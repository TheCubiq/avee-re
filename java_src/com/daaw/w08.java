package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class w08 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ p28 q;

    public w08(p28 p28Var, AtomicReference atomicReference) {
        this.q = p28Var;
        this.p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.p) {
            this.p.set(Boolean.valueOf(this.q.a.z().B(this.q.a.B().s(), m75.L)));
            this.p.notify();
        }
    }
}
