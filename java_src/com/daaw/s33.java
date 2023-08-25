package com.daaw;

import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class s33 implements AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final /* synthetic */ e14 f25829a;

    /* renamed from: b */
    public final /* synthetic */ t33 f25830b;

    public s33(t33 t33Var, e14 e14Var) {
        this.f25830b = t33Var;
        this.f25829a = e14Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        Object obj;
        obj = this.f25830b.f26959d;
        synchronized (obj) {
            this.f25829a.m23796c(new RuntimeException("Connection failed."));
        }
    }
}
