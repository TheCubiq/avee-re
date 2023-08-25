package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class uu5 implements o67 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ th6 c;
    public final /* synthetic */ wh6 d;
    public final /* synthetic */ kp6 e;
    public final /* synthetic */ fi6 f;
    public final /* synthetic */ vu5 g;

    public uu5(vu5 vu5Var, long j, String str, th6 th6Var, wh6 wh6Var, kp6 kp6Var, fi6 fi6Var) {
        this.g = vu5Var;
        this.a = j;
        this.b = str;
        this.c = th6Var;
        this.d = wh6Var;
        this.e = kp6Var;
        this.f = fi6Var;
    }

    @Override // com.daaw.o67
    public final void a(Object obj) {
        ag agVar;
        boolean z;
        vq5 vq5Var;
        wu5 wu5Var;
        agVar = this.g.a;
        long b = agVar.b() - this.a;
        vu5.g(this.g, this.b, 0, b, this.c.h0, null);
        vu5 vu5Var = this.g;
        z = vu5Var.e;
        if (z) {
            wu5Var = vu5Var.b;
            wu5Var.a(this.d, this.c, 0, null, b);
        }
        vq5Var = this.g.f;
        vq5Var.f(this.c, b, null);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        ag agVar;
        Integer num;
        zze b;
        boolean z;
        zze zzeVar;
        vq5 vq5Var;
        op6 op6Var;
        wu5 wu5Var;
        agVar = this.g.a;
        long b2 = agVar.b() - this.a;
        if (th instanceof TimeoutException) {
            num = null;
            r3 = 2;
        } else if (th instanceof hu5) {
            num = null;
            r3 = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            r3 = 4;
        } else if (th instanceof wi6) {
            num = null;
            r3 = 5;
        } else {
            if (th instanceof gi5) {
                r3 = tj6.a(th).zza == 3 ? 1 : 6;
                if (((Boolean) zzba.zzc().b(g93.v1)).booleanValue() && (th instanceof uq5) && (b = ((uq5) th).b()) != null) {
                    num = Integer.valueOf(b.zza);
                }
            }
            num = null;
        }
        vu5.g(this.g, this.b, r3, b2, this.c.h0, num);
        vu5 vu5Var = this.g;
        z = vu5Var.e;
        if (z) {
            wu5Var = vu5Var.b;
            wu5Var.a(this.d, this.c, r3, th instanceof uq5 ? (uq5) th : null, b2);
        }
        if (((Boolean) zzba.zzc().b(g93.A7)).booleanValue()) {
            op6Var = this.g.c;
            kp6 kp6Var = this.e;
            fi6 fi6Var = this.f;
            th6 th6Var = this.c;
            op6Var.d(kp6Var.c(fi6Var, th6Var, th6Var.o));
        }
        zze a = tj6.a(th);
        int i = a.zza;
        if ((i == 3 || i == 0) && (zzeVar = a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            a = tj6.a(new uq5(13, a.zzd));
        }
        vq5Var = this.g.f;
        vq5Var.e(this.c, b2, a);
    }
}
