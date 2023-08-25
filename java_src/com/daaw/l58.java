package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class l58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f17077p;

    /* renamed from: q */
    public final /* synthetic */ x78 f17078q;

    public l58(x78 x78Var, zzq zzqVar) {
        this.f17078q = x78Var;
        this.f17077p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f17078q;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            ry0.m10830j(this.f17077p);
            ua5Var.mo8367m1(this.f17077p);
            this.f17078q.f25143a.m24056C().m11361t();
            this.f17078q.m5457q(ua5Var, null, this.f17077p);
            this.f17078q.m5479E();
        } catch (RemoteException e) {
            this.f17078q.f25143a.mo3895i().m14160q().m20652b("Failed to send app launch to the service", e);
        }
    }
}
