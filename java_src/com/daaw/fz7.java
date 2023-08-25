package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class fz7 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ p28 q;

    public fz7(p28 p28Var, long j) {
        this.q = p28Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.z(this.p, true);
        this.q.a.L().S(new AtomicReference());
    }
}
