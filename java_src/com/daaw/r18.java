package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class r18 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ p28 q;

    public r18(p28 p28Var, AtomicReference atomicReference) {
        this.q = p28Var;
        this.p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.p) {
            this.p.set(Double.valueOf(this.q.a.z().j(this.q.a.B().s(), m75.P)));
            this.p.notify();
        }
    }
}
