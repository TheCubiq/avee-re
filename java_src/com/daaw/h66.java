package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class h66 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;

    public h66(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
        this.h = m08Var8;
        this.i = m08Var9;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new f66(g77Var, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (px5) this.d.zzb(), (Context) this.e.zzb(), ((cq4) this.f).a(), (lx5) this.g.zzb(), (ya5) this.h.zzb(), (hg5) this.i.zzb());
    }
}
