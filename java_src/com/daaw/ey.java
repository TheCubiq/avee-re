package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public abstract class ey extends fy implements gs {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(ey.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(ey.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes2.dex */
    public static abstract class a implements Runnable, Comparable<a>, iu, el1 {
        public long p;
        public Object q;
        public int r;

        @Override // com.daaw.iu
        public final synchronized void a() {
            pi1 pi1Var;
            pi1 pi1Var2;
            Object obj = this.q;
            pi1Var = hy.a;
            if (obj == pi1Var) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                bVar.g(this);
            }
            pi1Var2 = hy.a;
            this.q = pi1Var2;
        }

        @Override // com.daaw.el1
        public int b() {
            return this.r;
        }

        @Override // com.daaw.el1
        public dl1<?> d() {
            Object obj = this.q;
            if (obj instanceof dl1) {
                return (dl1) obj;
            }
            return null;
        }

        @Override // com.daaw.el1
        public void e(int i) {
            this.r = i;
        }

        @Override // com.daaw.el1
        public void f(dl1<?> dl1Var) {
            pi1 pi1Var;
            Object obj = this.q;
            pi1Var = hy.a;
            if (!(obj != pi1Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.q = dl1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(a aVar) {
            long j = this.p - aVar.p;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:39:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int h(long r8, com.daaw.ey.b r10, com.daaw.ey r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.q     // Catch: java.lang.Throwable -> L4b
                com.daaw.pi1 r1 = com.daaw.hy.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                com.daaw.el1 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                com.daaw.ey$a r0 = (com.daaw.ey.a) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = com.daaw.ey.i0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.p     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.p     // Catch: java.lang.Throwable -> L48
                long r3 = r10.b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L42
                r7.p = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                goto L4f
            L4e:
                throw r8
            L4f:
                goto L4e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.ey.a.h(long, com.daaw.ey$b, com.daaw.ey):int");
        }

        public final boolean i(long j) {
            return j - this.p >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.p + ']';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends dl1<a> {
        public long b;

        public b(long j) {
            this.b = j;
        }
    }

    @Override // com.daaw.pl
    public final void T(nl nlVar, Runnable runnable) {
        l0(runnable);
    }

    @Override // com.daaw.dy
    public long Z() {
        pi1 pi1Var;
        if (super.Z() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof al0)) {
                pi1Var = hy.b;
                return obj == pi1Var ? Long.MAX_VALUE : 0L;
            } else if (!((al0) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a e = bVar == null ? null : bVar.e();
        if (e == null) {
            return Long.MAX_VALUE;
        }
        long j = e.p;
        r.a();
        return f31.b(j - System.nanoTime(), 0L);
    }

    public final void j0() {
        pi1 pi1Var;
        pi1 pi1Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
                pi1Var = hy.b;
                if (j.a(atomicReferenceFieldUpdater, this, null, pi1Var)) {
                    return;
                }
            } else if (obj instanceof al0) {
                ((al0) obj).d();
                return;
            } else {
                pi1Var2 = hy.b;
                if (obj == pi1Var2) {
                    return;
                }
                al0 al0Var = new al0(8, true);
                al0Var.a((Runnable) obj);
                if (j.a(t, this, obj, al0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable k0() {
        pi1 pi1Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof al0) {
                al0 al0Var = (al0) obj;
                Object j = al0Var.j();
                if (j != al0.h) {
                    return (Runnable) j;
                }
                j.a(t, this, obj, al0Var.i());
            } else {
                pi1Var = hy.b;
                if (obj == pi1Var) {
                    return null;
                }
                if (j.a(t, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void l0(Runnable runnable) {
        if (m0(runnable)) {
            h0();
        } else {
            uq.v.l0(runnable);
        }
    }

    public final boolean m0(Runnable runnable) {
        pi1 pi1Var;
        while (true) {
            Object obj = this._queue;
            if (n0()) {
                return false;
            }
            if (obj == null) {
                if (j.a(t, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof al0) {
                al0 al0Var = (al0) obj;
                int a2 = al0Var.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    j.a(t, this, obj, al0Var.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                pi1Var = hy.b;
                if (obj == pi1Var) {
                    return false;
                }
                al0 al0Var2 = new al0(8, true);
                al0Var2.a((Runnable) obj);
                al0Var2.a(runnable);
                if (j.a(t, this, obj, al0Var2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean n0() {
        return this._isCompleted;
    }

    public boolean o0() {
        pi1 pi1Var;
        if (d0()) {
            b bVar = (b) this._delayed;
            if (bVar == null || bVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof al0) {
                        return ((al0) obj).g();
                    }
                    pi1Var = hy.b;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long p0() {
        /*
            r9 = this;
            boolean r0 = r9.e0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            com.daaw.ey$b r0 = (com.daaw.ey.b) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            com.daaw.r.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            com.daaw.el1 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
        L24:
            monitor-exit(r0)
            goto L3d
        L26:
            com.daaw.ey$a r5 = (com.daaw.ey.a) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.i(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.m0(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L24
            com.daaw.el1 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
            goto L24
        L3d:
            com.daaw.ey$a r6 = (com.daaw.ey.a) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.k0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.Z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ey.p0():long");
    }

    public final void q0() {
        r.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a i = bVar == null ? null : bVar.i();
            if (i == null) {
                return;
            }
            g0(nanoTime, i);
        }
    }

    public final void r0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void s0(long j, a aVar) {
        int t0 = t0(j, aVar);
        if (t0 == 0) {
            if (v0(aVar)) {
                h0();
            }
        } else if (t0 == 1) {
            g0(j, aVar);
        } else if (t0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // com.daaw.dy
    public void shutdown() {
        cl1.a.b();
        u0(true);
        j0();
        do {
        } while (p0() <= 0);
        q0();
    }

    public final int t0(long j, a aVar) {
        if (n0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            j.a(u, this, null, new b(j));
            Object obj = this._delayed;
            ug0.c(obj);
            bVar = (b) obj;
        }
        return aVar.h(j, bVar, this);
    }

    public final void u0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    public final boolean v0(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.e()) == aVar;
    }
}
