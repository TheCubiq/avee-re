package com.google.firebase.crashlytics.internal.report.model;
/* loaded from: classes2.dex */
public class CreateReportRequest {
    public final String googleAppId;
    public final String organizationId;
    public final Report report;

    public CreateReportRequest(String str, String str2, Report report) {
        this.organizationId = str;
        this.googleAppId = str2;
        this.report = report;
    }
}
