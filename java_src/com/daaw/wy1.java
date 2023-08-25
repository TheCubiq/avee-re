package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class wy1 {

    /* renamed from: f */
    public static final String f31653f = ll0.m16883f("WorkTimer");

    /* renamed from: a */
    public final ThreadFactory f31654a;

    /* renamed from: b */
    public final ScheduledExecutorService f31655b;

    /* renamed from: c */
    public final Map<String, RunnableC3484c> f31656c;

    /* renamed from: d */
    public final Map<String, InterfaceC3483b> f31657d;

    /* renamed from: e */
    public final Object f31658e;

    /* renamed from: com.daaw.wy1$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC3482a implements ThreadFactory {

        /* renamed from: a */
        public int f31659a = 0;

        public ThreadFactoryC3482a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f31659a);
            this.f31659a = this.f31659a + 1;
            return newThread;
        }
    }

    /* renamed from: com.daaw.wy1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3483b {
        /* renamed from: a */
        void mo5713a(String str);
    }

    /* renamed from: com.daaw.wy1$c */
    /* loaded from: classes.dex */
    public static class RunnableC3484c implements Runnable {

        /* renamed from: p */
        public final wy1 f31661p;

        /* renamed from: q */
        public final String f31662q;

        public RunnableC3484c(wy1 wy1Var, String str) {
            this.f31661p = wy1Var;
            this.f31662q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f31661p.f31658e) {
                if (this.f31661p.f31656c.remove(this.f31662q) != null) {
                    InterfaceC3483b remove = this.f31661p.f31657d.remove(this.f31662q);
                    if (remove != null) {
                        remove.mo5713a(this.f31662q);
                    }
                } else {
                    ll0.m16885c().mo16882a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f31662q), new Throwable[0]);
                }
            }
        }
    }

    public wy1() {
        ThreadFactoryC3482a threadFactoryC3482a = new ThreadFactoryC3482a();
        this.f31654a = threadFactoryC3482a;
        this.f31656c = new HashMap();
        this.f31657d = new HashMap();
        this.f31658e = new Object();
        this.f31655b = Executors.newSingleThreadScheduledExecutor(threadFactoryC3482a);
    }

    /* renamed from: a */
    public void m5716a() {
        if (this.f31655b.isShutdown()) {
            return;
        }
        this.f31655b.shutdownNow();
    }

    /* renamed from: b */
    public void m5715b(String str, long j, InterfaceC3483b interfaceC3483b) {
        synchronized (this.f31658e) {
            ll0.m16885c().mo16882a(f31653f, String.format("Starting timer for %s", str), new Throwable[0]);
            m5714c(str);
            RunnableC3484c runnableC3484c = new RunnableC3484c(this, str);
            this.f31656c.put(str, runnableC3484c);
            this.f31657d.put(str, interfaceC3483b);
            this.f31655b.schedule(runnableC3484c, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void m5714c(String str) {
        synchronized (this.f31658e) {
            if (this.f31656c.remove(str) != null) {
                ll0.m16885c().mo16882a(f31653f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f31657d.remove(str);
            }
        }
    }
}
