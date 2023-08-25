package com.daaw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class yz3 implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f34292a = new AtomicInteger(1);

    /* renamed from: b */
    public final /* synthetic */ String f34293b;

    public yz3(String str) {
        this.f34293b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f34293b;
        int andIncrement = this.f34292a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
