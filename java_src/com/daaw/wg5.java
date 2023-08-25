package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class wg5 extends l75 {
    public final /* synthetic */ Activity t;
    public final /* synthetic */ oq3 u;
    public final /* synthetic */ dj5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg5(dj5 dj5Var, Activity activity, oq3 oq3Var) {
        super(dj5Var.p, true);
        this.v = dj5Var;
        this.t = activity;
        this.u = oq3Var;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.v.p.i;
        ((ju3) ry0.j(ju3Var)).onActivitySaveInstanceState(nt0.g3(this.t), this.u, this.q);
    }
}
