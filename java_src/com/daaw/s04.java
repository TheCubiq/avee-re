package com.daaw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class s04 implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f25751a = new AtomicInteger(1);

    /* renamed from: b */
    public final /* synthetic */ String f25752b;

    public s04(String str) {
        this.f25752b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f25752b;
        int andIncrement = this.f25751a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
