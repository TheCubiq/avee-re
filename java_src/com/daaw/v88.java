package com.daaw;
/* loaded from: classes2.dex */
public final class v88 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ ca8 q;

    public v88(ca8 ca8Var, long j) {
        this.q = ca8Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca8.q(this.q, this.p);
    }
}
