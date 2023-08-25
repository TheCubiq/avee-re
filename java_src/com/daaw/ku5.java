package com.daaw;
/* loaded from: classes2.dex */
public final class ku5 implements Runnable {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ nv5 q;

    public ku5(nv5 nv5Var, boolean z) {
        this.q = nv5Var;
        this.p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8Var = this.q.a;
        yb8Var.n(this.p);
    }
}
