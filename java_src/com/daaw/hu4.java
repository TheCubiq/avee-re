package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes2.dex */
public final class hu4 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f12948a = Executors.defaultThreadFactory();

    public hu4(gk5 gk5Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12948a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
