package com.daaw;
/* loaded from: classes.dex */
public final class kl2 implements Runnable {
    public final /* synthetic */ ll2 p;

    public kl2(ll2 ll2Var) {
        this.p = ll2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        es6 es6Var;
        Object obj2;
        obj = this.p.B;
        synchronized (obj) {
            z = this.p.C;
            if (z) {
                return;
            }
            this.p.C = true;
            try {
                ll2.f(this.p);
            } catch (Exception e) {
                es6Var = this.p.u;
                es6Var.c(2023, -1L, e);
            }
            obj2 = this.p.B;
            synchronized (obj2) {
                this.p.C = false;
            }
        }
    }
}
