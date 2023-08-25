package com.daaw;

import com.daaw.vs;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class us implements ScheduledExecutorService {
    public final ExecutorService p;
    public final ScheduledExecutorService q;

    public us(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.p = executorService;
        this.q = scheduledExecutorService;
    }

    public static /* synthetic */ void m(Runnable runnable, vs.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(final Runnable runnable, final vs.b bVar) {
        this.p.execute(new Runnable() { // from class: com.daaw.rs
            @Override // java.lang.Runnable
            public final void run() {
                us.m(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture o(final Runnable runnable, long j, TimeUnit timeUnit, final vs.b bVar) {
        return this.q.schedule(new Runnable() { // from class: com.daaw.os
            @Override // java.lang.Runnable
            public final void run() {
                us.this.n(runnable, bVar);
            }
        }, j, timeUnit);
    }

    public static /* synthetic */ void p(Callable callable, vs.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future q(final Callable callable, final vs.b bVar) {
        return this.p.submit(new Runnable() { // from class: com.daaw.js
            @Override // java.lang.Runnable
            public final void run() {
                us.p(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture r(final Callable callable, long j, TimeUnit timeUnit, final vs.b bVar) {
        return this.q.schedule(new Callable() { // from class: com.daaw.ks
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future q;
                q = us.this.q(callable, bVar);
                return q;
            }
        }, j, timeUnit);
    }

    public static /* synthetic */ void s(Runnable runnable, vs.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final Runnable runnable, final vs.b bVar) {
        this.p.execute(new Runnable() { // from class: com.daaw.ss
            @Override // java.lang.Runnable
            public final void run() {
                us.s(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture u(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final vs.b bVar) {
        return this.q.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.ps
            @Override // java.lang.Runnable
            public final void run() {
                us.this.t(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final vs.b bVar) {
        this.p.execute(new Runnable() { // from class: com.daaw.ts
            @Override // java.lang.Runnable
            public final void run() {
                us.x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final vs.b bVar) {
        return this.q.scheduleWithFixedDelay(new Runnable() { // from class: com.daaw.qs
            @Override // java.lang.Runnable
            public final void run() {
                us.this.v(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    public static /* synthetic */ void x(Runnable runnable, vs.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.p.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.p.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.p.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.p.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.p.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.p.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.p.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.p.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new vs(new vs.c() { // from class: com.daaw.ms
            @Override // com.daaw.vs.c
            public final ScheduledFuture a(vs.b bVar) {
                ScheduledFuture o;
                o = us.this.o(runnable, j, timeUnit, bVar);
                return o;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new vs(new vs.c() { // from class: com.daaw.ns
            @Override // com.daaw.vs.c
            public final ScheduledFuture a(vs.b bVar) {
                ScheduledFuture r;
                r = us.this.r(callable, j, timeUnit, bVar);
                return r;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new vs(new vs.c() { // from class: com.daaw.is
            @Override // com.daaw.vs.c
            public final ScheduledFuture a(vs.b bVar) {
                ScheduledFuture u;
                u = us.this.u(runnable, j, j2, timeUnit, bVar);
                return u;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new vs(new vs.c() { // from class: com.daaw.ls
            @Override // com.daaw.vs.c
            public final ScheduledFuture a(vs.b bVar) {
                ScheduledFuture w;
                w = us.this.w(runnable, j, j2, timeUnit, bVar);
                return w;
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
        return this.p.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.p.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.p.submit(callable);
    }
}
