package com.daaw;

import com.daaw.C1325ft;
import com.daaw.C2041lj;
import com.daaw.C2716qj;
import com.daaw.kx1;
import java.util.List;
/* loaded from: classes.dex */
public class sb0 extends kx1 {

    /* renamed from: k */
    public static int[] f26054k = new int[2];

    /* renamed from: com.daaw.sb0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2930a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26055a;

        static {
            int[] iArr = new int[kx1.EnumC1995b.values().length];
            f26055a = iArr;
            try {
                iArr[kx1.EnumC1995b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26055a[kx1.EnumC1995b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26055a[kx1.EnumC1995b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public sb0(C2716qj c2716qj) {
        super(c2716qj);
        this.f16811h.f9866e = C1325ft.EnumC1326a.LEFT;
        this.f16812i.f9866e = C1325ft.EnumC1326a.RIGHT;
        this.f16809f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
        if (r14 != 1) goto L130;
     */
    @Override // com.daaw.kx1, com.daaw.InterfaceC3891zs
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        int i;
        int m17363g;
        int m17363g2;
        float f;
        C2587pt c2587pt;
        int m17363g3;
        int m17363g4;
        float f2;
        float m12407r;
        int i2 = C2930a.f26055a[this.f16813j.ordinal()];
        if (i2 == 1) {
            m17356p(interfaceC3891zs);
        } else if (i2 == 2) {
            m17357o(interfaceC3891zs);
        } else if (i2 == 3) {
            C2716qj c2716qj = this.f16805b;
            m17358n(interfaceC3891zs, c2716qj.f23990B, c2716qj.f23992D, 0);
            return;
        }
        if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
            C2716qj c2716qj2 = this.f16805b;
            int i3 = c2716qj2.f24037l;
            if (i3 == 2) {
                C2716qj m12461E = c2716qj2.m12461E();
                if (m12461E != null) {
                    C2587pt c2587pt2 = m12461E.f24023e.f16808e;
                    if (c2587pt2.f9871j) {
                        i = (int) ((c2587pt2.f9868g * this.f16805b.f24047q) + 0.5f);
                        this.f16808e.mo13161d(i);
                    }
                }
            } else if (i3 == 3) {
                int i4 = c2716qj2.f24039m;
                if (i4 == 0 || i4 == 3) {
                    ms1 ms1Var = c2716qj2.f24025f;
                    C1325ft c1325ft = ms1Var.f16811h;
                    C1325ft c1325ft2 = ms1Var.f16812i;
                    boolean z = c2716qj2.f23990B.f17433d != null;
                    boolean z2 = c2716qj2.f23991C.f17433d != null;
                    boolean z3 = c2716qj2.f23992D.f17433d != null;
                    boolean z4 = c2716qj2.f23993E.f17433d != null;
                    int m12405s = c2716qj2.m12405s();
                    if (z && z2 && z3 && z4) {
                        float m12407r2 = this.f16805b.m12407r();
                        if (c1325ft.f9871j && c1325ft2.f9871j) {
                            C1325ft c1325ft3 = this.f16811h;
                            if (c1325ft3.f9864c && this.f16812i.f9864c) {
                                m10475q(f26054k, c1325ft3.f9873l.get(0).f9868g + this.f16811h.f9867f, this.f16812i.f9873l.get(0).f9868g - this.f16812i.f9867f, c1325ft.f9868g + c1325ft.f9867f, c1325ft2.f9868g - c1325ft2.f9867f, m12407r2, m12405s);
                                this.f16808e.mo13161d(f26054k[0]);
                                this.f16805b.f24025f.f16808e.mo13161d(f26054k[1]);
                                return;
                            }
                            return;
                        }
                        C1325ft c1325ft4 = this.f16811h;
                        if (c1325ft4.f9871j) {
                            C1325ft c1325ft5 = this.f16812i;
                            if (c1325ft5.f9871j) {
                                if (!c1325ft.f9864c || !c1325ft2.f9864c) {
                                    return;
                                }
                                m10475q(f26054k, c1325ft4.f9868g + c1325ft4.f9867f, c1325ft5.f9868g - c1325ft5.f9867f, c1325ft.f9873l.get(0).f9868g + c1325ft.f9867f, c1325ft2.f9873l.get(0).f9868g - c1325ft2.f9867f, m12407r2, m12405s);
                                this.f16808e.mo13161d(f26054k[0]);
                                this.f16805b.f24025f.f16808e.mo13161d(f26054k[1]);
                            }
                        }
                        C1325ft c1325ft6 = this.f16811h;
                        if (!c1325ft6.f9864c || !this.f16812i.f9864c || !c1325ft.f9864c || !c1325ft2.f9864c) {
                            return;
                        }
                        m10475q(f26054k, c1325ft6.f9873l.get(0).f9868g + this.f16811h.f9867f, this.f16812i.f9873l.get(0).f9868g - this.f16812i.f9867f, c1325ft.f9873l.get(0).f9868g + c1325ft.f9867f, c1325ft2.f9873l.get(0).f9868g - c1325ft2.f9867f, m12407r2, m12405s);
                        this.f16808e.mo13161d(f26054k[0]);
                        c2587pt = this.f16805b.f24025f.f16808e;
                        m17363g = f26054k[1];
                    } else if (z && z3) {
                        if (!this.f16811h.f9864c || !this.f16812i.f9864c) {
                            return;
                        }
                        float m12407r3 = this.f16805b.m12407r();
                        int i5 = this.f16811h.f9873l.get(0).f9868g + this.f16811h.f9867f;
                        int i6 = this.f16812i.f9873l.get(0).f9868g - this.f16812i.f9867f;
                        if (m12405s == -1 || m12405s == 0) {
                            m17363g3 = m17363g(i6 - i5, 0);
                            int i7 = (int) ((m17363g3 * m12407r3) + 0.5f);
                            m17363g4 = m17363g(i7, 1);
                            if (i7 != m17363g4) {
                                f2 = m17363g4 / m12407r3;
                                m17363g3 = (int) (f2 + 0.5f);
                            }
                            this.f16808e.mo13161d(m17363g3);
                            this.f16805b.f24025f.f16808e.mo13161d(m17363g4);
                        } else if (m12405s == 1) {
                            m17363g3 = m17363g(i6 - i5, 0);
                            int i8 = (int) ((m17363g3 / m12407r3) + 0.5f);
                            m17363g4 = m17363g(i8, 1);
                            if (i8 != m17363g4) {
                                f2 = m17363g4 * m12407r3;
                                m17363g3 = (int) (f2 + 0.5f);
                            }
                            this.f16808e.mo13161d(m17363g3);
                            this.f16805b.f24025f.f16808e.mo13161d(m17363g4);
                        }
                    } else if (z2 && z4) {
                        if (!c1325ft.f9864c || !c1325ft2.f9864c) {
                            return;
                        }
                        float m12407r4 = this.f16805b.m12407r();
                        int i9 = c1325ft.f9873l.get(0).f9868g + c1325ft.f9867f;
                        int i10 = c1325ft2.f9873l.get(0).f9868g - c1325ft2.f9867f;
                        if (m12405s != -1) {
                            if (m12405s == 0) {
                                m17363g = m17363g(i10 - i9, 1);
                                int i11 = (int) ((m17363g * m12407r4) + 0.5f);
                                m17363g2 = m17363g(i11, 0);
                                if (i11 != m17363g2) {
                                    f = m17363g2 / m12407r4;
                                    m17363g = (int) (f + 0.5f);
                                }
                                this.f16808e.mo13161d(m17363g2);
                                c2587pt = this.f16805b.f24025f.f16808e;
                            }
                        }
                        m17363g = m17363g(i10 - i9, 1);
                        int i12 = (int) ((m17363g / m12407r4) + 0.5f);
                        m17363g2 = m17363g(i12, 0);
                        if (i12 != m17363g2) {
                            f = m17363g2 * m12407r4;
                            m17363g = (int) (f + 0.5f);
                        }
                        this.f16808e.mo13161d(m17363g2);
                        c2587pt = this.f16805b.f24025f.f16808e;
                    }
                    c2587pt.mo13161d(m17363g);
                } else {
                    int m12405s2 = c2716qj2.m12405s();
                    if (m12405s2 != -1) {
                        if (m12405s2 == 0) {
                            C2716qj c2716qj3 = this.f16805b;
                            m12407r = c2716qj3.f24025f.f16808e.f9868g / c2716qj3.m12407r();
                            i = (int) (m12407r + 0.5f);
                            this.f16808e.mo13161d(i);
                        } else if (m12405s2 != 1) {
                            i = 0;
                            this.f16808e.mo13161d(i);
                        }
                    }
                    C2716qj c2716qj4 = this.f16805b;
                    m12407r = c2716qj4.f24025f.f16808e.f9868g * c2716qj4.m12407r();
                    i = (int) (m12407r + 0.5f);
                    this.f16808e.mo13161d(i);
                }
            }
        }
        C1325ft c1325ft7 = this.f16811h;
        if (c1325ft7.f9864c) {
            C1325ft c1325ft8 = this.f16812i;
            if (c1325ft8.f9864c) {
                if (c1325ft7.f9871j && c1325ft8.f9871j && this.f16808e.f9871j) {
                    return;
                }
                if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                    C2716qj c2716qj5 = this.f16805b;
                    if (c2716qj5.f24037l == 0 && !c2716qj5.m12444T()) {
                        int i13 = this.f16811h.f9873l.get(0).f9868g;
                        C1325ft c1325ft9 = this.f16811h;
                        int i14 = i13 + c1325ft9.f9867f;
                        int i15 = this.f16812i.f9873l.get(0).f9868g + this.f16812i.f9867f;
                        c1325ft9.mo13161d(i14);
                        this.f16812i.mo13161d(i15);
                        this.f16808e.mo13161d(i15 - i14);
                        return;
                    }
                }
                if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT && this.f16804a == 1 && this.f16811h.f9873l.size() > 0 && this.f16812i.f9873l.size() > 0) {
                    int min = Math.min((this.f16812i.f9873l.get(0).f9868g + this.f16812i.f9867f) - (this.f16811h.f9873l.get(0).f9868g + this.f16811h.f9867f), this.f16808e.f23257m);
                    C2716qj c2716qj6 = this.f16805b;
                    int i16 = c2716qj6.f24045p;
                    int max = Math.max(c2716qj6.f24043o, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    this.f16808e.mo13161d(max);
                }
                if (this.f16808e.f9871j) {
                    C1325ft c1325ft10 = this.f16811h.f9873l.get(0);
                    C1325ft c1325ft11 = this.f16812i.f9873l.get(0);
                    int i17 = c1325ft10.f9868g + this.f16811h.f9867f;
                    int i18 = c1325ft11.f9868g + this.f16812i.f9867f;
                    float m12401u = this.f16805b.m12401u();
                    if (c1325ft10 == c1325ft11) {
                        i17 = c1325ft10.f9868g;
                        i18 = c1325ft11.f9868g;
                        m12401u = 0.5f;
                    }
                    this.f16811h.mo13161d((int) (i17 + 0.5f + (((i18 - i17) - this.f16808e.f9868g) * m12401u)));
                    this.f16812i.mo13161d(this.f16811h.f9868g + this.f16808e.f9868g);
                }
            }
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: d */
    public void mo10451d() {
        C2716qj m12461E;
        C1325ft c1325ft;
        C1325ft c1325ft2;
        int m12449O;
        C1325ft c1325ft3;
        C2041lj c2041lj;
        List<InterfaceC3891zs> list;
        InterfaceC3891zs interfaceC3891zs;
        C1325ft c1325ft4;
        C1325ft c1325ft5;
        C1325ft c1325ft6;
        int m12449O2;
        C1325ft c1325ft7;
        C1325ft c1325ft8;
        int i;
        C2716qj m12461E2;
        C2716qj c2716qj = this.f16805b;
        if (c2716qj.f24015a) {
            this.f16808e.mo13161d(c2716qj.m12450N());
        }
        if (this.f16808e.f9871j) {
            C2716qj.EnumC2718b enumC2718b = this.f16807d;
            C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.MATCH_PARENT;
            if (enumC2718b == enumC2718b2 && (((m12461E = this.f16805b.m12461E()) != null && m12461E.m12397w() == C2716qj.EnumC2718b.FIXED) || m12461E.m12397w() == enumC2718b2)) {
                m17365b(this.f16811h, m12461E.f24023e.f16811h, this.f16805b.f23990B.m16930b());
                m17365b(this.f16812i, m12461E.f24023e.f16812i, -this.f16805b.f23992D.m16930b());
                return;
            }
        } else {
            C2716qj.EnumC2718b m12397w = this.f16805b.m12397w();
            this.f16807d = m12397w;
            if (m12397w != C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.MATCH_PARENT;
                if (m12397w == enumC2718b3 && (((m12461E2 = this.f16805b.m12461E()) != null && m12461E2.m12397w() == C2716qj.EnumC2718b.FIXED) || m12461E2.m12397w() == enumC2718b3)) {
                    int m12450N = (m12461E2.m12450N() - this.f16805b.f23990B.m16930b()) - this.f16805b.f23992D.m16930b();
                    m17365b(this.f16811h, m12461E2.f24023e.f16811h, this.f16805b.f23990B.m16930b());
                    m17365b(this.f16812i, m12461E2.f24023e.f16812i, -this.f16805b.f23992D.m16930b());
                    this.f16808e.mo13161d(m12450N);
                    return;
                } else if (this.f16807d == C2716qj.EnumC2718b.FIXED) {
                    this.f16808e.mo13161d(this.f16805b.m12450N());
                }
            }
        }
        C2587pt c2587pt = this.f16808e;
        if (c2587pt.f9871j) {
            C2716qj c2716qj2 = this.f16805b;
            if (c2716qj2.f24015a) {
                C2041lj[] c2041ljArr = c2716qj2.f23998J;
                if (c2041ljArr[0].f17433d != null && c2041ljArr[1].f17433d != null) {
                    if (c2716qj2.m12444T()) {
                        this.f16811h.f9867f = this.f16805b.f23998J[0].m16930b();
                        c1325ft3 = this.f16812i;
                        c2041lj = this.f16805b.f23998J[1];
                        c1325ft3.f9867f = -c2041lj.m16930b();
                        return;
                    }
                    C1325ft m17362h = m17362h(this.f16805b.f23998J[0]);
                    if (m17362h != null) {
                        m17365b(this.f16811h, m17362h, this.f16805b.f23998J[0].m16930b());
                    }
                    C1325ft m17362h2 = m17362h(this.f16805b.f23998J[1]);
                    if (m17362h2 != null) {
                        m17365b(this.f16812i, m17362h2, -this.f16805b.f23998J[1].m16930b());
                    }
                    this.f16811h.f9863b = true;
                    this.f16812i.f9863b = true;
                    return;
                }
                if (c2041ljArr[0].f17433d != null) {
                    c1325ft5 = m17362h(c2041ljArr[0]);
                    if (c1325ft5 == null) {
                        return;
                    }
                    c1325ft6 = this.f16811h;
                    m12449O2 = this.f16805b.f23998J[0].m16930b();
                } else if (c2041ljArr[1].f17433d != null) {
                    C1325ft m17362h3 = m17362h(c2041ljArr[1]);
                    if (m17362h3 != null) {
                        m17365b(this.f16812i, m17362h3, -this.f16805b.f23998J[1].m16930b());
                        c1325ft7 = this.f16811h;
                        c1325ft8 = this.f16812i;
                        i = -this.f16808e.f9868g;
                        m17365b(c1325ft7, c1325ft8, i);
                        return;
                    }
                    return;
                } else if ((c2716qj2 instanceof za0) || c2716qj2.m12461E() == null || this.f16805b.mo12421k(C2041lj.EnumC2043b.CENTER).f17433d != null) {
                    return;
                } else {
                    c1325ft5 = this.f16805b.m12461E().f24023e.f16811h;
                    c1325ft6 = this.f16811h;
                    m12449O2 = this.f16805b.m12449O();
                }
                m17365b(c1325ft6, c1325ft5, m12449O2);
                c1325ft7 = this.f16812i;
                c1325ft8 = this.f16811h;
                i = this.f16808e.f9868g;
                m17365b(c1325ft7, c1325ft8, i);
                return;
            }
        }
        if (this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
            C2716qj c2716qj3 = this.f16805b;
            int i2 = c2716qj3.f24037l;
            if (i2 == 2) {
                C2716qj m12461E3 = c2716qj3.m12461E();
                if (m12461E3 != null) {
                    C2587pt c2587pt2 = m12461E3.f24025f.f16808e;
                    this.f16808e.f9873l.add(c2587pt2);
                    c2587pt2.f9872k.add(this.f16808e);
                    C2587pt c2587pt3 = this.f16808e;
                    c2587pt3.f9863b = true;
                    c2587pt3.f9872k.add(this.f16811h);
                    list = this.f16808e.f9872k;
                    interfaceC3891zs = this.f16812i;
                    list.add(interfaceC3891zs);
                }
            } else if (i2 == 3) {
                if (c2716qj3.f24039m == 3) {
                    this.f16811h.f9862a = this;
                    this.f16812i.f9862a = this;
                    ms1 ms1Var = c2716qj3.f24025f;
                    ms1Var.f16811h.f9862a = this;
                    ms1Var.f16812i.f9862a = this;
                    c2587pt.f9862a = this;
                    if (c2716qj3.m12442V()) {
                        this.f16808e.f9873l.add(this.f16805b.f24025f.f16808e);
                        this.f16805b.f24025f.f16808e.f9872k.add(this.f16808e);
                        ms1 ms1Var2 = this.f16805b.f24025f;
                        ms1Var2.f16808e.f9862a = this;
                        this.f16808e.f9873l.add(ms1Var2.f16811h);
                        this.f16808e.f9873l.add(this.f16805b.f24025f.f16812i);
                        this.f16805b.f24025f.f16811h.f9872k.add(this.f16808e);
                        list = this.f16805b.f24025f.f16812i.f9872k;
                        interfaceC3891zs = this.f16808e;
                        list.add(interfaceC3891zs);
                    } else if (this.f16805b.m12444T()) {
                        this.f16805b.f24025f.f16808e.f9873l.add(this.f16808e);
                        list = this.f16808e.f9872k;
                        interfaceC3891zs = this.f16805b.f24025f.f16808e;
                        list.add(interfaceC3891zs);
                    } else {
                        c1325ft4 = this.f16805b.f24025f.f16808e;
                    }
                } else {
                    C2587pt c2587pt4 = c2716qj3.f24025f.f16808e;
                    c2587pt.f9873l.add(c2587pt4);
                    c2587pt4.f9872k.add(this.f16808e);
                    this.f16805b.f24025f.f16811h.f9872k.add(this.f16808e);
                    this.f16805b.f24025f.f16812i.f9872k.add(this.f16808e);
                    C2587pt c2587pt5 = this.f16808e;
                    c2587pt5.f9863b = true;
                    c2587pt5.f9872k.add(this.f16811h);
                    this.f16808e.f9872k.add(this.f16812i);
                    this.f16811h.f9873l.add(this.f16808e);
                    c1325ft4 = this.f16812i;
                }
                list = c1325ft4.f9873l;
                interfaceC3891zs = this.f16808e;
                list.add(interfaceC3891zs);
            }
            c1325ft3.f9867f = -c2041lj.m16930b();
            return;
        }
        C2716qj c2716qj4 = this.f16805b;
        C2041lj[] c2041ljArr2 = c2716qj4.f23998J;
        if (c2041ljArr2[0].f17433d != null && c2041ljArr2[1].f17433d != null) {
            if (c2716qj4.m12444T()) {
                this.f16811h.f9867f = this.f16805b.f23998J[0].m16930b();
                c1325ft3 = this.f16812i;
                c2041lj = this.f16805b.f23998J[1];
                c1325ft3.f9867f = -c2041lj.m16930b();
                return;
            }
            C1325ft m17362h4 = m17362h(this.f16805b.f23998J[0]);
            C1325ft m17362h5 = m17362h(this.f16805b.f23998J[1]);
            m17362h4.m22311b(this);
            m17362h5.m22311b(this);
            this.f16813j = kx1.EnumC1995b.CENTER;
            return;
        }
        if (c2041ljArr2[0].f17433d != null) {
            c1325ft = m17362h(c2041ljArr2[0]);
            if (c1325ft == null) {
                return;
            }
            c1325ft2 = this.f16811h;
            m12449O = this.f16805b.f23998J[0].m16930b();
        } else if (c2041ljArr2[1].f17433d != null) {
            C1325ft m17362h6 = m17362h(c2041ljArr2[1]);
            if (m17362h6 != null) {
                m17365b(this.f16812i, m17362h6, -this.f16805b.f23998J[1].m16930b());
                m17364c(this.f16811h, this.f16812i, -1, this.f16808e);
                return;
            }
            return;
        } else if ((c2716qj4 instanceof za0) || c2716qj4.m12461E() == null) {
            return;
        } else {
            c1325ft = this.f16805b.m12461E().f24023e.f16811h;
            c1325ft2 = this.f16811h;
            m12449O = this.f16805b.m12449O();
        }
        m17365b(c1325ft2, c1325ft, m12449O);
        m17364c(this.f16812i, this.f16811h, 1, this.f16808e);
    }

    @Override // com.daaw.kx1
    /* renamed from: e */
    public void mo10450e() {
        C1325ft c1325ft = this.f16811h;
        if (c1325ft.f9871j) {
            this.f16805b.m12464C0(c1325ft.f9868g);
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: f */
    public void mo10449f() {
        this.f16806c = null;
        this.f16811h.m22310c();
        this.f16812i.m22310c();
        this.f16808e.m22310c();
        this.f16810g = false;
    }

    @Override // com.daaw.kx1
    /* renamed from: m */
    public boolean mo10447m() {
        return this.f16807d != C2716qj.EnumC2718b.MATCH_CONSTRAINT || this.f16805b.f24037l == 0;
    }

    /* renamed from: q */
    public final void m10475q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: r */
    public void m10474r() {
        this.f16810g = false;
        this.f16811h.m22310c();
        this.f16811h.f9871j = false;
        this.f16812i.m22310c();
        this.f16812i.f9871j = false;
        this.f16808e.f9871j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f16805b.m12411p();
    }
}
