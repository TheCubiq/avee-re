package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class jj5 implements wz7 {

    /* renamed from: a */
    public final m08 f15133a;

    /* renamed from: b */
    public final m08 f15134b;

    /* renamed from: c */
    public final m08 f15135c;

    /* renamed from: d */
    public final m08 f15136d;

    public jj5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f15133a = m08Var;
        this.f15134b = m08Var2;
        this.f15135c = m08Var3;
        this.f15136d = m08Var4;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ij5 zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new ij5((ScheduledExecutorService) this.f15133a.zzb(), g77Var, ((ak5) this.f15135c).zzb(), vz7.m6639a(this.f15136d));
    }
}
