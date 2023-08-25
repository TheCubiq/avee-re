package com.daaw;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k67 extends j67 {
    public final f77 w;

    public k67(f77 f77Var) {
        Objects.requireNonNull(f77Var);
        this.w = f77Var;
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.w.cancel(z);
    }

    @Override // com.daaw.c57, com.daaw.f77
    public final void f(Runnable runnable, Executor executor) {
        this.w.f(runnable, executor);
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final Object get() {
        return this.w.get();
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.get(j, timeUnit);
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean isDone() {
        return this.w.isDone();
    }

    @Override // com.daaw.c57
    public final String toString() {
        return this.w.toString();
    }
}
