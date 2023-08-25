package com.daaw;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class h20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public h20(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ry0.n(!eh1.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static h20 a(Context context) {
        ah1 ah1Var = new ah1(context);
        String a = ah1Var.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new h20(a, ah1Var.a("google_api_key"), ah1Var.a("firebase_database_url"), ah1Var.a("ga_trackingId"), ah1Var.a("gcm_defaultSenderId"), ah1Var.a("google_storage_bucket"), ah1Var.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h20) {
            h20 h20Var = (h20) obj;
            return ot0.a(this.b, h20Var.b) && ot0.a(this.a, h20Var.a) && ot0.a(this.c, h20Var.c) && ot0.a(this.d, h20Var.d) && ot0.a(this.e, h20Var.e) && ot0.a(this.f, h20Var.f) && ot0.a(this.g, h20Var.g);
        }
        return false;
    }

    public int hashCode() {
        return ot0.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return ot0.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
