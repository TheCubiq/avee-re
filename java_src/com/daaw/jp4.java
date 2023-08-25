package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class jp4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public jp4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new ip4((gr4) this.a.zzb(), ((sm4) this.b).a(), (ScheduledExecutorService) this.c.zzb(), g77Var);
    }
}
