package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class m45 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;

    public m45(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9) {
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
    /* renamed from: a */
    public final l45 zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new l45(((f94) this.a).zzb(), ((cq4) this.b).a(), (o35) this.c.zzb(), ((c45) this.d).a(), (x45) this.e.zzb(), (i55) this.f.zzb(), (Executor) this.g.zzb(), g77Var, (g35) this.i.zzb());
    }
}
