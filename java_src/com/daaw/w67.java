package com.daaw;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class w67 implements f77 {

    /* renamed from: q */
    public static final f77 f30928q = new w67(null);

    /* renamed from: r */
    public static final Logger f30929r = Logger.getLogger(w67.class.getName());

    /* renamed from: p */
    public final Object f30930p;

    public w67(Object obj) {
        this.f30930p = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // com.daaw.f77
    /* renamed from: f */
    public final void mo6515f(Runnable runnable, Executor executor) {
        sy6.m9706c(runnable, "Runnable was null.");
        sy6.m9706c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f30929r;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f30930p;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f30930p;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f30930p);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }
}
