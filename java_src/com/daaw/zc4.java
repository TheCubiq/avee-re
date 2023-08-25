package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zc4 extends l75 {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ gk5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc4(gk5 gk5Var, Bundle bundle) {
        super(gk5Var, true);
        this.u = gk5Var;
        this.t = bundle;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.u.i;
        ((ju3) ry0.j(ju3Var)).setConsent(this.t, this.p);
    }
}
