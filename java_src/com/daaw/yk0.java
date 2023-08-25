package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class yk0 {

    /* renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33742p = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_next");

    /* renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33743q = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_prev");

    /* renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33744r = AtomicReferenceFieldUpdater.newUpdater(yk0.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: com.daaw.yk0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3714a extends AbstractC1164e7<yk0> {

        /* renamed from: b */
        public final yk0 f33745b;

        /* renamed from: c */
        public yk0 f33746c;

        public AbstractC3714a(yk0 yk0Var) {
            this.f33745b = yk0Var;
        }

        @Override // com.daaw.AbstractC1164e7
        /* renamed from: h */
        public void mo3619d(yk0 yk0Var, Object obj) {
            boolean z = obj == null;
            yk0 yk0Var2 = z ? this.f33745b : this.f33746c;
            if (yk0Var2 != null && C1773j.m19216a(yk0.f33742p, yk0Var, this, yk0Var2) && z) {
                yk0 yk0Var3 = this.f33745b;
                yk0 yk0Var4 = this.f33746c;
                ug0.m8271c(yk0Var4);
                yk0Var3.m3628j(yk0Var4);
            }
        }
    }

    /* renamed from: g */
    public final boolean m3631g(yk0 yk0Var) {
        f33743q.lazySet(yk0Var, this);
        f33742p.lazySet(yk0Var, this);
        while (m3627k() == this) {
            if (C1773j.m19216a(f33742p, this, this, yk0Var)) {
                yk0Var.m3628j(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (com.daaw.C1773j.m19216a(com.daaw.yk0.f33742p, r3, r2, ((com.daaw.u31) r4).f28503a) != false) goto L23;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yk0 m3630h(pu0 pu0Var) {
        while (true) {
            yk0 yk0Var = (yk0) this._prev;
            yk0 yk0Var2 = yk0Var;
            while (true) {
                yk0 yk0Var3 = null;
                while (true) {
                    Object obj = yk0Var2._next;
                    if (obj == this) {
                        if (yk0Var == yk0Var2 || C1773j.m19216a(f33743q, this, yk0Var, yk0Var2)) {
                            return yk0Var2;
                        }
                    } else if (mo3624n()) {
                        return null;
                    } else {
                        if (obj == pu0Var) {
                            return yk0Var2;
                        }
                        if (obj instanceof pu0) {
                            if (pu0Var != null && pu0Var.m13143b((pu0) obj)) {
                                return null;
                            }
                            ((pu0) obj).mo13142c(yk0Var2);
                        } else if (!(obj instanceof u31)) {
                            yk0Var3 = yk0Var2;
                            yk0Var2 = (yk0) obj;
                        } else if (yk0Var3 != null) {
                            break;
                        } else {
                            yk0Var2 = (yk0) yk0Var2._prev;
                        }
                    }
                }
                yk0Var2 = yk0Var3;
            }
        }
    }

    /* renamed from: i */
    public final yk0 m3629i(yk0 yk0Var) {
        while (yk0Var.mo3624n()) {
            yk0Var = (yk0) yk0Var._prev;
        }
        return yk0Var;
    }

    /* renamed from: j */
    public final void m3628j(yk0 yk0Var) {
        yk0 yk0Var2;
        do {
            yk0Var2 = (yk0) yk0Var._prev;
            if (m3627k() != yk0Var) {
                return;
            }
        } while (!C1773j.m19216a(f33743q, yk0Var, yk0Var2, this));
        if (mo3624n()) {
            yk0Var.m3630h(null);
        }
    }

    /* renamed from: k */
    public final Object m3627k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof pu0)) {
                return obj;
            }
            ((pu0) obj).mo13142c(this);
        }
    }

    /* renamed from: l */
    public final yk0 m3626l() {
        return xk0.m5034b(m3627k());
    }

    /* renamed from: m */
    public final yk0 m3625m() {
        yk0 m3630h = m3630h(null);
        return m3630h == null ? m3629i((yk0) this._prev) : m3630h;
    }

    /* renamed from: n */
    public boolean mo3624n() {
        return m3627k() instanceof u31;
    }

    /* renamed from: o */
    public boolean m3623o() {
        return m3622p() == null;
    }

    /* renamed from: p */
    public final yk0 m3622p() {
        Object m3627k;
        yk0 yk0Var;
        do {
            m3627k = m3627k();
            if (m3627k instanceof u31) {
                return ((u31) m3627k).f28503a;
            }
            if (m3627k == this) {
                return (yk0) m3627k;
            }
            yk0Var = (yk0) m3627k;
        } while (!C1773j.m19216a(f33742p, this, m3627k, yk0Var.m3621q()));
        yk0Var.m3630h(null);
        return null;
    }

    /* renamed from: q */
    public final u31 m3621q() {
        u31 u31Var = (u31) this._removedRef;
        if (u31Var == null) {
            u31 u31Var2 = new u31(this);
            f33744r.lazySet(this, u31Var2);
            return u31Var2;
        }
        return u31Var;
    }

    /* renamed from: r */
    public final int m3620r(yk0 yk0Var, yk0 yk0Var2, AbstractC3714a abstractC3714a) {
        f33743q.lazySet(yk0Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33742p;
        atomicReferenceFieldUpdater.lazySet(yk0Var, yk0Var2);
        abstractC3714a.f33746c = yk0Var2;
        if (C1773j.m19216a(atomicReferenceFieldUpdater, this, yk0Var2, abstractC3714a)) {
            return abstractC3714a.mo13142c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new pz0(this) { // from class: com.daaw.yk0.b
            @Override // com.daaw.fi0
            public Object get() {
                return C0666aq.m27227a(this.f16192q);
            }
        } + '@' + C0666aq.m27226b(this);
    }
}
