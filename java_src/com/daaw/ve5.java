package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class ve5 implements wz7 {
    public final xd5 a;
    public final m08 b;
    public final m08 c;

    public ve5(xd5 xd5Var, m08 m08Var, m08 m08Var2) {
        this.a = xd5Var;
        this.b = m08Var;
        this.c = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        Set h = xd5.h((xe5) this.b.zzb(), g77Var);
        e08.b(h);
        return h;
    }
}
