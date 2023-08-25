package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class gm6 implements f77 {
    public final Object p;
    public final String q;
    public final f77 r;

    public gm6(Object obj, String str, f77 f77Var) {
        this.p = obj;
        this.q = str;
        this.r = f77Var;
    }

    public final Object a() {
        return this.p;
    }

    public final String b() {
        return this.q;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.r.cancel(z);
    }

    @Override // com.daaw.f77
    public final void f(Runnable runnable, Executor executor) {
        this.r.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.r.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.r.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.r.isDone();
    }

    public final String toString() {
        String str = this.q;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }
}
