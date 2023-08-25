package com.daaw;
/* loaded from: classes.dex */
public final class p95 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public p95(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        m08 m08Var = this.a;
        m08 m08Var2 = this.b;
        int i = ((cq4) this.c).a().o.a;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((mw5) m08Var2).zzb() : ((mw5) m08Var).zzb();
        }
        throw null;
    }
}
