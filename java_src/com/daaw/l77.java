package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class l77 extends i77 implements ScheduledExecutorService {

    /* renamed from: q */
    public final ScheduledExecutorService f17112q;

    public l77(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f17112q = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        v77 m7362E = v77.m7362E(runnable, null);
        return new j77(m7362E, this.f17112q.schedule(m7362E, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        v77 v77Var = new v77(callable);
        return new j77(v77Var, this.f17112q.schedule(v77Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        k77 k77Var = new k77(runnable);
        return new j77(k77Var, this.f17112q.scheduleAtFixedRate(k77Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        k77 k77Var = new k77(runnable);
        return new j77(k77Var, this.f17112q.scheduleWithFixedDelay(k77Var, j, j2, timeUnit));
    }
}
