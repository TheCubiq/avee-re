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
/* loaded from: classes2.dex */
public final class cz {

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {
        public final /* synthetic */ String a;
        public final /* synthetic */ AtomicLong b;

        /* renamed from: com.daaw.cz$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0047a extends ga {
            public final /* synthetic */ Runnable p;

            public C0047a(Runnable runnable) {
                this.p = runnable;
            }

            @Override // com.daaw.ga
            public void a() {
                this.p.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0047a(runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ga {
        public final /* synthetic */ String p;
        public final /* synthetic */ ExecutorService q;
        public final /* synthetic */ long r;
        public final /* synthetic */ TimeUnit s;

        public b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.p = str;
            this.q = executorService;
            this.r = j;
            this.s = timeUnit;
        }

        @Override // com.daaw.ga
        public void a() {
            try {
                ml0 f = ml0.f();
                f.b("Executing shutdown hook for " + this.p);
                this.q.shutdown();
                if (this.q.awaitTermination(this.r, this.s)) {
                    return;
                }
                ml0 f2 = ml0.f();
                f2.b(this.p + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.q.shutdownNow();
            } catch (InterruptedException unused) {
                ml0.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.p));
                this.q.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e);
        return e;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
