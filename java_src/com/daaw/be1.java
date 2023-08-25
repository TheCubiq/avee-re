package com.daaw;
/* loaded from: classes.dex */
public final class be1 {

    /* renamed from: a */
    public static final int[] f4753a = {sq1.m9994v("isom"), sq1.m9994v("iso2"), sq1.m9994v("iso3"), sq1.m9994v("iso4"), sq1.m9994v("iso5"), sq1.m9994v("iso6"), sq1.m9994v("avc1"), sq1.m9994v("hvc1"), sq1.m9994v("hev1"), sq1.m9994v("mp41"), sq1.m9994v("mp42"), sq1.m9994v("3g2a"), sq1.m9994v("3g2b"), sq1.m9994v("3gr6"), sq1.m9994v("3gs6"), sq1.m9994v("3ge6"), sq1.m9994v("3gg6"), sq1.m9994v("M4V "), sq1.m9994v("M4A "), sq1.m9994v("f4v "), sq1.m9994v("kddi"), sq1.m9994v("M4VP"), sq1.m9994v("qt  "), sq1.m9994v("MSNV")};

    /* renamed from: a */
    public static boolean m26198a(int i) {
        if ((i >>> 8) == sq1.m9994v("3gp")) {
            return true;
        }
        for (int i2 : f4753a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26197b(a00 a00Var) {
        return m26196c(a00Var, true);
    }

    /* renamed from: c */
    public static boolean m26196c(a00 a00Var, boolean z) {
        boolean z2;
        long mo5859h = a00Var.mo5859h();
        long j = -1;
        if (mo5859h == -1 || mo5859h > 4096) {
            mo5859h = 4096;
        }
        int i = (int) mo5859h;
        rv0 rv0Var = new rv0(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            rv0Var.m10924G(8);
            a00Var.mo5856k(rv0Var.f25637a, 0, 8);
            long m10894z = rv0Var.m10894z();
            int m10911i = rv0Var.m10911i();
            int i3 = 16;
            if (m10894z == 1) {
                a00Var.mo5856k(rv0Var.f25637a, 8, 8);
                rv0Var.m10922I(16);
                m10894z = rv0Var.m10928C();
            } else {
                if (m10894z == 0) {
                    long mo5859h2 = a00Var.mo5859h();
                    if (mo5859h2 != j) {
                        m10894z = 8 + (mo5859h2 - a00Var.getPosition());
                    }
                }
                i3 = 8;
            }
            long j2 = i3;
            if (m10894z < j2) {
                return false;
            }
            i2 += i3;
            if (m10911i != AbstractC0821b7.f4382C) {
                if (m10911i == AbstractC0821b7.f4400L || m10911i == AbstractC0821b7.f4404N) {
                    z2 = true;
                    break;
                } else if ((i2 + m10894z) - j2 >= i) {
                    break;
                } else {
                    int i4 = (int) (m10894z - j2);
                    i2 += i4;
                    if (m10911i == AbstractC0821b7.f4421b) {
                        if (i4 < 8) {
                            return false;
                        }
                        rv0Var.m10924G(i4);
                        a00Var.mo5856k(rv0Var.f25637a, 0, i4);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                rv0Var.m10920K(4);
                            } else if (m26198a(rv0Var.m10911i())) {
                                z3 = true;
                                break;
                            }
                            i6++;
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        a00Var.mo5860g(i4);
                    }
                    j = -1;
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }

    /* renamed from: d */
    public static boolean m26195d(a00 a00Var) {
        return m26196c(a00Var, false);
    }
}
