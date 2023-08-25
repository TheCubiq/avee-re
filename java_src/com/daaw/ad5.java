package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class ad5 extends l75 {
    public final /* synthetic */ Activity t;
    public final /* synthetic */ dj5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad5(dj5 dj5Var, Activity activity) {
        super(dj5Var.p, true);
        this.u = dj5Var;
        this.t = activity;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.u.p.i;
        ((ju3) ry0.j(ju3Var)).onActivityResumed(nt0.g3(this.t), this.q);
    }
}
