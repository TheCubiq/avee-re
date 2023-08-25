package com.daaw;
/* loaded from: classes2.dex */
public final class e38 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ k68 q;

    public e38(k68 k68Var, rj1 rj1Var) {
        this.q = k68Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        cu0 cu0Var;
        cu0 cu0Var2;
        obj = this.q.b;
        synchronized (obj) {
            k68 k68Var = this.q;
            cu0Var = k68Var.c;
            if (cu0Var != null) {
                cu0Var2 = k68Var.c;
                cu0Var2.a(this.p);
            }
        }
    }
}
