package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class xz5 implements qz5 {
    @GuardedBy("this")
    public final pi6 a;
    public final b94 b;
    public final Context c;
    public final nz5 d;
    public final vo6 e;
    @GuardedBy("this")
    public qm4 f;

    public xz5(b94 b94Var, Context context, nz5 nz5Var, pi6 pi6Var) {
        this.b = b94Var;
        this.c = context;
        this.d = nz5Var;
        this.a = pi6Var;
        this.e = b94Var.D();
        pi6Var.L(nz5Var.d());
    }

    @Override // com.daaw.qz5
    public final boolean a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        to6 to6Var;
        Executor c;
        Runnable runnable;
        zzt.zzp();
        if (zzs.zzD(this.c) && zzlVar.zzs == null) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            c = this.b.c();
            runnable = new Runnable() { // from class: com.daaw.sz5
                @Override // java.lang.Runnable
                public final void run() {
                    xz5.this.e();
                }
            };
        } else if (str != null) {
            nj6.a(this.c, zzlVar.zzf);
            if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && zzlVar.zzf) {
                this.b.p().m(true);
            }
            int i = ((rz5) oz5Var).a;
            pi6 pi6Var = this.a;
            pi6Var.e(zzlVar);
            pi6Var.Q(i);
            ri6 g = pi6Var.g();
            io6 b = ho6.b(this.c, so6.f(g), 8, zzlVar);
            zzcb zzcbVar = g.n;
            if (zzcbVar != null) {
                this.d.d().W(zzcbVar);
            }
            p15 m = this.b.m();
            sp4 sp4Var = new sp4();
            sp4Var.c(this.c);
            sp4Var.f(g);
            m.e(sp4Var.g());
            lw4 lw4Var = new lw4();
            lw4Var.n(this.d.d(), this.b.c());
            m.l(lw4Var.q());
            m.d(this.d.c());
            m.c(new wi4(null));
            q15 zzg = m.zzg();
            if (((Boolean) ta3.c.e()).booleanValue()) {
                to6 e = zzg.e();
                e.h(8);
                e.b(zzlVar.zzp);
                to6Var = e;
            } else {
                to6Var = null;
            }
            this.b.B().c(1);
            g77 g77Var = z04.a;
            e08.b(g77Var);
            ScheduledExecutorService d = this.b.d();
            jn4 a = zzg.a();
            qm4 qm4Var = new qm4(g77Var, d, a.i(a.j()));
            this.f = qm4Var;
            qm4Var.e(new wz5(this, pz5Var, to6Var, b, zzg));
            return true;
        } else {
            k04.zzg("Ad unit ID should not be null for NativeAdLoader.");
            c = this.b.c();
            runnable = new Runnable() { // from class: com.daaw.tz5
                @Override // java.lang.Runnable
                public final void run() {
                    xz5.this.f();
                }
            };
        }
        c.execute(runnable);
        return false;
    }

    public final /* synthetic */ void e() {
        this.d.a().b(tj6.d(4, null, null));
    }

    public final /* synthetic */ void f() {
        this.d.a().b(tj6.d(6, null, null));
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        qm4 qm4Var = this.f;
        return qm4Var != null && qm4Var.f();
    }
}
