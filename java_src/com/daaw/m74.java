package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class m74 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ gk5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m74(gk5 gk5Var, String str, String str2, Bundle bundle) {
        super(gk5Var, true);
        this.w = gk5Var;
        this.t = str;
        this.u = str2;
        this.v = bundle;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.w.i;
        ((ju3) ry0.j(ju3Var)).clearConditionalUserProperty(this.t, this.u, this.v);
    }
}
