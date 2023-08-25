package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
/* renamed from: com.daaw.fp */
/* loaded from: classes2.dex */
public class C1318fp {

    /* renamed from: a */
    public final Context f9746a;

    /* renamed from: b */
    public final SharedPreferences f9747b;

    /* renamed from: c */
    public final e01 f9748c;

    /* renamed from: d */
    public boolean f9749d;

    public C1318fp(Context context, String str, e01 e01Var) {
        Context m22436a = m22436a(context);
        this.f9746a = m22436a;
        this.f9747b = m22436a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f9748c = e01Var;
        this.f9749d = m22434c();
    }

    /* renamed from: a */
    public static Context m22436a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C3866zk.m2181b(context);
    }

    /* renamed from: b */
    public synchronized boolean m22435b() {
        return this.f9749d;
    }

    /* renamed from: c */
    public final boolean m22434c() {
        return this.f9747b.contains("firebase_data_collection_default_enabled") ? this.f9747b.getBoolean("firebase_data_collection_default_enabled", true) : m22433d();
    }

    /* renamed from: d */
    public final boolean m22433d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f9746a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f9746a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
