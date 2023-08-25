package com.daaw;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class mt {
    public final Context a;
    public b b = null;

    /* loaded from: classes2.dex */
    public class b {
        public final String a;
        public final String b;

        public b() {
            int q = fh.q(mt.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q == 0) {
                if (!mt.this.c("flutter_assets/NOTICES.Z")) {
                    this.a = null;
                    this.b = null;
                    return;
                }
                this.a = "Flutter";
                this.b = null;
                ml0.f().i("Development platform is: Flutter");
                return;
            }
            this.a = "Unity";
            String string = mt.this.a.getResources().getString(q);
            this.b = string;
            ml0 f = ml0.f();
            f.i("Unity Editor version is: " + string);
        }
    }

    public mt(Context context) {
        this.a = context;
    }

    public final boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }

    public final b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }
}
