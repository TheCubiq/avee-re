package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class w08 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f30770p;

    /* renamed from: q */
    public final /* synthetic */ p28 f30771q;

    public w08(p28 p28Var, AtomicReference atomicReference) {
        this.f30771q = p28Var;
        this.f30770p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30770p) {
            this.f30770p.set(Boolean.valueOf(this.f30771q.f25143a.m24020z().m12677B(this.f30771q.f25143a.m24057B().m5301s(), m75.f18504L)));
            this.f30770p.notify();
        }
    }
}
