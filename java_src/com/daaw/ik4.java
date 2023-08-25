package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final /* synthetic */ class ik4 implements Runnable {
    public final /* synthetic */ AtomicReference p;

    public /* synthetic */ ik4(AtomicReference atomicReference) {
        this.p = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.o(this.p);
    }
}
