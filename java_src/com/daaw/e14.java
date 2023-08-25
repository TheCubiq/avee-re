package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class e14 implements f77 {
    public final o77 p = o77.D();

    public static final boolean a(boolean z) {
        if (!z) {
            zzt.zzo().t(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean b(Object obj) {
        boolean h = this.p.h(obj);
        a(h);
        return h;
    }

    public final boolean c(Throwable th) {
        boolean i = this.p.i(th);
        a(i);
        return i;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.p.cancel(z);
    }

    @Override // com.daaw.f77
    public final void f(Runnable runnable, Executor executor) {
        this.p.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.p.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.p.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.p.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.p.isDone();
    }
}
