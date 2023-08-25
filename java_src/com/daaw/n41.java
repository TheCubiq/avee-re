package com.daaw;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class n41 {

    /* renamed from: com.daaw.n41$a */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC2243a implements ThreadFactory {

        /* renamed from: a */
        public String f19458a;

        /* renamed from: b */
        public int f19459b;

        /* renamed from: com.daaw.n41$a$a */
        /* loaded from: classes.dex */
        public static class C2244a extends Thread {

            /* renamed from: p */
            public final int f19460p;

            public C2244a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f19460p = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f19460p);
                super.run();
            }
        }

        public ThreadFactoryC2243a(String str, int i) {
            this.f19458a = str;
            this.f19459b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2244a(runnable, this.f19458a, this.f19459b);
        }
    }

    /* renamed from: com.daaw.n41$b */
    /* loaded from: classes.dex */
    public static class RunnableC2245b<T> implements Runnable {

        /* renamed from: p */
        public Callable<T> f19461p;

        /* renamed from: q */
        public InterfaceC3222uj<T> f19462q;

        /* renamed from: r */
        public Handler f19463r;

        /* renamed from: com.daaw.n41$b$a */
        /* loaded from: classes.dex */
        public class RunnableC2246a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ InterfaceC3222uj f19464p;

            /* renamed from: q */
            public final /* synthetic */ Object f19465q;

            public RunnableC2246a(InterfaceC3222uj interfaceC3222uj, Object obj) {
                this.f19464p = interfaceC3222uj;
                this.f19465q = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f19464p.mo2971a(this.f19465q);
            }
        }

        public RunnableC2245b(Handler handler, Callable<T> callable, InterfaceC3222uj<T> interfaceC3222uj) {
            this.f19461p = callable;
            this.f19462q = interfaceC3222uj;
            this.f19463r = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f19461p.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f19463r.post(new RunnableC2246a(this.f19462q, t));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m15535a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2243a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static <T> void m15534b(Executor executor, Callable<T> callable, InterfaceC3222uj<T> interfaceC3222uj) {
        executor.execute(new RunnableC2245b(C2167md.m16088a(), callable, interfaceC3222uj));
    }

    /* renamed from: c */
    public static <T> T m15533c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
