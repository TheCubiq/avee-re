package com.daaw;
/* loaded from: classes2.dex */
public final class d28 implements Runnable {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ p28 q;

    public d28(p28 p28Var, boolean z) {
        this.q = p28Var;
        this.p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n = this.q.a.n();
        boolean m = this.q.a.m();
        this.q.a.j(this.p);
        if (m == this.p) {
            this.q.a.i().v().b("Default data collection state already set to", Boolean.valueOf(this.p));
        }
        if (this.q.a.n() == n || this.q.a.n() != this.q.a.m()) {
            this.q.a.i().x().c("Default data collection is different than actual status", Boolean.valueOf(this.p), Boolean.valueOf(n));
        }
        this.q.P();
    }
}
