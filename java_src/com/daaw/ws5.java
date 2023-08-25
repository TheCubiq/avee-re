package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ws5 implements qq5 {

    /* renamed from: a */
    public final zj4 f31486a;

    /* renamed from: b */
    public final as5 f31487b;

    /* renamed from: c */
    public final g77 f31488c;

    /* renamed from: d */
    public final nq4 f31489d;

    /* renamed from: e */
    public final ScheduledExecutorService f31490e;

    public ws5(zj4 zj4Var, as5 as5Var, nq4 nq4Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        this.f31486a = zj4Var;
        this.f31487b = as5Var;
        this.f31489d = nq4Var;
        this.f31490e = scheduledExecutorService;
        this.f31488c = g77Var;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        return fi6Var.f9623a.f5824a.m11286a() != null && this.f31487b.mo1905a(fi6Var, th6Var);
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(final fi6 fi6Var, final th6 th6Var) {
        return this.f31488c.mo20112M(new Callable() { // from class: com.daaw.ts5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ws5.this.m5824c(fi6Var, th6Var);
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ zi4 m5824c(final fi6 fi6Var, final th6 th6Var) {
        return this.f31486a.mo2201b(new rm4(fi6Var, th6Var, null), new mk4(fi6Var.f9623a.f5824a.m11286a(), new Runnable() { // from class: com.daaw.us5
            @Override // java.lang.Runnable
            public final void run() {
                ws5.this.m5821f(fi6Var, th6Var);
            }
        })).zza();
    }

    /* renamed from: f */
    public final /* synthetic */ void m5821f(fi6 fi6Var, th6 th6Var) {
        s67.m10625r(s67.m10628o(this.f31487b.mo1904b(fi6Var, th6Var), th6Var.f27672S, TimeUnit.SECONDS, this.f31490e), new vs5(this), this.f31488c);
    }
}
