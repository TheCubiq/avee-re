package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class r18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f24736p;

    /* renamed from: q */
    public final /* synthetic */ p28 f24737q;

    public r18(p28 p28Var, AtomicReference atomicReference) {
        this.f24737q = p28Var;
        this.f24736p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24736p) {
            this.f24736p.set(Double.valueOf(this.f24737q.f25143a.m24020z().m12667j(this.f24737q.f25143a.m24057B().m5301s(), m75.f18508P)));
            this.f24736p.notify();
        }
    }
}
