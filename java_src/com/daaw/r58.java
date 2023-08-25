package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class r58 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ x78 r;

    public r58(x78 x78Var, zzq zzqVar, Bundle bundle) {
        this.r = x78Var;
        this.p = zzqVar;
        this.q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.r;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Failed to send default event parameters to service");
            return;
        }
        try {
            ry0.j(this.p);
            ua5Var.e0(this.q, this.p);
        } catch (RemoteException e) {
            this.r.a.i().q().b("Failed to send default event parameters to service", e);
        }
    }
}
