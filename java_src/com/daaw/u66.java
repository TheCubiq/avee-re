package com.daaw;
/* loaded from: classes2.dex */
public final class u66 {
    public final dr6 a;

    public u66(yb8 yb8Var) {
        this.a = yb8Var.c0();
    }

    public final boolean a() {
        try {
            iv0 a = ez1.a(this.a.d());
            if (a != null) {
                return a.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.i().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.i().v().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
