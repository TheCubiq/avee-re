package com.daaw;
/* loaded from: classes2.dex */
public abstract class l75 implements Runnable {
    public final long p;
    public final long q;
    public final boolean r;
    public final /* synthetic */ gk5 s;

    public l75(gk5 gk5Var, boolean z) {
        this.s = gk5Var;
        this.p = gk5Var.b.a();
        this.q = gk5Var.b.b();
        this.r = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.s.g;
        if (z) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.s.k(e, false, this.r);
            b();
        }
    }
}
