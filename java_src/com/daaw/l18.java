package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class l18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f16962p;

    /* renamed from: q */
    public final /* synthetic */ p28 f16963q;

    public l18(p28 p28Var, AtomicReference atomicReference) {
        this.f16963q = p28Var;
        this.f16962p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16962p) {
            this.f16962p.set(Long.valueOf(this.f16963q.f25143a.m24020z().m12660q(this.f16963q.f25143a.m24057B().m5301s(), m75.f18506N)));
            this.f16962p.notify();
        }
    }
}
