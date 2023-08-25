package com.daaw;

import com.daaw.InterfaceC2307nl;
import com.daaw.mh0;
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
public class uh0 implements mh0, InterfaceC0836bf, pv0 {

    /* renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29060p = AtomicReferenceFieldUpdater.newUpdater(uh0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: com.daaw.uh0$a */
    /* loaded from: classes2.dex */
    public static final class C3208a extends th0 {

        /* renamed from: t */
        public final uh0 f29061t;

        /* renamed from: u */
        public final C3209b f29062u;

        /* renamed from: v */
        public final C0620af f29063v;

        /* renamed from: w */
        public final Object f29064w;

        public C3208a(uh0 uh0Var, C3209b c3209b, C0620af c0620af, Object obj) {
            this.f29061t = uh0Var;
            this.f29062u = c3209b;
            this.f29063v = c0620af;
            this.f29064w = obj;
        }

        @Override // com.daaw.z40
        /* renamed from: b */
        public /* bridge */ /* synthetic */ lp1 mo2829b(Throwable th) {
            mo8198s(th);
            return lp1.f17593a;
        }

        @Override // com.daaw.AbstractC2552ph
        /* renamed from: s */
        public void mo8198s(Throwable th) {
            this.f29061t.m8206r(this.f29062u, this.f29063v, this.f29064w);
        }
    }

    /* renamed from: com.daaw.uh0$b */
    /* loaded from: classes2.dex */
    public static final class C3209b implements qf0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: p */
        public final ys0 f29065p;

        public C3209b(ys0 ys0Var, boolean z, Throwable th) {
            this.f29065p = ys0Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m8197a(Throwable th) {
            Throwable m8194f = m8194f();
            if (m8194f == null) {
                m8187m(th);
            } else if (th == m8194f) {
            } else {
                Object m8195c = m8195c();
                if (m8195c == null) {
                    m8188l(th);
                } else if (!(m8195c instanceof Throwable)) {
                    if (!(m8195c instanceof ArrayList)) {
                        throw new IllegalStateException(ug0.m8262l("State is ", m8195c).toString());
                    }
                    ((ArrayList) m8195c).add(th);
                } else if (th == m8195c) {
                } else {
                    ArrayList<Throwable> m8196b = m8196b();
                    m8196b.add(m8195c);
                    m8196b.add(th);
                    m8188l(m8196b);
                }
            }
        }

        /* renamed from: b */
        public final ArrayList<Throwable> m8196b() {
            return new ArrayList<>(4);
        }

        /* renamed from: c */
        public final Object m8195c() {
            return this._exceptionsHolder;
        }

        @Override // com.daaw.qf0
        /* renamed from: d */
        public boolean mo3346d() {
            return m8194f() == null;
        }

        @Override // com.daaw.qf0
        /* renamed from: e */
        public ys0 mo3345e() {
            return this.f29065p;
        }

        /* renamed from: f */
        public final Throwable m8194f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m8193g() {
            return m8194f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: h */
        public final boolean m8192h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m8191i() {
            pi1 pi1Var;
            Object m8195c = m8195c();
            pi1Var = vh0.f30227e;
            return m8195c == pi1Var;
        }

        /* renamed from: j */
        public final List<Throwable> m8190j(Throwable th) {
            ArrayList<Throwable> arrayList;
            pi1 pi1Var;
            Object m8195c = m8195c();
            if (m8195c == null) {
                arrayList = m8196b();
            } else if (m8195c instanceof Throwable) {
                ArrayList<Throwable> m8196b = m8196b();
                m8196b.add(m8195c);
                arrayList = m8196b;
            } else if (!(m8195c instanceof ArrayList)) {
                throw new IllegalStateException(ug0.m8262l("State is ", m8195c).toString());
            } else {
                arrayList = (ArrayList) m8195c;
            }
            Throwable m8194f = m8194f();
            if (m8194f != null) {
                arrayList.add(0, m8194f);
            }
            if (th != null && !ug0.m8273a(th, m8194f)) {
                arrayList.add(th);
            }
            pi1Var = vh0.f30227e;
            m8188l(pi1Var);
            return arrayList;
        }

        /* renamed from: k */
        public final void m8189k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: l */
        public final void m8188l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: m */
        public final void m8187m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + m8193g() + ", completing=" + m8192h() + ", rootCause=" + m8194f() + ", exceptions=" + m8195c() + ", list=" + mo3345e() + ']';
        }
    }

