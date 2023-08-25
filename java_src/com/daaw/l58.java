package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class l58 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ x78 q;

    public l58(x78 x78Var, zzq zzqVar) {
        this.q = x78Var;
        this.p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.q;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            ry0.j(this.p);
            ua5Var.m1(this.p);
            this.q.a.C().t();
            this.q.q(ua5Var, null, this.p);
            this.q.E();
        } catch (RemoteException e) {
            this.q.a.i().q().b("Failed to send app launch to the service", e);
        }
    }
}
