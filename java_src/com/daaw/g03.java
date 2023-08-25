package com.daaw;
/* loaded from: classes.dex */
public final class g03 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ k03 r;

    public g03(k03 k03Var, int i, long j) {
        this.r = k03Var;
        this.p = i;
        this.q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.r.b;
        l03Var.A(this.p, this.q);
    }
}
