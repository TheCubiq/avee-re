package com.google.firebase.crashlytics.internal.settings.model;
/* loaded from: classes2.dex */
public class AppRequestData {
    public final String appId;
    public final String buildVersion;
    public final String builtSdkVersion;
    public final String displayVersion;
    public final String googleAppId;
    public final String instanceIdentifier;
    public final String minSdkVersion;
    public final String name;
    public final String organizationId;
    public final int source;

    public AppRequestData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9) {
        this.organizationId = str;
        this.googleAppId = str2;
        this.appId = str3;
        this.displayVersion = str4;
        this.buildVersion = str5;
        this.instanceIdentifier = str6;
        this.name = str7;
        this.source = i;
        this.minSdkVersion = str8;
        this.builtSdkVersion = str9;
    }
}
