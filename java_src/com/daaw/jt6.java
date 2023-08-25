package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class jt6 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzac f15404p;

    /* renamed from: q */
    public final /* synthetic */ zzq f15405q;

    /* renamed from: r */
    public final /* synthetic */ ob7 f15406r;

    public jt6(ob7 ob7Var, zzac zzacVar, zzq zzqVar) {
        this.f15406r = ob7Var;
        this.f15404p = zzacVar;
        this.f15405q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.f15406r.f21251p;
        yb8Var.m3907c();
        if (this.f15404p.f37058r.m1073h() == null) {
            yb8Var3 = this.f15406r.f21251p;
            yb8Var3.m3880t(this.f15404p, this.f15405q);
            return;
        }
        yb8Var2 = this.f15406r.f21251p;
        yb8Var2.m3874z(this.f15404p, this.f15405q);
    }
}
