package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: com.daaw.zl */
/* loaded from: classes2.dex */
public class C3873zl {

    /* renamed from: a */
    public final Executor f35187a;

    /* renamed from: b */
    public rj1<Void> f35188b = dk1.m24304e(null);

    /* renamed from: c */
    public final Object f35189c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f35190d = new ThreadLocal<>();

    /* renamed from: com.daaw.zl$a */
    /* loaded from: classes2.dex */
    public class RunnableC3874a implements Runnable {
        public RunnableC3874a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3873zl.this.f35190d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.daaw.zl$b */
    /* loaded from: classes2.dex */
    public class CallableC3875b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f35192a;

        public CallableC3875b(Runnable runnable) {
            this.f35192a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f35192a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.daaw.zl$c */
    /* loaded from: classes2.dex */
    public class C3876c<T> implements InterfaceC1587hl<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f35194a;

        public C3876c(Callable callable) {
            this.f35194a = callable;
        }

        @Override // com.daaw.InterfaceC1587hl
        /* renamed from: a */
        public T mo2139a(rj1<Void> rj1Var) {
            return (T) this.f35194a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.daaw.zl$d */
    /* loaded from: classes2.dex */
    public class C3877d<T> implements InterfaceC1587hl<T, Void> {
        public C3877d() {
        }

        @Override // com.daaw.InterfaceC1587hl
        /* renamed from: b */
        public Void mo2139a(rj1<T> rj1Var) {
            return null;
        }
    }

    public C3873zl(Executor executor) {
        this.f35187a = executor;
        executor.execute(new RunnableC3874a());
    }

    /* renamed from: b */
    public void m2148b() {
        if (!m2145e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m2147c() {
        return this.f35187a;
    }

    /* renamed from: d */
    public final <T> rj1<Void> m2146d(rj1<T> rj1Var) {
        return rj1Var.mo11243g(this.f35187a, new C3877d());
    }

    /* renamed from: e */
    public final boolean m2145e() {
        return Boolean.TRUE.equals(this.f35190d.get());
    }

    /* renamed from: f */
    public final <T> InterfaceC1587hl<Void, T> m2144f(Callable<T> callable) {
        return new C3876c(callable);
    }

    /* renamed from: g */
    public rj1<Void> m2143g(Runnable runnable) {
        return m2142h(new CallableC3875b(runnable));
    }

    /* renamed from: h */
    public <T> rj1<T> m2142h(Callable<T> callable) {
        rj1<T> mo11243g;
        synchronized (this.f35189c) {
            mo11243g = this.f35188b.mo11243g(this.f35187a, m2144f(callable));
            this.f35188b = m2146d(mo11243g);
        }
        return mo11243g;
    }

    /* renamed from: i */
    public <T> rj1<T> m2141i(Callable<rj1<T>> callable) {
        rj1<T> mo11241i;
        synchronized (this.f35189c) {
            mo11241i = this.f35188b.mo11241i(this.f35187a, m2144f(callable));
            this.f35188b = m2146d(mo11241i);
        }
        return mo11241i;
    }
}
