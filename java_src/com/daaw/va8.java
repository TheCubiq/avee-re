package com.daaw;
/* loaded from: classes2.dex */
public final class va8 implements Runnable {
    public final /* synthetic */ bc8 p;
    public final /* synthetic */ yb8 q;

    public va8(yb8 yb8Var, bc8 bc8Var) {
        this.q = yb8Var;
        this.p = bc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8.k0(this.q, this.p);
        this.q.x();
    }
}
