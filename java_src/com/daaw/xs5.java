package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class xs5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public xs5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ws5 zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new ws5((zj4) this.a.zzb(), ((bs5) this.b).zzb(), (nq4) this.c.zzb(), (ScheduledExecutorService) this.d.zzb(), g77Var);
    }
}
