package com.daaw;
/* loaded from: classes.dex */
public final class eu2 {
    public static final int[] a = {pz2.g("isom"), pz2.g("iso2"), pz2.g("iso3"), pz2.g("iso4"), pz2.g("iso5"), pz2.g("iso6"), pz2.g("avc1"), pz2.g("hvc1"), pz2.g("hev1"), pz2.g("mp41"), pz2.g("mp42"), pz2.g("3g2a"), pz2.g("3g2b"), pz2.g("3gr6"), pz2.g("3gs6"), pz2.g("3ge6"), pz2.g("3gg6"), pz2.g("M4V "), pz2.g("M4A "), pz2.g("f4v "), pz2.g("kddi"), pz2.g("M4VP"), pz2.g("qt  "), pz2.g("MSNV")};

    public static boolean a(ms2 ms2Var) {
        return c(ms2Var, true);
    }

    public static boolean b(ms2 ms2Var) {
        return c(ms2Var, false);
    }

    public static boolean c(ms2 ms2Var, boolean z) {
        boolean z2;
        long c = ms2Var.c();
        int i = (int) ((c == -1 || c > 4096) ? 4096L : 4096L);
        iz2 iz2Var = new iz2(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            iz2Var.s(8);
            ms2Var.g(iz2Var.a, 0, 8, false);
            long m = iz2Var.m();
            int e = iz2Var.e();
            int i3 = 16;
            if (m == 1) {
                ms2Var.g(iz2Var.a, 8, 8, false);
                iz2Var.u(16);
                m = iz2Var.n();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (m < j) {
                return false;
            }
            i2 += i3;
            if (e != nt2.C) {
                if (e == nt2.L || e == nt2.N) {
                    z2 = true;
                    break;
                } else if ((i2 + m) - j >= i) {
                    break;
                } else {
                    int i4 = (int) (m - j);
                    i2 += i4;
                    if (e == nt2.b) {
                        if (i4 < 8) {
                            return false;
                        }
                        iz2Var.s(i4);
                        ms2Var.g(iz2Var.a, 0, i4, false);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 != 1) {
                                int e2 = iz2Var.e();
                                if ((e2 >>> 8) != pz2.g("3gp")) {
                                    int[] iArr = a;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != e2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                            iz2Var.w(4);
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        ms2Var.f(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
