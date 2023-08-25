package com.daaw;

import com.daaw.lj;
import com.daaw.qj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class gb {
    public final ArrayList<qj> a = new ArrayList<>();
    public a b = new a();
    public rj c;

    /* loaded from: classes.dex */
    public static class a {
        public qj.b a;
        public qj.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(qj qjVar, a aVar);
    }

    public gb(rj rjVar) {
        this.c = rjVar;
    }

    public final boolean a(b bVar, qj qjVar, boolean z) {
        this.b.a = qjVar.w();
        this.b.b = qjVar.K();
        this.b.c = qjVar.N();
        this.b.d = qjVar.t();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = z;
        qj.b bVar2 = aVar.a;
        qj.b bVar3 = qj.b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.b == bVar3;
        boolean z4 = z2 && qjVar.Q > 0.0f;
        boolean z5 = z3 && qjVar.Q > 0.0f;
        if (z4 && qjVar.n[0] == 4) {
            aVar.a = qj.b.FIXED;
        }
        if (z5 && qjVar.n[1] == 4) {
            aVar.b = qj.b.FIXED;
        }
        bVar.b(qjVar, aVar);
        qjVar.B0(this.b.e);
        qjVar.e0(this.b.f);
        qjVar.d0(this.b.h);
        qjVar.Y(this.b.g);
        a aVar2 = this.b;
        aVar2.j = false;
        return aVar2.i;
    }

    public final void b(rj rjVar) {
        int size = rjVar.w0.size();
        b R0 = rjVar.R0();
        for (int i = 0; i < size; i++) {
            qj qjVar = rjVar.w0.get(i);
            if (!(qjVar instanceof k80) && (!qjVar.e.e.j || !qjVar.f.e.j)) {
                qj.b q = qjVar.q(0);
                boolean z = true;
                qj.b q2 = qjVar.q(1);
                qj.b bVar = qj.b.MATCH_CONSTRAINT;
                if (!((q != bVar || qjVar.l == 1 || q2 != bVar || qjVar.m == 1) ? false : false)) {
                    a(R0, qjVar, false);
                }
            }
        }
        R0.a();
    }

    public final void c(rj rjVar, String str, int i, int i2) {
        int C = rjVar.C();
        int B = rjVar.B();
        rjVar.r0(0);
        rjVar.q0(0);
        rjVar.B0(i);
        rjVar.e0(i2);
        rjVar.r0(C);
        rjVar.q0(B);
        this.c.H0();
    }

    public long d(rj rjVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        boolean z2;
        boolean z3;
        int i11;
        int i12;
        b bVar;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        b R0 = rjVar.R0();
        int size = rjVar.w0.size();
        int N = rjVar.N();
        int t = rjVar.t();
        boolean b2 = su0.b(i, 128);
        boolean z6 = b2 || su0.b(i, 64);
        if (z6) {
            for (int i15 = 0; i15 < size; i15++) {
                qj qjVar = rjVar.w0.get(i15);
                qj.b w = qjVar.w();
                qj.b bVar2 = qj.b.MATCH_CONSTRAINT;
                boolean z7 = (w == bVar2) && (qjVar.K() == bVar2) && qjVar.r() > 0.0f;
                if ((qjVar.T() && z7) || ((qjVar.V() && z7) || (qjVar instanceof ru1) || qjVar.T() || qjVar.V())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            int i16 = ak0.q;
        }
        if (z6 && ((i4 == 1073741824 && i6 == 1073741824) || b2)) {
            int min = Math.min(rjVar.A(), i5);
            int min2 = Math.min(rjVar.z(), i7);
            if (i4 == 1073741824 && rjVar.N() != min) {
                rjVar.B0(min);
                rjVar.T0();
            }
            if (i6 == 1073741824 && rjVar.t() != min2) {
                rjVar.e0(min2);
                rjVar.T0();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = rjVar.O0(b2);
                i10 = 2;
            } else {
                boolean P0 = rjVar.P0(b2);
                if (i4 == 1073741824) {
                    z5 = P0 & rjVar.Q0(b2, 0);
                    i14 = 1;
                } else {
                    z5 = P0;
                    i14 = 0;
                }
                if (i6 == 1073741824) {
                    boolean Q0 = rjVar.Q0(b2, 1) & z5;
                    i10 = i14 + 1;
                    z = Q0;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                rjVar.F0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(rjVar);
        }
        int S0 = rjVar.S0();
        int size2 = this.a.size();
        if (size > 0) {
            c(rjVar, "First pass", N, t);
        }
        if (size2 > 0) {
            qj.b w2 = rjVar.w();
            qj.b bVar3 = qj.b.WRAP_CONTENT;
            boolean z8 = w2 == bVar3;
            boolean z9 = rjVar.K() == bVar3;
            int max = Math.max(rjVar.N(), this.c.C());
            int max2 = Math.max(rjVar.t(), this.c.B());
            int i17 = 0;
            boolean z10 = false;
            while (i17 < size2) {
                qj qjVar2 = this.a.get(i17);
                if (qjVar2 instanceof ru1) {
                    int N2 = qjVar2.N();
                    int t2 = qjVar2.t();
                    i13 = S0;
                    boolean a2 = z10 | a(R0, qjVar2, true);
                    int N3 = qjVar2.N();
                    int t3 = qjVar2.t();
                    if (N3 != N2) {
                        qjVar2.B0(N3);
                        if (z8 && qjVar2.G() > max) {
                            max = Math.max(max, qjVar2.G() + qjVar2.k(lj.b.RIGHT).b());
                        }
                        z4 = true;
                    } else {
                        z4 = a2;
                    }
                    if (t3 != t2) {
                        qjVar2.e0(t3);
                        if (z9 && qjVar2.n() > max2) {
                            max2 = Math.max(max2, qjVar2.n() + qjVar2.k(lj.b.BOTTOM).b());
                        }
                        z4 = true;
                    }
                    z10 = z4 | ((ru1) qjVar2).I0();
                } else {
                    i13 = S0;
                }
                i17++;
                S0 = i13;
            }
            int i18 = S0;
            int i19 = 0;
            while (i19 < 2) {
                int i20 = 0;
                while (i20 < size2) {
                    qj qjVar3 = this.a.get(i20);
                    if (((qjVar3 instanceof za0) && !(qjVar3 instanceof ru1)) || (qjVar3 instanceof k80) || qjVar3.M() == 8 || ((qjVar3.e.e.j && qjVar3.f.e.j) || (qjVar3 instanceof ru1))) {
                        i12 = i19;
                        i11 = size2;
                        bVar = R0;
                    } else {
                        int N4 = qjVar3.N();
                        int t4 = qjVar3.t();
                        i11 = size2;
                        int l = qjVar3.l();
                        i12 = i19;
                        z10 |= a(R0, qjVar3, true);
                        int N5 = qjVar3.N();
                        bVar = R0;
                        int t5 = qjVar3.t();
                        if (N5 != N4) {
                            qjVar3.B0(N5);
                            if (z8 && qjVar3.G() > max) {
                                max = Math.max(max, qjVar3.G() + qjVar3.k(lj.b.RIGHT).b());
                            }
                            z10 = true;
                        }
                        if (t5 != t4) {
                            qjVar3.e0(t5);
                            if (z9 && qjVar3.n() > max2) {
                                max2 = Math.max(max2, qjVar3.n() + qjVar3.k(lj.b.BOTTOM).b());
                            }
                            z10 = true;
                        }
                        if (qjVar3.Q() && l != qjVar3.l()) {
                            z10 = true;
                        }
                    }
                    i20++;
                    size2 = i11;
                    R0 = bVar;
                    i19 = i12;
                }
                int i21 = i19;
                int i22 = size2;
                b bVar4 = R0;
                if (z10) {
                    c(rjVar, "intermediate pass", N, t);
                    z10 = false;
                }
                i19 = i21 + 1;
                size2 = i22;
                R0 = bVar4;
            }
            if (z10) {
                c(rjVar, "2nd pass", N, t);
                if (rjVar.N() < max) {
                    rjVar.B0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rjVar.t() < max2) {
                    rjVar.e0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    c(rjVar, "3rd pass", N, t);
                }
            }
            S0 = i18;
        }
        rjVar.c1(S0);
        return 0L;
    }

    public void e(rj rjVar) {
        int i;
        this.a.clear();
        int size = rjVar.w0.size();
        while (i < size) {
            qj qjVar = rjVar.w0.get(i);
            qj.b w = qjVar.w();
            qj.b bVar = qj.b.MATCH_CONSTRAINT;
            if (w != bVar) {
                qj.b w2 = qjVar.w();
                qj.b bVar2 = qj.b.MATCH_PARENT;
                i = (w2 == bVar2 || qjVar.K() == bVar || qjVar.K() == bVar2) ? 0 : i + 1;
            }
            this.a.add(qjVar);
        }
        rjVar.T0();
    }
}
