package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class wh4 {
    public final on6 a;
    public final kd5 b;
    public final fi6 c;

    public wh4(kd5 kd5Var, fi6 fi6Var, on6 on6Var) {
        this.a = on6Var;
        this.b = kd5Var;
        this.c = fi6Var;
    }

    public static String b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j, int i) {
        if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
            on6 on6Var = this.a;
            nn6 b = nn6.b("ad_closed");
            b.g(this.c.b.b);
            b.a("show_time", String.valueOf(j));
            b.a("ad_format", "app_open_ad");
            b.a("acr", b(i));
            on6Var.a(b);
            return;
        }
        jd5 a = this.b.a();
        a.e(this.c.b.b);
        a.b("action", "ad_closed");
        a.b("show_time", String.valueOf(j));
        a.b("ad_format", "app_open_ad");
        a.b("acr", b(i));
        a.g();
    }
}
