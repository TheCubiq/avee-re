package com.daaw;
/* loaded from: classes2.dex */
public final class kv4 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ oq3 u;
    public final /* synthetic */ gk5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv4(gk5 gk5Var, String str, oq3 oq3Var) {
        super(gk5Var, true);
        this.v = gk5Var;
        this.t = str;
        this.u = oq3Var;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.v.i;
        ((ju3) ry0.j(ju3Var)).getMaxUserProperties(this.t, this.u);
    }

    @Override // com.daaw.l75
    public final void b() {
        this.u.T0(null);
    }
}
