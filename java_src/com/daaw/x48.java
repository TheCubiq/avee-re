package com.daaw;

import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class x48 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f32098p;

    /* renamed from: q */
    public final /* synthetic */ boolean f32099q;

    /* renamed from: r */
    public final /* synthetic */ zzkw f32100r;

    /* renamed from: s */
    public final /* synthetic */ x78 f32101s;

    public x48(x78 x78Var, zzq zzqVar, boolean z, zzkw zzkwVar) {
        this.f32101s = x78Var;
        this.f32098p = zzqVar;
        this.f32099q = z;
        this.f32100r = zzkwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f32101s;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Discarding data. Failed to set user property");
            return;
        }
        ry0.m10830j(this.f32098p);
        this.f32101s.m5457q(ua5Var, this.f32099q ? null : this.f32100r, this.f32098p);
        this.f32101s.m5479E();
    }
}
