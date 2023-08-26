package com.google.android.gms.internal.ads;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzadd implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzadb zzccb;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzccc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadd(zzadb zzadbVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzccb = zzadbVar;
        this.zzccc = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzccb.zza(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzccc;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            zzane.e("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzccc;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
