package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class xs5 implements wz7 {

    /* renamed from: a */
    public final m08 f32926a;

    /* renamed from: b */
    public final m08 f32927b;

    /* renamed from: c */
    public final m08 f32928c;

    /* renamed from: d */
    public final m08 f32929d;

    /* renamed from: e */
    public final m08 f32930e;

    public xs5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.f32926a = m08Var;
        this.f32927b = m08Var2;
        this.f32928c = m08Var3;
        this.f32929d = m08Var4;
        this.f32930e = m08Var5;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final ws5 zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new ws5((zj4) this.f32926a.zzb(), ((bs5) this.f32927b).zzb(), (nq4) this.f32928c.zzb(), (ScheduledExecutorService) this.f32929d.zzb(), g77Var);
    }
}
