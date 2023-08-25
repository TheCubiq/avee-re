package com.daaw;

import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class s33 implements pa.b {
    public final /* synthetic */ e14 a;
    public final /* synthetic */ t33 b;

    public s33(t33 t33Var, e14 e14Var) {
        this.b = t33Var;
        this.a = e14Var;
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        Object obj;
        obj = this.b.d;
        synchronized (obj) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}
