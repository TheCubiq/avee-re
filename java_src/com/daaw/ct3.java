package com.daaw;

import java.lang.Thread;
/* loaded from: classes.dex */
public final class ct3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f6177a;

    /* renamed from: b */
    public final /* synthetic */ et3 f6178b;

    public ct3(et3 et3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6178b = et3Var;
        this.f6177a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f6178b.m23189g(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6177a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f6177a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            k04.zzg("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f6177a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
        }
    }
}
