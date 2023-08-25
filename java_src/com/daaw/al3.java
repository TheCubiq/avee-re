package com.daaw;
/* loaded from: classes.dex */
public final class al3 extends l14 {

    /* renamed from: c */
    public final Object f3297c = new Object();

    /* renamed from: d */
    public final il3 f3298d;

    /* renamed from: e */
    public boolean f3299e;

    public al3(il3 il3Var) {
        this.f3298d = il3Var;
    }

    /* renamed from: g */
    public final void m27356g() {
        synchronized (this.f3297c) {
            if (this.f3299e) {
                return;
            }
            this.f3299e = true;
            m17206e(new xk3(this), new h14());
            m17206e(new yk3(this), new zk3(this));
        }
    }
}
