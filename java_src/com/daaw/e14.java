package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class e14 implements f77 {

    /* renamed from: p */
    public final o77 f8027p = o77.m14487D();

    /* renamed from: a */
    public static final boolean m23798a(boolean z) {
        if (!z) {
            zzt.zzo().m11903t(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    /* renamed from: b */
    public final boolean m23797b(Object obj) {
        boolean mo14486h = this.f8027p.mo14486h(obj);
        m23798a(mo14486h);
        return mo14486h;
    }

    /* renamed from: c */
    public final boolean m23796c(Throwable th) {
        boolean mo14485i = this.f8027p.mo14485i(th);
        m23798a(mo14485i);
        return mo14485i;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f8027p.cancel(z);
    }

    @Override // com.daaw.f77
    /* renamed from: f */
    public final void mo6515f(Runnable runnable, Executor executor) {
        this.f8027p.mo6515f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8027p.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f8027p.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8027p.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8027p.isDone();
    }
}
