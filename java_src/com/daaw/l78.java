package com.daaw;
/* loaded from: classes2.dex */
public final class l78 implements Runnable {
    public final /* synthetic */ ua5 p;
    public final /* synthetic */ u78 q;

    public l78(u78 u78Var, ua5 ua5Var) {
        this.q = u78Var;
        this.p = ua5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.q) {
            this.q.a = false;
            if (!this.q.c.z()) {
                this.q.c.a.i().p().a("Connected to remote service");
                this.q.c.x(this.p);
            }
        }
    }
}