    /* renamed from: com.daaw.uh0$c */
    /* loaded from: classes2.dex */
    public static final class C3210c extends yk0.AbstractC3714a {

        /* renamed from: d */
        public final /* synthetic */ yk0 f29066d;

        /* renamed from: e */
        public final /* synthetic */ uh0 f29067e;

        /* renamed from: f */
        public final /* synthetic */ Object f29068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3210c(yk0 yk0Var, uh0 uh0Var, Object obj) {
            super(yk0Var);
            this.f29066d = yk0Var;
            this.f29067e = uh0Var;
            this.f29068f = obj;
        }

        @Override // com.daaw.AbstractC1164e7
        /* renamed from: i */
        public Object mo8186g(yk0 yk0Var) {
            if (this.f29067e.m8249F() == this.f29068f) {
                return null;
            }
            return xk0.m5035a();
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ CancellationException m8227b0(uh0 uh0Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return uh0Var.m8228a0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: A */
    public boolean m8252A() {
        return false;
    }

    /* renamed from: B */
    public final ys0 m8251B(qf0 qf0Var) {
        ys0 mo3345e = qf0Var.mo3345e();
        if (mo3345e == null) {
            if (qf0Var instanceof C1989kw) {
                return new ys0();
            }
            if (qf0Var instanceof th0) {
                m8232W((th0) qf0Var);
                return null;
            }
            throw new IllegalStateException(ug0.m8262l("State should have list: ", qf0Var).toString());
        }
        return mo3345e;
    }

    /* renamed from: C */
    public final InterfaceC3830ze m8250C() {
        return (InterfaceC3830ze) this._parentHandle;
    }

    /* renamed from: F */
    public final Object m8249F() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof pu0)) {
                return obj;
            }
            ((pu0) obj).mo13142c(this);
        }
    }

    /* renamed from: G */
    public boolean m8248G(Throwable th) {
        return false;
    }

    /* renamed from: H */
    public void mo8247H(Throwable th) {
        throw th;
    }

    /* renamed from: I */
    public boolean mo8246I() {
        return false;
    }

    /* renamed from: J */
    public final Object m8245J(Object obj) {
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        pi1 pi1Var4;
        pi1 pi1Var5;
        pi1 pi1Var6;
        Throwable th = null;
        while (true) {
            Object m8249F = m8249F();
            if (m8249F instanceof C3209b) {
                synchronized (m8249F) {
                    if (((C3209b) m8249F).m8191i()) {
                        pi1Var2 = vh0.f30226d;
                        return pi1Var2;
                    }
                    boolean m8193g = ((C3209b) m8249F).m8193g();
                    if (obj != null || !m8193g) {
                        if (th == null) {
                            th = m8205s(obj);
                        }
                        ((C3209b) m8249F).m8197a(th);
                    }
                    Throwable m8194f = m8193g ^ true ? ((C3209b) m8249F).m8194f() : null;
                    if (m8194f != null) {
                        m8237R(((C3209b) m8249F).mo3345e(), m8194f);
                    }
                    pi1Var = vh0.f30223a;
                    return pi1Var;
                }
            } else if (!(m8249F instanceof qf0)) {
                pi1Var3 = vh0.f30226d;
                return pi1Var3;
            } else {
                if (th == null) {
                    th = m8205s(obj);
                }
                qf0 qf0Var = (qf0) m8249F;
                if (!qf0Var.mo3346d()) {
                    Object m8219f0 = m8219f0(m8249F, new C2292nh(th, false, 2, null));
                    pi1Var5 = vh0.f30223a;
                    if (m8219f0 == pi1Var5) {
                        throw new IllegalStateException(ug0.m8262l("Cannot happen in ", m8249F).toString());
                    }
                    pi1Var6 = vh0.f30225c;
                    if (m8219f0 != pi1Var6) {
                        return m8219f0;
                    }
                } else if (m8221e0(qf0Var, th)) {
                    pi1Var4 = vh0.f30223a;
                    return pi1Var4;
                }
            }
        }
    }

    @Override // com.daaw.pv0
    /* renamed from: K */
    public CancellationException mo8244K() {
        Throwable th;
        Object m8249F = m8249F();
        if (m8249F instanceof C3209b) {
            th = ((C3209b) m8249F).m8194f();
        } else if (m8249F instanceof C2292nh) {
            th = ((C2292nh) m8249F).f20118a;
        } else if (m8249F instanceof qf0) {
            throw new IllegalStateException(ug0.m8262l("Cannot be cancelling child in this state: ", m8249F).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new nh0(ug0.m8262l("Parent job is ", m8229Z(m8249F)), th, this) : cancellationException;
    }

    @Override // com.daaw.mh0
    /* renamed from: L */
    public void mo8243L(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new nh0(mo8210m(), null, this);
        }
        m8213j(cancellationException);
    }

    /* renamed from: M */
    public final Object m8242M(Object obj) {
        Object m8219f0;
        pi1 pi1Var;
        pi1 pi1Var2;
        do {
            m8219f0 = m8219f0(m8249F(), obj);
            pi1Var = vh0.f30223a;
            if (m8219f0 == pi1Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m8201x(obj));
            }
            pi1Var2 = vh0.f30225c;
        } while (m8219f0 == pi1Var2);
        return m8219f0;
    }

    /* renamed from: N */
    public final th0 m8241N(z40<? super Throwable, lp1> z40Var, boolean z) {
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
        th0Var.m9114u(this);
        return th0Var;
    }

    /* renamed from: O */
    public String mo8240O() {
        return C0666aq.m27227a(this);
    }

    /* renamed from: P */
    public final C0620af m8239P(yk0 yk0Var) {
        while (yk0Var.mo3624n()) {
            yk0Var = yk0Var.m3625m();
        }
        while (true) {
            yk0Var = yk0Var.m3626l();
            if (!yk0Var.mo3624n()) {
                if (yk0Var instanceof C0620af) {
                    return (C0620af) yk0Var;
                }
                if (yk0Var instanceof ys0) {
                    return null;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC0836bf
    /* renamed from: Q */
    public final void mo8238Q(pv0 pv0Var) {
        m8214i(pv0Var);
    }

    /* renamed from: R */
    public final void m8237R(ys0 ys0Var, Throwable th) {
        C2712qh c2712qh;
        m8235T(th);
        C2712qh c2712qh2 = null;
        for (yk0 yk0Var = (yk0) ys0Var.m3627k(); !ug0.m8273a(yk0Var, ys0Var); yk0Var = yk0Var.m3626l()) {
            if (yk0Var instanceof oh0) {
                th0 th0Var = (th0) yk0Var;
                try {
                    th0Var.mo8198s(th);
                } catch (Throwable th2) {
                    if (c2712qh2 == null) {
                        c2712qh = null;
                    } else {
                        C3651xy.m4411a(c2712qh2, th2);
                        c2712qh = c2712qh2;
                    }
                    if (c2712qh == null) {
                        c2712qh2 = new C2712qh("Exception in completion handler " + th0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c2712qh2 != null) {
            mo8247H(c2712qh2);
        }
        m8211l(th);
    }

    /* renamed from: S */
    public final void m8236S(ys0 ys0Var, Throwable th) {
        C2712qh c2712qh;
        C2712qh c2712qh2 = null;
        for (yk0 yk0Var = (yk0) ys0Var.m3627k(); !ug0.m8273a(yk0Var, ys0Var); yk0Var = yk0Var.m3626l()) {
            if (yk0Var instanceof th0) {
                th0 th0Var = (th0) yk0Var;
                try {
                    th0Var.mo8198s(th);
                } catch (Throwable th2) {
                    if (c2712qh2 == null) {
                        c2712qh = null;
                    } else {
                        C3651xy.m4411a(c2712qh2, th2);
                        c2712qh = c2712qh2;
                    }
                    if (c2712qh == null) {
                        c2712qh2 = new C2712qh("Exception in completion handler " + th0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c2712qh2 == null) {
            return;
        }
        mo8247H(c2712qh2);
    }

    /* renamed from: T */
    public void m8235T(Throwable th) {
    }

    /* renamed from: U */
    public void mo8234U(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.daaw.pf0] */
    /* renamed from: V */
    public final void m8233V(C1989kw c1989kw) {
        ys0 ys0Var = new ys0();
        if (!c1989kw.mo3346d()) {
            ys0Var = new pf0(ys0Var);
        }
        C1773j.m19216a(f29060p, this, c1989kw, ys0Var);
    }

    /* renamed from: W */
    public final void m8232W(th0 th0Var) {
        th0Var.m3631g(new ys0());
        C1773j.m19216a(f29060p, this, th0Var, th0Var.m3626l());
    }

    /* renamed from: X */
    public final void m8231X(th0 th0Var) {
        Object m8249F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1989kw c1989kw;
        do {
            m8249F = m8249F();
            if (!(m8249F instanceof th0)) {
                if (!(m8249F instanceof qf0) || ((qf0) m8249F).mo3345e() == null) {
                    return;
                }
                th0Var.m3623o();
                return;
            } else if (m8249F != th0Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f29060p;
                c1989kw = vh0.f30229g;
            }
        } while (!C1773j.m19216a(atomicReferenceFieldUpdater, this, m8249F, c1989kw));
    }

    /* renamed from: Y */
    public final void m8230Y(InterfaceC3830ze interfaceC3830ze) {
        this._parentHandle = interfaceC3830ze;
    }

    /* renamed from: Z */
    public final String m8229Z(Object obj) {
        if (!(obj instanceof C3209b)) {
            return obj instanceof qf0 ? ((qf0) obj).mo3346d() ? "Active" : "New" : obj instanceof C2292nh ? "Cancelled" : "Completed";
        }
        C3209b c3209b = (C3209b) obj;
        return c3209b.m8193g() ? "Cancelling" : c3209b.m8192h() ? "Completing" : "Active";
    }

    /* renamed from: a0 */
    public final CancellationException m8228a0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo8210m();
            }
            cancellationException = new nh0(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: c0 */
    public final String m8225c0() {
        return mo8240O() + '{' + m8229Z(m8249F()) + '}';
    }

    @Override // com.daaw.mh0
    /* renamed from: d */
    public boolean mo8224d() {
        Object m8249F = m8249F();
        return (m8249F instanceof qf0) && ((qf0) m8249F).mo3346d();
    }

    /* renamed from: d0 */
    public final boolean m8223d0(qf0 qf0Var, Object obj) {
        if (C1773j.m19216a(f29060p, this, qf0Var, vh0.m7143f(obj))) {
            m8235T(null);
            mo8234U(obj);
            m8208p(qf0Var, obj);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m8221e0(qf0 qf0Var, Throwable th) {
        ys0 m8251B = m8251B(qf0Var);
        if (m8251B == null) {
            return false;
        }
        if (C1773j.m19216a(f29060p, this, qf0Var, new C3209b(m8251B, false, th))) {
            m8237R(m8251B, th);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m8220f(Object obj, ys0 ys0Var, th0 th0Var) {
        int m3620r;
        C3210c c3210c = new C3210c(th0Var, this, obj);
        do {
            m3620r = ys0Var.m3625m().m3620r(th0Var, ys0Var, c3210c);
            if (m3620r == 1) {
                return true;
            }
        } while (m3620r != 2);
        return false;
    }

    /* renamed from: f0 */
    public final Object m8219f0(Object obj, Object obj2) {
        pi1 pi1Var;
        pi1 pi1Var2;
        if (!(obj instanceof qf0)) {
            pi1Var2 = vh0.f30223a;
            return pi1Var2;
        } else if ((!(obj instanceof C1989kw) && !(obj instanceof th0)) || (obj instanceof C0620af) || (obj2 instanceof C2292nh)) {
            return m8217g0((qf0) obj, obj2);
        } else {
            if (m8223d0((qf0) obj, obj2)) {
                return obj2;
            }
            pi1Var = vh0.f30225c;
            return pi1Var;
        }
    }

    @Override // com.daaw.InterfaceC2307nl
    public <R> R fold(R r, n50<? super R, ? super InterfaceC2307nl.InterfaceC2310b, ? extends R> n50Var) {
        return (R) mh0.C2176a.m16034a(this, r, n50Var);
    }

    /* renamed from: g */
    public final void m8218g(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C3651xy.m4411a(th, th2);
            }
        }
    }

    /* renamed from: g0 */
    public final Object m8217g0(qf0 qf0Var, Object obj) {
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        ys0 m8251B = m8251B(qf0Var);
        if (m8251B == null) {
            pi1Var3 = vh0.f30225c;
            return pi1Var3;
        }
        C3209b c3209b = qf0Var instanceof C3209b ? (C3209b) qf0Var : null;
        if (c3209b == null) {
            c3209b = new C3209b(m8251B, false, null);
        }
        synchronized (c3209b) {
            if (c3209b.m8192h()) {
                pi1Var2 = vh0.f30223a;
                return pi1Var2;
            }
            c3209b.m8189k(true);
            if (c3209b != qf0Var && !C1773j.m19216a(f29060p, this, qf0Var, c3209b)) {
                pi1Var = vh0.f30225c;
                return pi1Var;
            }
            boolean m8193g = c3209b.m8193g();
            C2292nh c2292nh = obj instanceof C2292nh ? (C2292nh) obj : null;
            if (c2292nh != null) {
                c3209b.m8197a(c2292nh.f20118a);
            }
            Throwable m8194f = true ^ m8193g ? c3209b.m8194f() : null;
            lp1 lp1Var = lp1.f17593a;
            if (m8194f != null) {
                m8237R(m8251B, m8194f);
            }
            C0620af m8203v = m8203v(qf0Var);
            return (m8203v == null || !m8215h0(c3209b, m8203v, obj)) ? m8204t(c3209b, obj) : vh0.f30224b;
        }
    }

    @Override // com.daaw.InterfaceC2307nl.InterfaceC2310b, com.daaw.InterfaceC2307nl
    public <E extends InterfaceC2307nl.InterfaceC2310b> E get(InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
        return (E) mh0.C2176a.m16033b(this, interfaceC2312c);
    }

    @Override // com.daaw.InterfaceC2307nl.InterfaceC2310b
    public final InterfaceC2307nl.InterfaceC2312c<?> getKey() {
        return mh0.f18874d;
    }

    /* renamed from: h */
    public void mo8216h(Object obj) {
    }

    /* renamed from: h0 */
    public final boolean m8215h0(C3209b c3209b, C0620af c0620af, Object obj) {
        while (mh0.C2176a.m16032c(c0620af.f3139t, false, false, new C3208a(this, c3209b, c0620af, obj), 1, null) == zs0.f35447p) {
            c0620af = m8239P(c0620af);
            if (c0620af == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m8214i(Object obj) {
        Object obj2;
        pi1 pi1Var;
        pi1 pi1Var2;
        pi1 pi1Var3;
        obj2 = vh0.f30223a;
        if (m8252A() && (obj2 = m8212k(obj)) == vh0.f30224b) {
            return true;
        }
        pi1Var = vh0.f30223a;
        if (obj2 == pi1Var) {
            obj2 = m8245J(obj);
        }
        pi1Var2 = vh0.f30223a;
        if (obj2 == pi1Var2 || obj2 == vh0.f30224b) {
            return true;
        }
        pi1Var3 = vh0.f30226d;
        if (obj2 == pi1Var3) {
            return false;
        }
        mo8216h(obj2);
        return true;
    }

    /* renamed from: j */
    public void m8213j(Throwable th) {
        m8214i(th);
    }

    /* renamed from: k */
    public final Object m8212k(Object obj) {
        pi1 pi1Var;
        Object m8219f0;
        pi1 pi1Var2;
        do {
            Object m8249F = m8249F();
            if (!(m8249F instanceof qf0) || ((m8249F instanceof C3209b) && ((C3209b) m8249F).m8192h())) {
                pi1Var = vh0.f30223a;
                return pi1Var;
            }
            m8219f0 = m8219f0(m8249F, new C2292nh(m8205s(obj), false, 2, null));
            pi1Var2 = vh0.f30225c;
        } while (m8219f0 == pi1Var2);
        return m8219f0;
    }

    /* renamed from: l */
    public final boolean m8211l(Throwable th) {
        if (mo8246I()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC3830ze m8250C = m8250C();
        return (m8250C == null || m8250C == zs0.f35447p) ? z : m8250C.mo1954c(th) || z;
    }

    /* renamed from: m */
    public String mo8210m() {
        return "Job was cancelled";
    }

    @Override // com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        return mh0.C2176a.m16031d(this, interfaceC2312c);
    }

    /* renamed from: o */
    public boolean m8209o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m8214i(th) && m8199z();
    }

    /* renamed from: p */
    public final void m8208p(qf0 qf0Var, Object obj) {
        InterfaceC3830ze m8250C = m8250C();
        if (m8250C != null) {
            m8250C.mo1955a();
            m8230Y(zs0.f35447p);
        }
        C2292nh c2292nh = obj instanceof C2292nh ? (C2292nh) obj : null;
        Throwable th = c2292nh != null ? c2292nh.f20118a : null;
        if (!(qf0Var instanceof th0)) {
            ys0 mo3345e = qf0Var.mo3345e();
            if (mo3345e == null) {
                return;
            }
            m8236S(mo3345e, th);
            return;
        }
        try {
            ((th0) qf0Var).mo8198s(th);
        } catch (Throwable th2) {
            mo8247H(new C2712qh("Exception in completion handler " + qf0Var + " for " + this, th2));
        }
    }

    @Override // com.daaw.mh0
    /* renamed from: q */
    public final CancellationException mo8207q() {
        Object m8249F = m8249F();
        if (!(m8249F instanceof C3209b)) {
            if (m8249F instanceof qf0) {
                throw new IllegalStateException(ug0.m8262l("Job is still new or active: ", this).toString());
            }
            return m8249F instanceof C2292nh ? m8227b0(this, ((C2292nh) m8249F).f20118a, null, 1, null) : new nh0(ug0.m8262l(C0666aq.m27227a(this), " has completed normally"), null, this);
        }
        Throwable m8194f = ((C3209b) m8249F).m8194f();
        CancellationException m8228a0 = m8194f != null ? m8228a0(m8194f, ug0.m8262l(C0666aq.m27227a(this), " is cancelling")) : null;
        if (m8228a0 != null) {
            return m8228a0;
        }
        throw new IllegalStateException(ug0.m8262l("Job is still new or active: ", this).toString());
    }

    /* renamed from: r */
    public final void m8206r(C3209b c3209b, C0620af c0620af, Object obj) {
        C0620af m8239P = m8239P(c0620af);
        if (m8239P == null || !m8215h0(c3209b, m8239P, obj)) {
            mo8216h(m8204t(c3209b, obj));
        }
    }

    /* renamed from: s */
    public final Throwable m8205s(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new nh0(mo8210m(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((pv0) obj).mo8244K();
    }

    /* renamed from: t */
    public final Object m8204t(C3209b c3209b, Object obj) {
        boolean m8193g;
        Throwable m8200y;
        C2292nh c2292nh = obj instanceof C2292nh ? (C2292nh) obj : null;
        Throwable th = c2292nh == null ? null : c2292nh.f20118a;
        synchronized (c3209b) {
            m8193g = c3209b.m8193g();
            List<Throwable> m8190j = c3209b.m8190j(th);
            m8200y = m8200y(c3209b, m8190j);
            if (m8200y != null) {
                m8218g(m8200y, m8190j);
            }
        }
        boolean z = false;
        if (m8200y != null && m8200y != th) {
            obj = new C2292nh(m8200y, false, 2, null);
        }
        if (m8200y != null) {
            if ((m8211l(m8200y) || m8248G(m8200y)) ? true : true) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C2292nh) obj).m15180b();
            }
        }
        if (!m8193g) {
            m8235T(m8200y);
        }
        mo8234U(obj);
        C1773j.m19216a(f29060p, this, c3209b, vh0.m7143f(obj));
        m8208p(c3209b, obj);
        return obj;
    }

    public String toString() {
        return m8225c0() + '@' + C0666aq.m27226b(this);
    }

    /* renamed from: v */
    public final C0620af m8203v(qf0 qf0Var) {
        C0620af c0620af = qf0Var instanceof C0620af ? (C0620af) qf0Var : null;
        if (c0620af == null) {
            ys0 mo3345e = qf0Var.mo3345e();
            if (mo3345e == null) {
                return null;
            }
            return m8239P(mo3345e);
        }
        return c0620af;
    }

    @Override // com.daaw.mh0
    /* renamed from: w */
    public final InterfaceC1754iu mo8202w(boolean z, boolean z2, z40<? super Throwable, lp1> z40Var) {
        th0 m8241N = m8241N(z40Var, z);
        while (true) {
            Object m8249F = m8249F();
            if (m8249F instanceof C1989kw) {
                C1989kw c1989kw = (C1989kw) m8249F;
                if (!c1989kw.mo3346d()) {
                    m8233V(c1989kw);
                } else if (C1773j.m19216a(f29060p, this, m8249F, m8241N)) {
                    return m8241N;
                }
            } else {
                if (!(m8249F instanceof qf0)) {
                    if (z2) {
                        C2292nh c2292nh = m8249F instanceof C2292nh ? (C2292nh) m8249F : null;
                        z40Var.mo2829b(c2292nh != null ? c2292nh.f20118a : null);
                    }
                    return zs0.f35447p;
                }
                ys0 mo3345e = ((qf0) m8249F).mo3345e();
                if (mo3345e == null) {
                    Objects.requireNonNull(m8249F, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m8232W((th0) m8249F);
                } else {
                    InterfaceC1754iu interfaceC1754iu = zs0.f35447p;
                    if (z && (m8249F instanceof C3209b)) {
                        synchronized (m8249F) {
                            r3 = ((C3209b) m8249F).m8194f();
                            if (r3 == null || ((z40Var instanceof C0620af) && !((C3209b) m8249F).m8192h())) {
                                if (m8220f(m8249F, mo3345e, m8241N)) {
                                    if (r3 == null) {
                                        return m8241N;
                                    }
                                    interfaceC1754iu = m8241N;
                                }
                            }
                            lp1 lp1Var = lp1.f17593a;
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            z40Var.mo2829b(r3);
                        }
                        return interfaceC1754iu;
                    } else if (m8220f(m8249F, mo3345e, m8241N)) {
                        return m8241N;
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final Throwable m8201x(Object obj) {
        C2292nh c2292nh = obj instanceof C2292nh ? (C2292nh) obj : null;
        if (c2292nh == null) {
            return null;
        }
        return c2292nh.f20118a;
    }

    /* renamed from: y */
    public final Throwable m8200y(C3209b c3209b, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (c3209b.m8193g()) {
                return new nh0(mo8210m(), null, this);
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

    /* renamed from: z */
    public boolean m8199z() {
        return true;
    }
}
