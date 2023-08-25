package com.daaw;

import com.daaw.C2041lj;
import com.daaw.C2716qj;
/* loaded from: classes.dex */
public abstract class kx1 implements InterfaceC3891zs {

    /* renamed from: a */
    public int f16804a;

    /* renamed from: b */
    public C2716qj f16805b;

    /* renamed from: c */
    public l61 f16806c;

    /* renamed from: d */
    public C2716qj.EnumC2718b f16807d;

    /* renamed from: e */
    public C2587pt f16808e = new C2587pt(this);

    /* renamed from: f */
    public int f16809f = 0;

    /* renamed from: g */
    public boolean f16810g = false;

    /* renamed from: h */
    public C1325ft f16811h = new C1325ft(this);

    /* renamed from: i */
    public C1325ft f16812i = new C1325ft(this);

    /* renamed from: j */
    public EnumC1995b f16813j = EnumC1995b.NONE;

    /* renamed from: com.daaw.kx1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1994a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16814a;

        static {
            int[] iArr = new int[C2041lj.EnumC2043b.values().length];
            f16814a = iArr;
            try {
                iArr[C2041lj.EnumC2043b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16814a[C2041lj.EnumC2043b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16814a[C2041lj.EnumC2043b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16814a[C2041lj.EnumC2043b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16814a[C2041lj.EnumC2043b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.daaw.kx1$b */
    /* loaded from: classes.dex */
    public enum EnumC1995b {
        NONE,
        START,
        END,
        CENTER
    }

    public kx1(C2716qj c2716qj) {
        this.f16805b = c2716qj;
    }

