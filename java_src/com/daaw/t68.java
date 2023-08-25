package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class t68 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ zzac r;
    public final /* synthetic */ zzac s;
    public final /* synthetic */ x78 t;

    public t68(x78 x78Var, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.t = x78Var;
        this.p = zzqVar;
        this.q = z2;
        this.r = zzacVar;
        this.s = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.t;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        ry0.j(this.p);
        this.t.q(ua5Var, this.q ? null : this.r, this.p);
        this.t.E();
    }
}
