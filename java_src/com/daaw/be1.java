package com.daaw;
/* loaded from: classes.dex */
public final class be1 {
    public static final int[] a = {sq1.v("isom"), sq1.v("iso2"), sq1.v("iso3"), sq1.v("iso4"), sq1.v("iso5"), sq1.v("iso6"), sq1.v("avc1"), sq1.v("hvc1"), sq1.v("hev1"), sq1.v("mp41"), sq1.v("mp42"), sq1.v("3g2a"), sq1.v("3g2b"), sq1.v("3gr6"), sq1.v("3gs6"), sq1.v("3ge6"), sq1.v("3gg6"), sq1.v("M4V "), sq1.v("M4A "), sq1.v("f4v "), sq1.v("kddi"), sq1.v("M4VP"), sq1.v("qt  "), sq1.v("MSNV")};

    public static boolean a(int i) {
        if ((i >>> 8) == sq1.v("3gp")) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(a00 a00Var) {
        return c(a00Var, true);
    }

    public static boolean c(a00 a00Var, boolean z) {
        boolean z2;
        long h = a00Var.h();
        long j = -1;
        if (h == -1 || h > 4096) {
            h = 4096;
        }
        int i = (int) h;
        rv0 rv0Var = new rv0(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            rv0Var.G(8);
            a00Var.k(rv0Var.a, 0, 8);
            long z4 = rv0Var.z();
            int i3 = rv0Var.i();
            int i4 = 16;
            if (z4 == 1) {
                a00Var.k(rv0Var.a, 8, 8);
                rv0Var.I(16);
                z4 = rv0Var.C();
            } else {
                if (z4 == 0) {
                    long h2 = a00Var.h();
                    if (h2 != j) {
                        z4 = 8 + (h2 - a00Var.getPosition());
                    }
                }
                i4 = 8;
            }
            long j2 = i4;
            if (z4 < j2) {
                return false;
            }
            i2 += i4;
            if (i3 != b7.C) {
                if (i3 == b7.L || i3 == b7.N) {
                    z2 = true;
                    break;
                } else if ((i2 + z4) - j2 >= i) {
                    break;
                } else {
                    int i5 = (int) (z4 - j2);
                    i2 += i5;
                    if (i3 == b7.b) {
                        if (i5 < 8) {
                            return false;
                        }
                        rv0Var.G(i5);
                        a00Var.k(rv0Var.a, 0, i5);
                        int i6 = i5 / 4;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                break;
                            }
                            if (i7 == 1) {
                                rv0Var.K(4);
                            } else if (a(rv0Var.i())) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        a00Var.g(i5);
                    }
                    j = -1;
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }

    public static boolean d(a00 a00Var) {
        return c(a00Var, false);
    }
}
