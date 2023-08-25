package com.daaw;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* renamed from: com.daaw.tl */
/* loaded from: classes2.dex */
public final class ExecutorC3090tl implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: p */
    public final int f27821p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q */
    public final int f27822q;

    /* renamed from: r */
    public final long f27823r;

    /* renamed from: s */
    public final String f27824s;

    /* renamed from: t */
    public final r70 f27825t;

    /* renamed from: u */
    public final r70 f27826u;

    /* renamed from: v */
    public final AtomicReferenceArray<C3093c> f27827v;

    /* renamed from: w */
    public static final C3091a f27817w = new C3091a(null);

    /* renamed from: A */
    public static final pi1 f27816A = new pi1("NOT_IN_STACK");

    /* renamed from: x */
    public static final /* synthetic */ AtomicLongFieldUpdater f27818x = AtomicLongFieldUpdater.newUpdater(ExecutorC3090tl.class, "parkedWorkersStack");

    /* renamed from: y */
    public static final /* synthetic */ AtomicLongFieldUpdater f27819y = AtomicLongFieldUpdater.newUpdater(ExecutorC3090tl.class, "controlState");

    /* renamed from: z */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27820z = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3090tl.class, "_isTerminated");

    /* renamed from: com.daaw.tl$a */
    /* loaded from: classes2.dex */
    public static final class C3091a {
        public C3091a() {
        }

        public /* synthetic */ C3091a(C2575pq c2575pq) {
            this();
        }
    }

    /* renamed from: com.daaw.tl$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3092b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27828a;

        static {
            int[] iArr = new int[EnumC3094d.values().length];
            iArr[EnumC3094d.PARKING.ordinal()] = 1;
            iArr[EnumC3094d.BLOCKING.ordinal()] = 2;
            iArr[EnumC3094d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC3094d.DORMANT.ordinal()] = 4;
            iArr[EnumC3094d.TERMINATED.ordinal()] = 5;
            f27828a = iArr;
        }
    }

    /* renamed from: com.daaw.tl$c */
    /* loaded from: classes2.dex */
    public final class C3093c extends Thread {

        /* renamed from: w */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f27829w = AtomicIntegerFieldUpdater.newUpdater(C3093c.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: p */
        public final ny1 f27830p;

        /* renamed from: q */
        public EnumC3094d f27831q;

        /* renamed from: r */
        public long f27832r;

        /* renamed from: s */
        public long f27833s;

        /* renamed from: t */
        public int f27834t;

        /* renamed from: u */
        public boolean f27835u;
        public volatile /* synthetic */ int workerCtl;

        public C3093c() {
            setDaemon(true);
            this.f27830p = new ny1();
            this.f27831q = EnumC3094d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC3090tl.f27816A;
            this.f27834t = z21.f34359p.mo2967b();
        }

        public C3093c(int i) {
            this();
            m9012o(i);
        }

        /* renamed from: b */
        public final void m9025b(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC3090tl.f27819y.addAndGet(ExecutorC3090tl.this, -2097152L);
            if (this.f27831q != EnumC3094d.TERMINATED) {
                this.f27831q = EnumC3094d.DORMANT;
            }
        }

        /* renamed from: c */
        public final void m9024c(int i) {
            if (i != 0 && m9008s(EnumC3094d.BLOCKING)) {
                ExecutorC3090tl.this.m9036W();
            }
        }

        /* renamed from: d */
        public final void m9023d(qj1 qj1Var) {
            int mo7118b = qj1Var.f24070q.mo7118b();
            m9018i(mo7118b);
            m9024c(mo7118b);
            ExecutorC3090tl.this.m9039T(qj1Var);
            m9025b(mo7118b);
        }

        /* renamed from: e */
        public final qj1 m9022e(boolean z) {
            qj1 m9014m;
            qj1 m9014m2;
            if (z) {
                boolean z2 = m9016k(ExecutorC3090tl.this.f27821p * 2) == 0;
                if (z2 && (m9014m2 = m9014m()) != null) {
                    return m9014m2;
                }
                qj1 m14726h = this.f27830p.m14726h();
                if (m14726h != null) {
                    return m14726h;
                }
                if (!z2 && (m9014m = m9014m()) != null) {
                    return m9014m;
                }
            } else {
                qj1 m9014m3 = m9014m();
                if (m9014m3 != null) {
                    return m9014m3;
                }
            }
            return m9007t(false);
        }

        /* renamed from: f */
        public final qj1 m9021f(boolean z) {
            qj1 m2153d;
            if (m9010q()) {
                return m9022e(z);
            }
            if (!z || (m2153d = this.f27830p.m14726h()) == null) {
                m2153d = ExecutorC3090tl.this.f27826u.m2153d();
            }
            return m2153d == null ? m9007t(true) : m2153d;
        }

        /* renamed from: g */
        public final int m9020g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object m9019h() {
            return this.nextParkedWorker;
        }

        /* renamed from: i */
        public final void m9018i(int i) {
            this.f27832r = 0L;
            if (this.f27831q == EnumC3094d.PARKING) {
                this.f27831q = EnumC3094d.BLOCKING;
            }
        }

        /* renamed from: j */
        public final boolean m9017j() {
            return this.nextParkedWorker != ExecutorC3090tl.f27816A;
        }

        /* renamed from: k */
        public final int m9016k(int i) {
            int i2 = this.f27834t;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f27834t = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: l */
        public final void m9015l() {
            if (this.f27832r == 0) {
                this.f27832r = System.nanoTime() + ExecutorC3090tl.this.f27823r;
            }
            LockSupport.parkNanos(ExecutorC3090tl.this.f27823r);
            if (System.nanoTime() - this.f27832r >= 0) {
                this.f27832r = 0L;
                m9006u();
            }
        }

        /* renamed from: m */
        public final qj1 m9014m() {
            r70 r70Var;
            if (m9016k(2) == 0) {
                qj1 m2153d = ExecutorC3090tl.this.f27825t.m2153d();
                if (m2153d != null) {
                    return m2153d;
                }
                r70Var = ExecutorC3090tl.this.f27826u;
            } else {
                qj1 m2153d2 = ExecutorC3090tl.this.f27826u.m2153d();
                if (m2153d2 != null) {
                    return m2153d2;
                }
                r70Var = ExecutorC3090tl.this.f27825t;
            }
            return r70Var.m2153d();
        }

        /* renamed from: n */
        public final void m9013n() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC3090tl.this.isTerminated() && this.f27831q != EnumC3094d.TERMINATED) {
                    qj1 m9021f = m9021f(this.f27835u);
                    if (m9021f != null) {
                        this.f27833s = 0L;
                        m9023d(m9021f);
                    } else {
                        this.f27835u = false;
                        if (this.f27833s == 0) {
                            m9009r();
                        } else if (z) {
                            m9008s(EnumC3094d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f27833s);
                            this.f27833s = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            m9008s(EnumC3094d.TERMINATED);
        }

        /* renamed from: o */
        public final void m9012o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC3090tl.this.f27824s);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void m9011p(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: q */
        public final boolean m9010q() {
            boolean z;
            if (this.f27831q != EnumC3094d.CPU_ACQUIRED) {
                ExecutorC3090tl executorC3090tl = ExecutorC3090tl.this;
                while (true) {
                    long j = executorC3090tl.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (ExecutorC3090tl.f27819y.compareAndSet(executorC3090tl, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f27831q = EnumC3094d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        public final void m9009r() {
            if (!m9017j()) {
                ExecutorC3090tl.this.m9041L(this);
                return;
            }
            this.workerCtl = -1;
            while (m9017j() && this.workerCtl == -1 && !ExecutorC3090tl.this.isTerminated() && this.f27831q != EnumC3094d.TERMINATED) {
                m9008s(EnumC3094d.PARKING);
                Thread.interrupted();
                m9015l();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m9013n();
        }

        /* renamed from: s */
        public final boolean m9008s(EnumC3094d enumC3094d) {
            EnumC3094d enumC3094d2 = this.f27831q;
            boolean z = enumC3094d2 == EnumC3094d.CPU_ACQUIRED;
            if (z) {
                ExecutorC3090tl.f27819y.addAndGet(ExecutorC3090tl.this, 4398046511104L);
            }
            if (enumC3094d2 != enumC3094d) {
                this.f27831q = enumC3094d;
            }
            return z;
        }

        /* renamed from: t */
        public final qj1 m9007t(boolean z) {
            int i = (int) (ExecutorC3090tl.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int m9016k = m9016k(i);
            ExecutorC3090tl executorC3090tl = ExecutorC3090tl.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                m9016k++;
                if (m9016k > i) {
                    m9016k = 1;
                }
                C3093c c3093c = executorC3090tl.f27827v.get(m9016k);
                if (c3093c != null && c3093c != this) {
                    ny1 ny1Var = this.f27830p;
                    ny1 ny1Var2 = c3093c.f27830p;
                    long m14723k = z ? ny1Var.m14723k(ny1Var2) : ny1Var.m14722l(ny1Var2);
                    if (m14723k == -1) {
                        return this.f27830p.m14726h();
                    }
                    if (m14723k > 0) {
                        j = Math.min(j, m14723k);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f27833s = j;
            return null;
        }

        /* renamed from: u */
        public final void m9006u() {
            ExecutorC3090tl executorC3090tl = ExecutorC3090tl.this;
            synchronized (executorC3090tl.f27827v) {
                if (executorC3090tl.isTerminated()) {
                    return;
                }
                if (((int) (executorC3090tl.controlState & 2097151)) <= executorC3090tl.f27821p) {
                    return;
                }
                if (f27829w.compareAndSet(this, -1, 1)) {
                    int m9020g = m9020g();
                    m9012o(0);
                    executorC3090tl.m9040Q(this, m9020g, 0);
                    int andDecrement = (int) (2097151 & ExecutorC3090tl.f27819y.getAndDecrement(executorC3090tl));
                    if (andDecrement != m9020g) {
                        C3093c c3093c = executorC3090tl.f27827v.get(andDecrement);
                        ug0.m8271c(c3093c);
                        C3093c c3093c2 = c3093c;
                        executorC3090tl.f27827v.set(m9020g, c3093c2);
                        c3093c2.m9012o(m9020g);
                        executorC3090tl.m9040Q(c3093c2, andDecrement, m9020g);
                    }
                    executorC3090tl.f27827v.set(andDecrement, null);
                    lp1 lp1Var = lp1.f17593a;
                    this.f27831q = EnumC3094d.TERMINATED;
                }
            }
        }
    }

    /* renamed from: com.daaw.tl$d */
    /* loaded from: classes2.dex */
    public enum EnumC3094d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC3090tl(int i, int i2, long j, String str) {
        this.f27821p = i;
        this.f27822q = i2;
        this.f27823r = j;
        this.f27824s = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f27825t = new r70();
        this.f27826u = new r70();
        this.parkedWorkersStack = 0L;
        this.f27827v = new AtomicReferenceArray<>(i2 + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    /* renamed from: D */
    public static /* synthetic */ void m9044D(ExecutorC3090tl executorC3090tl, Runnable runnable, uj1 uj1Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            uj1Var = ek1.f8533f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC3090tl.m9027w(runnable, uj1Var, z);
    }

    /* renamed from: Z */
    public static /* synthetic */ boolean m9033Z(ExecutorC3090tl executorC3090tl, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = executorC3090tl.controlState;
        }
        return executorC3090tl.m9034Y(j);
    }

    /* renamed from: E */
    public final int m9043E(C3093c c3093c) {
        int m9020g;
        do {
            Object m9019h = c3093c.m9019h();
            if (m9019h == f27816A) {
                return -1;
            }
            if (m9019h == null) {
                return 0;
            }
            c3093c = (C3093c) m9019h;
            m9020g = c3093c.m9020g();
        } while (m9020g == 0);
        return m9020g;
    }

    /* renamed from: K */
    public final C3093c m9042K() {
        while (true) {
            long j = this.parkedWorkersStack;
            C3093c c3093c = this.f27827v.get((int) (2097151 & j));
            if (c3093c == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int m9043E = m9043E(c3093c);
            if (m9043E >= 0 && f27818x.compareAndSet(this, j, m9043E | j2)) {
                c3093c.m9011p(f27816A);
                return c3093c;
            }
        }
    }

    /* renamed from: L */
    public final boolean m9041L(C3093c c3093c) {
        long j;
        int m9020g;
        if (c3093c.m9019h() != f27816A) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            m9020g = c3093c.m9020g();
            c3093c.m9011p(this.f27827v.get((int) (2097151 & j)));
        } while (!f27818x.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | m9020g));
        return true;
    }

    /* renamed from: Q */
    public final void m9040Q(C3093c c3093c, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? m9043E(c3093c) : i2;
            }
            if (i3 >= 0 && f27818x.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    /* renamed from: T */
    public final void m9039T(qj1 qj1Var) {
        try {
            qj1Var.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: U */
    public final void m9038U(long j) {
        int i;
        if (f27820z.compareAndSet(this, 0, 1)) {
            C3093c m9028u = m9028u();
            synchronized (this.f27827v) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C3093c c3093c = this.f27827v.get(i2);
                    ug0.m8271c(c3093c);
                    C3093c c3093c2 = c3093c;
                    if (c3093c2 != m9028u) {
                        while (c3093c2.isAlive()) {
                            LockSupport.unpark(c3093c2);
                            c3093c2.join(j);
                        }
                        c3093c2.f27830p.m14727g(this.f27826u);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f27826u.m2155b();
            this.f27825t.m2155b();
            while (true) {
                qj1 m9021f = m9028u == null ? null : m9028u.m9021f(true);
                if (m9021f == null && (m9021f = this.f27825t.m2153d()) == null && (m9021f = this.f27826u.m2153d()) == null) {
                    break;
                }
                m9039T(m9021f);
            }
            if (m9028u != null) {
                m9028u.m9008s(EnumC3094d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* renamed from: V */
    public final void m9037V(boolean z) {
        long addAndGet = f27819y.addAndGet(this, 2097152L);
        if (z || m9032a0() || m9034Y(addAndGet)) {
            return;
        }
        m9032a0();
    }

    /* renamed from: W */
    public final void m9036W() {
        if (m9032a0() || m9033Z(this, 0L, 1, null)) {
            return;
        }
        m9032a0();
    }

    /* renamed from: X */
    public final qj1 m9035X(C3093c c3093c, qj1 qj1Var, boolean z) {
        if (c3093c == null || c3093c.f27831q == EnumC3094d.TERMINATED) {
            return qj1Var;
        }
        if (qj1Var.f24070q.mo7118b() == 0 && c3093c.f27831q == EnumC3094d.BLOCKING) {
            return qj1Var;
        }
        c3093c.f27835u = true;
        return c3093c.f27830p.m14733a(qj1Var, z);
    }

    /* renamed from: Y */
    public final boolean m9034Y(long j) {
        if (f31.m22948a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f27821p) {
            int m9030n = m9030n();
            if (m9030n == 1 && this.f27821p > 1) {
                m9030n();
            }
            if (m9030n > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m9032a0() {
        C3093c m9042K;
        do {
            m9042K = m9042K();
            if (m9042K == null) {
                return false;
            }
        } while (!C3093c.f27829w.compareAndSet(m9042K, -1, 0));
        LockSupport.unpark(m9042K);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m9038U(10000L);
    }

    /* renamed from: d */
    public final boolean m9031d(qj1 qj1Var) {
        return (qj1Var.f24070q.mo7118b() == 1 ? this.f27826u : this.f27825t).m2156a(qj1Var);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m9044D(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: n */
    public final int m9030n() {
        int i;
        synchronized (this.f27827v) {
            if (isTerminated()) {
                i = -1;
            } else {
                long j = this.controlState;
                int i2 = (int) (j & 2097151);
                int m22948a = f31.m22948a(i2 - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (m22948a >= this.f27821p) {
                    return 0;
                }
                if (i2 >= this.f27822q) {
                    return 0;
                }
                int i3 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i3 > 0 && this.f27827v.get(i3) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C3093c c3093c = new C3093c(i3);
                this.f27827v.set(i3, c3093c);
                if (!(i3 == ((int) (2097151 & f27819y.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c3093c.start();
                i = m22948a + 1;
            }
            return i;
        }
    }

    /* renamed from: q */
    public final qj1 m9029q(Runnable runnable, uj1 uj1Var) {
        long mo8436a = ek1.f8532e.mo8436a();
        if (runnable instanceof qj1) {
            qj1 qj1Var = (qj1) runnable;
            qj1Var.f24069p = mo8436a;
            qj1Var.f24070q = uj1Var;
            return qj1Var;
        }
        return new zj1(runnable, mo8436a, uj1Var);
    }

    public String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        int length = this.f27827v.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < length) {
            int i7 = i6 + 1;
            C3093c c3093c = this.f27827v.get(i6);
            if (c3093c != null) {
                int m14728f = c3093c.f27830p.m14728f();
                int i8 = C3092b.f27828a[c3093c.f27831q.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(m14728f);
                        c = 'b';
                    } else if (i8 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(m14728f);
                        c = 'c';
                    } else if (i8 == 4) {
                        i4++;
                        if (m14728f > 0) {
                            sb = new StringBuilder();
                            sb.append(m14728f);
                            c = 'd';
                        }
                    } else if (i8 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f27824s + '@' + C0666aq.m27226b(this) + "[Pool Size {core = " + this.f27821p + ", max = " + this.f27822q + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f27825t.m2154c() + ", global blocking queue size = " + this.f27826u.m2154c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f27821p - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final C3093c m9028u() {
        Thread currentThread = Thread.currentThread();
        C3093c c3093c = currentThread instanceof C3093c ? (C3093c) currentThread : null;
        if (c3093c != null && ug0.m8273a(ExecutorC3090tl.this, this)) {
            return c3093c;
        }
        return null;
    }

    /* renamed from: w */
    public final void m9027w(Runnable runnable, uj1 uj1Var, boolean z) {
        C2803r.m11892a();
        qj1 m9029q = m9029q(runnable, uj1Var);
        C3093c m9028u = m9028u();
        qj1 m9035X = m9035X(m9028u, m9029q, z);
        if (m9035X != null && !m9031d(m9035X)) {
            throw new RejectedExecutionException(ug0.m8262l(this.f27824s, " was terminated"));
        }
        boolean z2 = z && m9028u != null;
        if (m9029q.f24070q.mo7118b() != 0) {
            m9037V(z2);
        } else if (z2) {
        } else {
            m9036W();
        }
    }
}
