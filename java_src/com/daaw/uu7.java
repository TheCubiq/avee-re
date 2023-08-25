package com.daaw;
/* loaded from: classes2.dex */
public final class uu7 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ p28 q;

    public uu7(p28 p28Var, long j) {
        this.q = p28Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.a.F().k.b(this.p);
        this.q.a.i().p().b("Session timeout duration set", Long.valueOf(this.p));
    }
}
