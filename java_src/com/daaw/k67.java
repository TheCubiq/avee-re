package com.daaw;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k67 extends j67 {

    /* renamed from: w */
    public final f77 f15716w;

    public k67(f77 f77Var) {
        Objects.requireNonNull(f77Var);
        this.f15716w = f77Var;
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f15716w.cancel(z);
    }

    @Override // com.daaw.c57, com.daaw.f77
    /* renamed from: f */
    public final void mo6515f(Runnable runnable, Executor executor) {
        this.f15716w.mo6515f(runnable, executor);
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final Object get() {
        return this.f15716w.get();
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f15716w.get(j, timeUnit);
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15716w.isCancelled();
    }

    @Override // com.daaw.c57, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15716w.isDone();
    }

    @Override // com.daaw.c57
    public final String toString() {
        return this.f15716w.toString();
    }
}
