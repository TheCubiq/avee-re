package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class bu<T> extends eu<T> implements vl, gl<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(bu.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final pl s;
    public final gl<T> t;
    public Object u;
    public final Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public bu(pl plVar, gl<? super T> glVar) {
        super(-1);
        this.s = plVar;
        this.t = glVar;
        this.u = cu.a();
        this.v = bl1.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // com.daaw.vl
    public vl a() {
        gl<T> glVar = this.t;
        if (glVar instanceof vl) {
            return (vl) glVar;
        }
        return null;
    }

    @Override // com.daaw.gl
    public void b(Object obj) {
        nl context = this.t.getContext();
        Object d = rh.d(obj, null, 1, null);
        if (this.s.U(context)) {
            this.u = d;
            this.r = 0;
            this.s.T(context, this);
            return;
        }
        dy a = cl1.a.a();
        if (a.c0()) {
            this.u = d;
            this.r = 0;
            a.Y(this);
            return;
        }
        a.a0(true);
        try {
            nl context2 = getContext();
            Object c = bl1.c(context2, this.v);
            this.t.b(obj);
            lp1 lp1Var = lp1.a;
            bl1.a(context2, c);
            do {
            } while (a.e0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.daaw.eu
    public void c(Object obj, Throwable th) {
        if (obj instanceof oh) {
            ((oh) obj).b.b(th);
        }
    }

    @Override // com.daaw.eu
    public gl<T> d() {
        return this;
    }

    @Override // com.daaw.gl
    public nl getContext() {
        return this.t.getContext();
    }

    @Override // com.daaw.eu
    public Object h() {
        Object obj = this.u;
        this.u = cu.a();
        return obj;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == cu.b);
    }

    public final vd<?> j() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof vd) {
            return (vd) obj;
        }
        return null;
    }

    public final boolean k() {
        return this._reusableCancellableContinuation != null;
    }

    public final void l() {
        i();
        vd<?> j = j();
        if (j == null) {
            return;
        }
        j.l();
    }

    public String toString() {
        return "DispatchedContinuation[" + this.s + ", " + aq.c(this.t) + ']';
    }
}
