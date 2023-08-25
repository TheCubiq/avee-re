package com.daaw;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public abstract class m32 extends es3 {

    /* renamed from: d */
    public final int f18422d;

    /* renamed from: e */
    public final Bundle f18423e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC2527pa f18424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m32(AbstractC2527pa abstractC2527pa, int i, Bundle bundle) {
        super(abstractC2527pa, Boolean.TRUE);
        this.f18424f = abstractC2527pa;
        this.f18422d = i;
        this.f18423e = bundle;
    }

    @Override // com.daaw.es3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16239a(Object obj) {
        ConnectionResult connectionResult;
        if (this.f18422d != 0) {
            this.f18424f.m13558I(1, null);
            Bundle bundle = this.f18423e;
            connectionResult = new ConnectionResult(this.f18422d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC2527pa.KEY_PENDING_INTENT) : null);
        } else if (mo5485g()) {
            return;
        } else {
            this.f18424f.m13558I(1, null);
            connectionResult = new ConnectionResult(8, null);
        }
        mo5486f(connectionResult);
    }

    @Override // com.daaw.es3
    /* renamed from: b */
    public final void mo16238b() {
    }

    /* renamed from: f */
    public abstract void mo5486f(ConnectionResult connectionResult);

    /* renamed from: g */
    public abstract boolean mo5485g();
}
