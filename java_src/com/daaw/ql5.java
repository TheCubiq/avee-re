package com.daaw;
/* loaded from: classes.dex */
public final class ql5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public ql5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final pl5 zzb() {
        g77 g77Var = z04.b;
        e08.b(g77Var);
        g77 g77Var2 = z04.a;
        e08.b(g77Var2);
        return new pl5(g77Var, g77Var2, ((hm5) this.c).zzb());
    }
}
