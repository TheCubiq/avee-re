package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class o66 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;

    public o66(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new m66(g77Var, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (Context) this.d.zzb(), ((cq4) this.e).a(), (b94) this.f.zzb());
    }
}
