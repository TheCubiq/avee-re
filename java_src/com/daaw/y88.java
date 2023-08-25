package com.daaw;
/* loaded from: classes2.dex */
public final class y88 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ ca8 q;

    public y88(ca8 ca8Var, long j) {
        this.q = ca8Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca8.p(this.q, this.p);
    }
}
