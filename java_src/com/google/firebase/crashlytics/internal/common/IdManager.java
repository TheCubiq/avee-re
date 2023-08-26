package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private final Context appContext;
    private final String appIdentifier;
    private String crashlyticsInstallId;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.installerPackageNameProvider = new InstallerPackageNameProvider();
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public synchronized String getCrashlyticsInstallId() {
        String str;
        if (this.crashlyticsInstallId != null) {
            return this.crashlyticsInstallId;
        }
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
        Task<String> id = this.firebaseInstallationsApi.getId();
        String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
        try {
            str = (String) Utils.awaitEvenIfOnMainThread(id);
        } catch (Exception e) {
            Logger.getLogger().d("Failed to retrieve installation id", e);
            str = string != null ? string : null;
        }
        if (string == null) {
            SharedPreferences legacySharedPrefs = CommonUtils.getLegacySharedPrefs(this.appContext);
            String string2 = legacySharedPrefs.getString("crashlytics.installation.id", null);
            Logger logger = Logger.getLogger();
            logger.d("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.crashlyticsInstallId = createAndStoreIid(str, sharedPrefs);
            } else {
                this.crashlyticsInstallId = string2;
                migrateLegacyId(string2, str, sharedPrefs, legacySharedPrefs);
            }
            return this.crashlyticsInstallId;
        }
        if (string.equals(str)) {
            this.crashlyticsInstallId = sharedPrefs.getString("crashlytics.installation.id", null);
            Logger logger2 = Logger.getLogger();
            logger2.d("Found matching FID, using Crashlytics IID: " + this.crashlyticsInstallId);
            if (this.crashlyticsInstallId == null) {
                this.crashlyticsInstallId = createAndStoreIid(str, sharedPrefs);
            }
        } else {
            this.crashlyticsInstallId = createAndStoreIid(str, sharedPrefs);
        }
        return this.crashlyticsInstallId;
    }

    private synchronized void migrateLegacyId(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        Logger logger = Logger.getLogger();
        logger.d("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString(PREFKEY_FIREBASE_IID, str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove(PREFKEY_ADVERTISING_ID).apply();
    }

    private synchronized String createAndStoreIid(String str, SharedPreferences sharedPreferences) {
        String formatId;
        formatId = formatId(UUID.randomUUID().toString());
        Logger logger = Logger.getLogger();
        logger.d("Created new Crashlytics IID: " + formatId);
        sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString(PREFKEY_FIREBASE_IID, str).apply();
        return formatId;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}
