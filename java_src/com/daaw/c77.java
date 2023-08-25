package com.daaw;

import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class c77 implements Runnable {
    public final /* synthetic */ zzkw p;
    public final /* synthetic */ zzq q;
    public final /* synthetic */ ob7 r;

    public c77(ob7 ob7Var, zzkw zzkwVar, zzq zzqVar) {
        this.r = ob7Var;
        this.p = zzkwVar;
        this.q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.r.p;
        yb8Var.c();
        if (this.p.h() == null) {
            yb8Var3 = this.r.p;
            yb8Var3.u(this.p, this.q);
            return;
        }
        yb8Var2 = this.r.p;
        yb8Var2.B(this.p, this.q);
    }
}
