package com.daaw;

import android.os.Process;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class r00 extends ThreadPoolExecutor {
    public final AtomicInteger p;
    public final d q;

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {
        public int a = 0;

        /* loaded from: classes.dex */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            a aVar = new a(runnable, "fifo-pool-thread-" + this.a);
            this.a = this.a + 1;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> extends FutureTask<T> implements Comparable<c<?>> {
        public final int p;
        public final int q;

        public c(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (!(runnable instanceof bz0)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.p = ((bz0) runnable).a();
            this.q = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c<?> cVar) {
            int i = this.p - cVar.p;
            return i == 0 ? this.q - cVar.q : i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.q == cVar.q && this.p == cVar.p;
            }
            return false;
        }

        public int hashCode() {
            return (this.p * 31) + this.q;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static class d {
        public static final d p;
        public static final d q;
        public static final d r;
        public static final /* synthetic */ d[] s;

        /* loaded from: classes.dex */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.r00.d
            public void a(Throwable th) {
            }
        }

        /* loaded from: classes.dex */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.r00.d
            public void a(Throwable th) {
                super.a(th);
                throw new RuntimeException(th);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            p = dVar;
            a aVar = new a("LOG", 1);
            q = aVar;
            b bVar = new b("THROW", 2);
            r = bVar;
            s = new d[]{dVar, aVar, bVar};
        }

        public d(String str, int i) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) s.clone();
        }

        public void a(Throwable th) {
        }
    }

    public r00(int i) {
        this(i, d.q);
    }

    public r00(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.p = new AtomicInteger();
        this.q = dVar;
    }

    public r00(int i, d dVar) {
        this(i, i, 0L, TimeUnit.MILLISECONDS, new b(), dVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                this.q.a(e);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new c(runnable, t, this.p.getAndIncrement());
    }
}
