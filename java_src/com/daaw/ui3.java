package com.daaw;

import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class ui3 implements pa.b {
    public final /* synthetic */ e14 a;

    public ui3(vi3 vi3Var, e14 e14Var) {
        this.a = e14Var;
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}
