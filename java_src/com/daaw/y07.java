package com.daaw;
/* loaded from: classes2.dex */
public final class y07 implements Runnable {
    public final /* synthetic */ ru7 p;

    public y07(ru7 ru7Var) {
        this.p = ru7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zt0 zt0Var;
        zt0 zt0Var2;
        obj = this.p.b;
        synchronized (obj) {
            ru7 ru7Var = this.p;
            zt0Var = ru7Var.c;
            if (zt0Var != null) {
                zt0Var2 = ru7Var.c;
                zt0Var2.b();
            }
        }
    }
}
