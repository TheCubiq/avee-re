package com.daaw;

import com.daaw.C2041lj;
import com.daaw.C2716qj;
import java.util.ArrayList;
/* renamed from: com.daaw.gb */
/* loaded from: classes.dex */
public class C1387gb {

    /* renamed from: a */
    public final ArrayList<C2716qj> f10983a = new ArrayList<>();

    /* renamed from: b */
    public C1388a f10984b = new C1388a();

    /* renamed from: c */
    public C2865rj f10985c;

    /* renamed from: com.daaw.gb$a */
    /* loaded from: classes.dex */
    public static class C1388a {

        /* renamed from: a */
        public C2716qj.EnumC2718b f10986a;

        /* renamed from: b */
        public C2716qj.EnumC2718b f10987b;

        /* renamed from: c */
        public int f10988c;

        /* renamed from: d */
        public int f10989d;

        /* renamed from: e */
        public int f10990e;

        /* renamed from: f */
        public int f10991f;

        /* renamed from: g */
        public int f10992g;

        /* renamed from: h */
        public boolean f10993h;

        /* renamed from: i */
        public boolean f10994i;

        /* renamed from: j */
        public boolean f10995j;
    }

    /* renamed from: com.daaw.gb$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1389b {
        /* renamed from: a */
        void mo21829a();

