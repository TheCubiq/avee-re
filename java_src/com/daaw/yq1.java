package com.daaw;

import android.annotation.SuppressLint;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public final class yq1 {
    public static final ExecutorService a = cz.c("awaitEvenIfOnMainThread task continuation executor");

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ Callable p;
        public final /* synthetic */ tj1 q;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: com.daaw.yq1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0092a<T> implements hl<T, Void> {
            public C0092a() {
            }

            @Override // com.daaw.hl
            /* renamed from: b */
            public Void a(rj1<T> rj1Var) {
                if (rj1Var.n()) {
                    a.this.q.c(rj1Var.k());
                    return null;
                }
                a.this.q.b(rj1Var.j());
                return null;
            }
        }

        public a(Callable callable, tj1 tj1Var) {
            this.p = callable;
            this.q = tj1Var;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"TaskMainThread"})
        public void run() {
            try {
                ((rj1) this.p.call()).f(new C0092a());
            } catch (Exception e) {
                this.q.b(e);
            }
        }
    }

    public static <T> T d(rj1<T> rj1Var) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        rj1Var.g(a, new hl() { // from class: com.daaw.xq1
            @Override // com.daaw.hl
            public final Object a(rj1 rj1Var2) {
                Object g;
                g = yq1.g(countDownLatch, rj1Var2);
                return g;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (rj1Var.n()) {
            return rj1Var.k();
        }
        if (rj1Var.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (rj1Var.m()) {
            throw new IllegalStateException(rj1Var.j());
        }
        throw new TimeoutException();
    }

    public static boolean e(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> rj1<T> f(Executor executor, Callable<rj1<T>> callable) {
        tj1 tj1Var = new tj1();
        executor.execute(new a(callable, tj1Var));
        return tj1Var.a();
    }

    public static /* synthetic */ Object g(CountDownLatch countDownLatch, rj1 rj1Var) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void h(tj1 tj1Var, rj1 rj1Var) {
        if (rj1Var.n()) {
            tj1Var.e(rj1Var.k());
            return null;
        }
        Exception j = rj1Var.j();
        Objects.requireNonNull(j);
        tj1Var.d(j);
        return null;
    }

    public static /* synthetic */ Void i(tj1 tj1Var, rj1 rj1Var) {
        if (rj1Var.n()) {
            tj1Var.e(rj1Var.k());
            return null;
        }
        Exception j = rj1Var.j();
        Objects.requireNonNull(j);
        tj1Var.d(j);
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> rj1<T> j(rj1<T> rj1Var, rj1<T> rj1Var2) {
        final tj1 tj1Var = new tj1();
        hl<T, TContinuationResult> hlVar = new hl() { // from class: com.daaw.wq1
            @Override // com.daaw.hl
            public final Object a(rj1 rj1Var3) {
                Void h;
                h = yq1.h(tj1.this, rj1Var3);
                return h;
            }
        };
        rj1Var.f(hlVar);
        rj1Var2.f(hlVar);
        return tj1Var.a();
    }

    public static <T> rj1<T> k(Executor executor, rj1<T> rj1Var, rj1<T> rj1Var2) {
        final tj1 tj1Var = new tj1();
        hl<T, TContinuationResult> hlVar = new hl() { // from class: com.daaw.vq1
            @Override // com.daaw.hl
            public final Object a(rj1 rj1Var3) {
                Void i;
                i = yq1.i(tj1.this, rj1Var3);
                return i;
            }
        };
        rj1Var.g(executor, hlVar);
        rj1Var2.g(executor, hlVar);
        return tj1Var.a();
    }
}
