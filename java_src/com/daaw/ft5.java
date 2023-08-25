package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ft5 implements qq5 {
    public final Context a;
    public final ia5 b;
    public final s05 c;
    public final ri6 d;
    public final Executor e;
    public final zzchu f;
    public final bh3 g;
    public final boolean h = ((Boolean) zzba.zzc().b(g93.W7)).booleanValue();

    public ft5(Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, s05 s05Var, ia5 ia5Var, bh3 bh3Var) {
        this.a = context;
        this.d = ri6Var;
        this.c = s05Var;
        this.e = executor;
        this.f = zzchuVar;
        this.b = ia5Var;
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
        f77 n = s67.n(s67.i(null), new w57() { // from class: com.daaw.at5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ft5.this.c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.e);
        n.f(new Runnable() { // from class: com.daaw.bt5
            @Override // java.lang.Runnable
            public final void run() {
                ma5.this.b();
            }
        }, this.e);
        return n;
    }

    public final /* synthetic */ f77 c(final th6 th6Var, fi6 fi6Var, ma5 ma5Var, Object obj) {
        final a74 a = this.b.a(this.d.e, th6Var, fi6Var.b.b);
        a.X(th6Var.X);
        ma5Var.a(this.a, (View) a);
        e14 e14Var = new e14();
        final pz4 c = this.c.c(new rm4(fi6Var, th6Var, null), new sz4(new et5(this.a, this.f, e14Var, th6Var, a, this.d, this.h, this.g), a));
        e14Var.b(c);
        c.b().n0(new ir4() { // from class: com.daaw.ct5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f);
        c.k().i(a, true, this.h ? this.g : null);
        c.k();
        yh6 yh6Var = th6Var.t;
        return s67.m(ha5.j(a, yh6Var.b, yh6Var.a), new ey6() { // from class: com.daaw.dt5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = a;
                th6 th6Var2 = th6Var;
                pz4 pz4Var = c;
                if (th6Var2.N) {
                    a74Var.C();
                }
                a74Var.v0();
                a74Var.onPause();
                return pz4Var.i();
            }
        }, this.e);
    }
}
