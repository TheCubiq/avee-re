package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class l61 {

    /* renamed from: h */
    public static int f17080h;

    /* renamed from: c */
    public kx1 f17083c;

    /* renamed from: d */
    public kx1 f17084d;

    /* renamed from: f */
    public int f17086f;

    /* renamed from: g */
    public int f17087g;

    /* renamed from: a */
    public int f17081a = 0;

    /* renamed from: b */
    public boolean f17082b = false;

    /* renamed from: e */
    public ArrayList<kx1> f17085e = new ArrayList<>();

    public l61(kx1 kx1Var, int i) {
        this.f17083c = null;
        this.f17084d = null;
        int i2 = f17080h;
        this.f17086f = i2;
        f17080h = i2 + 1;
        this.f17083c = kx1Var;
        this.f17084d = kx1Var;
        this.f17087g = i;
    }

    /* renamed from: a */
    public void m17131a(kx1 kx1Var) {
        this.f17085e.add(kx1Var);
        this.f17084d = kx1Var;
    }

    /* renamed from: b */
    public long m17130b(C2865rj c2865rj, int i) {
        long mo10448j;
        kx1 kx1Var;
        long j;
        long j2;
        kx1 kx1Var2 = this.f17083c;
        if (kx1Var2 instanceof C2934se) {
            if (((C2934se) kx1Var2).f16809f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(kx1Var2 instanceof sb0)) {
                return 0L;
            }
        } else if (!(kx1Var2 instanceof ms1)) {
            return 0L;
        }
        C1325ft c1325ft = (i == 0 ? c2865rj.f24023e : c2865rj.f24025f).f16811h;
        C1325ft c1325ft2 = (i == 0 ? c2865rj.f24023e : c2865rj.f24025f).f16812i;
        boolean contains = kx1Var2.f16811h.f9873l.contains(c1325ft);
        boolean contains2 = this.f17083c.f16812i.f9873l.contains(c1325ft2);
        long mo10448j2 = this.f17083c.mo10448j();
        if (!contains || !contains2) {
            if (contains) {
                C1325ft c1325ft3 = this.f17083c.f16811h;
                j2 = m17128d(c1325ft3, c1325ft3.f9867f);
                j = this.f17083c.f16811h.f9867f + mo10448j2;
            } else if (contains2) {
                C1325ft c1325ft4 = this.f17083c.f16812i;
                long m17129c = m17129c(c1325ft4, c1325ft4.f9867f);
                j = (-this.f17083c.f16812i.f9867f) + mo10448j2;
                j2 = -m17129c;
            } else {
                kx1 kx1Var3 = this.f17083c;
                mo10448j = kx1Var3.f16811h.f9867f + kx1Var3.mo10448j();
                kx1Var = this.f17083c;
            }
            return Math.max(j2, j);
        }
        long m17128d = m17128d(this.f17083c.f16811h, 0L);
        long m17129c2 = m17129c(this.f17083c.f16812i, 0L);
        long j3 = m17128d - mo10448j2;
        kx1 kx1Var4 = this.f17083c;
        int i2 = kx1Var4.f16812i.f9867f;
        if (j3 >= (-i2)) {
            j3 += i2;
        }
        int i3 = kx1Var4.f16811h.f9867f;
        long j4 = ((-m17129c2) - mo10448j2) - i3;
        if (j4 >= i3) {
            j4 -= i3;
        }
        float m12417m = kx1Var4.f16805b.m12417m(i);
        float f = (float) (m12417m > 0.0f ? (((float) j4) / m12417m) + (((float) j3) / (1.0f - m12417m)) : 0L);
        long j5 = (f * m12417m) + 0.5f + mo10448j2 + (f * (1.0f - m12417m)) + 0.5f;
        kx1Var = this.f17083c;
        mo10448j = kx1Var.f16811h.f9867f + j5;
        return mo10448j - kx1Var.f16812i.f9867f;
    }

    /* renamed from: c */
    public final long m17129c(C1325ft c1325ft, long j) {
        kx1 kx1Var = c1325ft.f9865d;
        if (kx1Var instanceof ab0) {
            return j;
        }
        int size = c1325ft.f9872k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC3891zs interfaceC3891zs = c1325ft.f9872k.get(i);
            if (interfaceC3891zs instanceof C1325ft) {
                C1325ft c1325ft2 = (C1325ft) interfaceC3891zs;
                if (c1325ft2.f9865d != kx1Var) {
                    j2 = Math.min(j2, m17129c(c1325ft2, c1325ft2.f9867f + j));
                }
            }
        }
        if (c1325ft == kx1Var.f16812i) {
            long mo10448j = j - kx1Var.mo10448j();
            return Math.min(Math.min(j2, m17129c(kx1Var.f16811h, mo10448j)), mo10448j - kx1Var.f16811h.f9867f);
        }
        return j2;
    }

    /* renamed from: d */
    public final long m17128d(C1325ft c1325ft, long j) {
        kx1 kx1Var = c1325ft.f9865d;
        if (kx1Var instanceof ab0) {
            return j;
        }
        int size = c1325ft.f9872k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC3891zs interfaceC3891zs = c1325ft.f9872k.get(i);
            if (interfaceC3891zs instanceof C1325ft) {
                C1325ft c1325ft2 = (C1325ft) interfaceC3891zs;
                if (c1325ft2.f9865d != kx1Var) {
                    j2 = Math.max(j2, m17128d(c1325ft2, c1325ft2.f9867f + j));
                }
            }
        }
        if (c1325ft == kx1Var.f16811h) {
            long mo10448j = j + kx1Var.mo10448j();
            return Math.max(Math.max(j2, m17128d(kx1Var.f16812i, mo10448j)), mo10448j - kx1Var.f16812i.f9867f);
        }
        return j2;
    }
}
