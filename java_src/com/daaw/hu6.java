package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
/* loaded from: classes2.dex */
public final class hu6 implements Runnable {
    public final /* synthetic */ zzac p;
    public final /* synthetic */ ob7 q;

    public hu6(ob7 ob7Var, zzac zzacVar) {
        this.q = ob7Var;
        this.p = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8 yb8Var3;
        yb8Var = this.q.p;
        yb8Var.c();
        if (this.p.r.h() == null) {
            yb8Var3 = this.q.p;
            yb8Var3.s(this.p);
            return;
        }
        yb8Var2 = this.q.p;
        yb8Var2.y(this.p);
    }
}
