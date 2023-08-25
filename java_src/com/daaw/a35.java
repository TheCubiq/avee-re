package com.daaw;
/* loaded from: classes2.dex */
public final class a35 extends l75 {
    public final /* synthetic */ q95 t;
    public final /* synthetic */ gk5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a35(gk5 gk5Var, q95 q95Var) {
        super(gk5Var, true);
        this.u = gk5Var;
        this.t = q95Var;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.u.i;
        ((ju3) ry0.j(ju3Var)).registerOnMeasurementEventListener(this.t);
    }
}
