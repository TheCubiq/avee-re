package com.daaw;
/* loaded from: classes.dex */
public final class al3 extends l14 {
    public final Object c = new Object();
    public final il3 d;
    public boolean e;

    public al3(il3 il3Var) {
        this.d = il3Var;
    }

    public final void g() {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            e(new xk3(this), new h14());
            e(new yk3(this), new zk3(this));
        }
    }
}
