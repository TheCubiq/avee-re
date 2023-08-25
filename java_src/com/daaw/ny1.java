package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class ny1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ny1.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<qj1> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ qj1 b(ny1 ny1Var, qj1 qj1Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ny1Var.a(qj1Var, z);
    }

    public final qj1 a(qj1 qj1Var, boolean z) {
        if (z) {
            return c(qj1Var);
        }
        qj1 qj1Var2 = (qj1) b.getAndSet(this, qj1Var);
        if (qj1Var2 == null) {
            return null;
        }
        return c(qj1Var2);
    }

    public final qj1 c(qj1 qj1Var) {
        if (qj1Var.q.b() == 1) {
            e.incrementAndGet(this);
        }
        if (e() == 127) {
            return qj1Var;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, qj1Var);
        c.incrementAndGet(this);
        return null;
    }

    public final void d(qj1 qj1Var) {
        if (qj1Var != null) {
            if (qj1Var.q.b() == 1) {
                e.decrementAndGet(this);
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(r70 r70Var) {
        qj1 qj1Var = (qj1) b.getAndSet(this, null);
        if (qj1Var != null) {
            r70Var.a(qj1Var);
        }
        do {
        } while (j(r70Var));
    }

    public final qj1 h() {
        qj1 qj1Var = (qj1) b.getAndSet(this, null);
        return qj1Var == null ? i() : qj1Var;
    }

    public final qj1 i() {
        qj1 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(r70 r70Var) {
        qj1 i = i();
        if (i == null) {
            return false;
        }
        r70Var.a(i);
        return true;
    }

    public final long k(ny1 ny1Var) {
        int i = ny1Var.consumerIndex;
        int i2 = ny1Var.producerIndex;
        AtomicReferenceArray<qj1> atomicReferenceArray = ny1Var.a;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (ny1Var.blockingTasksInBuffer == 0) {
                break;
            }
            qj1 qj1Var = atomicReferenceArray.get(i3);
            if (qj1Var != null) {
                if ((qj1Var.q.b() == 1) && atomicReferenceArray.compareAndSet(i3, qj1Var, null)) {
                    e.decrementAndGet(ny1Var);
                    b(this, qj1Var, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m(ny1Var, true);
    }

    public final long l(ny1 ny1Var) {
        qj1 i = ny1Var.i();
        if (i != null) {
            b(this, i, false, 2, null);
            return -1L;
        }
        return m(ny1Var, false);
    }

    public final long m(ny1 ny1Var, boolean z) {
        qj1 qj1Var;
        do {
            qj1Var = (qj1) ny1Var.lastScheduledTask;
            if (qj1Var == null) {
                return -2L;
            }
            if (z) {
                if (!(qj1Var.q.b() == 1)) {
                    return -2L;
                }
            }
            long a = ek1.e.a() - qj1Var.p;
            long j = ek1.a;
            if (a < j) {
                return j - a;
            }
        } while (!j.a(b, ny1Var, qj1Var, null));
        b(this, qj1Var, false, 2, null);
        return -1L;
    }
}
