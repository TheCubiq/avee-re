package com.google.firebase.crashlytics.internal.settings.model;
/* loaded from: classes2.dex */
public class AppSettingsData {
    public static final String STATUS_ACTIVATED = "activated";
    public static final String STATUS_CONFIGURED = "configured";
    public static final String STATUS_NEW = "new";
    public final String bundleId;
    public final int nativeReportUploadVariant;
    public final String ndkReportsUrl;
    public final String organizationId;
    public final int reportUploadVariant;
    public final String reportsUrl;
    public final String status;
    public final boolean updateRequired;
    public final String url;

    public AppSettingsData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, int i2) {
        this.status = str;
        this.url = str2;
        this.reportsUrl = str3;
        this.ndkReportsUrl = str4;
        this.bundleId = str5;
        this.organizationId = str6;
        this.updateRequired = z;
        this.reportUploadVariant = i;
        this.nativeReportUploadVariant = i2;
    }

    public AppSettingsData(String str, String str2, String str3, String str4, boolean z) {
        this(str, str2, str3, str4, null, null, z, 0, 0);
    }
}
