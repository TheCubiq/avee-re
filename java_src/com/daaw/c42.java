package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class c42 {

    /* renamed from: a */
    public static final byte[] f5462a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f5463b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f5464c = new Object();

    /* renamed from: d */
    public static int[] f5465d = new int[10];

    /* renamed from: a */
    public static int m25632a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        uo4.m7872f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m25628e(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m25628e(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m25628e(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m25628e(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    /* renamed from: b */
    public static int m25631b(byte[] bArr, int i) {
        int i2;
        synchronized (f5464c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f5465d;
                    int length = iArr.length;
                    if (length <= i4) {
                        f5465d = Arrays.copyOf(iArr, length + length);
                    }
                    f5465d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f5465d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* renamed from: c */
    public static a42 m25630c(byte[] bArr, int i, int i2) {
        e42 e42Var = new e42(bArr, 4, i2);
        int m23725c = e42Var.m23725c();
        int m23725c2 = e42Var.m23725c();
        e42Var.m23724d();
        return new a42(m23725c, m23725c2, e42Var.m23722f());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b42 m25629d(byte[] bArr, int i, int i2) {
        int m23725c;
        int i3;
        boolean z;
        boolean z2;
        int m23725c2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean m23722f;
        float f;
        int m23727a;
        e42 e42Var = new e42(bArr, i, i2);
        int m23727a2 = e42Var.m23727a(8);
        int m23727a3 = e42Var.m23727a(8);
        int m23727a4 = e42Var.m23727a(8);
        int m23725c3 = e42Var.m23725c();
        if (m23727a2 != 100 && m23727a2 != 110 && m23727a2 != 122 && m23727a2 != 244 && m23727a2 != 44 && m23727a2 != 83 && m23727a2 != 86 && m23727a2 != 118 && m23727a2 != 128) {
            if (m23727a2 != 138) {
                m23725c = 1;
                z2 = false;
                int m23725c4 = e42Var.m23725c() + 4;
                m23725c2 = e42Var.m23725c();
                if (m23725c2 != 0) {
                    i4 = m23727a2;
                    i5 = m23727a3;
                    i6 = m23725c2;
                    i7 = e42Var.m23725c() + 4;
                } else if (m23725c2 == 1) {
                    boolean m23722f2 = e42Var.m23722f();
                    e42Var.m23726b();
                    e42Var.m23726b();
                    i4 = m23727a2;
                    long m23725c5 = e42Var.m23725c();
                    i5 = m23727a3;
                    for (int i8 = 0; i8 < m23725c5; i8++) {
                        e42Var.m23725c();
                    }
                    z3 = m23722f2;
                    i6 = 1;
                    i7 = 0;
                    int m23725c6 = e42Var.m23725c();
                    e42Var.m23724d();
                    int m23725c7 = e42Var.m23725c() + 1;
                    int m23725c8 = e42Var.m23725c();
                    m23722f = e42Var.m23722f();
                    int i9 = 2 - (m23722f ? 1 : 0);
                    int i10 = (m23725c8 + 1) * i9;
                    if (!m23722f) {
                        e42Var.m23724d();
                    }
                    e42Var.m23724d();
                    int i11 = m23725c7 * 16;
                    int i12 = i10 * 16;
                    if (e42Var.m23722f()) {
                        int m23725c9 = e42Var.m23725c();
                        int m23725c10 = e42Var.m23725c();
                        int m23725c11 = e42Var.m23725c();
                        int m23725c12 = e42Var.m23725c();
                        if (m23725c != 0) {
                            int i13 = m23725c == 3 ? 1 : 2;
                            i9 *= m23725c == 1 ? 2 : 1;
                            r10 = i13;
                        }
                        i11 -= (m23725c9 + m23725c10) * r10;
                        i12 -= (m23725c11 + m23725c12) * i9;
                    }
                    int i14 = i11;
                    int i15 = i12;
                    if (e42Var.m23722f() && e42Var.m23722f()) {
                        m23727a = e42Var.m23727a(8);
                        if (m23727a != 255) {
                            int m23727a5 = e42Var.m23727a(16);
                            int m23727a6 = e42Var.m23727a(16);
                            if (m23727a5 != 0 && m23727a6 != 0) {
                                f = m23727a5 / m23727a6;
                            }
                        } else if (m23727a < 17) {
                            f = f5463b[m23727a];
                        } else {
                            s95.m10493e("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m23727a);
                        }
                        return new b42(i4, i5, m23727a4, m23725c3, m23725c6, i14, i15, f, z2, m23722f, m23725c4, i6, i7, z3);
                    }
                    f = 1.0f;
                    return new b42(i4, i5, m23727a4, m23725c3, m23725c6, i14, i15, f, z2, m23722f, m23725c4, i6, i7, z3);
                } else {
                    i4 = m23727a2;
                    i5 = m23727a3;
                    i6 = m23725c2;
                    i7 = 0;
                }
                z3 = false;
                int m23725c62 = e42Var.m23725c();
                e42Var.m23724d();
                int m23725c72 = e42Var.m23725c() + 1;
                int m23725c82 = e42Var.m23725c();
                m23722f = e42Var.m23722f();
                int i92 = 2 - (m23722f ? 1 : 0);
                int i102 = (m23725c82 + 1) * i92;
                if (!m23722f) {
                }
                e42Var.m23724d();
                int i112 = m23725c72 * 16;
                int i122 = i102 * 16;
                if (e42Var.m23722f()) {
                }
                int i142 = i112;
                int i152 = i122;
                if (e42Var.m23722f()) {
                    m23727a = e42Var.m23727a(8);
                    if (m23727a != 255) {
                    }
                    return new b42(i4, i5, m23727a4, m23725c3, m23725c62, i142, i152, f, z2, m23722f, m23725c4, i6, i7, z3);
                }
                f = 1.0f;
                return new b42(i4, i5, m23727a4, m23725c3, m23725c62, i142, i152, f, z2, m23722f, m23725c4, i6, i7, z3);
            }
            m23727a2 = 138;
        }
        m23725c = e42Var.m23725c();
        if (m23725c == 3) {
            z = e42Var.m23722f();
            i3 = 3;
        } else {
            i3 = m23725c;
            z = false;
        }
        e42Var.m23725c();
        e42Var.m23725c();
        e42Var.m23724d();
        if (e42Var.m23722f()) {
            int i16 = i3 != 3 ? 8 : 12;
            int i17 = 0;
            while (i17 < i16) {
                if (e42Var.m23722f()) {
                    int i18 = i17 < 6 ? 16 : 64;
                    int i19 = 8;
                    int i20 = 8;
                    for (int i21 = 0; i21 < i18; i21++) {
                        if (i19 != 0) {
                            i19 = ((i20 + e42Var.m23726b()) + 256) % 256;
                        }
                        if (i19 != 0) {
                            i20 = i19;
                        }
                    }
                }
                i17++;
            }
        }
        z2 = z;
        int m23725c42 = e42Var.m23725c() + 4;
        m23725c2 = e42Var.m23725c();
        if (m23725c2 != 0) {
        }
        z3 = false;
        int m23725c622 = e42Var.m23725c();
        e42Var.m23724d();
        int m23725c722 = e42Var.m23725c() + 1;
        int m23725c822 = e42Var.m23725c();
        m23722f = e42Var.m23722f();
        int i922 = 2 - (m23722f ? 1 : 0);
        int i1022 = (m23725c822 + 1) * i922;
        if (!m23722f) {
        }
        e42Var.m23724d();
        int i1122 = m23725c722 * 16;
        int i1222 = i1022 * 16;
        if (e42Var.m23722f()) {
        }
        int i1422 = i1122;
        int i1522 = i1222;
        if (e42Var.m23722f()) {
        }
        f = 1.0f;
        return new b42(i4, i5, m23727a4, m23725c3, m23725c622, i1422, i1522, f, z2, m23722f, m23725c42, i6, i7, z3);
    }

    /* renamed from: e */
    public static void m25628e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
