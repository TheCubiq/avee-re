package com.daaw;

import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class g33 implements AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final /* synthetic */ h33 f10231a;

    public g33(h33 h33Var) {
        this.f10231a = h33Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        Object obj;
        j33 j33Var;
        Object obj2;
        obj = this.f10231a.f11999c;
        synchronized (obj) {
            this.f10231a.f12002f = null;
            h33 h33Var = this.f10231a;
            j33Var = h33Var.f12000d;
            if (j33Var != null) {
                h33Var.f12000d = null;
            }
            obj2 = this.f10231a.f11999c;
            obj2.notifyAll();
        }
    }
}
