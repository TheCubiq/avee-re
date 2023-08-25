package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class i18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f13190p;

    /* renamed from: q */
    public final /* synthetic */ p28 f13191q;

    public i18(p28 p28Var, AtomicReference atomicReference) {
        this.f13191q = p28Var;
        this.f13190p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13190p) {
            this.f13190p.set(this.f13191q.f25143a.m24020z().m12654x(this.f13191q.f25143a.m24057B().m5301s(), m75.f18505M));
            this.f13190p.notify();
        }
    }
}
