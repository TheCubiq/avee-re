package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class z04 {
    public static final g77 a;
    public static final g77 b;
    public static final g77 c;
    public static final ScheduledExecutorService d;
    public static final g77 e;
    public static final g77 f;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (vf.a()) {
            fv6.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new s04("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new s04("Default"));
        }
        a = new y04(threadPoolExecutor, null);
        if (vf.a()) {
            threadPoolExecutor2 = fv6.a().b(5, new s04("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s04("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        b = new y04(threadPoolExecutor2, null);
        if (vf.a()) {
            threadPoolExecutor3 = fv6.a().c(new s04("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s04("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        c = new y04(threadPoolExecutor3, null);
        d = new r04(3, new s04("Schedule"));
        e = new y04(new t04(), null);
        f = new y04(m77.b(), null);
    }
}
