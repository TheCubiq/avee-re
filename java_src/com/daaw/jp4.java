package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class jp4 implements wz7 {

    /* renamed from: a */
    public final m08 f15312a;

    /* renamed from: b */
    public final m08 f15313b;

    /* renamed from: c */
    public final m08 f15314c;

    /* renamed from: d */
    public final m08 f15315d;

    public jp4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f15312a = m08Var;
        this.f15313b = m08Var2;
        this.f15314c = m08Var3;
        this.f15315d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new ip4((gr4) this.f15312a.zzb(), ((sm4) this.f15313b).m10155a(), (ScheduledExecutorService) this.f15314c.zzb(), g77Var);
    }
}
