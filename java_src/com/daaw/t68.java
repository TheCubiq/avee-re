package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class t68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f27048p;

    /* renamed from: q */
    public final /* synthetic */ boolean f27049q;

    /* renamed from: r */
    public final /* synthetic */ zzac f27050r;

    /* renamed from: s */
    public final /* synthetic */ zzac f27051s;

    /* renamed from: t */
    public final /* synthetic */ x78 f27052t;

    public t68(x78 x78Var, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.f27052t = x78Var;
        this.f27048p = zzqVar;
        this.f27049q = z2;
        this.f27050r = zzacVar;
        this.f27051s = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f27052t;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        ry0.m10830j(this.f27048p);
        this.f27052t.m5457q(ua5Var, this.f27049q ? null : this.f27050r, this.f27048p);
        this.f27052t.m5479E();
    }
}
