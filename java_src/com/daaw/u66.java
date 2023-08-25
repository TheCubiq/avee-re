package com.daaw;
/* loaded from: classes2.dex */
public final class u66 {

    /* renamed from: a */
    public final dr6 f28593a;

    public u66(yb8 yb8Var) {
        this.f28593a = yb8Var.m3906c0();
    }

    /* renamed from: a */
    public final boolean m8545a() {
        try {
            iv0 m22979a = ez1.m22979a(this.f28593a.mo3905d());
            if (m22979a != null) {
                return m22979a.m19341f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f28593a.mo3895i().m14156v().m20653a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f28593a.mo3895i().m14156v().m20652b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
