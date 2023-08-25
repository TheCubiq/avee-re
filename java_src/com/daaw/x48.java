package com.daaw;

import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class x48 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ zzkw r;
    public final /* synthetic */ x78 s;

    public x48(x78 x78Var, zzq zzqVar, boolean z, zzkw zzkwVar) {
        this.s = x78Var;
        this.p = zzqVar;
        this.q = z;
        this.r = zzkwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.s;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Discarding data. Failed to set user property");
            return;
        }
        ry0.j(this.p);
        this.s.q(ua5Var, this.q ? null : this.r, this.p);
        this.s.E();
    }
}
