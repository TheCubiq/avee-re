package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class l18 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ p28 q;

    public l18(p28 p28Var, AtomicReference atomicReference) {
        this.q = p28Var;
        this.p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.p) {
            this.p.set(Long.valueOf(this.q.a.z().q(this.q.a.B().s(), m75.N)));
            this.p.notify();
        }
    }
}
