package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class sm2 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f26416a = Executors.defaultThreadFactory();

    /* renamed from: b */
    public final AtomicInteger f26417b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f26416a.newThread(runnable);
        int andIncrement = this.f26417b.getAndIncrement();
        newThread.setName("gads-" + andIncrement);
        return newThread;
    }
}
