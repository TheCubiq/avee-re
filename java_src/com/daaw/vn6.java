package com.daaw;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class vn6 extends ud7 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public tm6 c;
    public tm6 d;
    public final PriorityBlockingQueue e;
    public final BlockingQueue f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;
    public volatile boolean k;

    public vn6(dr6 dr6Var) {
        super(dr6Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new nk6(this, "Thread death: Uncaught exception on worker thread");
        this.h = new nk6(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean B(vn6 vn6Var) {
        boolean z = vn6Var.k;
        return false;
    }

    public final void A(Runnable runnable) {
        j();
        ry0.j(runnable);
        D(new ql6(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.c;
    }

    public final void D(ql6 ql6Var) {
        synchronized (this.i) {
            this.e.add(ql6Var);
            tm6 tm6Var = this.c;
            if (tm6Var == null) {
                tm6 tm6Var2 = new tm6(this, "Measurement Worker", this.e);
                this.c = tm6Var2;
                tm6Var2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                tm6Var.a();
            }
        }
    }

    @Override // com.daaw.rc7
    public final void e() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.daaw.rc7
    public final void f() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.daaw.ud7
    public final boolean h() {
        return false;
    }

    public final Object q(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.a.r().z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                hk5 w = this.a.i().w();
                w.a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.a.i().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        j();
        ry0.j(callable);
        ql6 ql6Var = new ql6(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.a.i().w().a("Callable skipped the worker queue.");
            }
            ql6Var.run();
        } else {
            D(ql6Var);
        }
        return ql6Var;
    }

    public final Future t(Callable callable) {
        j();
        ry0.j(callable);
        ql6 ql6Var = new ql6(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            ql6Var.run();
        } else {
            D(ql6Var);
        }
        return ql6Var;
    }

    public final void y(Runnable runnable) {
        j();
        ry0.j(runnable);
        ql6 ql6Var = new ql6(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(ql6Var);
            tm6 tm6Var = this.d;
            if (tm6Var == null) {
                tm6 tm6Var2 = new tm6(this, "Measurement Network", this.f);
                this.d = tm6Var2;
                tm6Var2.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                tm6Var.a();
            }
        }
    }

    public final void z(Runnable runnable) {
        j();
        ry0.j(runnable);
        D(new ql6(this, runnable, false, "Task exception on worker thread"));
    }
}
