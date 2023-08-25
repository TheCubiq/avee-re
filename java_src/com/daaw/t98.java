package com.daaw;
/* loaded from: classes2.dex */
public final class t98 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ xc8 q;

    public t98(xc8 xc8Var, rj1 rj1Var) {
        this.q = xc8Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        gu0 gu0Var;
        gu0 gu0Var2;
        obj = this.q.b;
        synchronized (obj) {
            xc8 xc8Var = this.q;
            gu0Var = xc8Var.c;
            if (gu0Var != null) {
                gu0Var2 = xc8Var.c;
                gu0Var2.c((Exception) ry0.j(this.p.j()));
            }
        }
    }
}
