package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStoreImpl;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.unity.ResourceUnityVersionProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public class CrashlyticsCore {
    private static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private CrashlyticsNativeComponent nativeComponent;
    private final long startTime = System.currentTimeMillis();

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, ExecutorService executorService) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.crashHandlerExecutor = executorService;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
    }

    public boolean onPreExecute(SettingsDataProvider settingsDataProvider) {
        String mappingFileId = CommonUtils.getMappingFileId(this.context);
        Logger logger = Logger.getLogger();
        logger.d("Mapping file ID is: " + mappingFileId);
        if (!isBuildIdValid(mappingFileId, CommonUtils.getBooleanResourceValue(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            throw new IllegalStateException(MISSING_BUILD_ID_MSG);
        }
        String applicationId = this.app.getOptions().getApplicationId();
        try {
            Logger logger2 = Logger.getLogger();
            logger2.i("Initializing Crashlytics " + getVersion());
            FileStoreImpl fileStoreImpl = new FileStoreImpl(this.context);
            this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, fileStoreImpl);
            this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, fileStoreImpl);
            HttpRequestFactory httpRequestFactory = new HttpRequestFactory();
            AppData create = AppData.create(this.context, this.idManager, applicationId, mappingFileId);
            ResourceUnityVersionProvider resourceUnityVersionProvider = new ResourceUnityVersionProvider(this.context);
            Logger logger3 = Logger.getLogger();
            logger3.d("Installer package name is: " + create.installerPackageName);
            this.controller = new CrashlyticsController(this.context, this.backgroundWorker, httpRequestFactory, this.idManager, this.dataCollectionArbiter, fileStoreImpl, this.crashMarker, create, null, null, this.nativeComponent, resourceUnityVersionProvider, this.analyticsEventLogger, settingsDataProvider);
            boolean didPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), settingsDataProvider);
            if (didPreviousInitializationFail && CommonUtils.canTryConnection(this.context)) {
                Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously(settingsDataProvider);
                return false;
            }
            Logger.getLogger().d("Exception handling initialization successful");
            return true;
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    public Task<Void> doBackgroundInitializationAsync(final SettingsDataProvider settingsDataProvider) {
        return Utils.callTask(this.crashHandlerExecutor, new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Task<Void> call() throws Exception {
                return CrashlyticsCore.this.doBackgroundInitialization(settingsDataProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> doBackgroundInitialization(SettingsDataProvider settingsDataProvider) {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.breadcrumbSource.registerBreadcrumbHandler(CrashlyticsCore$$Lambda$1.lambdaFactory$(this));
            Settings settings = settingsDataProvider.getSettings();
            if (!settings.getFeaturesData().collectReports) {
                Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.controller.finalizeSessions(settings.getSessionData().maxCustomExceptionEvents)) {
                Logger.getLogger().d("Could not finalize previous sessions.");
            }
            return this.controller.submitAllReports(1.0f, settingsDataProvider.getAppSettings());
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.forException(e);
        } finally {
            markInitializationComplete();
        }
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.controller.checkForUnsentReports();
    }

    public Task<Void> sendUnsentReports() {
        return this.controller.sendUnsentReports();
    }

    public Task<Void> deleteUnsentReports() {
        return this.controller.deleteUnsentReports();
    }

    public void logException(Throwable th) {
        this.controller.writeNonFatalException(Thread.currentThread(), th);
    }

    public void log(String str) {
        this.controller.writeToLog(System.currentTimeMillis() - this.startTime, str);
    }

    public void setUserId(String str) {
        this.controller.setUserId(str);
    }

    public void setCustomKey(String str, String str2) {
        this.controller.setCustomKey(str, str2);
    }

    CrashlyticsController getController() {
        return this.controller;
    }

    private void finishInitSynchronously(final SettingsDataProvider settingsDataProvider) {
        Future<?> submit = this.crashHandlerExecutor.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.2
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsCore.this.doBackgroundInitialization(settingsDataProvider);
            }
        });
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.getLogger().e("Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", e3);
        }
    }

    void markInitializationStarted() {
        this.backgroundWorker.checkRunningOnThread();
        this.initializationMarker.create();
        Logger.getLogger().d("Initialization marker file created.");
    }

    void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable<Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    Logger logger = Logger.getLogger();
                    logger.d("Initialization marker file removed: " + remove);
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e);
                    return false;
                }
            }
        });
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submit(new Callable<Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    return Boolean.valueOf(CrashlyticsCore.this.controller.didCrashOnPreviousExecution());
                }
            })));
        } catch (Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            Logger.getLogger().d("Configured not to require a build ID.");
            return true;
        } else if (CommonUtils.isNullOrEmpty(str)) {
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, ".     |  | ");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".   \\ |  | /");
            Log.e(Logger.TAG, ".    \\    /");
            Log.e(Logger.TAG, ".     \\  /");
            Log.e(Logger.TAG, ".      \\/");
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, MISSING_BUILD_ID_MSG);
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, ".      /\\");
            Log.e(Logger.TAG, ".     /  \\");
            Log.e(Logger.TAG, ".    /    \\");
            Log.e(Logger.TAG, ".   / |  | \\");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".");
            return false;
        } else {
            return true;
        }
    }
}
