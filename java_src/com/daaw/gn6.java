package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class gn6 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public gn6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new en6(g77Var, (ScheduledExecutorService) this.b.zzb(), ((hn6) this.c).zzb());
    }
}
