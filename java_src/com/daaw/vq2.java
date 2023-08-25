package com.daaw;
/* loaded from: classes.dex */
public final class vq2 implements Runnable {
    public final /* synthetic */ as2 p;
    public final /* synthetic */ xq2 q;

    public vq2(xq2 xq2Var, as2 as2Var) {
        this.q = xq2Var;
        this.p = as2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.a();
    }
}
