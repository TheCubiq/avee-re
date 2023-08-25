package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ah6 implements o67 {
    public final /* synthetic */ pz5 a;
    public final /* synthetic */ to6 b;
    public final /* synthetic */ io6 c;
    public final /* synthetic */ ch6 d;
    public final /* synthetic */ dh6 e;

    public ah6(dh6 dh6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, ch6 ch6Var) {
        this.e = dh6Var;
        this.a = pz5Var;
        this.b = to6Var;
        this.c = io6Var;
        this.d = ch6Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tg6 tg6Var;
        Executor executor;
        final tg6 tg6Var2;
        tg6 tg6Var3;
        vo6 vo6Var;
        to6 to6Var;
        j95 j95Var = (j95) obj;
        synchronized (this.e) {
            cv4 e = j95Var.e();
            tg6Var = this.e.d;
            e.d(tg6Var);
            this.a.a(j95Var);
            dh6 dh6Var = this.e;
            executor = dh6Var.b;
            tg6Var2 = dh6Var.d;
            tg6Var2.getClass();
            executor.execute(new Runnable() { // from class: com.daaw.yg6
                @Override // java.lang.Runnable
                public final void run() {
                    tg6.this.zzn();
                }
            });
            tg6Var3 = this.e.d;
            tg6Var3.k();
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.g;
                io6 io6Var = this.c;
                io6Var.d(j95Var.g().b);
                io6Var.l(j95Var.c().zzg());
                io6Var.zzf(true);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.f(j95Var.g().b);
                to6Var.e(j95Var.c().zzg());
                io6 io6Var2 = this.c;
                io6Var2.zzf(true);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        cf6 cf6Var;
        tg6 tg6Var;
        n95 j;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        cf6Var = this.e.e;
        o95 o95Var = (o95) cf6Var.zzd();
        final zze b = o95Var == null ? tj6.b(th, null) : o95Var.zzb().a(th);
        synchronized (this.e) {
            if (o95Var != null) {
                o95Var.a().b(b);
                executor = this.e.b;
                executor.execute(new Runnable() { // from class: com.daaw.zg6
                    @Override // java.lang.Runnable
                    public final void run() {
                        tg6 tg6Var2;
                        ah6 ah6Var = ah6.this;
                        zze zzeVar = b;
                        tg6Var2 = ah6Var.e.d;
                        tg6Var2.b(zzeVar);
                    }
                });
            } else {
                tg6Var = this.e.d;
                tg6Var.b(b);
                j = this.e.j(this.d);
                j.zze().zzb().c().zzd();
            }
            nj6.b(b.zza, th, "RewardedAdLoader.onFailure");
            this.a.zza();
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.g;
                io6 io6Var = this.c;
                io6Var.b(b);
                io6Var.e(th);
                io6Var.zzf(false);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.c(b);
                io6 io6Var2 = this.c;
                io6Var2.e(th);
                io6Var2.zzf(false);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }
}
