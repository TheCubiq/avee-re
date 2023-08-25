package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class wh4 {

    /* renamed from: a */
    public final on6 f31246a;

    /* renamed from: b */
    public final kd5 f31247b;

    /* renamed from: c */
    public final fi6 f31248c;

    public wh4(kd5 kd5Var, fi6 fi6Var, on6 on6Var) {
        this.f31246a = on6Var;
        this.f31247b = kd5Var;
        this.f31248c = fi6Var;
    }

    /* renamed from: b */
    public static String m6063b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void m6064a(long j, int i) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
            on6 on6Var = this.f31246a;
            nn6 m14953b = nn6.m14953b("ad_closed");
            m14953b.m14948g(this.f31248c.f9624b.f8508b);
            m14953b.m14954a("show_time", String.valueOf(j));
            m14953b.m14954a("ad_format", "app_open_ad");
            m14953b.m14954a("acr", m6063b(i));
            on6Var.mo7889a(m14953b);
            return;
        }
        jd5 m17776a = this.f31247b.m17776a();
        m17776a.m18587e(this.f31248c.f9624b.f8508b);
        m17776a.m18590b("action", "ad_closed");
        m17776a.m18590b("show_time", String.valueOf(j));
        m17776a.m18590b("ad_format", "app_open_ad");
        m17776a.m18590b("acr", m6063b(i));
        m17776a.m18585g();
    }
}
