package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class ua4 extends l75 {
    public final /* synthetic */ Activity t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ gk5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua4(gk5 gk5Var, Activity activity, String str, String str2) {
        super(gk5Var, true);
        this.w = gk5Var;
        this.t = activity;
        this.u = str;
        this.v = str2;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.w.i;
        ((ju3) ry0.j(ju3Var)).setCurrentScreen(nt0.g3(this.t), this.u, this.v, this.p);
    }
}
