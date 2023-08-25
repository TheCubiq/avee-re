package com.daaw;
/* loaded from: classes2.dex */
public class t81 extends bz {
    public final int r;
    public final int s;
    public final long t;
    public final String u;
    public tl v = W();

    public t81(int i, int i2, long j, String str) {
        this.r = i;
        this.s = i2;
        this.t = j;
        this.u = str;
    }

    @Override // com.daaw.pl
    public void T(nl nlVar, Runnable runnable) {
        tl.D(this.v, runnable, null, false, 6, null);
    }

    public final tl W() {
        return new tl(this.r, this.s, this.t, this.u);
    }

    public final void X(Runnable runnable, uj1 uj1Var, boolean z) {
        this.v.w(runnable, uj1Var, z);
    }
}
