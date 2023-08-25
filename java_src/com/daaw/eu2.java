package com.daaw;
/* loaded from: classes.dex */
public final class eu2 {

    /* renamed from: a */
    public static final int[] f8832a = {pz2.m12843g("isom"), pz2.m12843g("iso2"), pz2.m12843g("iso3"), pz2.m12843g("iso4"), pz2.m12843g("iso5"), pz2.m12843g("iso6"), pz2.m12843g("avc1"), pz2.m12843g("hvc1"), pz2.m12843g("hev1"), pz2.m12843g("mp41"), pz2.m12843g("mp42"), pz2.m12843g("3g2a"), pz2.m12843g("3g2b"), pz2.m12843g("3gr6"), pz2.m12843g("3gs6"), pz2.m12843g("3ge6"), pz2.m12843g("3gg6"), pz2.m12843g("M4V "), pz2.m12843g("M4A "), pz2.m12843g("f4v "), pz2.m12843g("kddi"), pz2.m12843g("M4VP"), pz2.m12843g("qt  "), pz2.m12843g("MSNV")};

    /* renamed from: a */
    public static boolean m23178a(ms2 ms2Var) {
        return m23176c(ms2Var, true);
    }

    /* renamed from: b */
    public static boolean m23177b(ms2 ms2Var) {
        return m23176c(ms2Var, false);
    }

    /* renamed from: c */
    public static boolean m23176c(ms2 ms2Var, boolean z) {
        boolean z2;
        long m15802c = ms2Var.m15802c();
        int i = (int) ((m15802c == -1 || m15802c > 4096) ? 4096L : 4096L);
        iz2 iz2Var = new iz2(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            iz2Var.m19228s(8);
            ms2Var.m15798g(iz2Var.f14125a, 0, 8, false);
            long m19234m = iz2Var.m19234m();
            int m19242e = iz2Var.m19242e();
            int i3 = 16;
            if (m19234m == 1) {
                ms2Var.m15798g(iz2Var.f14125a, 8, 8, false);
                iz2Var.m19226u(16);
                m19234m = iz2Var.m19233n();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (m19234m < j) {
                return false;
            }
            i2 += i3;
            if (m19242e != nt2.f20635C) {
                if (m19242e == nt2.f20653L || m19242e == nt2.f20657N) {
                    z2 = true;
                    break;
                } else if ((i2 + m19234m) - j >= i) {
                    break;
                } else {
                    int i4 = (int) (m19234m - j);
                    i2 += i4;
                    if (m19242e == nt2.f20673b) {
                        if (i4 < 8) {
                            return false;
                        }
                        iz2Var.m19228s(i4);
                        ms2Var.m15798g(iz2Var.f14125a, 0, i4, false);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 != 1) {
                                int m19242e2 = iz2Var.m19242e();
                                if ((m19242e2 >>> 8) != pz2.m12843g("3gp")) {
                                    int[] iArr = f8832a;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != m19242e2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                            iz2Var.m19224w(4);
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        ms2Var.m15799f(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
