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

    /* renamed from: l */
    public static final AtomicLong f30360l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public tm6 f30361c;

    /* renamed from: d */
    public tm6 f30362d;

    /* renamed from: e */
    public final PriorityBlockingQueue f30363e;

    /* renamed from: f */
    public final BlockingQueue f30364f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f30365g;

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f30366h;

    /* renamed from: i */
    public final Object f30367i;

    /* renamed from: j */
    public final Semaphore f30368j;

    /* renamed from: k */
    public volatile boolean f30369k;

    public vn6(dr6 dr6Var) {
        super(dr6Var);
        this.f30367i = new Object();
        this.f30368j = new Semaphore(2);
        this.f30363e = new PriorityBlockingQueue();
        this.f30364f = new LinkedBlockingQueue();
        this.f30365g = new nk6(this, "Thread death: Uncaught exception on worker thread");
        this.f30366h = new nk6(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m6995B(vn6 vn6Var) {
        boolean z = vn6Var.f30369k;
        return false;
    }

    /* renamed from: A */
    public final void m6996A(Runnable runnable) {
        m8310j();
        ry0.m10830j(runnable);
        m6993D(new ql6(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m6994C() {
        return Thread.currentThread() == this.f30361c;
    }

    /* renamed from: D */
    public final void m6993D(ql6 ql6Var) {
        synchronized (this.f30367i) {
            this.f30363e.add(ql6Var);
            tm6 tm6Var = this.f30361c;
            if (tm6Var == null) {
                tm6 tm6Var2 = new tm6(this, "Measurement Worker", this.f30363e);
                this.f30361c = tm6Var2;
                tm6Var2.setUncaughtExceptionHandler(this.f30365g);
                this.f30361c.start();
            } else {
                tm6Var.m8963a();
            }
        }
    }

    @Override // com.daaw.rc7
    /* renamed from: e */
    public final void mo6992e() {
        if (Thread.currentThread() != this.f30362d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.daaw.rc7
    /* renamed from: f */
    public final void mo6991f() {
        if (Thread.currentThread() != this.f30361c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.daaw.ud7
    /* renamed from: h */
    public final boolean mo6990h() {
        return false;
    }

    /* renamed from: q */
    public final Object m6986q(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f25143a.mo3882r().m6978z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                hk5 m14155w = this.f25143a.mo3895i().m14155w();
                m14155w.m20653a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f25143a.mo3895i().m14155w().m20653a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: s */
    public final Future m6985s(Callable callable) {
        m8310j();
        ry0.m10830j(callable);
        ql6 ql6Var = new ql6(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30361c) {
            if (!this.f30363e.isEmpty()) {
                this.f25143a.mo3895i().m14155w().m20653a("Callable skipped the worker queue.");
            }
            ql6Var.run();
        } else {
            m6993D(ql6Var);
        }
        return ql6Var;
    }

    /* renamed from: t */
    public final Future m6984t(Callable callable) {
        m8310j();
        ry0.m10830j(callable);
        ql6 ql6Var = new ql6(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30361c) {
            ql6Var.run();
        } else {
            m6993D(ql6Var);
        }
        return ql6Var;
    }

    /* renamed from: y */
    public final void m6979y(Runnable runnable) {
        m8310j();
        ry0.m10830j(runnable);
        ql6 ql6Var = new ql6(this, runnable, false, "Task exception on network thread");
        synchronized (this.f30367i) {
            this.f30364f.add(ql6Var);
            tm6 tm6Var = this.f30362d;
            if (tm6Var == null) {
                tm6 tm6Var2 = new tm6(this, "Measurement Network", this.f30364f);
                this.f30362d = tm6Var2;
                tm6Var2.setUncaughtExceptionHandler(this.f30366h);
                this.f30362d.start();
            } else {
                tm6Var.m8963a();
            }
        }
    }

    /* renamed from: z */
    public final void m6978z(Runnable runnable) {
        m8310j();
        ry0.m10830j(runnable);
        m6993D(new ql6(this, runnable, false, "Task exception on worker thread"));
    }
}
