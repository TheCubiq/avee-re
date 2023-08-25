package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class jj5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public jj5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ij5 zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new ij5((ScheduledExecutorService) this.a.zzb(), g77Var, ((ak5) this.c).zzb(), vz7.a(this.d));
    }
}
