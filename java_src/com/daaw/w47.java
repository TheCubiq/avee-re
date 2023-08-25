package com.daaw;
/* loaded from: classes.dex */
public final class w47<V> implements Runnable {

    /* renamed from: p */
    public final c57<V> f30885p;

    /* renamed from: q */
    public final f77<? extends V> f30886q;

    public w47(c57 c57Var, f77 f77Var) {
        this.f30885p = c57Var;
        this.f30886q = f77Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object m25612j;
        r47 r47Var;
        obj = this.f30885p.f5511p;
        if (obj != this) {
            return;
        }
        m25612j = c57.m25612j(this.f30886q);
        r47Var = c57.f5509u;
        if (r47Var.mo5528f(this.f30885p, this, m25612j)) {
            c57.m25616B(this.f30885p, false);
        }
    }
}
