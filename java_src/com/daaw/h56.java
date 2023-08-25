package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class h56 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public h56(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new f56(g77Var, ((h94) this.b).a(), (Set) this.c.zzb());
    }
}
