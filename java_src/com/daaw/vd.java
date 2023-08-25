package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class vd<T> extends eu<T> implements ud<T>, vl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(vd.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(vd.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    public final gl<T> s;
    public final nl t;
    public iu u;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(vd vdVar, Object obj, int i, z40 z40Var, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            z40Var = null;
        }
        vdVar.s(obj, i, z40Var);
    }

    @Override // com.daaw.vl
    public vl a() {
        gl<T> glVar = this.s;
        if (glVar instanceof vl) {
            return (vl) glVar;
        }
        return null;
    }

    @Override // com.daaw.gl
    public void b(Object obj) {
        t(this, rh.b(obj, this), this.r, null, 4, null);
    }

    @Override // com.daaw.eu
    public void c(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof bt0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof nh) {
                return;
            }
            if (obj2 instanceof lh) {
                lh lhVar = (lh) obj2;
                if (!(!lhVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (j.a(w, this, obj2, lh.b(lhVar, null, null, null, null, th, 15, null))) {
                    lhVar.d(this, th);
                    return;
                }
            } else if (j.a(w, this, obj2, new lh(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // com.daaw.eu
    public final gl<T> d() {
        return this.s;
    }

    @Override // com.daaw.eu
    public Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        d();
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.eu
    public <T> T f(Object obj) {
        return obj instanceof lh ? (T) ((lh) obj).a : obj;
    }

    @Override // com.daaw.gl
    public nl getContext() {
        return this.t;
    }

    @Override // com.daaw.eu
    public Object h() {
        return o();
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(ug0.l("Already resumed, but proposed with update ", obj).toString());
    }

    public final void j(pd pdVar, Throwable th) {
        try {
            pdVar.a(th);
        } catch (Throwable th2) {
            sl.a(getContext(), new qh(ug0.l("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void k(z40<? super Throwable, lp1> z40Var, Throwable th) {
        try {
            z40Var.b(th);
        } catch (Throwable th2) {
            sl.a(getContext(), new qh(ug0.l("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public final void l() {
        iu iuVar = this.u;
        if (iuVar == null) {
            return;
        }
        iuVar.a();
        this.u = zs0.p;
    }

    public final void m() {
        if (q()) {
            return;
        }
        l();
    }

    public final void n(int i) {
        if (v()) {
            return;
        }
        fu.a(this, i);
    }

    public final Object o() {
        return this._state;
    }

    public final String p() {
        Object o = o();
        return o instanceof bt0 ? "Active" : o instanceof xd ? "Cancelled" : "Completed";
    }

    public final boolean q() {
        return fu.c(this.r) && ((bu) this.s).k();
    }

    public String r() {
        return "CancellableContinuation";
    }

    public final void s(Object obj, int i, z40<? super Throwable, lp1> z40Var) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof bt0)) {
                if (obj2 instanceof xd) {
                    xd xdVar = (xd) obj2;
                    if (xdVar.c()) {
                        if (z40Var == null) {
                            return;
                        }
                        k(z40Var, xdVar.a);
                        return;
                    }
                }
                i(obj);
                throw new mi0();
            }
        } while (!j.a(w, this, obj2, u((bt0) obj2, obj, i, z40Var, null)));
        m();
        n(i);
    }

    public String toString() {
        return r() + '(' + aq.c(this.s) + "){" + p() + "}@" + aq.b(this);
    }

    public final Object u(bt0 bt0Var, Object obj, int i, z40<? super Throwable, lp1> z40Var, Object obj2) {
        if (obj instanceof nh) {
            return obj;
        }
        if (fu.b(i) || obj2 != null) {
            if (z40Var == null && !(bt0Var instanceof pd) && obj2 == null) {
                return obj;
            }
            return new lh(obj, bt0Var instanceof pd ? (pd) bt0Var : null, z40Var, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean v() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!v.compareAndSet(this, 0, 2));
        return true;
    }
}
