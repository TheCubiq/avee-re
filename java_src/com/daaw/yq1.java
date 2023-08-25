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

    /* renamed from: a */
    public static final ExecutorService f33952a = C1027cz.m24865c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: com.daaw.yq1$a */
    /* loaded from: classes2.dex */
    public class RunnableC3736a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Callable f33953p;

        /* renamed from: q */
        public final /* synthetic */ tj1 f33954q;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: com.daaw.yq1$a$a */
        /* loaded from: classes2.dex */
        public class C3737a<T> implements InterfaceC1587hl<T, Void> {
            public C3737a() {
            }

            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: b */
            public Void mo2139a(rj1<T> rj1Var) {
                if (rj1Var.mo11236n()) {
                    RunnableC3736a.this.f33954q.m9080c(rj1Var.mo11239k());
                    return null;
                }
                RunnableC3736a.this.f33954q.m9081b(rj1Var.mo11240j());
                return null;
            }
        }

        public RunnableC3736a(Callable callable, tj1 tj1Var) {
            this.f33953p = callable;
            this.f33954q = tj1Var;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"TaskMainThread"})
        public void run() {
            try {
                ((rj1) this.f33953p.call()).mo11244f(new C3737a());
            } catch (Exception e) {
                this.f33954q.m9081b(e);
            }
        }
    }

    /* renamed from: d */
    public static <T> T m3444d(rj1<T> rj1Var) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        rj1Var.mo11243g(f33952a, new InterfaceC1587hl() { // from class: com.daaw.xq1
            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: a */
            public final Object mo2139a(rj1 rj1Var2) {
                Object m3441g;
                m3441g = yq1.m3441g(countDownLatch, rj1Var2);
                return m3441g;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (rj1Var.mo11236n()) {
            return rj1Var.mo11239k();
        }
        if (rj1Var.mo11238l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (rj1Var.mo11237m()) {
            throw new IllegalStateException(rj1Var.mo11240j());
        }
        throw new TimeoutException();
    }

    /* renamed from: e */
    public static boolean m3443e(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
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

    /* renamed from: f */
    public static <T> rj1<T> m3442f(Executor executor, Callable<rj1<T>> callable) {
        tj1 tj1Var = new tj1();
        executor.execute(new RunnableC3736a(callable, tj1Var));
        return tj1Var.m9082a();
    }

    /* renamed from: g */
    public static /* synthetic */ Object m3441g(CountDownLatch countDownLatch, rj1 rj1Var) {
        countDownLatch.countDown();
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ Void m3440h(tj1 tj1Var, rj1 rj1Var) {
        if (rj1Var.mo11236n()) {
            tj1Var.m9078e(rj1Var.mo11239k());
            return null;
        }
        Exception mo11240j = rj1Var.mo11240j();
        Objects.requireNonNull(mo11240j);
        tj1Var.m9079d(mo11240j);
        return null;
    }

    /* renamed from: i */
    public static /* synthetic */ Void m3439i(tj1 tj1Var, rj1 rj1Var) {
        if (rj1Var.mo11236n()) {
            tj1Var.m9078e(rj1Var.mo11239k());
            return null;
        }
        Exception mo11240j = rj1Var.mo11240j();
        Objects.requireNonNull(mo11240j);
        tj1Var.m9079d(mo11240j);
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: j */
    public static <T> rj1<T> m3438j(rj1<T> rj1Var, rj1<T> rj1Var2) {
        final tj1 tj1Var = new tj1();
        InterfaceC1587hl<T, TContinuationResult> interfaceC1587hl = new InterfaceC1587hl() { // from class: com.daaw.wq1
            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: a */
            public final Object mo2139a(rj1 rj1Var3) {
                Void m3440h;
                m3440h = yq1.m3440h(tj1.this, rj1Var3);
                return m3440h;
            }
        };
        rj1Var.mo11244f(interfaceC1587hl);
        rj1Var2.mo11244f(interfaceC1587hl);
        return tj1Var.m9082a();
    }

    /* renamed from: k */
    public static <T> rj1<T> m3437k(Executor executor, rj1<T> rj1Var, rj1<T> rj1Var2) {
        final tj1 tj1Var = new tj1();
        InterfaceC1587hl<T, TContinuationResult> interfaceC1587hl = new InterfaceC1587hl() { // from class: com.daaw.vq1
            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: a */
            public final Object mo2139a(rj1 rj1Var3) {
                Void m3439i;
                m3439i = yq1.m3439i(tj1.this, rj1Var3);
                return m3439i;
            }
        };
        rj1Var.mo11243g(executor, interfaceC1587hl);
        rj1Var2.mo11243g(executor, interfaceC1587hl);
        return tj1Var.m9082a();
    }
}
