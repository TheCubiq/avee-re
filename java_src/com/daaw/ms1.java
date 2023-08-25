package com.daaw;

import com.daaw.C1325ft;
import com.daaw.C2041lj;
import com.daaw.C2716qj;
import com.daaw.kx1;
/* loaded from: classes.dex */
public class ms1 extends kx1 {

    /* renamed from: k */
    public C1325ft f19119k;

    /* renamed from: l */
    public C2587pt f19120l;

    /* renamed from: com.daaw.ms1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2208a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19121a;

        static {
            int[] iArr = new int[kx1.EnumC1995b.values().length];
            f19121a = iArr;
            try {
                iArr[kx1.EnumC1995b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19121a[kx1.EnumC1995b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19121a[kx1.EnumC1995b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ms1(C2716qj c2716qj) {
        super(c2716qj);
        C1325ft c1325ft = new C1325ft(this);
        this.f19119k = c1325ft;
        this.f19120l = null;
        this.f16811h.f9866e = C1325ft.EnumC1326a.TOP;
        this.f16812i.f9866e = C1325ft.EnumC1326a.BOTTOM;
        c1325ft.f9866e = C1325ft.EnumC1326a.BASELINE;
        this.f16809f = 1;
    }

    @Override // com.daaw.kx1, com.daaw.InterfaceC3891zs
    /* renamed from: a */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        int i;
        float m12407r;
        int i2 = C2208a.f19121a[this.f16813j.ordinal()];
        if (i2 == 1) {
            m17356p(interfaceC3891zs);
        } else if (i2 == 2) {
            m17357o(interfaceC3891zs);
        } else if (i2 == 3) {
            C2716qj c2716qj = this.f16805b;
            m17358n(interfaceC3891zs, c2716qj.f23991C, c2716qj.f23993E, 1);
            return;
        }
        C2587pt c2587pt = this.f16808e;
        if (c2587pt.f9864c && !c2587pt.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
            C2716qj c2716qj2 = this.f16805b;
            int i3 = c2716qj2.f24039m;
            if (i3 == 2) {
                C2716qj m12461E = c2716qj2.m12461E();
                if (m12461E != null) {
                    C2587pt c2587pt2 = m12461E.f24025f.f16808e;
                    if (c2587pt2.f9871j) {
                        i = (int) ((c2587pt2.f9868g * this.f16805b.f24053t) + 0.5f);
                        this.f16808e.mo13161d(i);
                    }
                }
            } else if (i3 == 3 && c2716qj2.f24023e.f16808e.f9871j) {
                int m12405s = c2716qj2.m12405s();
                if (m12405s != -1) {
                    if (m12405s == 0) {
                        C2716qj c2716qj3 = this.f16805b;
                        m12407r = c2716qj3.f24023e.f16808e.f9868g * c2716qj3.m12407r();
                        i = (int) (m12407r + 0.5f);
                        this.f16808e.mo13161d(i);
                    } else if (m12405s != 1) {
                        i = 0;
                        this.f16808e.mo13161d(i);
                    }
                }
                C2716qj c2716qj4 = this.f16805b;
                m12407r = c2716qj4.f24023e.f16808e.f9868g / c2716qj4.m12407r();
                i = (int) (m12407r + 0.5f);
                this.f16808e.mo13161d(i);
            }
        }
        C1325ft c1325ft = this.f16811h;
        if (c1325ft.f9864c) {
            C1325ft c1325ft2 = this.f16812i;
            if (c1325ft2.f9864c) {
                if (c1325ft.f9871j && c1325ft2.f9871j && this.f16808e.f9871j) {
                    return;
                }
                if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                    C2716qj c2716qj5 = this.f16805b;
                    if (c2716qj5.f24037l == 0 && !c2716qj5.m12442V()) {
                        int i4 = this.f16811h.f9873l.get(0).f9868g;
                        C1325ft c1325ft3 = this.f16811h;
                        int i5 = i4 + c1325ft3.f9867f;
                        int i6 = this.f16812i.f9873l.get(0).f9868g + this.f16812i.f9867f;
                        c1325ft3.mo13161d(i5);
                        this.f16812i.mo13161d(i6);
                        this.f16808e.mo13161d(i6 - i5);
                        return;
                    }
                }
                if (!this.f16808e.f9871j && this.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT && this.f16804a == 1 && this.f16811h.f9873l.size() > 0 && this.f16812i.f9873l.size() > 0) {
                    int i7 = (this.f16812i.f9873l.get(0).f9868g + this.f16812i.f9867f) - (this.f16811h.f9873l.get(0).f9868g + this.f16811h.f9867f);
                    C2587pt c2587pt3 = this.f16808e;
                    int i8 = c2587pt3.f23257m;
                    if (i7 < i8) {
                        c2587pt3.mo13161d(i7);
                    } else {
                        c2587pt3.mo13161d(i8);
                    }
                }
                if (this.f16808e.f9871j && this.f16811h.f9873l.size() > 0 && this.f16812i.f9873l.size() > 0) {
                    C1325ft c1325ft4 = this.f16811h.f9873l.get(0);
                    C1325ft c1325ft5 = this.f16812i.f9873l.get(0);
                    int i9 = c1325ft4.f9868g + this.f16811h.f9867f;
                    int i10 = c1325ft5.f9868g + this.f16812i.f9867f;
                    float m12455I = this.f16805b.m12455I();
                    if (c1325ft4 == c1325ft5) {
                        i9 = c1325ft4.f9868g;
                        i10 = c1325ft5.f9868g;
                        m12455I = 0.5f;
                    }
                    this.f16811h.mo13161d((int) (i9 + 0.5f + (((i10 - i9) - this.f16808e.f9868g) * m12455I)));
                    this.f16812i.mo13161d(this.f16811h.f9868g + this.f16808e.f9868g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
        if (r9.f16805b.m12447Q() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e5, code lost:
        r0 = r9.f19119k;
        r1 = r9.f16811h;
        r2 = r9.f19120l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x033e, code lost:
        if (r0.f16807d == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0370, code lost:
        if (r9.f16805b.m12447Q() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e7, code lost:
        if (r0.f16807d == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e9, code lost:
        r0.f16808e.f9872k.add(r9.f16808e);
        r9.f16808e.f9873l.add(r9.f16805b.f24023e.f16808e);
        r9.f16808e.f9862a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.kx1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10451d() {
        C2716qj m12461E;
        sb0 sb0Var;
        C1325ft c1325ft;
        C1325ft c1325ft2;
        C2587pt c2587pt;
        kx1 kx1Var;
        C1325ft c1325ft3;
        C1325ft c1325ft4;
        int i;
        C2716qj m12461E2;
        C2716qj c2716qj = this.f16805b;
        if (c2716qj.f24015a) {
            this.f16808e.mo13161d(c2716qj.m12403t());
        }
        if (!this.f16808e.f9871j) {
            this.f16807d = this.f16805b.m12453K();
            if (this.f16805b.m12447Q()) {
                this.f19120l = new C1267fb(this);
            }
            C2716qj.EnumC2718b enumC2718b = this.f16807d;
            if (enumC2718b != C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                if (enumC2718b == C2716qj.EnumC2718b.MATCH_PARENT && (m12461E2 = this.f16805b.m12461E()) != null && m12461E2.m12453K() == C2716qj.EnumC2718b.FIXED) {
                    int m12403t = (m12461E2.m12403t() - this.f16805b.f23991C.m16930b()) - this.f16805b.f23993E.m16930b();
                    m17365b(this.f16811h, m12461E2.f24025f.f16811h, this.f16805b.f23991C.m16930b());
                    m17365b(this.f16812i, m12461E2.f24025f.f16812i, -this.f16805b.f23993E.m16930b());
                    this.f16808e.mo13161d(m12403t);
                    return;
                } else if (this.f16807d == C2716qj.EnumC2718b.FIXED) {
                    this.f16808e.mo13161d(this.f16805b.m12403t());
                }
            }
        } else if (this.f16807d == C2716qj.EnumC2718b.MATCH_PARENT && (m12461E = this.f16805b.m12461E()) != null && m12461E.m12453K() == C2716qj.EnumC2718b.FIXED) {
            m17365b(this.f16811h, m12461E.f24025f.f16811h, this.f16805b.f23991C.m16930b());
            m17365b(this.f16812i, m12461E.f24025f.f16812i, -this.f16805b.f23993E.m16930b());
            return;
        }
        C2587pt c2587pt2 = this.f16808e;
        boolean z = c2587pt2.f9871j;
        if (z) {
            C2716qj c2716qj2 = this.f16805b;
            if (c2716qj2.f24015a) {
                C2041lj[] c2041ljArr = c2716qj2.f23998J;
                if (c2041ljArr[2].f17433d != null && c2041ljArr[3].f17433d != null) {
                    if (c2716qj2.m12442V()) {
                        this.f16811h.f9867f = this.f16805b.f23998J[2].m16930b();
                        this.f16812i.f9867f = -this.f16805b.f23998J[3].m16930b();
                    } else {
                        C1325ft m17362h = m17362h(this.f16805b.f23998J[2]);
                        if (m17362h != null) {
                            m17365b(this.f16811h, m17362h, this.f16805b.f23998J[2].m16930b());
                        }
                        C1325ft m17362h2 = m17362h(this.f16805b.f23998J[3]);
                        if (m17362h2 != null) {
                            m17365b(this.f16812i, m17362h2, -this.f16805b.f23998J[3].m16930b());
                        }
                        this.f16811h.f9863b = true;
                        this.f16812i.f9863b = true;
                    }
                    if (!this.f16805b.m12447Q()) {
                        return;
                    }
                } else if (c2041ljArr[2].f17433d != null) {
                    C1325ft m17362h3 = m17362h(c2041ljArr[2]);
                    if (m17362h3 == null) {
                        return;
                    }
                    m17365b(this.f16811h, m17362h3, this.f16805b.f23998J[2].m16930b());
                    m17365b(this.f16812i, this.f16811h, this.f16808e.f9868g);
                    if (!this.f16805b.m12447Q()) {
                        return;
                    }
                } else if (c2041ljArr[3].f17433d != null) {
                    C1325ft m17362h4 = m17362h(c2041ljArr[3]);
                    if (m17362h4 != null) {
                        m17365b(this.f16812i, m17362h4, -this.f16805b.f23998J[3].m16930b());
                        m17365b(this.f16811h, this.f16812i, -this.f16808e.f9868g);
                    }
                    if (!this.f16805b.m12447Q()) {
                        return;
                    }
                } else if (c2041ljArr[4].f17433d != null) {
                    C1325ft m17362h5 = m17362h(c2041ljArr[4]);
                    if (m17362h5 != null) {
                        m17365b(this.f19119k, m17362h5, 0);
                        m17365b(this.f16811h, this.f19119k, -this.f16805b.m12419l());
                        c1325ft3 = this.f16812i;
                        c1325ft4 = this.f16811h;
                        i = this.f16808e.f9868g;
                        m17365b(c1325ft3, c1325ft4, i);
                        return;
                    }
                    return;
                } else if ((c2716qj2 instanceof za0) || c2716qj2.m12461E() == null || this.f16805b.mo12421k(C2041lj.EnumC2043b.CENTER).f17433d != null) {
                    return;
                } else {
                    m17365b(this.f16811h, this.f16805b.m12461E().f24025f.f16811h, this.f16805b.m12448P());
                    m17365b(this.f16812i, this.f16811h, this.f16808e.f9868g);
                    if (!this.f16805b.m12447Q()) {
                        return;
                    }
                }
                c1325ft3 = this.f19119k;
                c1325ft4 = this.f16811h;
                i = this.f16805b.m12419l();
                m17365b(c1325ft3, c1325ft4, i);
                return;
            }
        }
        if (z || this.f16807d != C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
            c2587pt2.m22311b(this);
        } else {
            C2716qj c2716qj3 = this.f16805b;
            int i2 = c2716qj3.f24039m;
            if (i2 == 2) {
                C2716qj m12461E3 = c2716qj3.m12461E();
                if (m12461E3 != null) {
                    kx1Var = m12461E3.f24025f;
                    C2587pt c2587pt3 = kx1Var.f16808e;
                    this.f16808e.f9873l.add(c2587pt3);
                    c2587pt3.f9872k.add(this.f16808e);
                    C2587pt c2587pt4 = this.f16808e;
                    c2587pt4.f9863b = true;
                    c2587pt4.f9872k.add(this.f16811h);
                    this.f16808e.f9872k.add(this.f16812i);
                }
            } else if (i2 == 3 && !c2716qj3.m12442V()) {
                C2716qj c2716qj4 = this.f16805b;
                if (c2716qj4.f24037l != 3) {
                    kx1Var = c2716qj4.f24023e;
                    C2587pt c2587pt32 = kx1Var.f16808e;
                    this.f16808e.f9873l.add(c2587pt32);
                    c2587pt32.f9872k.add(this.f16808e);
                    C2587pt c2587pt42 = this.f16808e;
                    c2587pt42.f9863b = true;
                    c2587pt42.f9872k.add(this.f16811h);
                    this.f16808e.f9872k.add(this.f16812i);
                }
            }
        }
        C2716qj c2716qj5 = this.f16805b;
        C2041lj[] c2041ljArr2 = c2716qj5.f23998J;
        if (c2041ljArr2[2].f17433d == null || c2041ljArr2[3].f17433d == null) {
            if (c2041ljArr2[2].f17433d != null) {
                C1325ft m17362h6 = m17362h(c2041ljArr2[2]);
                if (m17362h6 != null) {
                    m17365b(this.f16811h, m17362h6, this.f16805b.f23998J[2].m16930b());
                    m17364c(this.f16812i, this.f16811h, 1, this.f16808e);
                    if (this.f16805b.m12447Q()) {
                        m17364c(this.f19119k, this.f16811h, 1, this.f19120l);
                    }
                    C2716qj.EnumC2718b enumC2718b2 = this.f16807d;
                    C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                    if (enumC2718b2 == enumC2718b3 && this.f16805b.m12407r() > 0.0f) {
                        sb0Var = this.f16805b.f24023e;
                    }
                }
            } else if (c2041ljArr2[3].f17433d != null) {
                C1325ft m17362h7 = m17362h(c2041ljArr2[3]);
                if (m17362h7 != null) {
                    m17365b(this.f16812i, m17362h7, -this.f16805b.f23998J[3].m16930b());
                    m17364c(this.f16811h, this.f16812i, -1, this.f16808e);
                }
            } else if (c2041ljArr2[4].f17433d != null) {
                C1325ft m17362h8 = m17362h(c2041ljArr2[4]);
                if (m17362h8 != null) {
                    m17365b(this.f19119k, m17362h8, 0);
                    m17364c(this.f16811h, this.f19119k, -1, this.f19120l);
                    c1325ft = this.f16812i;
                    c1325ft2 = this.f16811h;
                    c2587pt = this.f16808e;
                }
            } else if (!(c2716qj5 instanceof za0) && c2716qj5.m12461E() != null) {
                m17365b(this.f16811h, this.f16805b.m12461E().f24025f.f16811h, this.f16805b.m12448P());
                m17364c(this.f16812i, this.f16811h, 1, this.f16808e);
                if (this.f16805b.m12447Q()) {
                    m17364c(this.f19119k, this.f16811h, 1, this.f19120l);
                }
                C2716qj.EnumC2718b enumC2718b4 = this.f16807d;
                C2716qj.EnumC2718b enumC2718b5 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (enumC2718b4 == enumC2718b5 && this.f16805b.m12407r() > 0.0f) {
                    sb0Var = this.f16805b.f24023e;
                }
            }
            if (this.f16808e.f9873l.size() != 0) {
                this.f16808e.f9864c = true;
                return;
            }
            return;
        } else if (c2716qj5.m12442V()) {
            this.f16811h.f9867f = this.f16805b.f23998J[2].m16930b();
            this.f16812i.f9867f = -this.f16805b.f23998J[3].m16930b();
        } else {
            C1325ft m17362h9 = m17362h(this.f16805b.f23998J[2]);
            C1325ft m17362h10 = m17362h(this.f16805b.f23998J[3]);
            m17362h9.m22311b(this);
            m17362h10.m22311b(this);
            this.f16813j = kx1.EnumC1995b.CENTER;
        }
        m17364c(c1325ft, c1325ft2, 1, c2587pt);
        if (this.f16808e.f9873l.size() != 0) {
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: e */
    public void mo10450e() {
        C1325ft c1325ft = this.f16811h;
        if (c1325ft.f9871j) {
            this.f16805b.m12462D0(c1325ft.f9868g);
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: f */
    public void mo10449f() {
        this.f16806c = null;
        this.f16811h.m22310c();
        this.f16812i.m22310c();
        this.f19119k.m22310c();
        this.f16808e.m22310c();
        this.f16810g = false;
    }

    @Override // com.daaw.kx1
    /* renamed from: m */
    public boolean mo10447m() {
        return this.f16807d != C2716qj.EnumC2718b.MATCH_CONSTRAINT || this.f16805b.f24039m == 0;
    }

    /* renamed from: q */
    public void m15805q() {
        this.f16810g = false;
        this.f16811h.m22310c();
        this.f16811h.f9871j = false;
        this.f16812i.m22310c();
        this.f16812i.f9871j = false;
        this.f19119k.m22310c();
        this.f19119k.f9871j = false;
        this.f16808e.f9871j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f16805b.m12411p();
    }
}
