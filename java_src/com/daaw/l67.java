package com.daaw;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class l67 extends p17 implements Future {
    /* renamed from: b */
    public abstract Future mo16196b();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo16196b().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return mo16196b().get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo16196b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo16196b().isDone();
    }
}
