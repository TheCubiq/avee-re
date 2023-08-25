package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class gm6 implements f77 {

    /* renamed from: p */
    public final Object f11444p;

    /* renamed from: q */
    public final String f11445q;

    /* renamed from: r */
    public final f77 f11446r;

    public gm6(Object obj, String str, f77 f77Var) {
        this.f11444p = obj;
        this.f11445q = str;
        this.f11446r = f77Var;
    }

    /* renamed from: a */
    public final Object m21488a() {
        return this.f11444p;
    }

    /* renamed from: b */
    public final String m21487b() {
        return this.f11445q;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f11446r.cancel(z);
    }

    @Override // com.daaw.f77
    /* renamed from: f */
    public final void mo6515f(Runnable runnable, Executor executor) {
        this.f11446r.mo6515f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11446r.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f11446r.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11446r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11446r.isDone();
    }

    public final String toString() {
        String str = this.f11445q;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }
}
