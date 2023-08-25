package com.daaw;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
/* renamed from: com.daaw.go */
/* loaded from: classes.dex */
public class ThreadFactoryC1449go implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f11481e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f11482a = new AtomicLong();

    /* renamed from: b */
    public final String f11483b;

    /* renamed from: c */
    public final int f11484c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f11485d;

    public ThreadFactoryC1449go(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f11483b = str;
        this.f11484c = i;
        this.f11485d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21427b(Runnable runnable) {
        Process.setThreadPriority(this.f11484c);
        StrictMode.ThreadPolicy threadPolicy = this.f11485d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f11481e.newThread(new Runnable() { // from class: com.daaw.fo
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC1449go.this.m21427b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f11483b, Long.valueOf(this.f11482a.getAndIncrement())));
        return newThread;
    }
}
