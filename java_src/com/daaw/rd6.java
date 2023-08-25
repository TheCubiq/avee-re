package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class rd6 implements qz5 {
    public final Context a;
    public final Executor b;
    public final b94 c;
    public final az5 d;
    public final ez5 e;
    public final ViewGroup f;
    public fa3 g;
    public final jt4 h;
    public final vo6 i;
    public final wv4 j;
    @GuardedBy("this")
    public final pi6 k;
    @GuardedBy("this")
    public f77 l;

    public rd6(Context context, Executor executor, zzq zzqVar, b94 b94Var, az5 az5Var, ez5 ez5Var, pi6 pi6Var, wv4 wv4Var) {
        this.a = context;
        this.b = executor;
        this.c = b94Var;
        this.d = az5Var;
        this.e = ez5Var;
        this.k = pi6Var;
        this.h = b94Var.k();
        this.i = b94Var.D();
        this.f = new FrameLayout(context);
        this.j = wv4Var;
        pi6Var.I(zzqVar);
    }

    @Override // com.daaw.qz5
    public final boolean a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        yj4 j;
        wi4 wi4Var;
        to6 to6Var;
        if (str == null) {
            k04.zzg("Ad unit ID should not be null for banner ad.");
            this.b.execute(new Runnable() { // from class: com.daaw.nd6
                @Override // java.lang.Runnable
                public final void run() {
                    rd6.this.l();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && zzlVar.zzf) {
                this.c.p().m(true);
            }
            pi6 pi6Var = this.k;
            pi6Var.J(str);
            pi6Var.e(zzlVar);
            ri6 g = pi6Var.g();
            io6 b = ho6.b(this.a, so6.f(g), 3, zzlVar);
            if (((Boolean) kb3.d.e()).booleanValue() && this.k.x().zzk) {
                az5 az5Var = this.d;
                if (az5Var != null) {
                    az5Var.b(tj6.d(7, null, null));
                }
                return false;
            }
            if (((Boolean) zzba.zzc().b(g93.q7)).booleanValue()) {
                j = this.c.j();
                sp4 sp4Var = new sp4();
                sp4Var.c(this.a);
                sp4Var.f(g);
                j.n(sp4Var.g());
                lw4 lw4Var = new lw4();
                lw4Var.m(this.d, this.b);
                lw4Var.n(this.d, this.b);
                j.k(lw4Var.q());
                j.o(new cx5(this.g));
                j.d(new l15(u35.h, null));
                j.i(new rl4(this.h, this.j));
                wi4Var = new wi4(this.f);
            } else {
                j = this.c.j();
                sp4 sp4Var2 = new sp4();
                sp4Var2.c(this.a);
                sp4Var2.f(g);
                j.n(sp4Var2.g());
                lw4 lw4Var2 = new lw4();
                lw4Var2.m(this.d, this.b);
                lw4Var2.d(this.d, this.b);
                lw4Var2.d(this.e, this.b);
                lw4Var2.o(this.d, this.b);
                lw4Var2.g(this.d, this.b);
                lw4Var2.h(this.d, this.b);
                lw4Var2.i(this.d, this.b);
                lw4Var2.e(this.d, this.b);
                lw4Var2.n(this.d, this.b);
                lw4Var2.l(this.d, this.b);
                j.k(lw4Var2.q());
                j.o(new cx5(this.g));
                j.d(new l15(u35.h, null));
                j.i(new rl4(this.h, this.j));
                wi4Var = new wi4(this.f);
            }
            j.c(wi4Var);
            zj4 zzj = j.zzj();
            if (((Boolean) ta3.c.e()).booleanValue()) {
                to6 f = zzj.f();
                f.h(3);
                f.b(zzlVar.zzp);
                to6Var = f;
            } else {
                to6Var = null;
            }
            jn4 d = zzj.d();
            f77 i = d.i(d.j());
            this.l = i;
            s67.r(i, new qd6(this, pz5Var, to6Var, b, zzj), this.b);
            return true;
        }
    }

    public final ViewGroup c() {
        return this.f;
    }

    public final pi6 h() {
        return this.k;
    }

    public final /* synthetic */ void l() {
        this.d.b(tj6.d(6, null, null));
    }

    public final void m() {
        this.h.C0(this.j.a());
    }

    public final void n(zzbe zzbeVar) {
        this.e.b(zzbeVar);
    }

    public final void o(kt4 kt4Var) {
        this.h.n0(kt4Var, this.b);
    }

    public final void p(fa3 fa3Var) {
        this.g = fa3Var;
    }

    public final boolean q() {
        ViewParent parent = this.f.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zzt.zzp();
            return zzs.zzT(view, view.getContext());
        }
        return false;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.l;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
