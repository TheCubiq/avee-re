package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class pf6 implements o67 {
    public final /* synthetic */ pz5 a;
    public final /* synthetic */ to6 b;
    public final /* synthetic */ io6 c;
    public final /* synthetic */ s05 d;
    public final /* synthetic */ qf6 e;

    public pf6(qf6 qf6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, s05 s05Var) {
        this.e = qf6Var;
        this.a = pz5Var;
        this.b = to6Var;
        this.c = io6Var;
        this.d = s05Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        Executor executor2;
        az5 az5Var;
        tg6 tg6Var;
        oz4 oz4Var = (oz4) obj;
        synchronized (this.e) {
            this.e.i = null;
            y83 y83Var = g93.s7;
            if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
                cv4 e = oz4Var.e();
                az5Var = this.e.d;
                e.a(az5Var);
                tg6Var = this.e.e;
                e.d(tg6Var);
            }
            this.a.a(oz4Var);
            if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
                executor = this.e.b;
                executor.execute(new Runnable() { // from class: com.daaw.lf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5 az5Var2;
                        az5Var2 = pf6.this.e.d;
                        az5Var2.zzn();
                    }
                });
                executor2 = this.e.b;
                executor2.execute(new Runnable() { // from class: com.daaw.mf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        tg6 tg6Var2;
                        tg6Var2 = pf6.this.e.e;
                        tg6Var2.zzn();
                    }
                });
            }
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.g;
                io6 io6Var = this.c;
                io6Var.d(oz4Var.g().b);
                io6Var.l(oz4Var.c().zzg());
                io6Var.zzf(true);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.f(oz4Var.g().b);
                to6Var.e(oz4Var.c().zzg());
                io6 io6Var2 = this.c;
                io6Var2.zzf(true);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        Executor executor2;
        final zze a = this.d.a().a(th);
        synchronized (this.e) {
            this.e.i = null;
            this.d.b().b(a);
            if (((Boolean) zzba.zzc().b(g93.s7)).booleanValue()) {
                executor = this.e.b;
                executor.execute(new Runnable() { // from class: com.daaw.nf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5 az5Var;
                        pf6 pf6Var = pf6.this;
                        zze zzeVar = a;
                        az5Var = pf6Var.e.d;
                        az5Var.b(zzeVar);
                    }
                });
                executor2 = this.e.b;
                executor2.execute(new Runnable() { // from class: com.daaw.of6
                    @Override // java.lang.Runnable
                    public final void run() {
                        tg6 tg6Var;
                        pf6 pf6Var = pf6.this;
                        zze zzeVar = a;
                        tg6Var = pf6Var.e.e;
                        tg6Var.b(zzeVar);
                    }
                });
            }
            nj6.b(a.zza, th, "InterstitialAdLoader.onFailure");
            this.a.zza();
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.g;
                io6 io6Var = this.c;
                io6Var.b(a);
                io6Var.e(th);
                io6Var.zzf(false);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.c(a);
                io6 io6Var2 = this.c;
                io6Var2.e(th);
                io6Var2.zzf(false);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }
}
