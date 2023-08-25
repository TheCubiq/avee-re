package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class so5 {
    public final oo5 a;
    public final g77 b;

    public so5(oo5 oo5Var, g77 g77Var) {
        this.a = oo5Var;
        this.b = g77Var;
    }

    public final void a(em6 em6Var) {
        g77 g77Var = this.b;
        final oo5 oo5Var = this.a;
        s67.r(g77Var.M(new Callable() { // from class: com.daaw.qo5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oo5.this.getWritableDatabase();
            }
        }), new ro5(this, em6Var), this.b);
    }
}
