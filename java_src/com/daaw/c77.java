package com.daaw;

import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class c77 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzkw f5603p;

    /* renamed from: q */
    public final /* synthetic */ zzq f5604q;

    /* renamed from: r */
    public final /* synthetic */ ob7 f5605r;

    public c77(ob7 ob7Var, zzkw zzkwVar, zzq zzqVar) {
        this.f5605r = ob7Var;
        this.f5603p = zzkwVar;
        this.f5604q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.f5605r.f21251p;
        yb8Var.m3907c();
        if (this.f5603p.m1073h() == null) {
            yb8Var3 = this.f5605r.f21251p;
            yb8Var3.m3879u(this.f5603p, this.f5604q);
            return;
        }
        yb8Var2 = this.f5605r.f21251p;
        yb8Var2.m3936B(this.f5603p, this.f5604q);
    }
}
