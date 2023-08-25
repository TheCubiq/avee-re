package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzccy;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class dh6 implements qz5 {
    public final Context a;
    public final Executor b;
    public final b94 c;
    public final tg6 d;
    public final cf6 e;
    public final gi6 f;
    public final vo6 g;
    @GuardedBy("this")
    public final pi6 h;
    @GuardedBy("this")
    public f77 i;

    public dh6(Context context, Executor executor, b94 b94Var, cf6 cf6Var, tg6 tg6Var, pi6 pi6Var, gi6 gi6Var) {
        this.a = context;
        this.b = executor;
        this.c = b94Var;
        this.e = cf6Var;
        this.d = tg6Var;
        this.h = pi6Var;
        this.f = gi6Var;
        this.g = b94Var.D();
    }

    @Override // com.daaw.qz5
    public final boolean a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        to6 to6Var;
        zzccy zzccyVar = new zzccy(zzlVar, str);
        if (zzccyVar.q == null) {
            k04.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.b.execute(new Runnable() { // from class: com.daaw.wg6
                @Override // java.lang.Runnable
                public final void run() {
                    dh6.this.h();
                }
            });
        } else {
            f77 f77Var = this.i;
            if (f77Var == null || f77Var.isDone()) {
                if (((Boolean) ta3.c.e()).booleanValue()) {
                    cf6 cf6Var = this.e;
                    if (cf6Var.zzd() != null) {
                        to6 zzh = ((o95) cf6Var.zzd()).zzh();
                        zzh.h(5);
                        zzh.b(zzccyVar.p.zzp);
                        to6Var = zzh;
                        nj6.a(this.a, zzccyVar.p.zzf);
                        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && zzccyVar.p.zzf) {
                            this.c.p().m(true);
                        }
                        pi6 pi6Var = this.h;
                        pi6Var.J(zzccyVar.q);
                        pi6Var.I(zzq.zzd());
                        pi6Var.e(zzccyVar.p);
                        ri6 g = pi6Var.g();
                        io6 b = ho6.b(this.a, so6.f(g), 5, zzccyVar.p);
                        ch6 ch6Var = new ch6(null);
                        ch6Var.a = g;
                        ch6Var.b = null;
                        f77 a = this.e.a(new df6(ch6Var, null), new ye6() { // from class: com.daaw.xg6
                            @Override // com.daaw.ye6
                            public final qp4 a(xe6 xe6Var) {
                                n95 j;
                                j = dh6.this.j(xe6Var);
                                return j;
                            }
                        }, null);
                        this.i = a;
                        s67.r(a, new ah6(this, pz5Var, to6Var, b, ch6Var), this.b);
                        return true;
                    }
                }
                to6Var = null;
                nj6.a(this.a, zzccyVar.p.zzf);
                if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue()) {
                    this.c.p().m(true);
                }
                pi6 pi6Var2 = this.h;
                pi6Var2.J(zzccyVar.q);
                pi6Var2.I(zzq.zzd());
                pi6Var2.e(zzccyVar.p);
                ri6 g2 = pi6Var2.g();
                io6 b2 = ho6.b(this.a, so6.f(g2), 5, zzccyVar.p);
                ch6 ch6Var2 = new ch6(null);
                ch6Var2.a = g2;
                ch6Var2.b = null;
                f77 a2 = this.e.a(new df6(ch6Var2, null), new ye6() { // from class: com.daaw.xg6
                    @Override // com.daaw.ye6
                    public final qp4 a(xe6 xe6Var) {
                        n95 j;
                        j = dh6.this.j(xe6Var);
                        return j;
                    }
                }, null);
                this.i = a2;
                s67.r(a2, new ah6(this, pz5Var, to6Var, b2, ch6Var2), this.b);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void h() {
        this.d.b(tj6.d(6, null, null));
    }

    public final void i(int i) {
        this.h.F().a(i);
    }

    public final n95 j(xe6 xe6Var) {
        n95 n = this.c.n();
        sp4 sp4Var = new sp4();
        sp4Var.c(this.a);
        sp4Var.f(((ch6) xe6Var).a);
        sp4Var.e(this.f);
        n.a(sp4Var.g());
        n.b(new lw4().q());
        return n;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        throw null;
    }
}
