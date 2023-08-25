package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class d68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f6565p;

    /* renamed from: q */
    public final /* synthetic */ x78 f6566q;

    public d68(x78 x78Var, zzq zzqVar) {
        this.f6566q = x78Var;
        this.f6565p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f6566q;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            ry0.m10830j(this.f6565p);
            ua5Var.mo8375X(this.f6565p);
            this.f6566q.m5479E();
        } catch (RemoteException e) {
            this.f6566q.f25143a.mo3895i().m14160q().m20652b("Failed to send measurementEnabled to the service", e);
        }
    }
}
