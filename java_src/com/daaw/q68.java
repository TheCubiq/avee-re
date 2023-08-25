package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class q68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f23713p;

    /* renamed from: q */
    public final /* synthetic */ boolean f23714q;

    /* renamed from: r */
    public final /* synthetic */ zzaw f23715r;

    /* renamed from: s */
    public final /* synthetic */ String f23716s;

    /* renamed from: t */
    public final /* synthetic */ x78 f23717t;

    public q68(x78 x78Var, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.f23717t = x78Var;
        this.f23713p = zzqVar;
        this.f23714q = z2;
        this.f23715r = zzawVar;
        this.f23716s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f23717t;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Discarding data. Failed to send event to service");
            return;
        }
        ry0.m10830j(this.f23713p);
        this.f23717t.m5457q(ua5Var, this.f23714q ? null : this.f23715r, this.f23713p);
        this.f23717t.m5479E();
    }
}
