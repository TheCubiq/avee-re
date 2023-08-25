package com.daaw;
/* loaded from: classes2.dex */
public final class tz4 extends l75 {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ gk5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz4(gk5 gk5Var, boolean z) {
        super(gk5Var, true);
        this.u = gk5Var;
        this.t = z;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.u.i;
        ((ju3) ry0.j(ju3Var)).setDataCollectionEnabled(this.t);
    }
}
