package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class q68 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ zzaw r;
    public final /* synthetic */ String s;
    public final /* synthetic */ x78 t;

    public q68(x78 x78Var, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.t = x78Var;
        this.p = zzqVar;
        this.q = z2;
        this.r = zzawVar;
        this.s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.t;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Discarding data. Failed to send event to service");
            return;
        }
        ry0.j(this.p);
        this.t.q(ua5Var, this.q ? null : this.r, this.p);
        this.t.E();
    }
}
