package com.daaw;

import java.lang.Thread;
/* loaded from: classes.dex */
public final class dt3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f7785a;

    /* renamed from: b */
    public final /* synthetic */ et3 f7786b;

    public dt3(et3 et3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7786b = et3Var;
        this.f7785a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f7786b.m23189g(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7785a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f7785a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            k04.zzg("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f7785a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
        }
    }
}
