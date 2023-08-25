package com.daaw;
/* loaded from: classes.dex */
public final class x14 implements Runnable {
    public final /* synthetic */ c24 p;

    public x14(c24 c24Var) {
        this.p = c24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        boolean z;
        d24 d24Var2;
        d24 d24Var3;
        c24 c24Var = this.p;
        d24Var = c24Var.F;
        if (d24Var != null) {
            z = c24Var.G;
            if (!z) {
                d24Var3 = c24Var.F;
                d24Var3.zzg();
                this.p.G = true;
            }
            d24Var2 = this.p.F;
            d24Var2.zze();
        }
    }
}
