package com.daaw;
/* loaded from: classes.dex */
public final class u14 implements Runnable {
    public final /* synthetic */ c24 p;

    public u14(c24 c24Var) {
        this.p = c24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24 c24Var = this.p;
        d24Var = c24Var.F;
        if (d24Var != null) {
            d24Var2 = c24Var.F;
            d24Var2.zzh();
        }
    }
}
