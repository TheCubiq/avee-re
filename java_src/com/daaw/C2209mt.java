package com.daaw;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.daaw.mt */
/* loaded from: classes2.dex */
public class C2209mt {

    /* renamed from: a */
    public final Context f19135a;

    /* renamed from: b */
    public C2211b f19136b = null;

    /* renamed from: com.daaw.mt$b */
    /* loaded from: classes2.dex */
    public class C2211b {

        /* renamed from: a */
        public final String f19137a;

        /* renamed from: b */
        public final String f19138b;

        public C2211b() {
            int m22650q = C1279fh.m22650q(C2209mt.this.f19135a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m22650q == 0) {
                if (!C2209mt.this.m15784c("flutter_assets/NOTICES.Z")) {
                    this.f19137a = null;
                    this.f19138b = null;
                    return;
                }
                this.f19137a = "Flutter";
                this.f19138b = null;
                ml0.m15976f().m15973i("Development platform is: Flutter");
                return;
            }
            this.f19137a = "Unity";
            String string = C2209mt.this.f19135a.getResources().getString(m22650q);
            this.f19138b = string;
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("Unity Editor version is: " + string);
        }
    }

    public C2209mt(Context context) {
        this.f19135a = context;
    }

    /* renamed from: c */
    public final boolean m15784c(String str) {
        if (this.f19135a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f19135a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public String m15783d() {
        return m15781f().f19137a;
    }

    /* renamed from: e */
    public String m15782e() {
        return m15781f().f19138b;
    }

    /* renamed from: f */
    public final C2211b m15781f() {
        if (this.f19136b == null) {
            this.f19136b = new C2211b();
        }
        return this.f19136b;
    }
}
