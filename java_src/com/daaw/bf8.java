package com.daaw;
/* loaded from: classes2.dex */
public final class bf8 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ nh8 q;

    public bf8(nh8 nh8Var, rj1 rj1Var) {
        this.q = nh8Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ku0 ku0Var;
        ku0 ku0Var2;
        obj = this.q.b;
        synchronized (obj) {
            nh8 nh8Var = this.q;
            ku0Var = nh8Var.c;
            if (ku0Var != null) {
                ku0Var2 = nh8Var.c;
                ku0Var2.onSuccess(this.p.k());
            }
        }
    }
}
