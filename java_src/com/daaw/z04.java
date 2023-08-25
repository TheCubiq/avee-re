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

    /* renamed from: a */
    public static final g77 f34305a;

    /* renamed from: b */
    public static final g77 f34306b;

    /* renamed from: c */
    public static final g77 f34307c;

    /* renamed from: d */
    public static final ScheduledExecutorService f34308d;

    /* renamed from: e */
    public static final g77 f34309e;

    /* renamed from: f */
    public static final g77 f34310f;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (C3327vf.m7198a()) {
            fv6.m22241a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new s04("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new s04("Default"));
        }
        f34305a = new y04(threadPoolExecutor, null);
        if (C3327vf.m7198a()) {
            threadPoolExecutor2 = fv6.m22241a().mo1868b(5, new s04("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s04("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        f34306b = new y04(threadPoolExecutor2, null);
        if (C3327vf.m7198a()) {
            threadPoolExecutor3 = fv6.m22241a().mo1867c(new s04("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s04("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        f34307c = new y04(threadPoolExecutor3, null);
        f34308d = new r04(3, new s04("Schedule"));
        f34309e = new y04(new t04(), null);
        f34310f = new y04(m77.m16187b(), null);
    }
}
