package com.daaw;
/* loaded from: classes.dex */
public final class t14 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ c24 r;

    public t14(c24 c24Var, String str, String str2) {
        this.r = c24Var;
        this.p = str;
        this.q = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24 c24Var = this.r;
        d24Var = c24Var.F;
        if (d24Var != null) {
            d24Var2 = c24Var.F;
            d24Var2.c(this.p, this.q);
        }
    }
}
