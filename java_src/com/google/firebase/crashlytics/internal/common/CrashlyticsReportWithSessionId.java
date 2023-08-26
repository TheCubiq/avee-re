package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2.dex */
public abstract class CrashlyticsReportWithSessionId {
    public abstract CrashlyticsReport getReport();

    public abstract String getSessionId();

    public static CrashlyticsReportWithSessionId create(CrashlyticsReport crashlyticsReport, String str) {
        return new AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, str);
    }
}
