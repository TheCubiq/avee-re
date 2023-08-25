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

    /* renamed from: p */
    public final AtomicInteger f24683p;

    /* renamed from: q */
    public final EnumC2809d f24684q;

    /* renamed from: com.daaw.r00$b */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC2806b implements ThreadFactory {

        /* renamed from: a */
        public int f24685a = 0;

        /* renamed from: com.daaw.r00$b$a */
        /* loaded from: classes.dex */
        public class C2807a extends Thread {
            public C2807a(Runnable runnable, String str) {
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
            C2807a c2807a = new C2807a(runnable, "fifo-pool-thread-" + this.f24685a);
            this.f24685a = this.f24685a + 1;
            return c2807a;
        }
    }

    /* renamed from: com.daaw.r00$c */
    /* loaded from: classes.dex */
    public static class C2808c<T> extends FutureTask<T> implements Comparable<C2808c<?>> {

        /* renamed from: p */
        public final int f24687p;

        /* renamed from: q */
        public final int f24688q;

        public C2808c(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (!(runnable instanceof bz0)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f24687p = ((bz0) runnable).mo16408a();
            this.f24688q = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C2808c<?> c2808c) {
            int i = this.f24687p - c2808c.f24687p;
            return i == 0 ? this.f24688q - c2808c.f24688q : i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2808c) {
                C2808c c2808c = (C2808c) obj;
                return this.f24688q == c2808c.f24688q && this.f24687p == c2808c.f24687p;
            }
            return false;
        }

        public int hashCode() {
            return (this.f24687p * 31) + this.f24688q;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.daaw.r00$d */
    /* loaded from: classes.dex */
    public static class EnumC2809d {

        /* renamed from: p */
        public static final EnumC2809d f24689p;

        /* renamed from: q */
        public static final EnumC2809d f24690q;

        /* renamed from: r */
        public static final EnumC2809d f24691r;

        /* renamed from: s */
        public static final /* synthetic */ EnumC2809d[] f24692s;

        /* renamed from: com.daaw.r00$d$a */
        /* loaded from: classes.dex */
        public enum C2810a extends EnumC2809d {
            public C2810a(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.r00.EnumC2809d
            /* renamed from: a */
            public void mo11886a(Throwable th) {
            }
        }

        /* renamed from: com.daaw.r00$d$b */
        /* loaded from: classes.dex */
        public enum C2811b extends EnumC2809d {
            public C2811b(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.r00.EnumC2809d
            /* renamed from: a */
            public void mo11886a(Throwable th) {
                super.mo11886a(th);
                throw new RuntimeException(th);
            }
        }

        static {
            EnumC2809d enumC2809d = new EnumC2809d("IGNORE", 0);
            f24689p = enumC2809d;
            C2810a c2810a = new C2810a("LOG", 1);
            f24690q = c2810a;
            C2811b c2811b = new C2811b("THROW", 2);
            f24691r = c2811b;
            f24692s = new EnumC2809d[]{enumC2809d, c2810a, c2811b};
        }

        public EnumC2809d(String str, int i) {
        }

        public static EnumC2809d valueOf(String str) {
            return (EnumC2809d) Enum.valueOf(EnumC2809d.class, str);
        }

        public static EnumC2809d[] values() {
            return (EnumC2809d[]) f24692s.clone();
        }

        /* renamed from: a */
        public void mo11886a(Throwable th) {
        }
    }

    public r00(int i) {
        this(i, EnumC2809d.f24690q);
    }

    public r00(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, EnumC2809d enumC2809d) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f24683p = new AtomicInteger();
        this.f24684q = enumC2809d;
    }

    public r00(int i, EnumC2809d enumC2809d) {
        this(i, i, 0L, TimeUnit.MILLISECONDS, new ThreadFactoryC2806b(), enumC2809d);
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
                this.f24684q.mo11886a(e);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C2808c(runnable, t, this.f24683p.getAndIncrement());
    }
}
