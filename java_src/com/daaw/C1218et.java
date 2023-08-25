package com.daaw;

import com.daaw.C1387gb;
import com.daaw.C2716qj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.daaw.et */
/* loaded from: classes.dex */
public class C1218et {

    /* renamed from: a */
    public C2865rj f8746a;

    /* renamed from: d */
    public C2865rj f8749d;

    /* renamed from: b */
    public boolean f8747b = true;

    /* renamed from: c */
    public boolean f8748c = true;

    /* renamed from: e */
    public ArrayList<kx1> f8750e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<l61> f8751f = new ArrayList<>();

    /* renamed from: g */
    public C1387gb.InterfaceC1389b f8752g = null;

    /* renamed from: h */
    public C1387gb.C1388a f8753h = new C1387gb.C1388a();

    /* renamed from: i */
    public ArrayList<l61> f8754i = new ArrayList<>();

    public C1218et(C2865rj c2865rj) {
        this.f8746a = c2865rj;
        this.f8749d = c2865rj;
    }

    /* renamed from: a */
    public final void m23222a(C1325ft c1325ft, int i, int i2, C1325ft c1325ft2, ArrayList<l61> arrayList, l61 l61Var) {
        kx1 kx1Var = c1325ft.f9865d;
        if (kx1Var.f16806c == null) {
            C2865rj c2865rj = this.f8746a;
            if (kx1Var == c2865rj.f24023e || kx1Var == c2865rj.f24025f) {
                return;
            }
            if (l61Var == null) {
                l61Var = new l61(kx1Var, i2);
                arrayList.add(l61Var);
            }
            kx1Var.f16806c = l61Var;
            l61Var.m17131a(kx1Var);
            for (InterfaceC3891zs interfaceC3891zs : kx1Var.f16811h.f9872k) {
                if (interfaceC3891zs instanceof C1325ft) {
                    m23222a((C1325ft) interfaceC3891zs, i, 0, c1325ft2, arrayList, l61Var);
                }
            }
            for (InterfaceC3891zs interfaceC3891zs2 : kx1Var.f16812i.f9872k) {
                if (interfaceC3891zs2 instanceof C1325ft) {
                    m23222a((C1325ft) interfaceC3891zs2, i, 1, c1325ft2, arrayList, l61Var);
                }
            }
            if (i == 1 && (kx1Var instanceof ms1)) {
                for (InterfaceC3891zs interfaceC3891zs3 : ((ms1) kx1Var).f19119k.f9872k) {
                    if (interfaceC3891zs3 instanceof C1325ft) {
                        m23222a((C1325ft) interfaceC3891zs3, i, 2, c1325ft2, arrayList, l61Var);
                    }
                }
            }
            for (C1325ft c1325ft3 : kx1Var.f16811h.f9873l) {
                if (c1325ft3 == c1325ft2) {
                    l61Var.f17082b = true;
                }
                m23222a(c1325ft3, i, 0, c1325ft2, arrayList, l61Var);
            }
            for (C1325ft c1325ft4 : kx1Var.f16812i.f9873l) {
                if (c1325ft4 == c1325ft2) {
                    l61Var.f17082b = true;
                }
                m23222a(c1325ft4, i, 1, c1325ft2, arrayList, l61Var);
            }
            if (i == 1 && (kx1Var instanceof ms1)) {
                for (C1325ft c1325ft5 : ((ms1) kx1Var).f19119k.f9873l) {
                    m23222a(c1325ft5, i, 2, c1325ft2, arrayList, l61Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r2.f24039m == 0) goto L30;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m23221b(C2865rj c2865rj) {
        int i;
        C2716qj.EnumC2718b enumC2718b;
        int i2;
        C2716qj.EnumC2718b enumC2718b2;
        C1218et c1218et;
        C2716qj c2716qj;
        C2587pt c2587pt;
        int m12403t;
        C2716qj.EnumC2718b enumC2718b3;
        C2716qj.EnumC2718b enumC2718b4;
        Iterator<C2716qj> it = c2865rj.f15492w0.iterator();
        while (it.hasNext()) {
            C2716qj next = it.next();
            C2716qj.EnumC2718b[] enumC2718bArr = next.f24001M;
            C2716qj.EnumC2718b enumC2718b5 = enumC2718bArr[0];
            C2716qj.EnumC2718b enumC2718b6 = enumC2718bArr[1];
            if (next.m12451M() != 8) {
                if (next.f24047q < 1.0f && enumC2718b5 == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                    next.f24037l = 2;
                }
                if (next.f24053t < 1.0f && enumC2718b6 == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                    next.f24039m = 2;
                }
                if (next.m12407r() > 0.0f) {
                    C2716qj.EnumC2718b enumC2718b7 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                    if (enumC2718b5 == enumC2718b7 && (enumC2718b6 == C2716qj.EnumC2718b.WRAP_CONTENT || enumC2718b6 == C2716qj.EnumC2718b.FIXED)) {
                        next.f24037l = 3;
                    } else {
                        if (enumC2718b6 != enumC2718b7 || (enumC2718b5 != C2716qj.EnumC2718b.WRAP_CONTENT && enumC2718b5 != C2716qj.EnumC2718b.FIXED)) {
                            if (enumC2718b5 == enumC2718b7 && enumC2718b6 == enumC2718b7) {
                                if (next.f24037l == 0) {
                                    next.f24037l = 3;
                                }
                            }
                        }
                        next.f24039m = 3;
                    }
                }
                C2716qj.EnumC2718b enumC2718b8 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (enumC2718b5 == enumC2718b8 && next.f24037l == 1 && (next.f23990B.f17433d == null || next.f23992D.f17433d == null)) {
                    enumC2718b5 = C2716qj.EnumC2718b.WRAP_CONTENT;
                }
                C2716qj.EnumC2718b enumC2718b9 = enumC2718b5;
                if (enumC2718b6 == enumC2718b8 && next.f24039m == 1 && (next.f23991C.f17433d == null || next.f23993E.f17433d == null)) {
                    enumC2718b6 = C2716qj.EnumC2718b.WRAP_CONTENT;
                }
                C2716qj.EnumC2718b enumC2718b10 = enumC2718b6;
                sb0 sb0Var = next.f24023e;
                sb0Var.f16807d = enumC2718b9;
                int i3 = next.f24037l;
                sb0Var.f16804a = i3;
                ms1 ms1Var = next.f24025f;
                ms1Var.f16807d = enumC2718b10;
                int i4 = next.f24039m;
                ms1Var.f16804a = i4;
                C2716qj.EnumC2718b enumC2718b11 = C2716qj.EnumC2718b.MATCH_PARENT;
                if ((enumC2718b9 == enumC2718b11 || enumC2718b9 == C2716qj.EnumC2718b.FIXED || enumC2718b9 == C2716qj.EnumC2718b.WRAP_CONTENT) && (enumC2718b10 == enumC2718b11 || enumC2718b10 == C2716qj.EnumC2718b.FIXED || enumC2718b10 == C2716qj.EnumC2718b.WRAP_CONTENT)) {
                    int m12450N = next.m12450N();
                    if (enumC2718b9 == enumC2718b11) {
                        i = (c2865rj.m12450N() - next.f23990B.f17434e) - next.f23992D.f17434e;
                        enumC2718b = C2716qj.EnumC2718b.FIXED;
                    } else {
                        i = m12450N;
                        enumC2718b = enumC2718b9;
                    }
                    int m12403t2 = next.m12403t();
                    if (enumC2718b10 == enumC2718b11) {
                        i2 = (c2865rj.m12403t() - next.f23991C.f17434e) - next.f23993E.f17434e;
                        enumC2718b2 = C2716qj.EnumC2718b.FIXED;
                    } else {
                        i2 = m12403t2;
                        enumC2718b2 = enumC2718b10;
                    }
                    c1218et = this;
                    c2716qj = next;
                } else {
                    if (enumC2718b9 == enumC2718b8 && (enumC2718b10 == (enumC2718b4 = C2716qj.EnumC2718b.WRAP_CONTENT) || enumC2718b10 == C2716qj.EnumC2718b.FIXED)) {
                        if (i3 == 3) {
                            if (enumC2718b10 == enumC2718b4) {
                                m23211l(next, enumC2718b4, 0, enumC2718b4, 0);
                            }
                            i2 = next.m12403t();
                            i = (int) ((i2 * next.f24005Q) + 0.5f);
                            enumC2718b2 = C2716qj.EnumC2718b.FIXED;
                            c1218et = this;
                            c2716qj = next;
                            enumC2718b = enumC2718b2;
                        } else if (i3 == 1) {
                            m23211l(next, enumC2718b4, 0, enumC2718b10, 0);
                            c2587pt = next.f24023e.f16808e;
                            m12403t = next.m12450N();
                            c2587pt.f23257m = m12403t;
                        } else if (i3 == 2) {
                            C2716qj.EnumC2718b[] enumC2718bArr2 = c2865rj.f24001M;
                            C2716qj.EnumC2718b enumC2718b12 = enumC2718bArr2[0];
                            C2716qj.EnumC2718b enumC2718b13 = C2716qj.EnumC2718b.FIXED;
                            if (enumC2718b12 == enumC2718b13 || enumC2718bArr2[0] == enumC2718b11) {
                                i2 = next.m12403t();
                                c1218et = this;
                                c2716qj = next;
                                enumC2718b = enumC2718b13;
                                i = (int) ((next.f24047q * c2865rj.m12450N()) + 0.5f);
                                enumC2718b2 = enumC2718b10;
                            }
                        } else {
                            C2041lj[] c2041ljArr = next.f23998J;
                            if (c2041ljArr[0].f17433d == null || c2041ljArr[1].f17433d == null) {
                                i = 0;
                                i2 = 0;
                                c1218et = this;
                                c2716qj = next;
                                enumC2718b = enumC2718b4;
                                enumC2718b2 = enumC2718b10;
                            }
                        }
                    }
                    if (enumC2718b10 == enumC2718b8 && (enumC2718b9 == (enumC2718b3 = C2716qj.EnumC2718b.WRAP_CONTENT) || enumC2718b9 == C2716qj.EnumC2718b.FIXED)) {
                        if (i4 == 3) {
                            if (enumC2718b9 == enumC2718b3) {
                                m23211l(next, enumC2718b3, 0, enumC2718b3, 0);
                            }
                            i = next.m12450N();
                            float f = next.f24005Q;
                            if (next.m12405s() == -1) {
                                f = 1.0f / f;
                            }
                            i2 = (int) ((i * f) + 0.5f);
                            enumC2718b2 = C2716qj.EnumC2718b.FIXED;
                            c1218et = this;
                            c2716qj = next;
                            enumC2718b = enumC2718b2;
                        } else if (i4 == 1) {
                            m23211l(next, enumC2718b9, 0, enumC2718b3, 0);
                            c2587pt = next.f24025f.f16808e;
                            m12403t = next.m12403t();
                            c2587pt.f23257m = m12403t;
                        } else if (i4 == 2) {
                            C2716qj.EnumC2718b[] enumC2718bArr3 = c2865rj.f24001M;
                            C2716qj.EnumC2718b enumC2718b14 = enumC2718bArr3[1];
                            C2716qj.EnumC2718b enumC2718b15 = C2716qj.EnumC2718b.FIXED;
                            if (enumC2718b14 == enumC2718b15 || enumC2718bArr3[1] == enumC2718b11) {
                                float f2 = next.f24053t;
                                i = next.m12450N();
                                i2 = (int) ((f2 * c2865rj.m12403t()) + 0.5f);
                                c1218et = this;
                                c2716qj = next;
                                enumC2718b = enumC2718b9;
                                enumC2718b2 = enumC2718b15;
                            }
                        } else {
                            C2041lj[] c2041ljArr2 = next.f23998J;
                            if (c2041ljArr2[2].f17433d == null || c2041ljArr2[3].f17433d == null) {
                                i = 0;
                                i2 = 0;
                                c1218et = this;
                                c2716qj = next;
                                enumC2718b = enumC2718b3;
                                enumC2718b2 = enumC2718b10;
                            }
                        }
                    }
                    if (enumC2718b9 == enumC2718b8 && enumC2718b10 == enumC2718b8) {
                        if (i3 == 1 || i4 == 1) {
                            C2716qj.EnumC2718b enumC2718b16 = C2716qj.EnumC2718b.WRAP_CONTENT;
                            m23211l(next, enumC2718b16, 0, enumC2718b16, 0);
                            next.f24023e.f16808e.f23257m = next.m12450N();
                            c2587pt = next.f24025f.f16808e;
                            m12403t = next.m12403t();
                            c2587pt.f23257m = m12403t;
                        } else if (i4 == 2 && i3 == 2) {
                            C2716qj.EnumC2718b[] enumC2718bArr4 = c2865rj.f24001M;
                            C2716qj.EnumC2718b enumC2718b17 = enumC2718bArr4[0];
                            enumC2718b2 = C2716qj.EnumC2718b.FIXED;
                            if (enumC2718b17 == enumC2718b2 || enumC2718bArr4[0] == enumC2718b2) {
                                if (enumC2718bArr4[1] == enumC2718b2 || enumC2718bArr4[1] == enumC2718b2) {
                                    float f3 = next.f24047q;
                                    float f4 = next.f24053t;
                                    i = (int) ((f3 * c2865rj.m12450N()) + 0.5f);
                                    i2 = (int) ((f4 * c2865rj.m12403t()) + 0.5f);
                                    c1218et = this;
                                    c2716qj = next;
                                    enumC2718b = enumC2718b2;
                                }
                            }
                        }
                    }
                }
                c1218et.m23211l(c2716qj, enumC2718b, i, enumC2718b2, i2);
                next.f24023e.f16808e.mo13161d(next.m12450N());
                next.f24025f.f16808e.mo13161d(next.m12403t());
            }
            next.f24015a = true;
        }
        return false;
    }

    /* renamed from: c */
    public void m23220c() {
        m23219d(this.f8750e);
        this.f8754i.clear();
        l61.f17080h = 0;
        m23214i(this.f8746a.f24023e, 0, this.f8754i);
        m23214i(this.f8746a.f24025f, 1, this.f8754i);
        this.f8747b = false;
    }

    /* renamed from: d */
    public void m23219d(ArrayList<kx1> arrayList) {
        kx1 l80Var;
        arrayList.clear();
        this.f8749d.f24023e.mo10449f();
        this.f8749d.f24025f.mo10449f();
        arrayList.add(this.f8749d.f24023e);
        arrayList.add(this.f8749d.f24025f);
        Iterator<C2716qj> it = this.f8749d.f15492w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2716qj next = it.next();
            if (next instanceof k80) {
                l80Var = new l80(next);
            } else {
                if (next.m12444T()) {
                    if (next.f24019c == null) {
                        next.f24019c = new C2934se(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f24019c);
                } else {
                    arrayList.add(next.f24023e);
                }
                if (next.m12442V()) {
                    if (next.f24021d == null) {
                        next.f24021d = new C2934se(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f24021d);
                } else {
                    arrayList.add(next.f24025f);
                }
                if (next instanceof bb0) {
                    l80Var = new ab0(next);
                }
            }
            arrayList.add(l80Var);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<kx1> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo10449f();
        }
        Iterator<kx1> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            kx1 next2 = it3.next();
            if (next2.f16805b != this.f8749d) {
                next2.mo10451d();
            }
        }
    }

    /* renamed from: e */
    public final int m23218e(C2865rj c2865rj, int i) {
        int size = this.f8754i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f8754i.get(i2).m17130b(c2865rj, i));
        }
        return (int) j;
    }

    /* renamed from: f */
    public boolean m23217f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f8747b || this.f8748c) {
            Iterator<C2716qj> it = this.f8746a.f15492w0.iterator();
            while (it.hasNext()) {
                C2716qj next = it.next();
                next.f24015a = false;
                next.f24023e.m10474r();
                next.f24025f.m15805q();
            }
            C2865rj c2865rj = this.f8746a;
            c2865rj.f24015a = false;
            c2865rj.f24023e.m10474r();
            this.f8746a.f24025f.m15805q();
            this.f8748c = false;
        }
        if (m23221b(this.f8749d)) {
            return false;
        }
        this.f8746a.m12464C0(0);
        this.f8746a.m12462D0(0);
        C2716qj.EnumC2718b m12409q = this.f8746a.m12409q(0);
        C2716qj.EnumC2718b m12409q2 = this.f8746a.m12409q(1);
        if (this.f8747b) {
            m23220c();
        }
        int m12449O = this.f8746a.m12449O();
        int m12448P = this.f8746a.m12448P();
        this.f8746a.f24023e.f16811h.mo13161d(m12449O);
        this.f8746a.f24025f.f16811h.mo13161d(m12448P);
        m23210m();
        C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.WRAP_CONTENT;
        if (m12409q == enumC2718b || m12409q2 == enumC2718b) {
            if (z4) {
                Iterator<kx1> it2 = this.f8750e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().mo10447m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m12409q == C2716qj.EnumC2718b.WRAP_CONTENT) {
                this.f8746a.m12424i0(C2716qj.EnumC2718b.FIXED);
                C2865rj c2865rj2 = this.f8746a;
                c2865rj2.m12466B0(m23218e(c2865rj2, 0));
                C2865rj c2865rj3 = this.f8746a;
                c2865rj3.f24023e.f16808e.mo13161d(c2865rj3.m12450N());
            }
            if (z4 && m12409q2 == C2716qj.EnumC2718b.WRAP_CONTENT) {
                this.f8746a.m12394x0(C2716qj.EnumC2718b.FIXED);
                C2865rj c2865rj4 = this.f8746a;
                c2865rj4.m12432e0(m23218e(c2865rj4, 1));
                C2865rj c2865rj5 = this.f8746a;
                c2865rj5.f24025f.f16808e.mo13161d(c2865rj5.m12403t());
            }
        }
        C2865rj c2865rj6 = this.f8746a;
        C2716qj.EnumC2718b[] enumC2718bArr = c2865rj6.f24001M;
        C2716qj.EnumC2718b enumC2718b2 = enumC2718bArr[0];
        C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.FIXED;
        if (enumC2718b2 == enumC2718b3 || enumC2718bArr[0] == C2716qj.EnumC2718b.MATCH_PARENT) {
            int m12450N = c2865rj6.m12450N() + m12449O;
            this.f8746a.f24023e.f16812i.mo13161d(m12450N);
            this.f8746a.f24023e.f16808e.mo13161d(m12450N - m12449O);
            m23210m();
            C2865rj c2865rj7 = this.f8746a;
            C2716qj.EnumC2718b[] enumC2718bArr2 = c2865rj7.f24001M;
            if (enumC2718bArr2[1] == enumC2718b3 || enumC2718bArr2[1] == C2716qj.EnumC2718b.MATCH_PARENT) {
                int m12403t = c2865rj7.m12403t() + m12448P;
                this.f8746a.f24025f.f16812i.mo13161d(m12403t);
                this.f8746a.f24025f.f16808e.mo13161d(m12403t - m12448P);
            }
            m23210m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<kx1> it3 = this.f8750e.iterator();
        while (it3.hasNext()) {
            kx1 next2 = it3.next();
            if (next2.f16805b != this.f8746a || next2.f16810g) {
                next2.mo10450e();
            }
        }
        Iterator<kx1> it4 = this.f8750e.iterator();
        while (it4.hasNext()) {
            kx1 next3 = it4.next();
            if (z2 || next3.f16805b != this.f8746a) {
                if (!next3.f16811h.f9871j || ((!next3.f16812i.f9871j && !(next3 instanceof l80)) || (!next3.f16808e.f9871j && !(next3 instanceof C2934se) && !(next3 instanceof l80)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f8746a.m12424i0(m12409q);
        this.f8746a.m12394x0(m12409q2);
        return z3;
    }

    /* renamed from: g */
    public boolean m23216g(boolean z) {
        if (this.f8747b) {
            Iterator<C2716qj> it = this.f8746a.f15492w0.iterator();
            while (it.hasNext()) {
                C2716qj next = it.next();
                next.f24015a = false;
                sb0 sb0Var = next.f24023e;
                sb0Var.f16808e.f9871j = false;
                sb0Var.f16810g = false;
                sb0Var.m10474r();
                ms1 ms1Var = next.f24025f;
                ms1Var.f16808e.f9871j = false;
                ms1Var.f16810g = false;
                ms1Var.m15805q();
            }
            C2865rj c2865rj = this.f8746a;
            c2865rj.f24015a = false;
            sb0 sb0Var2 = c2865rj.f24023e;
            sb0Var2.f16808e.f9871j = false;
            sb0Var2.f16810g = false;
            sb0Var2.m10474r();
            ms1 ms1Var2 = this.f8746a.f24025f;
            ms1Var2.f16808e.f9871j = false;
            ms1Var2.f16810g = false;
            ms1Var2.m15805q();
            m23220c();
        }
        if (m23221b(this.f8749d)) {
            return false;
        }
        this.f8746a.m12464C0(0);
        this.f8746a.m12462D0(0);
        this.f8746a.f24023e.f16811h.mo13161d(0);
        this.f8746a.f24025f.f16811h.mo13161d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m23215h(boolean z, int i) {
        boolean z2;
        C2716qj.EnumC2718b enumC2718b;
        C2587pt c2587pt;
        int m12403t;
        boolean z3 = true;
        boolean z4 = z & true;
        C2716qj.EnumC2718b m12409q = this.f8746a.m12409q(0);
        C2716qj.EnumC2718b m12409q2 = this.f8746a.m12409q(1);
        int m12449O = this.f8746a.m12449O();
        int m12448P = this.f8746a.m12448P();
        if (z4 && (m12409q == (enumC2718b = C2716qj.EnumC2718b.WRAP_CONTENT) || m12409q2 == enumC2718b)) {
            Iterator<kx1> it = this.f8750e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kx1 next = it.next();
                if (next.f16809f == i && !next.mo10447m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m12409q == C2716qj.EnumC2718b.WRAP_CONTENT) {
                    this.f8746a.m12424i0(C2716qj.EnumC2718b.FIXED);
                    C2865rj c2865rj = this.f8746a;
                    c2865rj.m12466B0(m23218e(c2865rj, 0));
                    C2865rj c2865rj2 = this.f8746a;
                    c2587pt = c2865rj2.f24023e.f16808e;
                    m12403t = c2865rj2.m12450N();
                    c2587pt.mo13161d(m12403t);
                }
            } else if (z4 && m12409q2 == C2716qj.EnumC2718b.WRAP_CONTENT) {
                this.f8746a.m12394x0(C2716qj.EnumC2718b.FIXED);
                C2865rj c2865rj3 = this.f8746a;
                c2865rj3.m12432e0(m23218e(c2865rj3, 1));
                C2865rj c2865rj4 = this.f8746a;
                c2587pt = c2865rj4.f24025f.f16808e;
                m12403t = c2865rj4.m12403t();
                c2587pt.mo13161d(m12403t);
            }
        }
        C2865rj c2865rj5 = this.f8746a;
        if (i == 0) {
            C2716qj.EnumC2718b[] enumC2718bArr = c2865rj5.f24001M;
            if (enumC2718bArr[0] == C2716qj.EnumC2718b.FIXED || enumC2718bArr[0] == C2716qj.EnumC2718b.MATCH_PARENT) {
                int m12450N = c2865rj5.m12450N() + m12449O;
                this.f8746a.f24023e.f16812i.mo13161d(m12450N);
                this.f8746a.f24023e.f16808e.mo13161d(m12450N - m12449O);
                z2 = true;
            }
            z2 = false;
        } else {
            C2716qj.EnumC2718b[] enumC2718bArr2 = c2865rj5.f24001M;
            if (enumC2718bArr2[1] == C2716qj.EnumC2718b.FIXED || enumC2718bArr2[1] == C2716qj.EnumC2718b.MATCH_PARENT) {
                int m12403t2 = c2865rj5.m12403t() + m12448P;
                this.f8746a.f24025f.f16812i.mo13161d(m12403t2);
                this.f8746a.f24025f.f16808e.mo13161d(m12403t2 - m12448P);
                z2 = true;
            }
            z2 = false;
        }
        m23210m();
        Iterator<kx1> it2 = this.f8750e.iterator();
        while (it2.hasNext()) {
            kx1 next2 = it2.next();
            if (next2.f16809f == i && (next2.f16805b != this.f8746a || next2.f16810g)) {
                next2.mo10450e();
            }
        }
        Iterator<kx1> it3 = this.f8750e.iterator();
        while (it3.hasNext()) {
            kx1 next3 = it3.next();
            if (next3.f16809f == i && (z2 || next3.f16805b != this.f8746a)) {
                if (!next3.f16811h.f9871j || !next3.f16812i.f9871j || (!(next3 instanceof C2934se) && !next3.f16808e.f9871j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f8746a.m12424i0(m12409q);
        this.f8746a.m12394x0(m12409q2);
        return z3;
    }

    /* renamed from: i */
    public final void m23214i(kx1 kx1Var, int i, ArrayList<l61> arrayList) {
        for (InterfaceC3891zs interfaceC3891zs : kx1Var.f16811h.f9872k) {
            if (interfaceC3891zs instanceof C1325ft) {
                m23222a((C1325ft) interfaceC3891zs, i, 0, kx1Var.f16812i, arrayList, null);
            } else if (interfaceC3891zs instanceof kx1) {
                m23222a(((kx1) interfaceC3891zs).f16811h, i, 0, kx1Var.f16812i, arrayList, null);
            }
        }
        for (InterfaceC3891zs interfaceC3891zs2 : kx1Var.f16812i.f9872k) {
            if (interfaceC3891zs2 instanceof C1325ft) {
                m23222a((C1325ft) interfaceC3891zs2, i, 1, kx1Var.f16811h, arrayList, null);
            } else if (interfaceC3891zs2 instanceof kx1) {
                m23222a(((kx1) interfaceC3891zs2).f16812i, i, 1, kx1Var.f16811h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC3891zs interfaceC3891zs3 : ((ms1) kx1Var).f19119k.f9872k) {
                if (interfaceC3891zs3 instanceof C1325ft) {
                    m23222a((C1325ft) interfaceC3891zs3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: j */
    public void m23213j() {
        this.f8747b = true;
    }

    /* renamed from: k */
    public void m23212k() {
        this.f8748c = true;
    }

    /* renamed from: l */
    public final void m23211l(C2716qj c2716qj, C2716qj.EnumC2718b enumC2718b, int i, C2716qj.EnumC2718b enumC2718b2, int i2) {
        C1387gb.C1388a c1388a = this.f8753h;
        c1388a.f10986a = enumC2718b;
        c1388a.f10987b = enumC2718b2;
        c1388a.f10988c = i;
        c1388a.f10989d = i2;
        this.f8752g.mo21828b(c2716qj, c1388a);
        c2716qj.m12466B0(this.f8753h.f10990e);
        c2716qj.m12432e0(this.f8753h.f10991f);
        c2716qj.m12434d0(this.f8753h.f10993h);
        c2716qj.m12440Y(this.f8753h.f10992g);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m23210m() {
        C2587pt c2587pt;
        int m12450N;
        C2587pt c2587pt2;
        int m12450N2;
        C2587pt c2587pt3;
        Iterator<C2716qj> it = this.f8746a.f15492w0.iterator();
        while (it.hasNext()) {
            C2716qj next = it.next();
            if (!next.f24015a) {
                C2716qj.EnumC2718b[] enumC2718bArr = next.f24001M;
                boolean z = false;
                C2716qj.EnumC2718b enumC2718b = enumC2718bArr[0];
                C2716qj.EnumC2718b enumC2718b2 = enumC2718bArr[1];
                int i = next.f24037l;
                int i2 = next.f24039m;
                C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.WRAP_CONTENT;
                boolean z2 = enumC2718b == enumC2718b3 || (enumC2718b == C2716qj.EnumC2718b.MATCH_CONSTRAINT && i == 1);
                if (enumC2718b2 == enumC2718b3 || (enumC2718b2 == C2716qj.EnumC2718b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2587pt c2587pt4 = next.f24023e.f16808e;
                boolean z3 = c2587pt4.f9871j;
                C2587pt c2587pt5 = next.f24025f.f16808e;
                boolean z4 = c2587pt5.f9871j;
                if (z3 && z4) {
                    C2716qj.EnumC2718b enumC2718b4 = C2716qj.EnumC2718b.FIXED;
                    m23211l(next, enumC2718b4, c2587pt4.f9868g, enumC2718b4, c2587pt5.f9868g);
                } else if (z3 && z) {
                    m23211l(next, C2716qj.EnumC2718b.FIXED, c2587pt4.f9868g, enumC2718b3, c2587pt5.f9868g);
                    if (enumC2718b2 == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                        c2587pt2 = next.f24025f.f16808e;
                        m12450N2 = next.m12403t();
                        c2587pt2.f23257m = m12450N2;
                        if (!next.f24015a) {
                            c2587pt3.mo13161d(next.m12419l());
                        }
                    } else {
                        c2587pt = next.f24025f.f16808e;
                        m12450N = next.m12403t();
                        c2587pt.mo13161d(m12450N);
                    }
                } else {
                    if (z4 && z2) {
                        m23211l(next, enumC2718b3, c2587pt4.f9868g, C2716qj.EnumC2718b.FIXED, c2587pt5.f9868g);
                        if (enumC2718b == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                            c2587pt2 = next.f24023e.f16808e;
                            m12450N2 = next.m12450N();
                            c2587pt2.f23257m = m12450N2;
                        } else {
                            c2587pt = next.f24023e.f16808e;
                            m12450N = next.m12450N();
                            c2587pt.mo13161d(m12450N);
                        }
                    }
                    if (!next.f24015a && (c2587pt3 = next.f24025f.f19120l) != null) {
                        c2587pt3.mo13161d(next.m12419l());
                    }
                }
                next.f24015a = true;
                if (!next.f24015a) {
                }
            }
        }
    }

    /* renamed from: n */
    public void m23209n(C1387gb.InterfaceC1389b interfaceC1389b) {
        this.f8752g = interfaceC1389b;
    }
}
