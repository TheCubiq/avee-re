package com.daaw;
/* loaded from: classes2.dex */
public final class f78 implements Runnable {
    public final /* synthetic */ ua5 p;
    public final /* synthetic */ u78 q;

    public f78(u78 u78Var, ua5 ua5Var) {
        this.q = u78Var;
        this.p = ua5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.q) {
            this.q.a = false;
            if (!this.q.c.z()) {
                this.q.c.a.i().v().a("Connected to service");
                this.q.c.x(this.p);
            }
        }
    }
}
