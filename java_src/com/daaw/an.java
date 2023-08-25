package com.daaw;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class an implements Thread.UncaughtExceptionHandler {
    public final a a;
    public final zb1 b;
    public final Thread.UncaughtExceptionHandler c;
    public final fm d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public interface a {
        void a(zb1 zb1Var, Thread thread, Throwable th);
    }

    public an(a aVar, zb1 zb1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fm fmVar) {
        this.a = aVar;
        this.b = zb1Var;
        this.c = uncaughtExceptionHandler;
        this.d = fmVar;
    }

    public boolean a() {
        return this.e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            ml0.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            ml0.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.d.b()) {
            ml0.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.daaw.ml0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.daaw.ml0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    ml0.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                ml0.f().e("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            ml0.f().b(r0);
            this.c.uncaughtException(thread, th);
            this.e.set(false);
        }
    }
}
