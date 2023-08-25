package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class s07 extends m32 {

    /* renamed from: g */
    public final /* synthetic */ AbstractC2527pa f25754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s07(AbstractC2527pa abstractC2527pa, int i, Bundle bundle) {
        super(abstractC2527pa, i, null);
        this.f25754g = abstractC2527pa;
    }

    @Override // com.daaw.m32
    /* renamed from: f */
    public final void mo5486f(ConnectionResult connectionResult) {
        if (this.f25754g.m13556f() && AbstractC2527pa.m13559H(this.f25754g)) {
            AbstractC2527pa.m13563D(this.f25754g, 16);
            return;
        }
        this.f25754g.f22751p.mo13540a(connectionResult);
        this.f25754g.m13551p(connectionResult);
    }

    @Override // com.daaw.m32
    /* renamed from: g */
    public final boolean mo5485g() {
        this.f25754g.f22751p.mo13540a(ConnectionResult.f36572t);
        return true;
    }
}
