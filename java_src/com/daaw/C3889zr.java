package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.daaw.zr */
/* loaded from: classes.dex */
public class C3889zr extends xj1 {

    /* renamed from: a */
    public final Object f35417a = new Object();

    /* renamed from: b */
    public final ExecutorService f35418b = Executors.newFixedThreadPool(4, new ThreadFactoryC3890a());

    /* renamed from: c */
    public volatile Handler f35419c;

    /* renamed from: com.daaw.zr$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC3890a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f35420a = new AtomicInteger(0);

        public ThreadFactoryC3890a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f35420a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    public static Handler m1974d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // com.daaw.xj1
    /* renamed from: a */
    public void mo1977a(Runnable runnable) {
        this.f35418b.execute(runnable);
    }

    @Override // com.daaw.xj1
    /* renamed from: b */
    public boolean mo1976b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // com.daaw.xj1
    /* renamed from: c */
    public void mo1975c(Runnable runnable) {
        if (this.f35419c == null) {
            synchronized (this.f35417a) {
                if (this.f35419c == null) {
                    this.f35419c = m1974d(Looper.getMainLooper());
                }
            }
        }
        this.f35419c.post(runnable);
    }
}
