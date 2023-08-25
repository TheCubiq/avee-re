package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class fr5 implements qq5 {
    public final ji4 a;
    public final Context b;
    public final ia5 c;
    public final ri6 d;
    public final Executor e;
    public final zzchu f;
    public final bh3 g;
    public final boolean h = ((Boolean) zzba.zzc().b(g93.W7)).booleanValue();

    public fr5(ji4 ji4Var, Context context, Executor executor, ia5 ia5Var, ri6 ri6Var, zzchu zzchuVar, bh3 bh3Var) {
        this.b = context;
        this.a = ji4Var;
        this.e = executor;
        this.c = ia5Var;
        this.d = ri6Var;
        this.f = zzchuVar;
        this.g = bh3Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.t;
        return (yh6Var == null || yh6Var.a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        final ma5 ma5Var = new ma5();
        f77 n = s67.n(s67.i(null), new w57() { // from class: com.daaw.dr5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fr5.this.c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.e);
        n.f(new Runnable() { // from class: com.daaw.er5
            @Override // java.lang.Runnable
            public final void run() {
                ma5.this.b();
            }
        }, this.e);
        return n;
    }

    public final /* synthetic */ f77 c(final th6 th6Var, fi6 fi6Var, ma5 ma5Var, Object obj) {
        final a74 a = this.c.a(this.d.e, th6Var, fi6Var.b.b);
        a.X(th6Var.X);
        ma5Var.a(this.b, (View) a);
        e14 e14Var = new e14();
        final gi4 a2 = this.a.a(new rm4(fi6Var, th6Var, null), new sz4(new hr5(this.f, e14Var, th6Var, a, this.d, this.h, this.g), a), new hi4(th6Var.b0));
        a2.j().i(a, false, this.h ? this.g : null);
        e14Var.b(a2);
        a2.b().n0(new ir4() { // from class: com.daaw.yq5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f);
        a2.j();
        yh6 yh6Var = th6Var.t;
        return s67.m(ha5.j(a, yh6Var.b, yh6Var.a), new ey6() { // from class: com.daaw.zq5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = a;
                th6 th6Var2 = th6Var;
                gi4 gi4Var = a2;
                if (th6Var2.N) {
                    a74Var.C();
                }
                a74Var.v0();
                a74Var.onPause();
                return gi4Var.h();
            }
        }, this.e);
    }
}
