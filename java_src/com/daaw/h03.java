package com.daaw;
/* loaded from: classes.dex */
public final class h03 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ k03 t;

    public h03(k03 k03Var, int i, int i2, int i3, float f) {
        this.t = k03Var;
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.t.b;
        l03Var.g(this.p, this.q, this.r, this.s);
    }
}
