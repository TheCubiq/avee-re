package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* loaded from: classes2.dex */
public enum DataTransportState {
    NONE,
    JAVA_ONLY,
    ALL;
    
    static final int REPORT_UPLOAD_VARIANT_DATATRANSPORT = 2;
    static final int REPORT_UPLOAD_VARIANT_LEGACY = 1;

    static DataTransportState getState(boolean z, boolean z2) {
        if (z) {
            if (!z2) {
                return JAVA_ONLY;
            }
            return ALL;
        }
        return NONE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DataTransportState getState(AppSettingsData appSettingsData) {
        return getState(appSettingsData.reportUploadVariant == 2, appSettingsData.nativeReportUploadVariant == 2);
    }
}
