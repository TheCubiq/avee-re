package com.daaw;

import com.daaw.ScheduledFutureC3366vs;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.daaw.us */
/* loaded from: classes2.dex */
public class ScheduledExecutorServiceC3253us implements ScheduledExecutorService {

    /* renamed from: p */
    public final ExecutorService f29500p;

    /* renamed from: q */
    public final ScheduledExecutorService f29501q;

    public ScheduledExecutorServiceC3253us(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f29500p = executorService;
        this.f29501q = scheduledExecutorService;
    }

    /* renamed from: m */
    public static /* synthetic */ void m7759m(Runnable runnable, ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        try {
            runnable.run();
            interfaceC3368b.set(null);
        } catch (Exception e) {
            interfaceC3368b.mo6827a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m7758n(final Runnable runnable, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        this.f29500p.execute(new Runnable() { // from class: com.daaw.rs
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.m7759m(runnable, interfaceC3368b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m7757o(final Runnable runnable, long j, TimeUnit timeUnit, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        return this.f29501q.schedule(new Runnable() { // from class: com.daaw.os
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.this.m7758n(runnable, interfaceC3368b);
            }
        }, j, timeUnit);
    }

    /* renamed from: p */
    public static /* synthetic */ void m7756p(Callable callable, ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        try {
            interfaceC3368b.set(callable.call());
        } catch (Exception e) {
            interfaceC3368b.mo6827a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Future m7755q(final Callable callable, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        return this.f29500p.submit(new Runnable() { // from class: com.daaw.js
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.m7756p(callable, interfaceC3368b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m7754r(final Callable callable, long j, TimeUnit timeUnit, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        return this.f29501q.schedule(new Callable() { // from class: com.daaw.ks
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m7755q;
                m7755q = ScheduledExecutorServiceC3253us.this.m7755q(callable, interfaceC3368b);
                return m7755q;
            }
        }, j, timeUnit);
    }

    /* renamed from: s */
    public static /* synthetic */ void m7753s(Runnable runnable, ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC3368b.mo6827a(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m7752t(final Runnable runnable, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        this.f29500p.execute(new Runnable() { // from class: com.daaw.ss
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.m7753s(runnable, interfaceC3368b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ ScheduledFuture m7751u(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        return this.f29501q.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.ps
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.this.m7752t(runnable, interfaceC3368b);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m7750v(final Runnable runnable, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        this.f29500p.execute(new Runnable() { // from class: com.daaw.ts
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.m7748x(runnable, interfaceC3368b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m7749w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        return this.f29501q.scheduleWithFixedDelay(new Runnable() { // from class: com.daaw.qs
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC3253us.this.m7750v(runnable, interfaceC3368b);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: x */
    public static /* synthetic */ void m7748x(Runnable runnable, ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC3368b.mo6827a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f29500p.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29500p.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f29500p.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f29500p.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f29500p.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.f29500p.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f29500p.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f29500p.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC3366vs(new ScheduledFutureC3366vs.InterfaceC3369c() { // from class: com.daaw.ms
            @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3369c
            /* renamed from: a */
            public final ScheduledFuture mo6826a(ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
                ScheduledFuture m7757o;
                m7757o = ScheduledExecutorServiceC3253us.this.m7757o(runnable, j, timeUnit, interfaceC3368b);
                return m7757o;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC3366vs(new ScheduledFutureC3366vs.InterfaceC3369c() { // from class: com.daaw.ns
            @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3369c
            /* renamed from: a */
            public final ScheduledFuture mo6826a(ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
                ScheduledFuture m7754r;
                m7754r = ScheduledExecutorServiceC3253us.this.m7754r(callable, j, timeUnit, interfaceC3368b);
                return m7754r;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC3366vs(new ScheduledFutureC3366vs.InterfaceC3369c() { // from class: com.daaw.is
            @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3369c
            /* renamed from: a */
            public final ScheduledFuture mo6826a(ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
                ScheduledFuture m7751u;
                m7751u = ScheduledExecutorServiceC3253us.this.m7751u(runnable, j, j2, timeUnit, interfaceC3368b);
                return m7751u;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC3366vs(new ScheduledFutureC3366vs.InterfaceC3369c() { // from class: com.daaw.ls
            @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3369c
            /* renamed from: a */
            public final ScheduledFuture mo6826a(ScheduledFutureC3366vs.InterfaceC3368b interfaceC3368b) {
                ScheduledFuture m7749w;
                m7749w = ScheduledExecutorServiceC3253us.this.m7749w(runnable, j, j2, timeUnit, interfaceC3368b);
                return m7749w;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f29500p.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f29500p.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f29500p.submit(callable);
    }
}
