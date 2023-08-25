package com.daaw;
/* loaded from: classes2.dex */
public final class i48 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ r48 q;

    public i48(r48 r48Var, long j) {
        this.q = r48Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.a.y().m(this.p);
        this.q.e = null;
    }
}
