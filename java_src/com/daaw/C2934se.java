package com.daaw;

import com.daaw.C2716qj;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.daaw.se */
/* loaded from: classes.dex */
public class C2934se extends kx1 {

    /* renamed from: k */
    public ArrayList<kx1> f26188k;

    /* renamed from: l */
    public int f26189l;

    public C2934se(C2716qj c2716qj, int i) {
        super(c2716qj);
        this.f26188k = new ArrayList<>();
        this.f16809f = i;
        m10446q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c6, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c8, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cb, code lost:
        r9.f16808e.mo13161d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03eb, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // com.daaw.kx1, com.daaw.InterfaceC3891zs
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        float f2;
        int i11;
        int max;
        int i12;
        int i13;
        if (this.f16811h.f9871j && this.f16812i.f9871j) {
            C2716qj m12461E = this.f16805b.m12461E();
            boolean m11259W0 = (m12461E == null || !(m12461E instanceof C2865rj)) ? false : ((C2865rj) m12461E).m11259W0();
            int i14 = this.f16812i.f9868g - this.f16811h.f9868g;
            int size = this.f26188k.size();
            int i15 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.f26188k.get(i15).f16805b.m12451M() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            int i17 = i16;
            while (true) {
                if (i17 < 0) {
                    break;
                }
                if (this.f26188k.get(i17).f16805b.m12451M() != 8) {
                    i = i17;
                    break;
                }
                i17--;
            }
            int i18 = 0;
            while (i18 < 2) {
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                int i20 = 0;
                f = 0.0f;
                while (i19 < size) {
                    kx1 kx1Var = this.f26188k.get(i19);
                    if (kx1Var.f16805b.m12451M() != i2) {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i4 += kx1Var.f16811h.f9867f;
                        }
                        C2587pt c2587pt = kx1Var.f16808e;
                        int i21 = c2587pt.f9868g;
                        boolean z3 = kx1Var.f16807d != C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                        if (z3) {
                            int i22 = this.f16809f;
                            if (i22 == 0 && !kx1Var.f16805b.f24023e.f16808e.f9871j) {
                                return;
                            }
                            if (i22 == 1 && !kx1Var.f16805b.f24025f.f16808e.f9871j) {
                                return;
                            }
                            i12 = i21;
                        } else {
                            i12 = i21;
                            if (kx1Var.f16804a == 1 && i18 == 0) {
                                i13 = c2587pt.f23257m;
                                i5++;
                            } else if (c2587pt.f9871j) {
                                i13 = i12;
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                float f3 = kx1Var.f16805b.f24048q0[this.f16809f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i13;
                            }
                            if (i19 < i16 && i19 < i) {
                                i4 += -kx1Var.f16812i.f9867f;
                            }
                        }
                        i13 = i12;
                        if (z3) {
                        }
                        if (i19 < i16) {
                            i4 += -kx1Var.f16812i.f9867f;
                        }
                    }
                    i19++;
                    i2 = 8;
                }
                if (i4 < i14 || i5 == 0) {
                    i3 = i20;
                    break;
                } else {
                    i18++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i23 = this.f16811h.f9868g;
            if (m11259W0) {
                i23 = this.f16812i.f9868g;
            }
            if (i4 > i14) {
                int i24 = (int) (((i4 - i14) / 2.0f) + 0.5f);
                i23 = m11259W0 ? i23 + i24 : i23 - i24;
            }
            if (i5 > 0) {
                float f4 = i14 - i4;
                int i25 = (int) ((f4 / i5) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    kx1 kx1Var2 = this.f26188k.get(i26);
                    int i28 = i25;
                    int i29 = i4;
                    if (kx1Var2.f16805b.m12451M() != 8 && kx1Var2.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
                        C2587pt c2587pt2 = kx1Var2.f16808e;
                        if (!c2587pt2.f9871j) {
                            if (f > 0.0f) {
                                i10 = i23;
                                i11 = (int) (((kx1Var2.f16805b.f24048q0[this.f16809f] * f4) / f) + 0.5f);
                            } else {
                                i10 = i23;
                                i11 = i28;
                            }
                            if (this.f16809f == 0) {
                                C2716qj c2716qj = kx1Var2.f16805b;
                                f2 = f4;
                                int i30 = c2716qj.f24045p;
                                z2 = m11259W0;
                                i9 = i3;
                                max = Math.max(c2716qj.f24043o, kx1Var2.f16804a == 1 ? Math.min(i11, c2587pt2.f23257m) : i11);
                                if (i30 > 0) {
                                    max = Math.min(i30, max);
                                }
                            } else {
                                z2 = m11259W0;
                                i9 = i3;
                                f2 = f4;
                                C2716qj c2716qj2 = kx1Var2.f16805b;
                                int i31 = c2716qj2.f24051s;
                                max = Math.max(c2716qj2.f24049r, kx1Var2.f16804a == 1 ? Math.min(i11, c2587pt2.f23257m) : i11);
                                if (i31 > 0) {
                                    max = Math.min(i31, max);
                                }
                            }
                        }
                    }
                    z2 = m11259W0;
                    i9 = i3;
                    i10 = i23;
                    f2 = f4;
                    i26++;
                    i25 = i28;
                    i4 = i29;
                    i23 = i10;
                    f4 = f2;
                    m11259W0 = z2;
                    i3 = i9;
                }
                z = m11259W0;
                i6 = i3;
                i7 = i23;
                int i32 = i4;
                if (i27 > 0) {
                    i5 -= i27;
                    int i33 = 0;
                    for (int i34 = 0; i34 < size; i34++) {
                        kx1 kx1Var3 = this.f26188k.get(i34);
                        if (kx1Var3.f16805b.m12451M() != 8) {
                            if (i34 > 0 && i34 >= i15) {
                                i33 += kx1Var3.f16811h.f9867f;
                            }
                            i33 += kx1Var3.f16808e.f9868g;
                            if (i34 < i16 && i34 < i) {
                                i33 += -kx1Var3.f16812i.f9867f;
                            }
                        }
                    }
                    i4 = i33;
                } else {
                    i4 = i32;
                }
                i8 = 2;
                if (this.f26189l == 2 && i27 == 0) {
                    this.f26189l = 0;
                }
            } else {
                z = m11259W0;
                i6 = i3;
                i7 = i23;
                i8 = 2;
            }
            if (i4 > i14) {
                this.f26189l = i8;
            }
            if (i6 > 0 && i5 == 0 && i15 == i) {
                this.f26189l = i8;
            }
            int i35 = this.f26189l;
            int i36 = i6;
            if (i35 == 1) {
                int i37 = i36 > 1 ? (i14 - i4) / (i36 - 1) : i36 == 1 ? (i14 - i4) / 2 : 0;
                if (i5 > 0) {
                    i37 = 0;
                }
                int i38 = i7;
                for (int i39 = 0; i39 < size; i39++) {
                    kx1 kx1Var4 = this.f26188k.get(z ? size - (i39 + 1) : i39);
                    if (kx1Var4.f16805b.m12451M() == 8) {
                        kx1Var4.f16811h.mo13161d(i38);
                        kx1Var4.f16812i.mo13161d(i38);
                    } else {
                        if (i39 > 0) {
                            i38 = z ? i38 - i37 : i38 + i37;
                        }
                        if (i39 > 0 && i39 >= i15) {
                            int i40 = kx1Var4.f16811h.f9867f;
                            i38 = z ? i38 - i40 : i38 + i40;
                        }
                        (z ? kx1Var4.f16812i : kx1Var4.f16811h).mo13161d(i38);
                        C2587pt c2587pt3 = kx1Var4.f16808e;
                        int i41 = c2587pt3.f9868g;
                        if (kx1Var4.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT && kx1Var4.f16804a == 1) {
                            i41 = c2587pt3.f23257m;
                        }
                        i38 = z ? i38 - i41 : i38 + i41;
                        (z ? kx1Var4.f16811h : kx1Var4.f16812i).mo13161d(i38);
                        kx1Var4.f16810g = true;
                        if (i39 < i16 && i39 < i) {
                            int i42 = -kx1Var4.f16812i.f9867f;
                            i38 = z ? i38 - i42 : i38 + i42;
                        }
                    }
                }
            } else if (i35 == 0) {
                int i43 = (i14 - i4) / (i36 + 1);
                if (i5 > 0) {
                    i43 = 0;
                }
                int i44 = i7;
                for (int i45 = 0; i45 < size; i45++) {
                    kx1 kx1Var5 = this.f26188k.get(z ? size - (i45 + 1) : i45);
                    if (kx1Var5.f16805b.m12451M() == 8) {
                        kx1Var5.f16811h.mo13161d(i44);
                        kx1Var5.f16812i.mo13161d(i44);
                    } else {
                        int i46 = z ? i44 - i43 : i44 + i43;
                        if (i45 > 0 && i45 >= i15) {
                            int i47 = kx1Var5.f16811h.f9867f;
                            i46 = z ? i46 - i47 : i46 + i47;
                        }
                        (z ? kx1Var5.f16812i : kx1Var5.f16811h).mo13161d(i46);
                        C2587pt c2587pt4 = kx1Var5.f16808e;
                        int i48 = c2587pt4.f9868g;
                        if (kx1Var5.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT && kx1Var5.f16804a == 1) {
                            i48 = Math.min(i48, c2587pt4.f23257m);
                        }
                        i44 = z ? i46 - i48 : i46 + i48;
                        (z ? kx1Var5.f16811h : kx1Var5.f16812i).mo13161d(i44);
                        if (i45 < i16 && i45 < i) {
                            int i49 = -kx1Var5.f16812i.f9867f;
                            i44 = z ? i44 - i49 : i44 + i49;
                        }
                    }
                }
            } else if (i35 == 2) {
                float m12401u = this.f16809f == 0 ? this.f16805b.m12401u() : this.f16805b.m12455I();
                if (z) {
                    m12401u = 1.0f - m12401u;
                }
                int i50 = (((int) ((((float) (i14 - i4)) * m12401u) + 0.5f)) < 0 || i5 > 0) ? 0 : 0;
                int i51 = z ? i7 - i50 : i7 + i50;
                for (int i52 = 0; i52 < size; i52++) {
                    kx1 kx1Var6 = this.f26188k.get(z ? size - (i52 + 1) : i52);
                    if (kx1Var6.f16805b.m12451M() == 8) {
                        kx1Var6.f16811h.mo13161d(i51);
                        kx1Var6.f16812i.mo13161d(i51);
                    } else {
                        if (i52 > 0 && i52 >= i15) {
                            int i53 = kx1Var6.f16811h.f9867f;
                            i51 = z ? i51 - i53 : i51 + i53;
                        }
                        (z ? kx1Var6.f16812i : kx1Var6.f16811h).mo13161d(i51);
                        C2587pt c2587pt5 = kx1Var6.f16808e;
                        int i54 = c2587pt5.f9868g;
                        if (kx1Var6.f16807d == C2716qj.EnumC2718b.MATCH_CONSTRAINT && kx1Var6.f16804a == 1) {
                            i54 = c2587pt5.f23257m;
                        }
                        i51 += i54;
                        (z ? kx1Var6.f16811h : kx1Var6.f16812i).mo13161d(i51);
                        if (i52 < i16 && i52 < i) {
                            int i55 = -kx1Var6.f16812i.f9867f;
                            i51 = z ? i51 - i55 : i51 + i55;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        m17365b(r5.f16812i, r1, -r0);
     */
    @Override // com.daaw.kx1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10451d() {
        C1325ft m17361i;
        int m16930b;
        Iterator<kx1> it = this.f26188k.iterator();
        while (it.hasNext()) {
            it.next().mo10451d();
        }
        int size = this.f26188k.size();
        if (size < 1) {
            return;
        }
        C2716qj c2716qj = this.f26188k.get(0).f16805b;
        C2716qj c2716qj2 = this.f26188k.get(size - 1).f16805b;
        if (this.f16809f == 0) {
            C2041lj c2041lj = c2716qj.f23990B;
            C2041lj c2041lj2 = c2716qj2.f23992D;
            C1325ft m17361i2 = m17361i(c2041lj, 0);
            int m16930b2 = c2041lj.m16930b();
            C2716qj m10445r = m10445r();
            if (m10445r != null) {
                m16930b2 = m10445r.f23990B.m16930b();
            }
            if (m17361i2 != null) {
                m17365b(this.f16811h, m17361i2, m16930b2);
            }
            m17361i = m17361i(c2041lj2, 0);
            m16930b = c2041lj2.m16930b();
            C2716qj m10444s = m10444s();
            if (m10444s != null) {
                m16930b = m10444s.f23992D.m16930b();
            }
        } else {
            C2041lj c2041lj3 = c2716qj.f23991C;
            C2041lj c2041lj4 = c2716qj2.f23993E;
            C1325ft m17361i3 = m17361i(c2041lj3, 1);
            int m16930b3 = c2041lj3.m16930b();
            C2716qj m10445r2 = m10445r();
            if (m10445r2 != null) {
                m16930b3 = m10445r2.f23991C.m16930b();
            }
            if (m17361i3 != null) {
                m17365b(this.f16811h, m17361i3, m16930b3);
            }
            m17361i = m17361i(c2041lj4, 1);
            m16930b = c2041lj4.m16930b();
            C2716qj m10444s2 = m10444s();
            if (m10444s2 != null) {
                m16930b = m10444s2.f23993E.m16930b();
            }
        }
        this.f16811h.f9862a = this;
        this.f16812i.f9862a = this;
    }

    @Override // com.daaw.kx1
    /* renamed from: e */
    public void mo10450e() {
        for (int i = 0; i < this.f26188k.size(); i++) {
            this.f26188k.get(i).mo10450e();
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: f */
    public void mo10449f() {
        this.f16806c = null;
        Iterator<kx1> it = this.f26188k.iterator();
        while (it.hasNext()) {
            it.next().mo10449f();
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: j */
    public long mo10448j() {
        int size = this.f26188k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            kx1 kx1Var = this.f26188k.get(i);
            j = j + kx1Var.f16811h.f9867f + kx1Var.mo10448j() + kx1Var.f16812i.f9867f;
        }
        return j;
    }

    @Override // com.daaw.kx1
    /* renamed from: m */
    public boolean mo10447m() {
        int size = this.f26188k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f26188k.get(i).mo10447m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m10446q() {
        C2716qj c2716qj;
        C2716qj c2716qj2 = this.f16805b;
        do {
            c2716qj = c2716qj2;
            c2716qj2 = c2716qj2.m12459F(this.f16809f);
        } while (c2716qj2 != null);
        this.f16805b = c2716qj;
        this.f26188k.add(c2716qj.m12456H(this.f16809f));
        C2716qj m12463D = c2716qj.m12463D(this.f16809f);
        while (m12463D != null) {
            this.f26188k.add(m12463D.m12456H(this.f16809f));
            m12463D = m12463D.m12463D(this.f16809f);
        }
        Iterator<kx1> it = this.f26188k.iterator();
        while (it.hasNext()) {
            kx1 next = it.next();
            int i = this.f16809f;
            if (i == 0) {
                next.f16805b.f24019c = this;
            } else if (i == 1) {
                next.f16805b.f24021d = this;
            }
        }
        if ((this.f16809f == 0 && ((C2865rj) this.f16805b.m12461E()).m11259W0()) && this.f26188k.size() > 1) {
            ArrayList<kx1> arrayList = this.f26188k;
            this.f16805b = arrayList.get(arrayList.size() - 1).f16805b;
        }
        this.f26189l = this.f16809f == 0 ? this.f16805b.m12399v() : this.f16805b.m12454J();
    }

    /* renamed from: r */
    public final C2716qj m10445r() {
        for (int i = 0; i < this.f26188k.size(); i++) {
            kx1 kx1Var = this.f26188k.get(i);
            if (kx1Var.f16805b.m12451M() != 8) {
                return kx1Var.f16805b;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final C2716qj m10444s() {
        for (int size = this.f26188k.size() - 1; size >= 0; size--) {
            kx1 kx1Var = this.f26188k.get(size);
            if (kx1Var.f16805b.m12451M() != 8) {
                return kx1Var.f16805b;
            }
        }
        return null;
    }

    public String toString() {
        Iterator<kx1> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f16809f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.f26188k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
