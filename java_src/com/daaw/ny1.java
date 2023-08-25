package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class ny1 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20846b = AtomicReferenceFieldUpdater.newUpdater(ny1.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20847c = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "producerIndex");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20848d = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "consumerIndex");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20849e = AtomicIntegerFieldUpdater.newUpdater(ny1.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray<qj1> f20850a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ qj1 m14732b(ny1 ny1Var, qj1 qj1Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ny1Var.m14733a(qj1Var, z);
    }

    /* renamed from: a */
    public final qj1 m14733a(qj1 qj1Var, boolean z) {
        if (z) {
            return m14731c(qj1Var);
        }
        qj1 qj1Var2 = (qj1) f20846b.getAndSet(this, qj1Var);
        if (qj1Var2 == null) {
            return null;
        }
        return m14731c(qj1Var2);
    }

    /* renamed from: c */
    public final qj1 m14731c(qj1 qj1Var) {
        if (qj1Var.f24070q.mo7118b() == 1) {
            f20849e.incrementAndGet(this);
        }
        if (m14729e() == 127) {
            return qj1Var;
        }
        int i = this.producerIndex & 127;
        while (this.f20850a.get(i) != null) {
            Thread.yield();
        }
        this.f20850a.lazySet(i, qj1Var);
        f20847c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void m14730d(qj1 qj1Var) {
        if (qj1Var != null) {
            if (qj1Var.f24070q.mo7118b() == 1) {
                f20849e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int m14729e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m14728f() {
        return this.lastScheduledTask != null ? m14729e() + 1 : m14729e();
    }

    /* renamed from: g */
    public final void m14727g(r70 r70Var) {
        qj1 qj1Var = (qj1) f20846b.getAndSet(this, null);
        if (qj1Var != null) {
            r70Var.m2156a(qj1Var);
        }
        do {
        } while (m14724j(r70Var));
    }

    /* renamed from: h */
    public final qj1 m14726h() {
        qj1 qj1Var = (qj1) f20846b.getAndSet(this, null);
        return qj1Var == null ? m14725i() : qj1Var;
    }

    /* renamed from: i */
    public final qj1 m14725i() {
        qj1 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f20848d.compareAndSet(this, i, i + 1) && (andSet = this.f20850a.getAndSet(i2, null)) != null) {
                m14730d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean m14724j(r70 r70Var) {
        qj1 m14725i = m14725i();
        if (m14725i == null) {
            return false;
        }
        r70Var.m2156a(m14725i);
        return true;
    }

    /* renamed from: k */
    public final long m14723k(ny1 ny1Var) {
        int i = ny1Var.consumerIndex;
        int i2 = ny1Var.producerIndex;
        AtomicReferenceArray<qj1> atomicReferenceArray = ny1Var.f20850a;
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
                if ((qj1Var.f24070q.mo7118b() == 1) && atomicReferenceArray.compareAndSet(i3, qj1Var, null)) {
                    f20849e.decrementAndGet(ny1Var);
                    m14732b(this, qj1Var, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m14721m(ny1Var, true);
    }

    /* renamed from: l */
    public final long m14722l(ny1 ny1Var) {
        qj1 m14725i = ny1Var.m14725i();
        if (m14725i != null) {
            m14732b(this, m14725i, false, 2, null);
            return -1L;
        }
        return m14721m(ny1Var, false);
    }

    /* renamed from: m */
    public final long m14721m(ny1 ny1Var, boolean z) {
        qj1 qj1Var;
        do {
            qj1Var = (qj1) ny1Var.lastScheduledTask;
            if (qj1Var == null) {
                return -2L;
            }
            if (z) {
                if (!(qj1Var.f24070q.mo7118b() == 1)) {
                    return -2L;
                }
            }
            long mo8436a = ek1.f8532e.mo8436a() - qj1Var.f24069p;
            long j = ek1.f8528a;
            if (mo8436a < j) {
                return j - mo8436a;
            }
        } while (!C1773j.m19216a(f20846b, ny1Var, qj1Var, null));
        m14732b(this, qj1Var, false, 2, null);
        return -1L;
    }
}
