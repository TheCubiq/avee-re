package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class wy1 {
    public static final String f = ll0.f("WorkTimer");
    public final ThreadFactory a;
    public final ScheduledExecutorService b;
    public final Map<String, c> c;
    public final Map<String, b> d;
    public final Object e;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public int a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public final wy1 p;
        public final String q;

        public c(wy1 wy1Var, String str) {
            this.p = wy1Var;
            this.q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.p.e) {
                if (this.p.c.remove(this.q) != null) {
                    b remove = this.p.d.remove(this.q);
                    if (remove != null) {
                        remove.a(this.q);
                    }
                } else {
                    ll0.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.q), new Throwable[0]);
                }
            }
        }
    }

    public wy1() {
        a aVar = new a();
        this.a = aVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.b.isShutdown()) {
            return;
        }
        this.b.shutdownNow();
    }

    public void b(String str, long j, b bVar) {
        synchronized (this.e) {
            ll0.c().a(f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            if (this.c.remove(str) != null) {
                ll0.c().a(f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.d.remove(str);
            }
        }
    }
}
