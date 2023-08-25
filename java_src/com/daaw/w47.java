package com.daaw;
/* loaded from: classes.dex */
public final class w47<V> implements Runnable {
    public final c57<V> p;
    public final f77<? extends V> q;

    public w47(c57 c57Var, f77 f77Var) {
        this.p = c57Var;
        this.q = f77Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object j;
        r47 r47Var;
        obj = this.p.p;
        if (obj != this) {
            return;
        }
        j = c57.j(this.q);
        r47Var = c57.u;
        if (r47Var.f(this.p, this, j)) {
            c57.B(this.p, false);
        }
    }
}
