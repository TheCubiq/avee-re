package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class mb6 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;

    public mb6(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        qz3 qz3Var = (qz3) this.a.zzb();
        boolean booleanValue = ((ab6) this.b).zzb().booleanValue();
        boolean booleanValue2 = ((bb6) this.c).zzb().booleanValue();
        fz3 fz3Var = new fz3();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new kb6(qz3Var, booleanValue, booleanValue2, fz3Var, g77Var, ((xa6) this.f).a(), (ScheduledExecutorService) this.g.zzb(), null);
    }
}
