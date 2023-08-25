package com.daaw;

import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class ui3 implements AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final /* synthetic */ e14 f29100a;

    public ui3(vi3 vi3Var, e14 e14Var) {
        this.f29100a = e14Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        this.f29100a.m23796c(new RuntimeException("Connection failed."));
    }
}
