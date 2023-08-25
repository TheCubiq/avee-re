package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class wz5 implements o67 {
    public final /* synthetic */ pz5 a;
    public final /* synthetic */ to6 b;
    public final /* synthetic */ io6 c;
    public final /* synthetic */ q15 d;
    public final /* synthetic */ xz5 e;

    public wz5(xz5 xz5Var, pz5 pz5Var, to6 to6Var, io6 io6Var, q15 q15Var) {
        this.e = xz5Var;
        this.a = pz5Var;
        this.b = to6Var;
        this.c = io6Var;
        this.d = q15Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        nz5 nz5Var;
        b94 b94Var;
        vo6 vo6Var;
        to6 to6Var;
        zl4 zl4Var = (zl4) obj;
        synchronized (this.e) {
            cv4 e = zl4Var.e();
            nz5Var = this.e.d;
            e.a(nz5Var.d());
            this.a.a(zl4Var);
            b94Var = this.e.b;
            b94Var.c().execute(new Runnable() { // from class: com.daaw.uz5
                @Override // java.lang.Runnable
                public final void run() {
                    nz5 nz5Var2;
                    nz5Var2 = wz5.this.e.d;
                    nz5Var2.b().zzn();
                }
            });
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.e;
                io6 io6Var = this.c;
                io6Var.d(zl4Var.g().b);
                io6Var.l(zl4Var.c().zzg());
                io6Var.zzf(true);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.f(zl4Var.g().b);
                to6Var.e(zl4Var.c().zzg());
                io6 io6Var2 = this.c;
                io6Var2.zzf(true);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        b94 b94Var;
        vo6 vo6Var;
        to6 to6Var;
        final zze a = this.d.a().a(th);
        this.d.b().b(a);
        b94Var = this.e.b;
        b94Var.c().execute(new Runnable() { // from class: com.daaw.vz5
            @Override // java.lang.Runnable
            public final void run() {
                nz5 nz5Var;
                wz5 wz5Var = wz5.this;
                zze zzeVar = a;
                nz5Var = wz5Var.e.d;
                nz5Var.a().b(zzeVar);
            }
        });
        nj6.b(a.zza, th, "NativeAdLoader.onFailure");
        this.a.zza();
        if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
            vo6Var = this.e.e;
            io6 io6Var = this.c;
            io6Var.b(a);
            io6Var.e(th);
            io6Var.zzf(false);
            vo6Var.b(io6Var.zzl());
            return;
        }
        to6Var.c(a);
        io6 io6Var2 = this.c;
        io6Var2.e(th);
        io6Var2.zzf(false);
        to6Var.a(io6Var2);
        to6Var.g();
    }
}
