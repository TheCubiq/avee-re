package com.daaw;

import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class g33 implements pa.b {
    public final /* synthetic */ h33 a;

    public g33(h33 h33Var) {
        this.a = h33Var;
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        Object obj;
        j33 j33Var;
        Object obj2;
        obj = this.a.c;
        synchronized (obj) {
            this.a.f = null;
            h33 h33Var = this.a;
            j33Var = h33Var.d;
            if (j33Var != null) {
                h33Var.d = null;
            }
            obj2 = this.a.c;
            obj2.notifyAll();
        }
    }
}
