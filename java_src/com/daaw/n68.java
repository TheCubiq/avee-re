package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class n68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f19532p;

    /* renamed from: q */
    public final /* synthetic */ x78 f19533q;

    public n68(x78 x78Var, zzq zzqVar) {
        this.f19533q = x78Var;
        this.f19532p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f19533q;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to send consent settings to service");
            return;
        }
        try {
            ry0.m10830j(this.f19532p);
            ua5Var.mo8376T1(this.f19532p);
            this.f19533q.m5479E();
        } catch (RemoteException e) {
            this.f19533q.f25143a.mo3895i().m14160q().m20652b("Failed to send consent settings to the service", e);
        }
    }
}
