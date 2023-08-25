package com.daaw;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: com.daaw.cz */
/* loaded from: classes2.dex */
public final class C1027cz {

    /* renamed from: com.daaw.cz$a */
    /* loaded from: classes2.dex */
    public class ThreadFactoryC1028a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f6297a;

        /* renamed from: b */
        public final /* synthetic */ AtomicLong f6298b;

        /* renamed from: com.daaw.cz$a$a */
        /* loaded from: classes2.dex */
        public class C1029a extends AbstractRunnableC1382ga {

            /* renamed from: p */
            public final /* synthetic */ Runnable f6299p;

            public C1029a(Runnable runnable) {
                this.f6299p = runnable;
            }

            @Override // com.daaw.AbstractRunnableC1382ga
            /* renamed from: a */
            public void mo21874a() {
                this.f6299p.run();
            }
        }

        public ThreadFactoryC1028a(String str, AtomicLong atomicLong) {
            this.f6297a = str;
            this.f6298b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C1029a(runnable));
            newThread.setName(this.f6297a + this.f6298b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.daaw.cz$b */
    /* loaded from: classes2.dex */
    public class C1030b extends AbstractRunnableC1382ga {

        /* renamed from: p */
        public final /* synthetic */ String f6301p;

        /* renamed from: q */
        public final /* synthetic */ ExecutorService f6302q;

        /* renamed from: r */
        public final /* synthetic */ long f6303r;

        /* renamed from: s */
        public final /* synthetic */ TimeUnit f6304s;

        public C1030b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f6301p = str;
            this.f6302q = executorService;
            this.f6303r = j;
            this.f6304s = timeUnit;
        }

        @Override // com.daaw.AbstractRunnableC1382ga
        /* renamed from: a */
        public void mo21874a() {
            try {
                ml0 m15976f = ml0.m15976f();
                m15976f.m15980b("Executing shutdown hook for " + this.f6301p);
                this.f6302q.shutdown();
                if (this.f6302q.awaitTermination(this.f6303r, this.f6304s)) {
                    return;
                }
                ml0 m15976f2 = ml0.m15976f();
                m15976f2.m15980b(this.f6301p + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f6302q.shutdownNow();
            } catch (InterruptedException unused) {
                ml0.m15976f().m15980b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f6301p));
                this.f6302q.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m24867a(String str, ExecutorService executorService) {
        m24866b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static void m24866b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C1030b c1030b = new C1030b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(c1030b, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m24865c(String str) {
        ExecutorService m24863e = m24863e(m24864d(str), new ThreadPoolExecutor.DiscardPolicy());
        m24867a(str, m24863e);
        return m24863e;
    }

    /* renamed from: d */
    public static ThreadFactory m24864d(String str) {
        return new ThreadFactoryC1028a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m24863e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
