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

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* renamed from: com.daaw.n41$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0077a extends Thread {
            public final int p;

            public C0077a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.p = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.p);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0077a(runnable, this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> implements Runnable {
        public Callable<T> p;
        public uj<T> q;
        public Handler r;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ uj p;
            public final /* synthetic */ Object q;

            public a(uj ujVar, Object obj) {
                this.p = ujVar;
                this.q = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.p.a(this.q);
            }
        }

        public b(Handler handler, Callable<T> callable, uj<T> ujVar) {
            this.p = callable;
            this.q = ujVar;
            this.r = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.p.call();
            } catch (Exception unused) {
                t = null;
            }
            this.r.post(new a(this.q, t));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, uj<T> ujVar) {
        executor.execute(new b(md.a(), callable, ujVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i) {
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
