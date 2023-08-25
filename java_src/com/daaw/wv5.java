package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class wv5 implements qq5 {
    public final Context a;
    public final ia5 b;
    public final o95 c;
    public final ri6 d;
    public final Executor e;
    public final zzchu f;
    public final bh3 g;
    public final boolean h = ((Boolean) zzba.zzc().b(g93.W7)).booleanValue();

    public wv5(Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, o95 o95Var, ia5 ia5Var, bh3 bh3Var) {
        this.a = context;
        this.d = ri6Var;
        this.c = o95Var;
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
        f77 n = s67.n(s67.i(null), new w57() { // from class: com.daaw.pv5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return wv5.this.c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.e);
        n.f(new Runnable() { // from class: com.daaw.qv5
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
        final k95 b = this.c.b(new rm4(fi6Var, th6Var, null), new l95(new vv5(this.a, this.b, this.d, this.f, th6Var, e14Var, a, this.g, this.h), a));
        e14Var.b(b);
        ph3.b(a, b.i());
        b.b().n0(new ir4() { // from class: com.daaw.rv5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f);
        b.l().i(a, true, this.h ? this.g : null);
        b.l();
        yh6 yh6Var = th6Var.t;
        return s67.m(ha5.j(a, yh6Var.b, yh6Var.a), new ey6() { // from class: com.daaw.sv5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = a;
                th6 th6Var2 = th6Var;
                k95 k95Var = b;
                if (th6Var2.N) {
                    a74Var.C();
                }
                a74Var.v0();
                a74Var.onPause();
                return k95Var.k();
            }
        }, this.e);
    }
}
