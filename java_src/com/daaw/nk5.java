package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class nk5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public nk5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final mk5 zzb() {
        Map c = ((d08) this.a).c();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new mk5(c, g77Var, ((ot4) this.c).zzb());
    }
}
