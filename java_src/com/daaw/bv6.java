package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class bv6 implements zu6 {
    public /* synthetic */ bv6(av6 av6Var) {
    }

    @Override // com.daaw.zu6
    public final ExecutorService a(int i) {
        return b(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.daaw.zu6
    public final ExecutorService b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.daaw.zu6
    public final ExecutorService c(ThreadFactory threadFactory, int i) {
        return b(1, threadFactory, 1);
    }
}
