package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.daaw.vd */
/* loaded from: classes2.dex */
public class C3324vd<T> extends AbstractC1219eu<T> implements InterfaceC3200ud<T>, InterfaceC3343vl {

    /* renamed from: v */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30154v = AtomicIntegerFieldUpdater.newUpdater(C3324vd.class, "_decision");

    /* renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30155w = AtomicReferenceFieldUpdater.newUpdater(C3324vd.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: s */
    public final InterfaceC1438gl<T> f30156s;

    /* renamed from: t */
    public final InterfaceC2307nl f30157t;

    /* renamed from: u */
    public InterfaceC1754iu f30158u;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static /* synthetic */ void m7250t(C3324vd c3324vd, Object obj, int i, z40 z40Var, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            z40Var = null;
        }
        c3324vd.m7251s(obj, i, z40Var);
    }

    @Override // com.daaw.InterfaceC3343vl
    /* renamed from: a */
    public InterfaceC3343vl mo7066a() {
        InterfaceC1438gl<T> interfaceC1438gl = this.f30156s;
        if (interfaceC1438gl instanceof InterfaceC3343vl) {
            return (InterfaceC3343vl) interfaceC1438gl;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1438gl
    /* renamed from: b */
    public void mo7267b(Object obj) {
        m7250t(this, C2862rh.m11314b(obj, this), this.f8831r, null, 4, null);
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: c */
    public void mo7266c(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof bt0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C2292nh) {
                return;
            }
            if (obj2 instanceof C2039lh) {
                C2039lh c2039lh = (C2039lh) obj2;
                if (!(!c2039lh.m16957c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C1773j.m19216a(f30155w, this, obj2, C2039lh.m16958b(c2039lh, null, null, null, null, th, 15, null))) {
                    c2039lh.m16956d(this, th);
                    return;
                }
            } else if (C1773j.m19216a(f30155w, this, obj2, new C2039lh(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: d */
    public final InterfaceC1438gl<T> mo7265d() {
        return this.f30156s;
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: e */
    public Throwable mo7264e(Object obj) {
        Throwable mo7264e = super.mo7264e(obj);
        if (mo7264e == null) {
            return null;
        }
        mo7265d();
        return mo7264e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.AbstractC1219eu
    /* renamed from: f */
    public <T> T mo7263f(Object obj) {
        return obj instanceof C2039lh ? (T) ((C2039lh) obj).f17386a : obj;
    }

    @Override // com.daaw.InterfaceC1438gl
    public InterfaceC2307nl getContext() {
        return this.f30157t;
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: h */
    public Object mo7262h() {
        return m7255o();
    }

    /* renamed from: i */
    public final Void m7261i(Object obj) {
        throw new IllegalStateException(ug0.m8262l("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: j */
    public final void m7260j(AbstractC2541pd abstractC2541pd, Throwable th) {
        try {
            abstractC2541pd.m12613a(th);
        } catch (Throwable th2) {
            C2954sl.m10220a(getContext(), new C2712qh(ug0.m8262l("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: k */
    public final void m7259k(z40<? super Throwable, lp1> z40Var, Throwable th) {
        try {
            z40Var.mo2829b(th);
        } catch (Throwable th2) {
            C2954sl.m10220a(getContext(), new C2712qh(ug0.m8262l("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: l */
    public final void m7258l() {
        InterfaceC1754iu interfaceC1754iu = this.f30158u;
        if (interfaceC1754iu == null) {
            return;
        }
        interfaceC1754iu.mo1955a();
        this.f30158u = zs0.f35447p;
    }

    /* renamed from: m */
    public final void m7257m() {
        if (m7253q()) {
            return;
        }
        m7258l();
    }

    /* renamed from: n */
    public final void m7256n(int i) {
        if (m7248v()) {
            return;
        }
        C1327fu.m22270a(this, i);
    }

    /* renamed from: o */
    public final Object m7255o() {
        return this._state;
    }

    /* renamed from: p */
    public final String m7254p() {
        Object m7255o = m7255o();
        return m7255o instanceof bt0 ? "Active" : m7255o instanceof C3525xd ? "Cancelled" : "Completed";
    }

    /* renamed from: q */
    public final boolean m7253q() {
        return C1327fu.m22268c(this.f8831r) && ((C0887bu) this.f30156s).m25828k();
    }

    /* renamed from: r */
    public String m7252r() {
        return "CancellableContinuation";
    }

    /* renamed from: s */
    public final void m7251s(Object obj, int i, z40<? super Throwable, lp1> z40Var) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof bt0)) {
                if (obj2 instanceof C3525xd) {
                    C3525xd c3525xd = (C3525xd) obj2;
                    if (c3525xd.m5228c()) {
                        if (z40Var == null) {
                            return;
                        }
                        m7259k(z40Var, c3525xd.f20118a);
                        return;
                    }
                }
                m7261i(obj);
                throw new mi0();
            }
        } while (!C1773j.m19216a(f30155w, this, obj2, m7249u((bt0) obj2, obj, i, z40Var, null)));
        m7257m();
        m7256n(i);
    }

    public String toString() {
        return m7252r() + '(' + C0666aq.m27225c(this.f30156s) + "){" + m7254p() + "}@" + C0666aq.m27226b(this);
    }

    /* renamed from: u */
    public final Object m7249u(bt0 bt0Var, Object obj, int i, z40<? super Throwable, lp1> z40Var, Object obj2) {
        if (obj instanceof C2292nh) {
            return obj;
        }
        if (C1327fu.m22269b(i) || obj2 != null) {
            if (z40Var == null && !(bt0Var instanceof AbstractC2541pd) && obj2 == null) {
                return obj;
            }
            return new C2039lh(obj, bt0Var instanceof AbstractC2541pd ? (AbstractC2541pd) bt0Var : null, z40Var, obj2, null, 16, null);
        }
        return obj;
    }

    /* renamed from: v */
    public final boolean m7248v() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f30154v.compareAndSet(this, 0, 2));
        return true;
    }
}
