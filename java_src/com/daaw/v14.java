package com.daaw;
/* loaded from: classes.dex */
public final class v14 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ c24 r;

    public v14(c24 c24Var, int i, int i2) {
        this.r = c24Var;
        this.p = i;
        this.q = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24 c24Var = this.r;
        d24Var = c24Var.F;
        if (d24Var != null) {
            d24Var2 = c24Var.F;
            d24Var2.a(this.p, this.q);
        }
    }
}
