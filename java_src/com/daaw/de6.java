package com.daaw;
/* loaded from: classes.dex */
public final class de6 implements bl6 {
    public final cf6 a;

    public de6(cf6 cf6Var) {
        this.a = cf6Var;
    }

    @Override // com.daaw.bl6
    public final f77 a(cl6 cl6Var) {
        ee6 ee6Var = (ee6) cl6Var;
        return ((ae6) this.a).c(ee6Var.b, ee6Var.a, null);
    }

    @Override // com.daaw.bl6
    public final void b(qk6 qk6Var) {
        qk6Var.a = ((ae6) this.a).b();
    }
}
