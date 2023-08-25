package com.daaw;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.daaw.an */
/* loaded from: classes2.dex */
public class C0650an implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final InterfaceC0651a f3325a;

    /* renamed from: b */
    public final zb1 f3326b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f3327c;

    /* renamed from: d */
    public final InterfaceC1306fm f3328d;

    /* renamed from: e */
    public final AtomicBoolean f3329e = new AtomicBoolean(false);

    /* renamed from: com.daaw.an$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0651a {
        /* renamed from: a */
        void mo26009a(zb1 zb1Var, Thread thread, Throwable th);
    }

    public C0650an(InterfaceC0651a interfaceC0651a, zb1 zb1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC1306fm interfaceC1306fm) {
        this.f3325a = interfaceC0651a;
        this.f3326b = zb1Var;
        this.f3327c = uncaughtExceptionHandler;
        this.f3328d = interfaceC1306fm;
    }

    /* renamed from: a */
    public boolean m27337a() {
        return this.f3329e.get();
    }

    /* renamed from: b */
    public final boolean m27336b(Thread thread, Throwable th) {
        if (thread == null) {
            ml0.m15976f().m15978d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            ml0.m15976f().m15978d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f3328d.mo19654b()) {
            ml0.m15976f().m15980b("Crashlytics will not record uncaught exception; native crash exists for session.");
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
        this.f3329e.set(true);
        try {
            try {
                if (m27336b(thread, th)) {
                    this.f3325a.mo26009a(this.f3326b, thread, th);
                } else {
                    ml0.m15976f().m15980b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                ml0.m15976f().m15977e("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            ml0.m15976f().m15980b(r0);
            this.f3327c.uncaughtException(thread, th);
            this.f3329e.set(false);
        }
    }
}
