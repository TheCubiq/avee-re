package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class o18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f20924p;

    /* renamed from: q */
    public final /* synthetic */ p28 f20925q;

    public o18(p28 p28Var, AtomicReference atomicReference) {
        this.f20925q = p28Var;
        this.f20924p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20924p) {
            this.f20924p.set(Integer.valueOf(this.f20925q.f25143a.m24020z().m12663n(this.f20925q.f25143a.m24057B().m5301s(), m75.f18507O)));
            this.f20924p.notify();
        }
    }
}
