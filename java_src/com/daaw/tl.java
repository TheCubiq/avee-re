package com.daaw;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public final class tl implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public final int p;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final int q;
    public final long r;
    public final String s;
    public final r70 t;
    public final r70 u;
    public final AtomicReferenceArray<c> v;
    public static final a w = new a(null);
    public static final pi1 A = new pi1("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater x = AtomicLongFieldUpdater.newUpdater(tl.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater y = AtomicLongFieldUpdater.newUpdater(tl.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(tl.class, "_isTerminated");

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final ny1 p;
        public d q;
        public long r;
        public long s;
        public int t;
        public boolean u;
        public volatile /* synthetic */ int workerCtl;

        public c() {
            setDaemon(true);
            this.p = new ny1();
            this.q = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = tl.A;
            this.t = z21.p.b();
        }

        public c(int i) {
            this();
            o(i);
        }

        public final void b(int i) {
            if (i == 0) {
                return;
            }
            tl.y.addAndGet(tl.this, -2097152L);
            if (this.q != d.TERMINATED) {
                this.q = d.DORMANT;
            }
        }

        public final void c(int i) {
            if (i != 0 && s(d.BLOCKING)) {
                tl.this.W();
            }
        }

        public final void d(qj1 qj1Var) {
            int b = qj1Var.q.b();
            i(b);
            c(b);
            tl.this.T(qj1Var);
            b(b);
        }

        public final qj1 e(boolean z) {
            qj1 m;
            qj1 m2;
            if (z) {
                boolean z2 = k(tl.this.p * 2) == 0;
                if (z2 && (m2 = m()) != null) {
                    return m2;
                }
                qj1 h = this.p.h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m()) != null) {
                    return m;
                }
            } else {
                qj1 m3 = m();
                if (m3 != null) {
                    return m3;
                }
            }
            return t(false);
        }

        public final qj1 f(boolean z) {
            qj1 d;
            if (q()) {
                return e(z);
            }
            if (!z || (d = this.p.h()) == null) {
                d = tl.this.u.d();
            }
            return d == null ? t(true) : d;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final void i(int i) {
            this.r = 0L;
            if (this.q == d.PARKING) {
                this.q = d.BLOCKING;
            }
        }

        public final boolean j() {
            return this.nextParkedWorker != tl.A;
        }

        public final int k(int i) {
            int i2 = this.t;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.t = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final void l() {
            if (this.r == 0) {
                this.r = System.nanoTime() + tl.this.r;
            }
            LockSupport.parkNanos(tl.this.r);
            if (System.nanoTime() - this.r >= 0) {
                this.r = 0L;
                u();
            }
        }

        public final qj1 m() {
            r70 r70Var;
            if (k(2) == 0) {
                qj1 d = tl.this.t.d();
                if (d != null) {
                    return d;
                }
                r70Var = tl.this.u;
            } else {
                qj1 d2 = tl.this.u.d();
                if (d2 != null) {
                    return d2;
                }
                r70Var = tl.this.t;
            }
            return r70Var.d();
        }

        public final void n() {
            loop0: while (true) {
                boolean z = false;
                while (!tl.this.isTerminated() && this.q != d.TERMINATED) {
                    qj1 f = f(this.u);
                    if (f != null) {
                        this.s = 0L;
                        d(f);
                    } else {
                        this.u = false;
                        if (this.s == 0) {
                            r();
                        } else if (z) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.s);
                            this.s = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        public final void o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl.this.s);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean q() {
            boolean z;
            if (this.q != d.CPU_ACQUIRED) {
                tl tlVar = tl.this;
                while (true) {
                    long j = tlVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (tl.y.compareAndSet(tlVar, j, j - 4398046511104L)) {
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
                this.q = d.CPU_ACQUIRED;
            }
            return true;
        }

        public final void r() {
            if (!j()) {
                tl.this.L(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !tl.this.isTerminated() && this.q != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.q;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                tl.y.addAndGet(tl.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.q = dVar;
            }
            return z;
        }

        public final qj1 t(boolean z) {
            int i = (int) (tl.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = k(i);
            tl tlVar = tl.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                k++;
                if (k > i) {
                    k = 1;
                }
                c cVar = tlVar.v.get(k);
                if (cVar != null && cVar != this) {
                    ny1 ny1Var = this.p;
                    ny1 ny1Var2 = cVar.p;
                    long k2 = z ? ny1Var.k(ny1Var2) : ny1Var.l(ny1Var2);
                    if (k2 == -1) {
                        return this.p.h();
                    }
                    if (k2 > 0) {
                        j = Math.min(j, k2);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.s = j;
            return null;
        }

        public final void u() {
            tl tlVar = tl.this;
            synchronized (tlVar.v) {
                if (tlVar.isTerminated()) {
                    return;
                }
                if (((int) (tlVar.controlState & 2097151)) <= tlVar.p) {
                    return;
                }
                if (w.compareAndSet(this, -1, 1)) {
                    int g = g();
                    o(0);
                    tlVar.Q(this, g, 0);
                    int andDecrement = (int) (2097151 & tl.y.getAndDecrement(tlVar));
                    if (andDecrement != g) {
                        c cVar = tlVar.v.get(andDecrement);
                        ug0.c(cVar);
                        c cVar2 = cVar;
                        tlVar.v.set(g, cVar2);
                        cVar2.o(g);
                        tlVar.Q(cVar2, andDecrement, g);
                    }
                    tlVar.v.set(andDecrement, null);
                    lp1 lp1Var = lp1.a;
                    this.q = d.TERMINATED;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public tl(int i, int i2, long j, String str) {
        this.p = i;
        this.q = i2;
        this.r = j;
        this.s = str;
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
        this.t = new r70();
        this.u = new r70();
        this.parkedWorkersStack = 0L;
        this.v = new AtomicReferenceArray<>(i2 + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void D(tl tlVar, Runnable runnable, uj1 uj1Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            uj1Var = ek1.f;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        tlVar.w(runnable, uj1Var, z2);
    }

    public static /* synthetic */ boolean Z(tl tlVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tlVar.controlState;
        }
        return tlVar.Y(j);
    }

    public final int E(c cVar) {
        int g;
        do {
            Object h = cVar.h();
            if (h == A) {
                return -1;
            }
            if (h == null) {
                return 0;
            }
            cVar = (c) h;
            g = cVar.g();
        } while (g == 0);
        return g;
    }

    public final c K() {
        while (true) {
            long j = this.parkedWorkersStack;
            c cVar = this.v.get((int) (2097151 & j));
            if (cVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int E = E(cVar);
            if (E >= 0 && x.compareAndSet(this, j, E | j2)) {
                cVar.p(A);
                return cVar;
            }
        }
    }

    public final boolean L(c cVar) {
        long j;
        int g;
        if (cVar.h() != A) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.g();
            cVar.p(this.v.get((int) (2097151 & j)));
        } while (!x.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | g));
        return true;
    }

    public final void Q(c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? E(cVar) : i2;
            }
            if (i3 >= 0 && x.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public final void T(qj1 qj1Var) {
        try {
            qj1Var.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void U(long j) {
        int i;
        if (z.compareAndSet(this, 0, 1)) {
            c u = u();
            synchronized (this.v) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    c cVar = this.v.get(i2);
                    ug0.c(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != u) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j);
                        }
                        cVar2.p.g(this.u);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.u.b();
            this.t.b();
            while (true) {
                qj1 f = u == null ? null : u.f(true);
                if (f == null && (f = this.t.d()) == null && (f = this.u.d()) == null) {
                    break;
                }
                T(f);
            }
            if (u != null) {
                u.s(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void V(boolean z2) {
        long addAndGet = y.addAndGet(this, 2097152L);
        if (z2 || a0() || Y(addAndGet)) {
            return;
        }
        a0();
    }

    public final void W() {
        if (a0() || Z(this, 0L, 1, null)) {
            return;
        }
        a0();
    }

    public final qj1 X(c cVar, qj1 qj1Var, boolean z2) {
        if (cVar == null || cVar.q == d.TERMINATED) {
            return qj1Var;
        }
        if (qj1Var.q.b() == 0 && cVar.q == d.BLOCKING) {
            return qj1Var;
        }
        cVar.u = true;
        return cVar.p.a(qj1Var, z2);
    }

    public final boolean Y(long j) {
        if (f31.a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.p) {
            int n = n();
            if (n == 1 && this.p > 1) {
                n();
            }
            if (n > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean a0() {
        c K;
        do {
            K = K();
            if (K == null) {
                return false;
            }
        } while (!c.w.compareAndSet(K, -1, 0));
        LockSupport.unpark(K);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        U(10000L);
    }

    public final boolean d(qj1 qj1Var) {
        return (qj1Var.q.b() == 1 ? this.u : this.t).a(qj1Var);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        D(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int n() {
        int i;
        synchronized (this.v) {
            if (isTerminated()) {
                i = -1;
            } else {
                long j = this.controlState;
                int i2 = (int) (j & 2097151);
                int a2 = f31.a(i2 - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (a2 >= this.p) {
                    return 0;
                }
                if (i2 >= this.q) {
                    return 0;
                }
                int i3 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i3 > 0 && this.v.get(i3) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(i3);
                this.v.set(i3, cVar);
                if (!(i3 == ((int) (2097151 & y.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i = a2 + 1;
            }
            return i;
        }
    }

    public final qj1 q(Runnable runnable, uj1 uj1Var) {
        long a2 = ek1.e.a();
        if (runnable instanceof qj1) {
            qj1 qj1Var = (qj1) runnable;
            qj1Var.p = a2;
            qj1Var.q = uj1Var;
            return qj1Var;
        }
        return new zj1(runnable, a2, uj1Var);
    }

    public String toString() {
        StringBuilder sb;
        char c2;
        ArrayList arrayList = new ArrayList();
        int length = this.v.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < length) {
            int i7 = i6 + 1;
            c cVar = this.v.get(i6);
            if (cVar != null) {
                int f = cVar.p.f();
                int i8 = b.a[cVar.q.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c2 = 'b';
                    } else if (i8 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c2 = 'c';
                    } else if (i8 == 4) {
                        i4++;
                        if (f > 0) {
                            sb = new StringBuilder();
                            sb.append(f);
                            c2 = 'd';
                        }
                    } else if (i8 == 5) {
                        i5++;
                    }
                    sb.append(c2);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.s + '@' + aq.b(this) + "[Pool Size {core = " + this.p + ", max = " + this.q + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.t.c() + ", global blocking queue size = " + this.u.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.p - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final c u() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && ug0.a(tl.this, this)) {
            return cVar;
        }
        return null;
    }

    public final void w(Runnable runnable, uj1 uj1Var, boolean z2) {
        r.a();
        qj1 q = q(runnable, uj1Var);
        c u = u();
        qj1 X = X(u, q, z2);
        if (X != null && !d(X)) {
            throw new RejectedExecutionException(ug0.l(this.s, " was terminated"));
        }
        boolean z3 = z2 && u != null;
        if (q.q.b() != 0) {
            V(z3);
        } else if (z3) {
        } else {
            W();
        }
    }
}
