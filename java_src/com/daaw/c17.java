package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class c17 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ ob7 q;

    public c17(ob7 ob7Var, zzq zzqVar) {
        this.q = ob7Var;
        this.p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.q.p;
        yb8Var.c();
        yb8Var2 = this.q.p;
        zzq zzqVar = this.p;
        yb8Var2.r().f();
        yb8Var2.e();
        ry0.f(zzqVar.p);
        yb8Var2.S(zzqVar);
    }
}
