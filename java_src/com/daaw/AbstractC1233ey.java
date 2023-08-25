package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.daaw.ey */
/* loaded from: classes2.dex */
public abstract class AbstractC1233ey extends AbstractC1344fy implements InterfaceC1459gs {

    /* renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8927t = AtomicReferenceFieldUpdater.newUpdater(AbstractC1233ey.class, Object.class, "_queue");

    /* renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8928u = AtomicReferenceFieldUpdater.newUpdater(AbstractC1233ey.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* renamed from: com.daaw.ey$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractRunnableC1234a implements Runnable, Comparable<AbstractRunnableC1234a>, InterfaceC1754iu, el1 {

        /* renamed from: p */
        public long f8929p;

        /* renamed from: q */
        public Object f8930q;

        /* renamed from: r */
        public int f8931r;

        @Override // com.daaw.InterfaceC1754iu
        /* renamed from: a */
        public final synchronized void mo1955a() {
            pi1 pi1Var;
            pi1 pi1Var2;
            Object obj = this.f8930q;
            pi1Var = C1628hy.f13052a;
            if (obj == pi1Var) {
                return;
            }
            C1235b c1235b = obj instanceof C1235b ? (C1235b) obj : null;
            if (c1235b != null) {
                c1235b.m24274g(this);
            }
            pi1Var2 = C1628hy.f13052a;
            this.f8930q = pi1Var2;
        }

        @Override // com.daaw.el1
        /* renamed from: b */
        public int mo23022b() {
            return this.f8931r;
        }

        @Override // com.daaw.el1
        /* renamed from: d */
        public dl1<?> mo23021d() {
            Object obj = this.f8930q;
            if (obj instanceof dl1) {
                return (dl1) obj;
            }
            return null;
        }

        @Override // com.daaw.el1
        /* renamed from: e */
        public void mo23020e(int i) {
            this.f8931r = i;
        }

