package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class hc6 implements o67 {
    public final /* synthetic */ pz5 a;
    public final /* synthetic */ to6 b;
    public final /* synthetic */ io6 c;
    public final /* synthetic */ jc6 d;
    public final /* synthetic */ kc6 e;

    public hc6(kc6 kc6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, jc6 jc6Var) {
        this.e = kc6Var;
        this.a = pz5Var;
        this.b = to6Var;
        this.c = io6Var;
        this.d = jc6Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vo6 vo6Var;
        to6 to6Var;
        dd6 dd6Var;
        zl4 zl4Var = (zl4) obj;
        synchronized (this.e) {
            this.e.j = null;
            if (((Boolean) zzba.zzc().b(g93.r7)).booleanValue()) {
                cv4 e = zl4Var.e();
                dd6Var = this.e.d;
                e.b(dd6Var);
            }
            this.a.a(zl4Var);
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.h;
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
        cf6 cf6Var;
        dd6 dd6Var;
        qp4 l;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        cf6Var = this.e.e;
        di4 di4Var = (di4) cf6Var.zzd();
        final zze b = di4Var == null ? tj6.b(th, null) : di4Var.zzb().a(th);
        synchronized (this.e) {
            this.e.j = null;
            if (di4Var != null) {
                di4Var.zzc().b(b);
                if (((Boolean) zzba.zzc().b(g93.r7)).booleanValue()) {
                    executor = this.e.b;
                    executor.execute(new Runnable() { // from class: com.daaw.gc6
                        @Override // java.lang.Runnable
                        public final void run() {
                            dd6 dd6Var2;
                            hc6 hc6Var = hc6.this;
                            zze zzeVar = b;
                            dd6Var2 = hc6Var.e.d;
                            dd6Var2.b(zzeVar);
                        }
                    });
                }
            } else {
                dd6Var = this.e.d;
                dd6Var.b(b);
                l = this.e.l(this.d);
                ((di4) l.zzh()).zzb().c().zzd();
            }
            nj6.b(b.zza, th, "AppOpenAdLoader.onFailure");
            this.a.zza();
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.h;
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
