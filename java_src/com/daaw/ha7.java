package com.daaw;
/* loaded from: classes.dex */
public final class ha7 extends de7 {
    public final /* synthetic */ ia7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha7(ia7 ia7Var, Class cls) {
        super(cls);
        this.b = ia7Var;
    }

    public static final ri7 g(ui7 ui7Var) {
        qi7 M = ri7.M();
        M.t(ui7Var.Q());
        M.s(yq7.F(vp7.a(ui7Var.L())));
        M.u(0);
        return (ri7) M.n();
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        return g((ui7) xt7Var);
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return ui7.P(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    /* renamed from: f */
    public final void d(ui7 ui7Var) {
        xp7.a(ui7Var.L());
        ia7 ia7Var = this.b;
        ia7.m(ui7Var.Q());
    }
}