    @Override // com.daaw.InterfaceC3891zs
    /* renamed from: a */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
    }

    /* renamed from: b */
    public final void m17365b(C1325ft c1325ft, C1325ft c1325ft2, int i) {
        c1325ft.f9873l.add(c1325ft2);
        c1325ft.f9867f = i;
        c1325ft2.f9872k.add(c1325ft);
    }

    /* renamed from: c */
    public final void m17364c(C1325ft c1325ft, C1325ft c1325ft2, int i, C2587pt c2587pt) {
        c1325ft.f9873l.add(c1325ft2);
        c1325ft.f9873l.add(this.f16808e);
        c1325ft.f9869h = i;
        c1325ft.f9870i = c2587pt;
        c1325ft2.f9872k.add(c1325ft);
        c2587pt.f9872k.add(c1325ft);
    }

    /* renamed from: d */
    public abstract void mo10451d();

    /* renamed from: e */
    public abstract void mo10450e();

    /* renamed from: f */
    public abstract void mo10449f();

    /* renamed from: g */
    public final int m17363g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C2716qj c2716qj = this.f16805b;
            int i3 = c2716qj.f24045p;
            max = Math.max(c2716qj.f24043o, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C2716qj c2716qj2 = this.f16805b;
            int i4 = c2716qj2.f24051s;
            max = Math.max(c2716qj2.f24049r, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final C1325ft m17362h(C2041lj c2041lj) {
        kx1 kx1Var;
        kx1 kx1Var2;
        C2041lj c2041lj2 = c2041lj.f17433d;
        if (c2041lj2 == null) {
            return null;
        }
        C2716qj c2716qj = c2041lj2.f17431b;
        int i = C1994a.f16814a[c2041lj2.f17432c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                kx1Var2 = c2716qj.f24023e;
            } else if (i == 3) {
                kx1Var = c2716qj.f24025f;
            } else if (i == 4) {
                return c2716qj.f24025f.f19119k;
            } else {
                if (i != 5) {
                    return null;
                }
                kx1Var2 = c2716qj.f24025f;
            }
            return kx1Var2.f16812i;
        }
        kx1Var = c2716qj.f24023e;
        return kx1Var.f16811h;
    }

    /* renamed from: i */
    public final C1325ft m17361i(C2041lj c2041lj, int i) {
        C2041lj c2041lj2 = c2041lj.f17433d;
        if (c2041lj2 == null) {
            return null;
        }
        C2716qj c2716qj = c2041lj2.f17431b;
        kx1 kx1Var = i == 0 ? c2716qj.f24023e : c2716qj.f24025f;
        int i2 = C1994a.f16814a[c2041lj2.f17432c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return kx1Var.f16812i;
        }
        return kx1Var.f16811h;
    }

    /* renamed from: j */
    public long mo10448j() {
        C2587pt c2587pt = this.f16808e;
        if (c2587pt.f9871j) {
            return c2587pt.f9868g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m17360k() {
        return this.f16810g;
    }

    /* renamed from: l */
    public final void m17359l(int i, int i2) {
        C2587pt c2587pt;
        int m17363g;
        int i3 = this.f16804a;
        if (i3 != 0) {
            if (i3 == 1) {
                int m17363g2 = m17363g(this.f16808e.f23257m, i);
                c2587pt = this.f16808e;
                m17363g = Math.min(m17363g2, i2);
                c2587pt.mo13161d(m17363g);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                C2716qj c2716qj = this.f16805b;
                kx1 kx1Var = c2716qj.f24023e;
                C2716qj.EnumC2718b enumC2718b = kx1Var.f16807d;
                C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (enumC2718b == enumC2718b2 && kx1Var.f16804a == 3) {
                    ms1 ms1Var = c2716qj.f24025f;
                    if (ms1Var.f16807d == enumC2718b2 && ms1Var.f16804a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    kx1Var = c2716qj.f24025f;
                }
                if (kx1Var.f16808e.f9871j) {
                    float m12407r = c2716qj.m12407r();
                    this.f16808e.mo13161d(i == 1 ? (int) ((kx1Var.f16808e.f9868g / m12407r) + 0.5f) : (int) ((m12407r * kx1Var.f16808e.f9868g) + 0.5f));
                    return;
                }
                return;
            } else {
                C2716qj m12461E = this.f16805b.m12461E();
                if (m12461E == null) {
                    return;
                }
                C2587pt c2587pt2 = (i == 0 ? m12461E.f24023e : m12461E.f24025f).f16808e;
                if (!c2587pt2.f9871j) {
                    return;
                }
                C2716qj c2716qj2 = this.f16805b;
                i2 = (int) ((c2587pt2.f9868g * (i == 0 ? c2716qj2.f24047q : c2716qj2.f24053t)) + 0.5f);
            }
        }
        c2587pt = this.f16808e;
        m17363g = m17363g(i2, i);
        c2587pt.mo13161d(m17363g);
    }

    /* renamed from: m */
    public abstract boolean mo10447m();

    /* renamed from: n */
    public void m17358n(InterfaceC3891zs interfaceC3891zs, C2041lj c2041lj, C2041lj c2041lj2, int i) {
        C1325ft c1325ft;
        C1325ft m17362h = m17362h(c2041lj);
        C1325ft m17362h2 = m17362h(c2041lj2);
        if (m17362h.f9871j && m17362h2.f9871j) {
            int m16930b = m17362h.f9868g + c2041lj.m16930b();
            int m16930b2 = m17362h2.f9868g - c2041lj2.m16930b();
            int i2 = m16930b2 - m16930b;
            if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                m17359l(i, i2);
            }
            C2587pt c2587pt = this.f16808e;
            if (c2587pt.f9871j) {
                if (c2587pt.f9868g == i2) {
                    this.f16811h.mo13161d(m16930b);
                    c1325ft = this.f16812i;
                } else {
                    C2716qj c2716qj = this.f16805b;
                    float m12401u = i == 0 ? c2716qj.m12401u() : c2716qj.m12455I();
                    if (m17362h == m17362h2) {
                        m16930b = m17362h.f9868g;
                        m16930b2 = m17362h2.f9868g;
                        m12401u = 0.5f;
                    }
                    this.f16811h.mo13161d((int) (m16930b + 0.5f + (((m16930b2 - m16930b) - this.f16808e.f9868g) * m12401u)));
                    c1325ft = this.f16812i;
                    m16930b2 = this.f16811h.f9868g + this.f16808e.f9868g;
                }
                c1325ft.mo13161d(m16930b2);
            }
        }
    }

    /* renamed from: o */
    public void m17357o(InterfaceC3891zs interfaceC3891zs) {
    }

    /* renamed from: p */
    public void m17356p(InterfaceC3891zs interfaceC3891zs) {
    }
}
