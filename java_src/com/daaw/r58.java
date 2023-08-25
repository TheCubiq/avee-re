package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class r58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f24870p;

    /* renamed from: q */
    public final /* synthetic */ Bundle f24871q;

    /* renamed from: r */
    public final /* synthetic */ x78 f24872r;

    public r58(x78 x78Var, zzq zzqVar, Bundle bundle) {
        this.f24872r = x78Var;
        this.f24870p = zzqVar;
        this.f24871q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f24872r;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to send default event parameters to service");
            return;
        }
        try {
            ry0.m10830j(this.f24870p);
            ua5Var.mo8373e0(this.f24871q, this.f24870p);
        } catch (RemoteException e) {
            this.f24872r.f25143a.mo3895i().m14160q().m20652b("Failed to send default event parameters to service", e);
        }
    }
}
