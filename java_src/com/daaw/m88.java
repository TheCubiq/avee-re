package com.daaw;
/* loaded from: classes2.dex */
public final class m88 implements Runnable {
    public final /* synthetic */ yb8 p;
    public final /* synthetic */ Runnable q;

    public m88(s88 s88Var, yb8 yb8Var, Runnable runnable) {
        this.p = yb8Var;
        this.q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.c();
        this.p.l0(this.q);
        this.p.C();
    }
}
