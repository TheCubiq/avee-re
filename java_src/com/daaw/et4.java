package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class et4 extends l75 {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ oq3 u;
    public final /* synthetic */ gk5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et4(gk5 gk5Var, Bundle bundle, oq3 oq3Var) {
        super(gk5Var, true);
        this.v = gk5Var;
        this.t = bundle;
        this.u = oq3Var;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.v.i;
        ((ju3) ry0.j(ju3Var)).performAction(this.t, this.u, this.p);
    }

    @Override // com.daaw.l75
    public final void b() {
        this.u.T0(null);
    }
}