        @Override // com.daaw.el1
        /* renamed from: f */
        public void mo23019f(dl1<?> dl1Var) {
            pi1 pi1Var;
            Object obj = this.f8930q;
            pi1Var = C1628hy.f13052a;
            if (!(obj != pi1Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f8930q = dl1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(AbstractRunnableC1234a abstractRunnableC1234a) {
            long j = this.f8929p - abstractRunnableC1234a.f8929p;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:39:0x0001 }] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized int m23017h(long j, C1235b c1235b, AbstractC1233ey abstractC1233ey) {
            pi1 pi1Var;
            long j2;
            long j3;
            int i;
            Object obj = this.f8930q;
            pi1Var = C1628hy.f13052a;
            if (obj == pi1Var) {
                i = 2;
            } else {
                synchronized (c1235b) {
                    AbstractRunnableC1234a m24279b = c1235b.m24279b();
                    if (abstractC1233ey.m23031n0()) {
                        return 1;
                    }
                    if (m24279b != null) {
                        long j4 = m24279b.f8929p;
                        if (j4 - j < 0) {
                            j = j4;
                        }
                        if (j - c1235b.f8932b > 0) {
                        }
                        j2 = this.f8929p;
                        j3 = c1235b.f8932b;
                        if (j2 - j3 < 0) {
                            this.f8929p = j3;
                        }
                        c1235b.m24280a(this);
                        i = 0;
                    }
                    c1235b.f8932b = j;
                    j2 = this.f8929p;
                    j3 = c1235b.f8932b;
                    if (j2 - j3 < 0) {
                    }
                    c1235b.m24280a(this);
                    i = 0;
                }
            }
            return i;
        }

        /* renamed from: i */
        public final boolean m23016i(long j) {
            return j - this.f8929p >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f8929p + ']';
        }
    }

    /* renamed from: com.daaw.ey$b */
    /* loaded from: classes2.dex */
    public static final class C1235b extends dl1<AbstractRunnableC1234a> {

        /* renamed from: b */
        public long f8932b;

        public C1235b(long j) {
            this.f8932b = j;
        }
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public final void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        mo7832l0(runnable);
    }

    @Override // com.daaw.AbstractC1150dy
    /* renamed from: Z */
    public long mo23036Z() {
        pi1 pi1Var;
        if (super.mo23036Z() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof al0)) {
                pi1Var = C1628hy.f13053b;
                return obj == pi1Var ? Long.MAX_VALUE : 0L;
            } else if (!((al0) obj).m27368g()) {
                return 0L;
            }
        }
        C1235b c1235b = (C1235b) this._delayed;
        AbstractRunnableC1234a m24276e = c1235b == null ? null : c1235b.m24276e();
        if (m24276e == null) {
            return Long.MAX_VALUE;
        }
        long j = m24276e.f8929p;
        C2803r.m11892a();
        return f31.m22947b(j - System.nanoTime(), 0L);
    }

    /* renamed from: j0 */
    public final void m23034j0() {
        pi1 pi1Var;
        pi1 pi1Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8927t;
                pi1Var = C1628hy.f13053b;
                if (C1773j.m19216a(atomicReferenceFieldUpdater, this, null, pi1Var)) {
                    return;
                }
            } else if (obj instanceof al0) {
                ((al0) obj).m27371d();
                return;
            } else {
                pi1Var2 = C1628hy.f13053b;
                if (obj == pi1Var2) {
                    return;
                }
                al0 al0Var = new al0(8, true);
                al0Var.m27374a((Runnable) obj);
                if (C1773j.m19216a(f8927t, this, obj, al0Var)) {
                    return;
                }
            }
        }
    }

    /* renamed from: k0 */
    public final Runnable m23033k0() {
        pi1 pi1Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof al0) {
                al0 al0Var = (al0) obj;
                Object m27365j = al0Var.m27365j();
                if (m27365j != al0.f3290h) {
                    return (Runnable) m27365j;
                }
                C1773j.m19216a(f8927t, this, obj, al0Var.m27366i());
            } else {
                pi1Var = C1628hy.f13053b;
                if (obj == pi1Var) {
                    return null;
                }
                if (C1773j.m19216a(f8927t, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: l0 */
    public void mo7832l0(Runnable runnable) {
        if (m23032m0(runnable)) {
            m22138h0();
        } else {
            RunnableC3251uq.f29423v.mo7832l0(runnable);
        }
    }

    /* renamed from: m0 */
    public final boolean m23032m0(Runnable runnable) {
        pi1 pi1Var;
        while (true) {
            Object obj = this._queue;
            if (m23031n0()) {
                return false;
            }
            if (obj == null) {
                if (C1773j.m19216a(f8927t, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof al0) {
                al0 al0Var = (al0) obj;
                int m27374a = al0Var.m27374a(runnable);
                if (m27374a == 0) {
                    return true;
                }
                if (m27374a == 1) {
                    C1773j.m19216a(f8927t, this, obj, al0Var.m27366i());
                } else if (m27374a == 2) {
                    return false;
                }
            } else {
                pi1Var = C1628hy.f13053b;
                if (obj == pi1Var) {
                    return false;
                }
                al0 al0Var2 = new al0(8, true);
                al0Var2.m27374a((Runnable) obj);
                al0Var2.m27374a(runnable);
                if (C1773j.m19216a(f8927t, this, obj, al0Var2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: n0 */
    public final boolean m23031n0() {
        return this._isCompleted;
    }

    /* renamed from: o0 */
    public boolean m23030o0() {
        pi1 pi1Var;
        if (m23818d0()) {
            C1235b c1235b = (C1235b) this._delayed;
            if (c1235b == null || c1235b.m24277d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof al0) {
                        return ((al0) obj).m27368g();
                    }
                    pi1Var = C1628hy.f13053b;
                    if (obj != pi1Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m23029p0() {
        Runnable m23033k0;
        AbstractRunnableC1234a abstractRunnableC1234a;
        if (m23817e0()) {
            return 0L;
        }
        C1235b c1235b = (C1235b) this._delayed;
        if (c1235b == null || c1235b.m24277d()) {
            m23033k0 = m23033k0();
            if (m23033k0 == null) {
                m23033k0.run();
                return 0L;
            }
            return mo23036Z();
        }
        C2803r.m11892a();
        long nanoTime = System.nanoTime();
        do {
            synchronized (c1235b) {
                AbstractRunnableC1234a m24279b = c1235b.m24279b();
                abstractRunnableC1234a = null;
                if (m24279b != null) {
                    AbstractRunnableC1234a abstractRunnableC1234a2 = m24279b;
                    if (abstractRunnableC1234a2.m23016i(nanoTime) ? m23032m0(abstractRunnableC1234a2) : false) {
                        abstractRunnableC1234a = c1235b.m24273h(0);
                    }
                }
            }
        } while (abstractRunnableC1234a != null);
        m23033k0 = m23033k0();
        if (m23033k0 == null) {
        }
    }

    /* renamed from: q0 */
    public final void m23028q0() {
        C2803r.m11892a();
        long nanoTime = System.nanoTime();
        while (true) {
            C1235b c1235b = (C1235b) this._delayed;
            AbstractRunnableC1234a m24272i = c1235b == null ? null : c1235b.m24272i();
            if (m24272i == null) {
                return;
            }
            mo7833g0(nanoTime, m24272i);
        }
    }

    /* renamed from: r0 */
    public final void m23027r0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: s0 */
    public final void m23026s0(long j, AbstractRunnableC1234a abstractRunnableC1234a) {
        int m23025t0 = m23025t0(j, abstractRunnableC1234a);
        if (m23025t0 == 0) {
            if (m23023v0(abstractRunnableC1234a)) {
                m22138h0();
            }
        } else if (m23025t0 == 1) {
            mo7833g0(j, abstractRunnableC1234a);
        } else if (m23025t0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // com.daaw.AbstractC1150dy
    public void shutdown() {
        cl1.f5936a.m25250b();
        m23024u0(true);
        m23034j0();
        do {
        } while (m23029p0() <= 0);
        m23028q0();
    }

    /* renamed from: t0 */
    public final int m23025t0(long j, AbstractRunnableC1234a abstractRunnableC1234a) {
        if (m23031n0()) {
            return 1;
        }
        C1235b c1235b = (C1235b) this._delayed;
        if (c1235b == null) {
            C1773j.m19216a(f8928u, this, null, new C1235b(j));
            Object obj = this._delayed;
            ug0.m8271c(obj);
            c1235b = (C1235b) obj;
        }
        return abstractRunnableC1234a.m23017h(j, c1235b, this);
    }

    /* renamed from: u0 */
    public final void m23024u0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: v0 */
    public final boolean m23023v0(AbstractRunnableC1234a abstractRunnableC1234a) {
        C1235b c1235b = (C1235b) this._delayed;
        return (c1235b == null ? null : c1235b.m24276e()) == abstractRunnableC1234a;
    }
}
