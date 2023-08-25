package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
/* loaded from: classes2.dex */
public final class hu6 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzac f12949p;

    /* renamed from: q */
    public final /* synthetic */ ob7 f12950q;

    public hu6(ob7 ob7Var, zzac zzacVar) {
        this.f12950q = ob7Var;
        this.f12949p = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.f12950q.f21251p;
        yb8Var.m3907c();
        if (this.f12949p.f37058r.m1073h() == null) {
            yb8Var3 = this.f12950q.f21251p;
            yb8Var3.m3881s(this.f12949p);
            return;
        }
        yb8Var2 = this.f12950q.f21251p;
        yb8Var2.m3875y(this.f12949p);
    }
}
