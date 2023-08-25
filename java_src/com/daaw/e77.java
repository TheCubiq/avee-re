package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class e77 extends AtomicReference implements Runnable {

    /* renamed from: p */
    public static final Runnable f8228p = new a77(null);

    /* renamed from: q */
    public static final Runnable f8229q = new a77(null);

    /* renamed from: a */
    public abstract Object mo8452a();

    /* renamed from: b */
    public abstract String mo8451b();

    /* renamed from: c */
    public final void m23673c(Thread thread) {
        Runnable runnable = (Runnable) get();
        y67 y67Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof y67)) {
                if (runnable != f8229q) {
                    break;
                }
            } else {
                y67Var = (y67) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f8229q;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(y67Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* renamed from: d */
    public abstract void mo8450d(Throwable th);

    /* renamed from: e */
    public abstract void mo8449e(Object obj);

    /* renamed from: f */
    public abstract boolean mo8448f();

    /* renamed from: g */
    public final void m23672g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            y67 y67Var = new y67(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, y67Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f8228p)) == f8229q) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f8228p)) == f8229q) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo8448f();
            if (z) {
                try {
                    obj = mo8452a();
                } catch (Throwable th) {
                    try {
                        n77.m15480a(th);
                        if (!compareAndSet(currentThread, f8228p)) {
                            m23673c(currentThread);
                        }
                        mo8450d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, f8228p)) {
                            m23673c(currentThread);
                        }
                        mo8449e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, f8228p)) {
                m23673c(currentThread);
            }
            if (z) {
                mo8449e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f8228p) {
            str = "running=[DONE]";
        } else if (runnable instanceof y67) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo8451b();
    }
}
