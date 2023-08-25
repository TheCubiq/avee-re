package com.daaw;
/* loaded from: classes.dex */
public final class ga2 {

    /* renamed from: a */
    public static final int[] f10976a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m21850a(k09 k09Var) {
        return m21848c(k09Var, true, false);
    }

    /* renamed from: b */
    public static boolean m21849b(k09 k09Var, boolean z) {
        return m21848c(k09Var, false, false);
    }

    /* renamed from: c */
    public static boolean m21848c(k09 k09Var, boolean z, boolean z2) {
        boolean z3;
        long zzd = k09Var.zzd();
        long j = 4096;
        long j2 = -1;
        if (zzd != -1 && zzd <= 4096) {
            j = zzd;
        }
        int i = (int) j;
        ik5 ik5Var = new ik5(64);
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < i) {
            ik5Var.m19719c(8);
            if (!k09Var.mo5661h(ik5Var.m19714h(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long m19729A = ik5Var.m19729A();
            int m19709m = ik5Var.m19709m();
            int i3 = 16;
            if (m19729A == 1) {
                k09Var.mo5659j(ik5Var.m19714h(), 8, 8);
                ik5Var.m19717e(16);
                m19729A = ik5Var.m19696z();
            } else {
                if (m19729A == 0) {
                    long zzd2 = k09Var.zzd();
                    if (zzd2 != j2) {
                        m19729A = 8 + (zzd2 - k09Var.zze());
                    }
                }
                i3 = 8;
            }
            long j3 = i3;
            if (m19729A < j3) {
                return z4;
            }
            i2 += i3;
            if (m19709m == 1836019574) {
                i += (int) m19729A;
                if (zzd != -1 && i > zzd) {
                    i = (int) zzd;
                }
                j2 = -1;
            } else if (m19709m == 1836019558 || m19709m == 1836475768) {
                z3 = true;
                break;
            } else {
                long j4 = zzd;
                if ((i2 + m19729A) - j3 >= i) {
                    break;
                }
                int i4 = (int) (m19729A - j3);
                i2 += i4;
                if (m19709m == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    ik5Var.m19719c(i4);
                    k09Var.mo5659j(ik5Var.m19714h(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int m19709m2 = ik5Var.m19709m();
                            if ((m19709m2 >>> 8) != 3368816) {
                                if (m19709m2 == 1751476579) {
                                    m19709m2 = 1751476579;
                                }
                                int[] iArr = f10976a;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != m19709m2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                        ik5Var.m19715g(4);
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i4 != 0) {
                    k09Var.mo5664c(i4);
                }
                j2 = -1;
                zzd = j4;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
