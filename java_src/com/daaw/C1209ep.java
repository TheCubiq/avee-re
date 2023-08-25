package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* renamed from: com.daaw.ep */
/* loaded from: classes2.dex */
public class C1209ep {

    /* renamed from: a */
    public final SharedPreferences f8642a;

    /* renamed from: b */
    public final s10 f8643b;

    /* renamed from: c */
    public final Object f8644c;

    /* renamed from: d */
    public tj1<Void> f8645d;

    /* renamed from: e */
    public boolean f8646e;

    /* renamed from: f */
    public boolean f8647f;

    /* renamed from: g */
    public Boolean f8648g;

    /* renamed from: h */
    public final tj1<Void> f8649h;

    public C1209ep(s10 s10Var) {
        Object obj = new Object();
        this.f8644c = obj;
        this.f8645d = new tj1<>();
        this.f8646e = false;
        this.f8647f = false;
        this.f8649h = new tj1<>();
        Context m10786j = s10Var.m10786j();
        this.f8643b = s10Var;
        this.f8642a = C1279fh.m22649r(m10786j);
        Boolean m23324b = m23324b();
        this.f8648g = m23324b == null ? m23325a(m10786j) : m23324b;
        synchronized (obj) {
            if (m23322d()) {
                this.f8645d.m9078e(null);
                this.f8646e = true;
            }
        }
    }

    /* renamed from: f */
    public static Boolean m23320f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            ml0.m15976f().m15977e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: a */
    public final Boolean m23325a(Context context) {
        Boolean m23320f = m23320f(context);
        if (m23320f == null) {
            this.f8647f = false;
            return null;
        }
        this.f8647f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m23320f));
    }

    /* renamed from: b */
    public final Boolean m23324b() {
        if (this.f8642a.contains("firebase_crashlytics_collection_enabled")) {
            this.f8647f = false;
            return Boolean.valueOf(this.f8642a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: c */
    public void m23323c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f8649h.m9078e(null);
    }

    /* renamed from: d */
    public synchronized boolean m23322d() {
        boolean booleanValue;
        Boolean bool = this.f8648g;
        booleanValue = bool != null ? bool.booleanValue() : this.f8643b.m10777s();
        m23321e(booleanValue);
        return booleanValue;
    }

    /* renamed from: e */
    public final void m23321e(boolean z) {
        ml0.m15976f().m15980b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.f8648g == null ? "global Firebase setting" : this.f8647f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    /* renamed from: g */
    public rj1<Void> m23319g() {
        rj1<Void> m9082a;
        synchronized (this.f8644c) {
            m9082a = this.f8645d.m9082a();
        }
        return m9082a;
    }

    /* renamed from: h */
    public rj1<Void> m23318h(Executor executor) {
        return yq1.m3437k(executor, this.f8649h.m9082a(), m23319g());
    }
}
