package com.daaw;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class al0<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f3291a;

    /* renamed from: b */
    public final boolean f3292b;

    /* renamed from: c */
    public final int f3293c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f3294d;

    /* renamed from: e */
    public static final C0646a f3287e = new C0646a(null);

    /* renamed from: h */
    public static final pi1 f3290h = new pi1("REMOVE_FROZEN");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3288f = AtomicReferenceFieldUpdater.newUpdater(al0.class, Object.class, "_next");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f3289g = AtomicLongFieldUpdater.newUpdater(al0.class, "_state");

    /* renamed from: com.daaw.al0$a */
    /* loaded from: classes2.dex */
    public static final class C0646a {
        public C0646a() {
        }

        public /* synthetic */ C0646a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final int m27363a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m27362b(long j, int i) {
            return m27360d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m27361c(long j, int i) {
            return m27360d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m27360d(long j, long j2) {
            return j & (j2 ^ (-1));
        }
    }

    /* renamed from: com.daaw.al0$b */
    /* loaded from: classes2.dex */
    public static final class C0647b {

        /* renamed from: a */
        public final int f3295a;

        public C0647b(int i) {
            this.f3295a = i;
        }
    }

    public al0(int i, boolean z) {
        this.f3291a = i;
        this.f3292b = z;
        int i2 = i - 1;
        this.f3293c = i2;
        this.f3294d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m27374a(E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return f3287e.m27363a(j);
            }
            C0646a c0646a = f3287e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f3293c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f3292b && this.f3294d.get(i2 & i3) != null) {
                int i4 = this.f3291a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (f3289g.compareAndSet(this, j, c0646a.m27361c(j, (i2 + 1) & 1073741823))) {
                this.f3294d.set(i2 & i3, e);
                al0<E> al0Var = this;
                while ((al0Var._state & 1152921504606846976L) != 0 && (al0Var = al0Var.m27366i().m27370e(i2, e)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final al0<E> m27373b(long j) {
        al0<E> al0Var = new al0<>(this.f3291a * 2, this.f3292b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f3293c;
            if ((i & i3) == (i2 & i3)) {
                al0Var._state = f3287e.m27360d(j, 1152921504606846976L);
                return al0Var;
            }
            Object obj = this.f3294d.get(i3 & i);
            if (obj == null) {
                obj = new C0647b(i);
            }
            al0Var.f3294d.set(al0Var.f3293c & i, obj);
            i++;
        }
    }

    /* renamed from: c */
    public final al0<E> m27372c(long j) {
        while (true) {
            al0<E> al0Var = (al0) this._next;
            if (al0Var != null) {
                return al0Var;
            }
            C1773j.m19216a(f3288f, this, null, m27373b(j));
        }
    }

    /* renamed from: d */
    public final boolean m27371d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f3289g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final al0<E> m27370e(int i, E e) {
        Object obj = this.f3294d.get(this.f3293c & i);
        if ((obj instanceof C0647b) && ((C0647b) obj).f3295a == i) {
            this.f3294d.set(i & this.f3293c, e);
            return this;
        }
        return null;
    }

    /* renamed from: f */
    public final int m27369f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean m27368g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: h */
    public final long m27367h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f3289g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: i */
    public final al0<E> m27366i() {
        return m27372c(m27367h());
    }

    /* renamed from: j */
    public final Object m27365j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f3290h;
            }
            C0646a c0646a = f3287e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f3293c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f3294d.get(i3 & i);
            if (obj == null) {
                if (this.f3292b) {
                    return null;
                }
            } else if (obj instanceof C0647b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f3289g.compareAndSet(this, j, c0646a.m27362b(j, i4))) {
                    this.f3294d.set(this.f3293c & i, null);
                    return obj;
                } else if (this.f3292b) {
                    al0<E> al0Var = this;
                    do {
                        al0Var = al0Var.m27364k(i, i4);
                    } while (al0Var != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: k */
    public final al0<E> m27364k(int i, int i2) {
        long j;
        C0646a c0646a;
        int i3;
        do {
            j = this._state;
            c0646a = f3287e;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return m27366i();
            }
        } while (!f3289g.compareAndSet(this, j, c0646a.m27362b(j, i2)));
        this.f3294d.set(this.f3293c & i3, null);
        return null;
    }
}
