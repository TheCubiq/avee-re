package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class i97 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f13383p;

    /* renamed from: q */
    public final /* synthetic */ ob7 f13384q;

    public i97(ob7 ob7Var, zzq zzqVar) {
        this.f13384q = ob7Var;
        this.f13383p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f13384q.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f13384q.f21251p;
        yb8Var2.m3884p(this.f13383p);
    }
}
