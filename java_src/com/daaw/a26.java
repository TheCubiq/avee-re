package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class a26 implements wz7 {

    /* renamed from: a */
    public final m08 f2711a;

    /* renamed from: b */
    public final m08 f2712b;

    /* renamed from: c */
    public final m08 f2713c;

    /* renamed from: d */
    public final m08 f2714d;

    public a26(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f2711a = m08Var;
        this.f2712b = m08Var2;
        this.f2713c = m08Var3;
        this.f2714d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new y16(((h94) this.f2711a).m20923a(), (qz3) this.f2712b.zzb(), (ScheduledExecutorService) this.f2713c.zzb(), g77Var);
    }
}
