package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class yk0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes2.dex */
    public static abstract class a extends e7<yk0> {
        public final yk0 b;
        public yk0 c;

        public a(yk0 yk0Var) {
            this.b = yk0Var;
        }

        @Override // com.daaw.e7
        /* renamed from: h */
        public void d(yk0 yk0Var, Object obj) {
            boolean z = obj == null;
            yk0 yk0Var2 = z ? this.b : this.c;
            if (yk0Var2 != null && j.a(yk0.p, yk0Var, this, yk0Var2) && z) {
                yk0 yk0Var3 = this.b;
                yk0 yk0Var4 = this.c;
                ug0.c(yk0Var4);
                yk0Var3.j(yk0Var4);
            }
        }
    }

    public final boolean g(yk0 yk0Var) {
        q.lazySet(yk0Var, this);
        p.lazySet(yk0Var, this);
        while (k() == this) {
            if (j.a(p, this, this, yk0Var)) {
                yk0Var.j(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (com.daaw.j.a(com.daaw.yk0.p, r3, r2, ((com.daaw.u31) r4).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.yk0 h(com.daaw.pu0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            com.daaw.yk0 r0 = (com.daaw.yk0) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = com.daaw.yk0.q
            boolean r0 = com.daaw.j.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.n()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof com.daaw.pu0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            com.daaw.pu0 r0 = (com.daaw.pu0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            com.daaw.pu0 r4 = (com.daaw.pu0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof com.daaw.u31
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.daaw.yk0.p
            com.daaw.u31 r4 = (com.daaw.u31) r4
            com.daaw.yk0 r4 = r4.a
            boolean r2 = com.daaw.j.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            com.daaw.yk0 r2 = (com.daaw.yk0) r2
            goto L7
        L52:
            r3 = r4
            com.daaw.yk0 r3 = (com.daaw.yk0) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yk0.h(com.daaw.pu0):com.daaw.yk0");
    }

    public final yk0 i(yk0 yk0Var) {
        while (yk0Var.n()) {
            yk0Var = (yk0) yk0Var._prev;
        }
        return yk0Var;
    }

    public final void j(yk0 yk0Var) {
        yk0 yk0Var2;
        do {
            yk0Var2 = (yk0) yk0Var._prev;
            if (k() != yk0Var) {
                return;
            }
        } while (!j.a(q, yk0Var, yk0Var2, this));
        if (n()) {
            yk0Var.h(null);
        }
    }

    public final Object k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof pu0)) {
                return obj;
            }
            ((pu0) obj).c(this);
        }
    }

    public final yk0 l() {
        return xk0.b(k());
    }

    public final yk0 m() {
        yk0 h = h(null);
        return h == null ? i((yk0) this._prev) : h;
    }

    public boolean n() {
        return k() instanceof u31;
    }

    public boolean o() {
        return p() == null;
    }

    public final yk0 p() {
        Object k;
        yk0 yk0Var;
        do {
            k = k();
            if (k instanceof u31) {
                return ((u31) k).a;
            }
            if (k == this) {
                return (yk0) k;
            }
            yk0Var = (yk0) k;
        } while (!j.a(p, this, k, yk0Var.q()));
        yk0Var.h(null);
        return null;
    }

    public final u31 q() {
        u31 u31Var = (u31) this._removedRef;
        if (u31Var == null) {
            u31 u31Var2 = new u31(this);
            r.lazySet(this, u31Var2);
            return u31Var2;
        }
        return u31Var;
    }

    public final int r(yk0 yk0Var, yk0 yk0Var2, a aVar) {
        q.lazySet(yk0Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
        atomicReferenceFieldUpdater.lazySet(yk0Var, yk0Var2);
        aVar.c = yk0Var2;
        if (j.a(atomicReferenceFieldUpdater, this, yk0Var2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new pz0(this) { // from class: com.daaw.yk0.b
            @Override // com.daaw.fi0
            public Object get() {
                return aq.a(this.q);
            }
        } + '@' + aq.b(this);
    }
}
