package com.daaw;
/* loaded from: classes2.dex */
public final class c48 implements Runnable {
    public final /* synthetic */ t38 p;
    public final /* synthetic */ t38 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ r48 t;

    public c48(r48 r48Var, t38 t38Var, t38 t38Var2, long j, boolean z) {
        this.t = r48Var;
        this.p = t38Var;
        this.q = t38Var2;
        this.r = j;
        this.s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.n(this.p, this.q, this.r, this.s, null);
    }
}
