package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class jt6 implements Runnable {
    public final /* synthetic */ zzac p;
    public final /* synthetic */ zzq q;
    public final /* synthetic */ ob7 r;

    public jt6(ob7 ob7Var, zzac zzacVar, zzq zzqVar) {
        this.r = ob7Var;
        this.p = zzacVar;
        this.q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.r.p;
        yb8Var.c();
        if (this.p.r.h() == null) {
            yb8Var3 = this.r.p;
            yb8Var3.t(this.p, this.q);
            return;
        }
        yb8Var2 = this.r.p;
        yb8Var2.z(this.p, this.q);
    }
}
