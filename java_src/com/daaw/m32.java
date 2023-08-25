package com.daaw;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public abstract class m32 extends es3 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ pa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m32(pa paVar, int i, Bundle bundle) {
        super(paVar, Boolean.TRUE);
        this.f = paVar;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.daaw.es3
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ConnectionResult connectionResult;
        if (this.d != 0) {
            this.f.I(1, null);
            Bundle bundle = this.e;
            connectionResult = new ConnectionResult(this.d, bundle != null ? (PendingIntent) bundle.getParcelable(pa.KEY_PENDING_INTENT) : null);
        } else if (g()) {
            return;
        } else {
            this.f.I(1, null);
            connectionResult = new ConnectionResult(8, null);
        }
        f(connectionResult);
    }

    @Override // com.daaw.es3
    public final void b() {
    }

    public abstract void f(ConnectionResult connectionResult);

    public abstract boolean g();
}
