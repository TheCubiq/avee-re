package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class c58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f5514p;

    /* renamed from: q */
    public final /* synthetic */ x78 f5515q;

    public c58(x78 x78Var, zzq zzqVar) {
        this.f5515q = x78Var;
        this.f5514p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f5515q;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            ry0.m10830j(this.f5514p);
            ua5Var.mo8365s2(this.f5514p);
        } catch (RemoteException e) {
            this.f5515q.f25143a.mo3895i().m14160q().m20652b("Failed to reset data on the service: remote exception", e);
        }
        this.f5515q.m5479E();
    }
}
