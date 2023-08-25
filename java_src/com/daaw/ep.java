package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class ep {
    public final SharedPreferences a;
    public final s10 b;
    public final Object c;
    public tj1<Void> d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final tj1<Void> h;

    public ep(s10 s10Var) {
        Object obj = new Object();
        this.c = obj;
        this.d = new tj1<>();
        this.e = false;
        this.f = false;
        this.h = new tj1<>();
        Context j = s10Var.j();
        this.b = s10Var;
        this.a = fh.r(j);
        Boolean b = b();
        this.g = b == null ? a(j) : b;
        synchronized (obj) {
            if (d()) {
                this.d.e(null);
                this.e = true;
            }
        }
    }

    public static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            ml0.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    public final Boolean a(Context context) {
        Boolean f = f(context);
        if (f == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    public final Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    public void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.g;
        booleanValue = bool != null ? bool.booleanValue() : this.b.s();
        e(booleanValue);
        return booleanValue;
    }

    public final void e(boolean z) {
        ml0.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public rj1<Void> g() {
        rj1<Void> a;
        synchronized (this.c) {
            a = this.d.a();
        }
        return a;
    }

    public rj1<Void> h(Executor executor) {
        return yq1.k(executor, this.h.a(), g());
    }
}