        /* renamed from: b */
        void mo21828b(C2716qj c2716qj, C1388a c1388a);
    }

    public C1387gb(C2865rj c2865rj) {
        this.f10985c = c2865rj;
    }

    /* renamed from: a */
    public final boolean m21834a(InterfaceC1389b interfaceC1389b, C2716qj c2716qj, boolean z) {
        this.f10984b.f10986a = c2716qj.m12397w();
        this.f10984b.f10987b = c2716qj.m12453K();
        this.f10984b.f10988c = c2716qj.m12450N();
        this.f10984b.f10989d = c2716qj.m12403t();
        C1388a c1388a = this.f10984b;
        c1388a.f10994i = false;
        c1388a.f10995j = z;
        C2716qj.EnumC2718b enumC2718b = c1388a.f10986a;
        C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
        boolean z2 = enumC2718b == enumC2718b2;
        boolean z3 = c1388a.f10987b == enumC2718b2;
        boolean z4 = z2 && c2716qj.f24005Q > 0.0f;
        boolean z5 = z3 && c2716qj.f24005Q > 0.0f;
        if (z4 && c2716qj.f24041n[0] == 4) {
            c1388a.f10986a = C2716qj.EnumC2718b.FIXED;
        }
        if (z5 && c2716qj.f24041n[1] == 4) {
            c1388a.f10987b = C2716qj.EnumC2718b.FIXED;
        }
        interfaceC1389b.mo21828b(c2716qj, c1388a);
        c2716qj.m12466B0(this.f10984b.f10990e);
        c2716qj.m12432e0(this.f10984b.f10991f);
        c2716qj.m12434d0(this.f10984b.f10993h);
        c2716qj.m12440Y(this.f10984b.f10992g);
        C1388a c1388a2 = this.f10984b;
        c1388a2.f10995j = false;
        return c1388a2.f10994i;
    }

    /* renamed from: b */
    public final void m21833b(C2865rj c2865rj) {
        int size = c2865rj.f15492w0.size();
        InterfaceC1389b m11265R0 = c2865rj.m11265R0();
        for (int i = 0; i < size; i++) {
            C2716qj c2716qj = c2865rj.f15492w0.get(i);
            if (!(c2716qj instanceof k80) && (!c2716qj.f24023e.f16808e.f9871j || !c2716qj.f24025f.f16808e.f9871j)) {
                C2716qj.EnumC2718b m12409q = c2716qj.m12409q(0);
                boolean z = true;
                C2716qj.EnumC2718b m12409q2 = c2716qj.m12409q(1);
                C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (!((m12409q != enumC2718b || c2716qj.f24037l == 1 || m12409q2 != enumC2718b || c2716qj.f24039m == 1) ? false : false)) {
                    m21834a(m11265R0, c2716qj, false);
                }
            }
        }
        m11265R0.mo21829a();
    }

    /* renamed from: c */
    public final void m21832c(C2865rj c2865rj, String str, int i, int i2) {
        int m12465C = c2865rj.m12465C();
        int m12467B = c2865rj.m12467B();
        c2865rj.m12406r0(0);
        c2865rj.m12408q0(0);
        c2865rj.m12466B0(i);
        c2865rj.m12432e0(i2);
        c2865rj.m12406r0(m12465C);
        c2865rj.m12408q0(m12467B);
        this.f10985c.mo11273H0();
    }

    /* renamed from: d */
    public long m21831d(C2865rj c2865rj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        boolean z2;
        boolean z3;
        int i11;
        int i12;
        InterfaceC1389b interfaceC1389b;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        InterfaceC1389b m11265R0 = c2865rj.m11265R0();
        int size = c2865rj.f15492w0.size();
        int m12450N = c2865rj.m12450N();
        int m12403t = c2865rj.m12403t();
        boolean m9851b = su0.m9851b(i, 128);
        boolean z6 = m9851b || su0.m9851b(i, 64);
        if (z6) {
            for (int i15 = 0; i15 < size; i15++) {
                C2716qj c2716qj = c2865rj.f15492w0.get(i15);
                C2716qj.EnumC2718b m12397w = c2716qj.m12397w();
                C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                boolean z7 = (m12397w == enumC2718b) && (c2716qj.m12453K() == enumC2718b) && c2716qj.m12407r() > 0.0f;
                if ((c2716qj.m12444T() && z7) || ((c2716qj.m12442V() && z7) || (c2716qj instanceof ru1) || c2716qj.m12444T() || c2716qj.m12442V())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            int i16 = ak0.f3244q;
        }
        if (z6 && ((i4 == 1073741824 && i6 == 1073741824) || m9851b)) {
            int min = Math.min(c2865rj.m12469A(), i5);
            int min2 = Math.min(c2865rj.m12391z(), i7);
            if (i4 == 1073741824 && c2865rj.m12450N() != min) {
                c2865rj.m12466B0(min);
                c2865rj.m11263T0();
            }
            if (i6 == 1073741824 && c2865rj.m12403t() != min2) {
                c2865rj.m12432e0(min2);
                c2865rj.m11263T0();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = c2865rj.m11268O0(m9851b);
                i10 = 2;
            } else {
                boolean m11267P0 = c2865rj.m11267P0(m9851b);
                if (i4 == 1073741824) {
                    z5 = m11267P0 & c2865rj.m11266Q0(m9851b, 0);
                    i14 = 1;
                } else {
                    z5 = m11267P0;
                    i14 = 0;
                }
                if (i6 == 1073741824) {
                    boolean m11266Q0 = c2865rj.m11266Q0(m9851b, 1) & z5;
                    i10 = i14 + 1;
                    z = m11266Q0;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                c2865rj.mo11274F0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        if (size > 0) {
            m21833b(c2865rj);
        }
        int m11264S0 = c2865rj.m11264S0();
        int size2 = this.f10983a.size();
        if (size > 0) {
            m21832c(c2865rj, "First pass", m12450N, m12403t);
        }
        if (size2 > 0) {
            C2716qj.EnumC2718b m12397w2 = c2865rj.m12397w();
            C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.WRAP_CONTENT;
            boolean z8 = m12397w2 == enumC2718b2;
            boolean z9 = c2865rj.m12453K() == enumC2718b2;
            int max = Math.max(c2865rj.m12450N(), this.f10985c.m12465C());
            int max2 = Math.max(c2865rj.m12403t(), this.f10985c.m12467B());
            int i17 = 0;
            boolean z10 = false;
            while (i17 < size2) {
                C2716qj c2716qj2 = this.f10983a.get(i17);
                if (c2716qj2 instanceof ru1) {
                    int m12450N2 = c2716qj2.m12450N();
                    int m12403t2 = c2716qj2.m12403t();
                    i13 = m11264S0;
                    boolean m21834a = z10 | m21834a(m11265R0, c2716qj2, true);
                    int m12450N3 = c2716qj2.m12450N();
                    int m12403t3 = c2716qj2.m12403t();
                    if (m12450N3 != m12450N2) {
                        c2716qj2.m12466B0(m12450N3);
                        if (z8 && c2716qj2.m12458G() > max) {
                            max = Math.max(max, c2716qj2.m12458G() + c2716qj2.mo12421k(C2041lj.EnumC2043b.RIGHT).m16930b());
                        }
                        z4 = true;
                    } else {
                        z4 = m21834a;
                    }
                    if (m12403t3 != m12403t2) {
                        c2716qj2.m12432e0(m12403t3);
                        if (z9 && c2716qj2.m12415n() > max2) {
                            max2 = Math.max(max2, c2716qj2.m12415n() + c2716qj2.mo12421k(C2041lj.EnumC2043b.BOTTOM).m16930b());
                        }
                        z4 = true;
                    }
                    z10 = z4 | ((ru1) c2716qj2).m10936I0();
                } else {
                    i13 = m11264S0;
                }
                i17++;
                m11264S0 = i13;
            }
            int i18 = m11264S0;
            int i19 = 0;
            while (i19 < 2) {
                int i20 = 0;
                while (i20 < size2) {
                    C2716qj c2716qj3 = this.f10983a.get(i20);
                    if (((c2716qj3 instanceof za0) && !(c2716qj3 instanceof ru1)) || (c2716qj3 instanceof k80) || c2716qj3.m12451M() == 8 || ((c2716qj3.f24023e.f16808e.f9871j && c2716qj3.f24025f.f16808e.f9871j) || (c2716qj3 instanceof ru1))) {
                        i12 = i19;
                        i11 = size2;
                        interfaceC1389b = m11265R0;
                    } else {
                        int m12450N4 = c2716qj3.m12450N();
                        int m12403t4 = c2716qj3.m12403t();
                        i11 = size2;
                        int m12419l = c2716qj3.m12419l();
                        i12 = i19;
                        z10 |= m21834a(m11265R0, c2716qj3, true);
                        int m12450N5 = c2716qj3.m12450N();
                        interfaceC1389b = m11265R0;
                        int m12403t5 = c2716qj3.m12403t();
                        if (m12450N5 != m12450N4) {
                            c2716qj3.m12466B0(m12450N5);
                            if (z8 && c2716qj3.m12458G() > max) {
                                max = Math.max(max, c2716qj3.m12458G() + c2716qj3.mo12421k(C2041lj.EnumC2043b.RIGHT).m16930b());
                            }
                            z10 = true;
                        }
                        if (m12403t5 != m12403t4) {
                            c2716qj3.m12432e0(m12403t5);
                            if (z9 && c2716qj3.m12415n() > max2) {
                                max2 = Math.max(max2, c2716qj3.m12415n() + c2716qj3.mo12421k(C2041lj.EnumC2043b.BOTTOM).m16930b());
                            }
                            z10 = true;
                        }
                        if (c2716qj3.m12447Q() && m12419l != c2716qj3.m12419l()) {
                            z10 = true;
                        }
                    }
                    i20++;
                    size2 = i11;
                    m11265R0 = interfaceC1389b;
                    i19 = i12;
                }
                int i21 = i19;
                int i22 = size2;
                InterfaceC1389b interfaceC1389b2 = m11265R0;
                if (z10) {
                    m21832c(c2865rj, "intermediate pass", m12450N, m12403t);
                    z10 = false;
                }
                i19 = i21 + 1;
                size2 = i22;
                m11265R0 = interfaceC1389b2;
            }
            if (z10) {
                m21832c(c2865rj, "2nd pass", m12450N, m12403t);
                if (c2865rj.m12450N() < max) {
                    c2865rj.m12466B0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2865rj.m12403t() < max2) {
                    c2865rj.m12432e0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m21832c(c2865rj, "3rd pass", m12450N, m12403t);
                }
            }
            m11264S0 = i18;
        }
        c2865rj.m11253c1(m11264S0);
        return 0L;
    }

    /* renamed from: e */
    public void m21830e(C2865rj c2865rj) {
        int i;
        this.f10983a.clear();
        int size = c2865rj.f15492w0.size();
        while (i < size) {
            C2716qj c2716qj = c2865rj.f15492w0.get(i);
            C2716qj.EnumC2718b m12397w = c2716qj.m12397w();
            C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
            if (m12397w != enumC2718b) {
                C2716qj.EnumC2718b m12397w2 = c2716qj.m12397w();
                C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.MATCH_PARENT;
                i = (m12397w2 == enumC2718b2 || c2716qj.m12453K() == enumC2718b || c2716qj.m12453K() == enumC2718b2) ? 0 : i + 1;
            }
            this.f10983a.add(c2716qj);
        }
        c2865rj.m11263T0();
    }
}
