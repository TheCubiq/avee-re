package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class qg2 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f23924a = Executors.defaultThreadFactory();

    /* renamed from: b */
    public final AtomicInteger f23925b = new AtomicInteger(1);

    public qg2(C2842rb c2842rb) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f23924a.newThread(runnable);
        int andIncrement = this.f23925b.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
