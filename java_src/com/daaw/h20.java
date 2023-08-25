package com.daaw;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class h20 {

    /* renamed from: a */
    public final String f11966a;

    /* renamed from: b */
    public final String f11967b;

    /* renamed from: c */
    public final String f11968c;

    /* renamed from: d */
    public final String f11969d;

    /* renamed from: e */
    public final String f11970e;

    /* renamed from: f */
    public final String f11971f;

    /* renamed from: g */
    public final String f11972g;

    public h20(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ry0.m10826n(!eh1.m23467a(str), "ApplicationId must be set.");
        this.f11967b = str;
        this.f11966a = str2;
        this.f11968c = str3;
        this.f11969d = str4;
        this.f11970e = str5;
        this.f11971f = str6;
        this.f11972g = str7;
    }

    /* renamed from: a */
    public static h20 m21088a(Context context) {
        ah1 ah1Var = new ah1(context);
        String m27481a = ah1Var.m27481a("google_app_id");
        if (TextUtils.isEmpty(m27481a)) {
            return null;
        }
        return new h20(m27481a, ah1Var.m27481a("google_api_key"), ah1Var.m27481a("firebase_database_url"), ah1Var.m27481a("ga_trackingId"), ah1Var.m27481a("gcm_defaultSenderId"), ah1Var.m27481a("google_storage_bucket"), ah1Var.m27481a("project_id"));
    }

    /* renamed from: b */
    public String m21087b() {
        return this.f11966a;
    }

    /* renamed from: c */
    public String m21086c() {
        return this.f11967b;
    }

    /* renamed from: d */
    public String m21085d() {
        return this.f11970e;
    }

    /* renamed from: e */
    public String m21084e() {
        return this.f11972g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h20) {
            h20 h20Var = (h20) obj;
            return ot0.m13981a(this.f11967b, h20Var.f11967b) && ot0.m13981a(this.f11966a, h20Var.f11966a) && ot0.m13981a(this.f11968c, h20Var.f11968c) && ot0.m13981a(this.f11969d, h20Var.f11969d) && ot0.m13981a(this.f11970e, h20Var.f11970e) && ot0.m13981a(this.f11971f, h20Var.f11971f) && ot0.m13981a(this.f11972g, h20Var.f11972g);
        }
        return false;
    }

    public int hashCode() {
        return ot0.m13980b(this.f11967b, this.f11966a, this.f11968c, this.f11969d, this.f11970e, this.f11971f, this.f11972g);
    }

    public String toString() {
        return ot0.m13979c(this).m13978a("applicationId", this.f11967b).m13978a("apiKey", this.f11966a).m13978a("databaseUrl", this.f11968c).m13978a("gcmSenderId", this.f11970e).m13978a("storageBucket", this.f11971f).m13978a("projectId", this.f11972g).toString();
    }
}
