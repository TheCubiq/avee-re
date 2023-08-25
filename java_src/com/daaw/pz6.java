package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class pz6 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f23558p;

    /* renamed from: q */
    public final /* synthetic */ ob7 f23559q;

    public pz6(ob7 ob7Var, zzq zzqVar) {
        this.f23559q = ob7Var;
        this.f23558p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f23559q.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f23559q.f21251p;
        yb8Var2.m3878v(this.f23558p);
    }
}
