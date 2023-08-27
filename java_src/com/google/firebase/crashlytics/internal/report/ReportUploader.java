package com.google.firebase.crashlytics.internal.report;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import com.google.firebase.crashlytics.internal.common.DataTransportState;
import com.google.firebase.crashlytics.internal.report.model.CreateReportRequest;
import com.google.firebase.crashlytics.internal.report.model.Report;
import com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ReportUploader {
    private static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final CreateReportSpiCall createReportCall;
    private final DataTransportState dataTransportState;
    private final String googleAppId;
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final String organizationId;
    private final ReportManager reportManager;
    private Thread uploadThread;

    /* loaded from: classes2.dex */
    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    /* loaded from: classes2.dex */
    public interface Provider {
        ReportUploader createReportUploader(AppSettingsData appSettingsData);
    }

    /* loaded from: classes2.dex */
    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getNativeReportFiles();
    }

    public ReportUploader(String str, String str2, DataTransportState dataTransportState, ReportManager reportManager, CreateReportSpiCall createReportSpiCall, HandlingExceptionCheck handlingExceptionCheck) {
        if (createReportSpiCall == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.createReportCall = createReportSpiCall;
        this.organizationId = str;
        this.googleAppId = str2;
        this.dataTransportState = dataTransportState;
        this.reportManager = reportManager;
        this.handlingExceptionCheck = handlingExceptionCheck;
    }

    public synchronized void uploadReportsAsync(List<Report> list, boolean z, float f) {
        if (this.uploadThread != null) {
            Logger.getLogger().d("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new Worker(list, z, f), "Crashlytics Report Uploader");
        this.uploadThread = thread;
        thread.start();
    }

    boolean isUploading() {
        return this.uploadThread != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:3:0x0001, B:5:0x0011, B:18:0x0062, B:6:0x001b, B:8:0x0021, B:10:0x0029, B:12:0x0034, B:16:0x004f), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean uploadReport(Report report, boolean z) {
        boolean invoke;
        try {
            CreateReportRequest createReportRequest = new CreateReportRequest(this.organizationId, this.googleAppId, report);
            if (this.dataTransportState == DataTransportState.ALL) {
                Logger.getLogger().d("Send to Reports Endpoint disabled. Removing Reports Endpoint report.");
            } else if (this.dataTransportState == DataTransportState.JAVA_ONLY && report.getType() == Report.Type.JAVA) {
                Logger.getLogger().d("Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report.");
            } else {
                invoke = this.createReportCall.invoke(createReportRequest, z);
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics Reports Endpoint upload ");
                sb.append(invoke ? "complete: " : "FAILED: ");
                sb.append(report.getIdentifier());
                logger.i(sb.toString());
                if (invoke) {
                    return false;
                }
                this.reportManager.deleteReport(report);
                return true;
            }
            invoke = true;
            if (invoke) {
            }
        } catch (Exception e) {
            Logger logger2 = Logger.getLogger();
            logger2.e("Error occurred sending report " + report, e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class Worker extends BackgroundPriorityRunnable {
        private final boolean dataCollectionToken;
        private final float delay;
        private final List<Report> reports;

        Worker(List<Report> list, boolean z, float f) {
            this.reports = list;
            this.dataCollectionToken = z;
            this.delay = f;
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                attemptUploadWithRetry(this.reports, this.dataCollectionToken);
            } catch (Exception e) {
                Logger.getLogger().e("An unexpected error occurred while attempting to upload crash reports.", e);
            }
            ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry(List<Report> list, boolean z) {
            float f;
            Logger.getLogger().d("Starting report processing in " + this.delay + " second(s)...");
            if (this.delay > 0.0f) {
                try {
                    Thread.sleep(f * 1000.0f);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                return;
            }
            int i = 0;
            while (list.size() > 0 && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                Logger.getLogger().d("Attempting to send " + list.size() + " report(s)");
                ArrayList arrayList = new ArrayList();
                for (Report report : list) {
                    if (!ReportUploader.this.uploadReport(report, z)) {
                        arrayList.add(report);
                    }
                }
                if (arrayList.size() > 0) {
                    int i2 = i + 1;
                    long j = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                    Logger.getLogger().d("Report submission: scheduling delayed retry in " + j + " seconds");
                    try {
                        Thread.sleep(j * 1000);
                        i = i2;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                list = arrayList;
            }
        }
    }
}
