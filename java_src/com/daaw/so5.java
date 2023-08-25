package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class so5 {

    /* renamed from: a */
    public final oo5 f26452a;

    /* renamed from: b */
    public final g77 f26453b;

    public so5(oo5 oo5Var, g77 g77Var) {
        this.f26452a = oo5Var;
        this.f26453b = g77Var;
    }

    /* renamed from: a */
    public final void m10115a(em6 em6Var) {
        g77 g77Var = this.f26453b;
        final oo5 oo5Var = this.f26452a;
        s67.m10625r(g77Var.mo20112M(new Callable() { // from class: com.daaw.qo5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oo5.this.getWritableDatabase();
            }
        }), new ro5(this, em6Var), this.f26453b);
    }
}
