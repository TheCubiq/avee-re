package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class lr5 implements qq5 {
    public final yh4 a;
    public final Context b;
    public final ia5 c;
    public final Executor d;

    public lr5(yh4 yh4Var, Context context, Executor executor, ia5 ia5Var) {
        this.b = context;
        this.a = yh4Var;
        this.d = executor;
        this.c = ia5Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.t;
        return (yh6Var == null || yh6Var.a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        return s67.n(s67.i(null), new w57() { // from class: com.daaw.ir5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return lr5.this.c(fi6Var, th6Var, obj);
            }
        }, this.d);
    }

    public final /* synthetic */ f77 c(fi6 fi6Var, th6 th6Var, Object obj) {
        zzq a = vi6.a(this.b, th6Var.v);
        final a74 a2 = this.c.a(a, th6Var, fi6Var.b.b);
        final qh4 a3 = this.a.a(new rm4(fi6Var, th6Var, null), new rh4((View) a2, a2, vi6.c(a), th6Var.b0, th6Var.f0, th6Var.P));
        a3.i().i(a2, false, null);
        gr4 b = a3.b();
        ir4 ir4Var = new ir4() { // from class: com.daaw.jr5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        };
        g77 g77Var = z04.f;
        b.n0(ir4Var, g77Var);
        a3.i();
        yh6 yh6Var = th6Var.t;
        return s67.m(ha5.j(a2, yh6Var.b, yh6Var.a), new ey6() { // from class: com.daaw.kr5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                return qh4.this.h();
            }
        }, g77Var);
    }
}
