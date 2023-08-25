package com.daaw;

import com.daaw.mh0;
import com.daaw.nl;
import com.daaw.yk0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class uh0 implements mh0, bf, pv0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(uh0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes2.dex */
    public static final class a extends th0 {
        public final uh0 t;
        public final b u;
        public final af v;
        public final Object w;

        public a(uh0 uh0Var, b bVar, af afVar, Object obj) {
            this.t = uh0Var;
            this.u = bVar;
            this.v = afVar;
            this.w = obj;
        }

        @Override // com.daaw.z40
        public /* bridge */ /* synthetic */ lp1 b(Throwable th) {
            s(th);
            return lp1.a;
        }

        @Override // com.daaw.ph
        public void s(Throwable th) {
            this.t.r(this.u, this.v, this.w);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements qf0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        public final ys0 p;

        public b(ys0 ys0Var, boolean z, Throwable th) {
            this.p = ys0Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable f = f();
            if (f == null) {
                m(th);
            } else if (th == f) {
            } else {
                Object c = c();
                if (c == null) {
                    l(th);
                } else if (!(c instanceof Throwable)) {
                    if (!(c instanceof ArrayList)) {
                        throw new IllegalStateException(ug0.l("State is ", c).toString());
                    }
                    ((ArrayList) c).add(th);
                } else if (th == c) {
                } else {
                    ArrayList<Throwable> b = b();
                    b.add(c);
                    b.add(th);
                    l(b);
                }
            }
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public final Object c() {
            return this._exceptionsHolder;
        }

        @Override // com.daaw.qf0
        public boolean d() {
            return f() == null;
        }

        @Override // com.daaw.qf0
        public ys0 e() {
            return this.p;
        }

        public final Throwable f() {
            return (Throwable) this._rootCause;
        }

        public final boolean g() {
            return f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            pi1 pi1Var;
            Object c = c();
            pi1Var = vh0.e;
            return c == pi1Var;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            pi1 pi1Var;
            Object c = c();
            if (c == null) {
                arrayList = b();
            } else if (c instanceof Throwable) {
                ArrayList<Throwable> b = b();
                b.add(c);
                arrayList = b;
            } else if (!(c instanceof ArrayList)) {
                throw new IllegalStateException(ug0.l("State is ", c).toString());
            } else {
                arrayList = (ArrayList) c;
            }
            Throwable f = f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !ug0.a(th, f)) {
                arrayList.add(th);
            }
            pi1Var = vh0.e;
            l(pi1Var);
            return arrayList;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + c() + ", list=" + e() + ']';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends yk0.a {
        public final /* synthetic */ yk0 d;
        public final /* synthetic */ uh0 e;
        public final /* synthetic */ Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yk0 yk0Var, uh0 uh0Var, Object obj) {
            super(yk0Var);
            this.d = yk0Var;
            this.e = uh0Var;
            this.f = obj;
        }

        @Override // com.daaw.e7
        /* renamed from: i */
        public Object g(yk0 yk0Var) {
            if (this.e.F() == this.f) {
                return null;
            }
            return xk0.a();
        }
    }

    public static /* synthetic */ CancellationException b0(uh0 uh0Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return uh0Var.a0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public boolean A() {
        return false;
    }

    public final ys0 B(qf0 qf0Var) {
        ys0 e = qf0Var.e();
        if (e == null) {
            if (qf0Var instanceof kw) {
                return new ys0();
            }
            if (qf0Var instanceof th0) {
                W((th0) qf0Var);
                return null;
            }
            throw new IllegalStateException(ug0.l("State should have list: ", qf0Var).toString());
        }
        return e;
    }

    public final ze C() {
        return (ze) this._parentHandle;
    }

    public final Object F() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof pu0)) {
                return obj;
            }
            ((pu0) obj).c(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public void H(Throwable th) {
        throw th;
    }

    public boolean I() {
        return false;
    }

    public final Object J(Object obj) {
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        pi1 pi1Var4;
        pi1 pi1Var5;
        pi1 pi1Var6;
        Throwable th = null;
        while (true) {
            Object F = F();
            if (F instanceof b) {
                synchronized (F) {
                    if (((b) F).i()) {
                        pi1Var2 = vh0.d;
                        return pi1Var2;
                    }
                    boolean g = ((b) F).g();
                    if (obj != null || !g) {
                        if (th == null) {
                            th = s(obj);
                        }
                        ((b) F).a(th);
                    }
                    Throwable f = g ^ true ? ((b) F).f() : null;
                    if (f != null) {
                        R(((b) F).e(), f);
                    }
                    pi1Var = vh0.a;
                    return pi1Var;
                }
            } else if (!(F instanceof qf0)) {
                pi1Var3 = vh0.d;
                return pi1Var3;
            } else {
                if (th == null) {
                    th = s(obj);
                }
                qf0 qf0Var = (qf0) F;
                if (!qf0Var.d()) {
                    Object f0 = f0(F, new nh(th, false, 2, null));
                    pi1Var5 = vh0.a;
                    if (f0 == pi1Var5) {
                        throw new IllegalStateException(ug0.l("Cannot happen in ", F).toString());
                    }
                    pi1Var6 = vh0.c;
                    if (f0 != pi1Var6) {
                        return f0;
                    }
                } else if (e0(qf0Var, th)) {
                    pi1Var4 = vh0.a;
                    return pi1Var4;
                }
            }
        }
    }

    @Override // com.daaw.pv0
    public CancellationException K() {
        Throwable th;
        Object F = F();
        if (F instanceof b) {
            th = ((b) F).f();
        } else if (F instanceof nh) {
            th = ((nh) F).a;
        } else if (F instanceof qf0) {
            throw new IllegalStateException(ug0.l("Cannot be cancelling child in this state: ", F).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new nh0(ug0.l("Parent job is ", Z(F)), th, this) : cancellationException;
    }

    @Override // com.daaw.mh0
    public void L(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new nh0(m(), null, this);
        }
        j(cancellationException);
    }

    public final Object M(Object obj) {
        Object f0;
        pi1 pi1Var;
        pi1 pi1Var2;
        do {
            f0 = f0(F(), obj);
            pi1Var = vh0.a;
            if (f0 == pi1Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, x(obj));
            }
            pi1Var2 = vh0.c;
        } while (f0 == pi1Var2);
        return f0;
    }

    public final th0 N(z40<? super Throwable, lp1> z40Var, boolean z) {
        th0 th0Var;
        if (z) {
            th0Var = z40Var instanceof oh0 ? (oh0) z40Var : null;
            if (th0Var == null) {
                th0Var = new ah0(z40Var);
            }
        } else {
            th0 th0Var2 = z40Var instanceof th0 ? (th0) z40Var : null;
            th0Var = th0Var2 != null ? th0Var2 : null;
            if (th0Var == null) {
                th0Var = new bh0(z40Var);
            }
        }
        th0Var.u(this);
        return th0Var;
    }

    public String O() {
        return aq.a(this);
    }

    public final af P(yk0 yk0Var) {
        while (yk0Var.n()) {
            yk0Var = yk0Var.m();
        }
        while (true) {
            yk0Var = yk0Var.l();
            if (!yk0Var.n()) {
                if (yk0Var instanceof af) {
                    return (af) yk0Var;
                }
                if (yk0Var instanceof ys0) {
                    return null;
                }
            }
        }
    }

    @Override // com.daaw.bf
    public final void Q(pv0 pv0Var) {
        i(pv0Var);
    }

    public final void R(ys0 ys0Var, Throwable th) {
        qh qhVar;
        T(th);
        qh qhVar2 = null;
        for (yk0 yk0Var = (yk0) ys0Var.k(); !ug0.a(yk0Var, ys0Var); yk0Var = yk0Var.l()) {
            if (yk0Var instanceof oh0) {
                th0 th0Var = (th0) yk0Var;
                try {
                    th0Var.s(th);
                } catch (Throwable th2) {
                    if (qhVar2 == null) {
                        qhVar = null;
                    } else {
                        xy.a(qhVar2, th2);
                        qhVar = qhVar2;
                    }
                    if (qhVar == null) {
                        qhVar2 = new qh("Exception in completion handler " + th0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (qhVar2 != null) {
            H(qhVar2);
        }
        l(th);
    }

    public final void S(ys0 ys0Var, Throwable th) {
        qh qhVar;
        qh qhVar2 = null;
        for (yk0 yk0Var = (yk0) ys0Var.k(); !ug0.a(yk0Var, ys0Var); yk0Var = yk0Var.l()) {
            if (yk0Var instanceof th0) {
                th0 th0Var = (th0) yk0Var;
                try {
                    th0Var.s(th);
                } catch (Throwable th2) {
                    if (qhVar2 == null) {
                        qhVar = null;
                    } else {
                        xy.a(qhVar2, th2);
                        qhVar = qhVar2;
                    }
                    if (qhVar == null) {
                        qhVar2 = new qh("Exception in completion handler " + th0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (qhVar2 == null) {
            return;
        }
        H(qhVar2);
    }

    public void T(Throwable th) {
    }

    public void U(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.daaw.pf0] */
    public final void V(kw kwVar) {
        ys0 ys0Var = new ys0();
        if (!kwVar.d()) {
            ys0Var = new pf0(ys0Var);
        }
        j.a(p, this, kwVar, ys0Var);
    }

    public final void W(th0 th0Var) {
        th0Var.g(new ys0());
        j.a(p, this, th0Var, th0Var.l());
    }

    public final void X(th0 th0Var) {
        Object F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kw kwVar;
        do {
            F = F();
            if (!(F instanceof th0)) {
                if (!(F instanceof qf0) || ((qf0) F).e() == null) {
                    return;
                }
                th0Var.o();
                return;
            } else if (F != th0Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = p;
                kwVar = vh0.g;
            }
        } while (!j.a(atomicReferenceFieldUpdater, this, F, kwVar));
    }

    public final void Y(ze zeVar) {
        this._parentHandle = zeVar;
    }

    public final String Z(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof qf0 ? ((qf0) obj).d() ? "Active" : "New" : obj instanceof nh ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public final CancellationException a0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = m();
            }
            cancellationException = new nh0(str, th, this);
        }
        return cancellationException;
    }

    public final String c0() {
        return O() + '{' + Z(F()) + '}';
    }

    @Override // com.daaw.mh0
    public boolean d() {
        Object F = F();
        return (F instanceof qf0) && ((qf0) F).d();
    }

    public final boolean d0(qf0 qf0Var, Object obj) {
        if (j.a(p, this, qf0Var, vh0.f(obj))) {
            T(null);
            U(obj);
            p(qf0Var, obj);
            return true;
        }
        return false;
    }

    public final boolean e0(qf0 qf0Var, Throwable th) {
        ys0 B = B(qf0Var);
        if (B == null) {
            return false;
        }
        if (j.a(p, this, qf0Var, new b(B, false, th))) {
            R(B, th);
            return true;
        }
        return false;
    }

    public final boolean f(Object obj, ys0 ys0Var, th0 th0Var) {
        int r;
        c cVar = new c(th0Var, this, obj);
        do {
            r = ys0Var.m().r(th0Var, ys0Var, cVar);
            if (r == 1) {
                return true;
            }
        } while (r != 2);
        return false;
    }

    public final Object f0(Object obj, Object obj2) {
        pi1 pi1Var;
        pi1 pi1Var2;
        if (!(obj instanceof qf0)) {
            pi1Var2 = vh0.a;
            return pi1Var2;
        } else if ((!(obj instanceof kw) && !(obj instanceof th0)) || (obj instanceof af) || (obj2 instanceof nh)) {
            return g0((qf0) obj, obj2);
        } else {
            if (d0((qf0) obj, obj2)) {
                return obj2;
            }
            pi1Var = vh0.c;
            return pi1Var;
        }
    }

    @Override // com.daaw.nl
    public <R> R fold(R r, n50<? super R, ? super nl.b, ? extends R> n50Var) {
        return (R) mh0.a.a(this, r, n50Var);
    }

    public final void g(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                xy.a(th, th2);
            }
        }
    }

    public final Object g0(qf0 qf0Var, Object obj) {
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        ys0 B = B(qf0Var);
        if (B == null) {
            pi1Var3 = vh0.c;
            return pi1Var3;
        }
        b bVar = qf0Var instanceof b ? (b) qf0Var : null;
        if (bVar == null) {
            bVar = new b(B, false, null);
        }
        synchronized (bVar) {
            if (bVar.h()) {
                pi1Var2 = vh0.a;
                return pi1Var2;
            }
            bVar.k(true);
            if (bVar != qf0Var && !j.a(p, this, qf0Var, bVar)) {
                pi1Var = vh0.c;
                return pi1Var;
            }
            boolean g = bVar.g();
            nh nhVar = obj instanceof nh ? (nh) obj : null;
            if (nhVar != null) {
                bVar.a(nhVar.a);
            }
            Throwable f = true ^ g ? bVar.f() : null;
            lp1 lp1Var = lp1.a;
            if (f != null) {
                R(B, f);
            }
            af v = v(qf0Var);
            return (v == null || !h0(bVar, v, obj)) ? t(bVar, obj) : vh0.b;
        }
    }

    @Override // com.daaw.nl.b, com.daaw.nl
    public <E extends nl.b> E get(nl.c<E> cVar) {
        return (E) mh0.a.b(this, cVar);
    }

    @Override // com.daaw.nl.b
    public final nl.c<?> getKey() {
        return mh0.d;
    }

    public void h(Object obj) {
    }

    public final boolean h0(b bVar, af afVar, Object obj) {
        while (mh0.a.c(afVar.t, false, false, new a(this, bVar, afVar, obj), 1, null) == zs0.p) {
            afVar = P(afVar);
            if (afVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(Object obj) {
        Object obj2;
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        obj2 = vh0.a;
        if (A() && (obj2 = k(obj)) == vh0.b) {
            return true;
        }
        pi1Var = vh0.a;
        if (obj2 == pi1Var) {
            obj2 = J(obj);
        }
        pi1Var2 = vh0.a;
        if (obj2 == pi1Var2 || obj2 == vh0.b) {
            return true;
        }
        pi1Var3 = vh0.d;
        if (obj2 == pi1Var3) {
            return false;
        }
        h(obj2);
        return true;
    }

    public void j(Throwable th) {
        i(th);
    }

    public final Object k(Object obj) {
        pi1 pi1Var;
        Object f0;
        pi1 pi1Var2;
        do {
            Object F = F();
            if (!(F instanceof qf0) || ((F instanceof b) && ((b) F).h())) {
                pi1Var = vh0.a;
                return pi1Var;
            }
            f0 = f0(F, new nh(s(obj), false, 2, null));
            pi1Var2 = vh0.c;
        } while (f0 == pi1Var2);
        return f0;
    }

    public final boolean l(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ze C = C();
        return (C == null || C == zs0.p) ? z : C.c(th) || z;
    }

    public String m() {
        return "Job was cancelled";
    }

    @Override // com.daaw.nl
    public nl minusKey(nl.c<?> cVar) {
        return mh0.a.d(this, cVar);
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && z();
    }

    public final void p(qf0 qf0Var, Object obj) {
        ze C = C();
        if (C != null) {
            C.a();
            Y(zs0.p);
        }
        nh nhVar = obj instanceof nh ? (nh) obj : null;
        Throwable th = nhVar != null ? nhVar.a : null;
        if (!(qf0Var instanceof th0)) {
            ys0 e = qf0Var.e();
            if (e == null) {
                return;
            }
            S(e, th);
            return;
        }
        try {
            ((th0) qf0Var).s(th);
        } catch (Throwable th2) {
            H(new qh("Exception in completion handler " + qf0Var + " for " + this, th2));
        }
    }

    @Override // com.daaw.mh0
    public final CancellationException q() {
        Object F = F();
        if (!(F instanceof b)) {
            if (F instanceof qf0) {
                throw new IllegalStateException(ug0.l("Job is still new or active: ", this).toString());
            }
            return F instanceof nh ? b0(this, ((nh) F).a, null, 1, null) : new nh0(ug0.l(aq.a(this), " has completed normally"), null, this);
        }
        Throwable f = ((b) F).f();
        CancellationException a0 = f != null ? a0(f, ug0.l(aq.a(this), " is cancelling")) : null;
        if (a0 != null) {
            return a0;
        }
        throw new IllegalStateException(ug0.l("Job is still new or active: ", this).toString());
    }

    public final void r(b bVar, af afVar, Object obj) {
        af P = P(afVar);
        if (P == null || !h0(bVar, P, obj)) {
            h(t(bVar, obj));
        }
    }

    public final Throwable s(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new nh0(m(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((pv0) obj).K();
    }

    public final Object t(b bVar, Object obj) {
        boolean g;
        Throwable y;
        nh nhVar = obj instanceof nh ? (nh) obj : null;
        Throwable th = nhVar == null ? null : nhVar.a;
        synchronized (bVar) {
            g = bVar.g();
            List<Throwable> j = bVar.j(th);
            y = y(bVar, j);
            if (y != null) {
                g(y, j);
            }
        }
        boolean z = false;
        if (y != null && y != th) {
            obj = new nh(y, false, 2, null);
        }
        if (y != null) {
            if ((l(y) || G(y)) ? true : true) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((nh) obj).b();
            }
        }
        if (!g) {
            T(y);
        }
        U(obj);
        j.a(p, this, bVar, vh0.f(obj));
        p(bVar, obj);
        return obj;
    }

    public String toString() {
        return c0() + '@' + aq.b(this);
    }

    public final af v(qf0 qf0Var) {
        af afVar = qf0Var instanceof af ? (af) qf0Var : null;
        if (afVar == null) {
            ys0 e = qf0Var.e();
            if (e == null) {
                return null;
            }
            return P(e);
        }
        return afVar;
    }

    @Override // com.daaw.mh0
    public final iu w(boolean z, boolean z2, z40<? super Throwable, lp1> z40Var) {
        th0 N = N(z40Var, z);
        while (true) {
            Object F = F();
            if (F instanceof kw) {
                kw kwVar = (kw) F;
                if (!kwVar.d()) {
                    V(kwVar);
                } else if (j.a(p, this, F, N)) {
                    return N;
                }
            } else {
                if (!(F instanceof qf0)) {
                    if (z2) {
                        nh nhVar = F instanceof nh ? (nh) F : null;
                        z40Var.b(nhVar != null ? nhVar.a : null);
                    }
                    return zs0.p;
                }
                ys0 e = ((qf0) F).e();
                if (e == null) {
                    Objects.requireNonNull(F, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    W((th0) F);
                } else {
                    iu iuVar = zs0.p;
                    if (z && (F instanceof b)) {
                        synchronized (F) {
                            r3 = ((b) F).f();
                            if (r3 == null || ((z40Var instanceof af) && !((b) F).h())) {
                                if (f(F, e, N)) {
                                    if (r3 == null) {
                                        return N;
                                    }
                                    iuVar = N;
                                }
                            }
                            lp1 lp1Var = lp1.a;
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            z40Var.b(r3);
                        }
                        return iuVar;
                    } else if (f(F, e, N)) {
                        return N;
                    }
                }
            }
        }
    }

    public final Throwable x(Object obj) {
        nh nhVar = obj instanceof nh ? (nh) obj : null;
        if (nhVar == null) {
            return null;
        }
        return nhVar.a;
    }

    public final Throwable y(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new nh0(m(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    public boolean z() {
        return true;
    }
}
