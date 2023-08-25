package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class zl {
    public final Executor a;
    public rj1<Void> b = dk1.e(null);
    public final Object c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zl.this.d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<Void> {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class c<T> implements hl<Void, T> {
        public final /* synthetic */ Callable a;

        public c(Callable callable) {
            this.a = callable;
        }

        @Override // com.daaw.hl
        public T a(rj1<Void> rj1Var) {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class d<T> implements hl<T, Void> {
        public d() {
        }

        @Override // com.daaw.hl
        /* renamed from: b */
        public Void a(rj1<T> rj1Var) {
            return null;
        }
    }

    public zl(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    public final <T> rj1<Void> d(rj1<T> rj1Var) {
        return rj1Var.g(this.a, new d());
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    public final <T> hl<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public rj1<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> rj1<T> h(Callable<T> callable) {
        rj1<T> g;
        synchronized (this.c) {
            g = this.b.g(this.a, f(callable));
            this.b = d(g);
        }
        return g;
    }

    public <T> rj1<T> i(Callable<rj1<T>> callable) {
        rj1<T> i;
        synchronized (this.c) {
            i = this.b.i(this.a, f(callable));
            this.b = d(i);
        }
        return i;
    }
}
