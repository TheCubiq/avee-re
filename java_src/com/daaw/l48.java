package com.daaw;
/* loaded from: classes2.dex */
public final class l48 implements Runnable {
    public final /* synthetic */ t38 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ r48 r;

    public l48(r48 r48Var, t38 t38Var, long j) {
        this.r = r48Var;
        this.p = t38Var;
        this.q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.r.o(this.p, false, this.q);
        r48 r48Var = this.r;
        r48Var.e = null;
        r48Var.a.L().u(null);
    }
}
