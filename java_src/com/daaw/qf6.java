package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class qf6 implements qz5 {
    public final Context a;
    public final Executor b;
    public final b94 c;
    public final az5 d;
    public final tg6 e;
    public fa3 f;
    public final vo6 g;
    @GuardedBy("this")
    public final pi6 h;
    @GuardedBy("this")
    public f77 i;

    public qf6(Context context, Executor executor, b94 b94Var, az5 az5Var, tg6 tg6Var, pi6 pi6Var) {
        this.a = context;
        this.b = executor;
        this.c = b94Var;
        this.d = az5Var;
        this.h = pi6Var;
        this.e = tg6Var;
        this.g = b94Var.D();
    }

    @Override // com.daaw.qz5
    public final boolean a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        s05 zzf;
        to6 to6Var;
        if (str == null) {
            k04.zzg("Ad unit ID should not be null for interstitial ad.");
            this.b.execute(new Runnable() { // from class: com.daaw.kf6
                @Override // java.lang.Runnable
                public final void run() {
                    qf6.this.g();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && zzlVar.zzf) {
                this.c.p().m(true);
            }
            zzq zzqVar = ((jf6) oz5Var).a;
            pi6 pi6Var = this.h;
            pi6Var.J(str);
            pi6Var.I(zzqVar);
            pi6Var.e(zzlVar);
            ri6 g = pi6Var.g();
            io6 b = ho6.b(this.a, so6.f(g), 4, zzlVar);
            if (((Boolean) zzba.zzc().b(g93.s7)).booleanValue()) {
                r05 l = this.c.l();
                sp4 sp4Var = new sp4();
                sp4Var.c(this.a);
                sp4Var.f(g);
                l.g(sp4Var.g());
                lw4 lw4Var = new lw4();
                lw4Var.m(this.d, this.b);
                lw4Var.n(this.d, this.b);
                l.m(lw4Var.q());
                l.h(new cx5(this.f));
                zzf = l.zzf();
            } else {
                lw4 lw4Var2 = new lw4();
                tg6 tg6Var = this.e;
                if (tg6Var != null) {
                    lw4Var2.h(tg6Var, this.b);
                    lw4Var2.i(this.e, this.b);
                    lw4Var2.e(this.e, this.b);
                }
                r05 l2 = this.c.l();
                sp4 sp4Var2 = new sp4();
                sp4Var2.c(this.a);
                sp4Var2.f(g);
                l2.g(sp4Var2.g());
                lw4Var2.m(this.d, this.b);
                lw4Var2.h(this.d, this.b);
                lw4Var2.i(this.d, this.b);
                lw4Var2.e(this.d, this.b);
                lw4Var2.d(this.d, this.b);
                lw4Var2.o(this.d, this.b);
                lw4Var2.n(this.d, this.b);
                lw4Var2.l(this.d, this.b);
                lw4Var2.f(this.d, this.b);
                l2.m(lw4Var2.q());
                l2.h(new cx5(this.f));
                zzf = l2.zzf();
            }
            s05 s05Var = zzf;
            if (((Boolean) ta3.c.e()).booleanValue()) {
                to6 d = s05Var.d();
                d.h(4);
                d.b(zzlVar.zzp);
                to6Var = d;
            } else {
                to6Var = null;
            }
            jn4 a = s05Var.a();
            f77 i = a.i(a.j());
            this.i = i;
            s67.r(i, new pf6(this, pz5Var, to6Var, b, s05Var), this.b);
            return true;
        }
    }

    public final /* synthetic */ void g() {
        this.d.b(tj6.d(6, null, null));
    }

    public final void h(fa3 fa3Var) {
        this.f = fa3Var;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.i;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
