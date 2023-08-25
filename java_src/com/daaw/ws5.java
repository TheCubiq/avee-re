package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ws5 implements qq5 {
    public final zj4 a;
    public final as5 b;
    public final g77 c;
    public final nq4 d;
    public final ScheduledExecutorService e;

    public ws5(zj4 zj4Var, as5 as5Var, nq4 nq4Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        this.a = zj4Var;
        this.b = as5Var;
        this.d = nq4Var;
        this.e = scheduledExecutorService;
        this.c = g77Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        return fi6Var.a.a.a() != null && this.b.a(fi6Var, th6Var);
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        return this.c.M(new Callable() { // from class: com.daaw.ts5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ws5.this.c(fi6Var, th6Var);
            }
        });
    }

    public final /* synthetic */ zi4 c(final fi6 fi6Var, final th6 th6Var) {
        return this.a.b(new rm4(fi6Var, th6Var, null), new mk4(fi6Var.a.a.a(), new Runnable() { // from class: com.daaw.us5
            @Override // java.lang.Runnable
            public final void run() {
                ws5.this.f(fi6Var, th6Var);
            }
        })).zza();
    }

    public final /* synthetic */ void f(fi6 fi6Var, th6 th6Var) {
        s67.r(s67.o(this.b.b(fi6Var, th6Var), th6Var.S, TimeUnit.SECONDS, this.e), new vs5(this), this.c);
    }
}
