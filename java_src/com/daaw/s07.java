package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class s07 extends m32 {
    public final /* synthetic */ pa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s07(pa paVar, int i, Bundle bundle) {
        super(paVar, i, null);
        this.g = paVar;
    }

    @Override // com.daaw.m32
    public final void f(ConnectionResult connectionResult) {
        if (this.g.f() && pa.H(this.g)) {
            pa.D(this.g, 16);
            return;
        }
        this.g.p.a(connectionResult);
        this.g.p(connectionResult);
    }

    @Override // com.daaw.m32
    public final boolean g() {
        this.g.p.a(ConnectionResult.t);
        return true;
    }
}
