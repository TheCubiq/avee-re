package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class r96 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public r96(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
    }

    public static p96 a(String str, y23 y23Var, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        return new p96(str, y23Var, qz3Var, scheduledExecutorService, g77Var, null);
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new p96(((xa6) this.a).a(), new y23(), (qz3) this.c.zzb(), (ScheduledExecutorService) this.d.zzb(), g77Var, null);
    }
}
