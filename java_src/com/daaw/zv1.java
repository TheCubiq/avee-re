package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zv1 {

    /* renamed from: com.daaw.zv1$a */
    /* loaded from: classes.dex */
    public static final class C3907a {

        /* renamed from: a */
        public final int f35563a;

        /* renamed from: b */
        public final int f35564b;

        /* renamed from: c */
        public final long[] f35565c;

        /* renamed from: d */
        public final int f35566d;

        /* renamed from: e */
        public final boolean f35567e;

        public C3907a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f35563a = i;
            this.f35564b = i2;
            this.f35565c = jArr;
            this.f35566d = i3;
            this.f35567e = z;
        }
    }

    /* renamed from: com.daaw.zv1$b */
    /* loaded from: classes.dex */
    public static final class C3908b {

        /* renamed from: a */
        public final String f35568a;

        /* renamed from: b */
        public final String[] f35569b;

        /* renamed from: c */
        public final int f35570c;

        public C3908b(String str, String[] strArr, int i) {
            this.f35568a = str;
            this.f35569b = strArr;
            this.f35570c = i;
        }
    }

    /* renamed from: com.daaw.zv1$c */
    /* loaded from: classes.dex */
    public static final class C3909c {

        /* renamed from: a */
        public final boolean f35571a;

        /* renamed from: b */
        public final int f35572b;

        /* renamed from: c */
        public final int f35573c;

        /* renamed from: d */
        public final int f35574d;

        public C3909c(boolean z, int i, int i2, int i3) {
            this.f35571a = z;
            this.f35572b = i;
            this.f35573c = i2;
            this.f35574d = i3;
        }
    }

    /* renamed from: com.daaw.zv1$d */
    /* loaded from: classes.dex */
    public static final class C3910d {

        /* renamed from: a */
        public final long f35575a;

        /* renamed from: b */
        public final int f35576b;

        /* renamed from: c */
        public final long f35577c;

        /* renamed from: d */
        public final int f35578d;

        /* renamed from: e */
        public final int f35579e;

        /* renamed from: f */
        public final int f35580f;

        /* renamed from: g */
        public final int f35581g;

        /* renamed from: h */
        public final int f35582h;

        /* renamed from: i */
        public final boolean f35583i;

        /* renamed from: j */
        public final byte[] f35584j;

        public C3910d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f35575a = j;
            this.f35576b = i;
            this.f35577c = j2;
            this.f35578d = i2;
            this.f35579e = i3;
            this.f35580f = i4;
            this.f35581g = i5;
            this.f35582h = i6;
            this.f35583i = z;
            this.f35584j = bArr;
        }
    }

    /* renamed from: a */
    public static int m1859a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static long m1858b(long j, long j2) {
        double d = j2;
        Double.isNaN(d);
        return (long) Math.floor(Math.pow(j, 1.0d / d));
    }

    /* renamed from: c */
    public static C3907a m1857c(xv1 xv1Var) {
        if (xv1Var.m4487d(24) != 5653314) {
            throw new tv0("expected code book to start with [0x56, 0x43, 0x42] at " + xv1Var.m4489b());
        }
        int m4487d = xv1Var.m4487d(16);
        int m4487d2 = xv1Var.m4487d(24);
        long[] jArr = new long[m4487d2];
        boolean m4488c = xv1Var.m4488c();
        long j = 0;
        if (m4488c) {
            int m4487d3 = xv1Var.m4487d(5) + 1;
            int i = 0;
            while (i < m4487d2) {
                int m4487d4 = xv1Var.m4487d(m1859a(m4487d2 - i));
                for (int i2 = 0; i2 < m4487d4 && i < m4487d2; i2++) {
                    jArr[i] = m4487d3;
                    i++;
                }
                m4487d3++;
            }
        } else {
            boolean m4488c2 = xv1Var.m4488c();
            for (int i3 = 0; i3 < m4487d2; i3++) {
                if (!m4488c2) {
                    jArr[i3] = xv1Var.m4487d(5) + 1;
                } else if (xv1Var.m4488c()) {
                    jArr[i3] = xv1Var.m4487d(5) + 1;
                } else {
                    jArr[i3] = 0;
                }
            }
        }
        int m4487d5 = xv1Var.m4487d(4);
        if (m4487d5 > 2) {
            throw new tv0("lookup type greater than 2 not decodable: " + m4487d5);
        }
        if (m4487d5 == 1 || m4487d5 == 2) {
            xv1Var.m4486e(32);
            xv1Var.m4486e(32);
            int m4487d6 = xv1Var.m4487d(4) + 1;
            xv1Var.m4486e(1);
            if (m4487d5 != 1) {
                j = m4487d2 * m4487d;
            } else if (m4487d != 0) {
                j = m1858b(m4487d2, m4487d);
            }
            xv1Var.m4486e((int) (j * m4487d6));
        }
        return new C3907a(m4487d, m4487d2, jArr, m4487d5, m4488c);
    }

    /* renamed from: d */
    public static void m1856d(xv1 xv1Var) {
        int m4487d = xv1Var.m4487d(6) + 1;
        for (int i = 0; i < m4487d; i++) {
            int m4487d2 = xv1Var.m4487d(16);
            if (m4487d2 == 0) {
                xv1Var.m4486e(8);
                xv1Var.m4486e(16);
                xv1Var.m4486e(16);
                xv1Var.m4486e(6);
                xv1Var.m4486e(8);
                int m4487d3 = xv1Var.m4487d(4) + 1;
                for (int i2 = 0; i2 < m4487d3; i2++) {
                    xv1Var.m4486e(8);
                }
            } else if (m4487d2 != 1) {
                throw new tv0("floor type greater than 1 not decodable: " + m4487d2);
            } else {
                int m4487d4 = xv1Var.m4487d(5);
                int i3 = -1;
                int[] iArr = new int[m4487d4];
                for (int i4 = 0; i4 < m4487d4; i4++) {
                    iArr[i4] = xv1Var.m4487d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = xv1Var.m4487d(3) + 1;
                    int m4487d5 = xv1Var.m4487d(2);
                    if (m4487d5 > 0) {
                        xv1Var.m4486e(8);
                    }
                    for (int i7 = 0; i7 < (1 << m4487d5); i7++) {
                        xv1Var.m4486e(8);
                    }
                }
                xv1Var.m4486e(2);
                int m4487d6 = xv1Var.m4487d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < m4487d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        xv1Var.m4486e(m4487d6);
                        i9++;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m1855e(int i, xv1 xv1Var) {
        int m4487d = xv1Var.m4487d(6) + 1;
        for (int i2 = 0; i2 < m4487d; i2++) {
            int m4487d2 = xv1Var.m4487d(16);
            if (m4487d2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(m4487d2);
            } else {
                int m4487d3 = xv1Var.m4488c() ? xv1Var.m4487d(4) + 1 : 1;
                if (xv1Var.m4488c()) {
                    int m4487d4 = xv1Var.m4487d(8) + 1;
                    for (int i3 = 0; i3 < m4487d4; i3++) {
                        int i4 = i - 1;
                        xv1Var.m4486e(m1859a(i4));
                        xv1Var.m4486e(m1859a(i4));
                    }
                }
                if (xv1Var.m4487d(2) != 0) {
                    throw new tv0("to reserved bits must be zero after mapping coupling steps");
                }
                if (m4487d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        xv1Var.m4486e(4);
                    }
                }
                for (int i6 = 0; i6 < m4487d3; i6++) {
                    xv1Var.m4486e(8);
                    xv1Var.m4486e(8);
                    xv1Var.m4486e(8);
                }
            }
        }
    }

    /* renamed from: f */
    public static C3909c[] m1854f(xv1 xv1Var) {
        int m4487d = xv1Var.m4487d(6) + 1;
        C3909c[] c3909cArr = new C3909c[m4487d];
        for (int i = 0; i < m4487d; i++) {
            c3909cArr[i] = new C3909c(xv1Var.m4488c(), xv1Var.m4487d(16), xv1Var.m4487d(16), xv1Var.m4487d(8));
        }
        return c3909cArr;
    }

    /* renamed from: g */
    public static void m1853g(xv1 xv1Var) {
        int m4487d = xv1Var.m4487d(6) + 1;
        for (int i = 0; i < m4487d; i++) {
            if (xv1Var.m4487d(16) > 2) {
                throw new tv0("residueType greater than 2 is not decodable");
            }
            xv1Var.m4486e(24);
            xv1Var.m4486e(24);
            xv1Var.m4486e(24);
            int m4487d2 = xv1Var.m4487d(6) + 1;
            xv1Var.m4486e(8);
            int[] iArr = new int[m4487d2];
            for (int i2 = 0; i2 < m4487d2; i2++) {
                iArr[i2] = ((xv1Var.m4488c() ? xv1Var.m4487d(5) : 0) * 8) + xv1Var.m4487d(3);
            }
            for (int i3 = 0; i3 < m4487d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        xv1Var.m4486e(8);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static C3908b m1852h(rv0 rv0Var) {
        m1849k(3, rv0Var, false);
        String m10899u = rv0Var.m10899u((int) rv0Var.m10906n());
        int length = 11 + m10899u.length();
        long m10906n = rv0Var.m10906n();
        String[] strArr = new String[(int) m10906n];
        int i = length + 4;
        for (int i2 = 0; i2 < m10906n; i2++) {
            strArr[i2] = rv0Var.m10899u((int) rv0Var.m10906n());
            i = i + 4 + strArr[i2].length();
        }
        if ((rv0Var.m10896x() & 1) != 0) {
            return new C3908b(m10899u, strArr, i + 1);
        }
        throw new tv0("framing bit expected to be set");
    }

    /* renamed from: i */
    public static C3910d m1851i(rv0 rv0Var) {
        m1849k(1, rv0Var, false);
        long m10906n = rv0Var.m10906n();
        int m10896x = rv0Var.m10896x();
        long m10906n2 = rv0Var.m10906n();
        int m10908l = rv0Var.m10908l();
        int m10908l2 = rv0Var.m10908l();
        int m10908l3 = rv0Var.m10908l();
        int m10896x2 = rv0Var.m10896x();
        return new C3910d(m10906n, m10896x, m10906n2, m10908l, m10908l2, m10908l3, (int) Math.pow(2.0d, m10896x2 & 15), (int) Math.pow(2.0d, (m10896x2 & 240) >> 4), (rv0Var.m10896x() & 1) > 0, Arrays.copyOf(rv0Var.f25637a, rv0Var.m10916d()));
    }

    /* renamed from: j */
    public static C3909c[] m1850j(rv0 rv0Var, int i) {
        m1849k(5, rv0Var, false);
        int m10896x = rv0Var.m10896x() + 1;
        xv1 xv1Var = new xv1(rv0Var.f25637a);
        xv1Var.m4486e(rv0Var.m10917c() * 8);
        for (int i2 = 0; i2 < m10896x; i2++) {
            m1857c(xv1Var);
        }
        int m4487d = xv1Var.m4487d(6) + 1;
        for (int i3 = 0; i3 < m4487d; i3++) {
            if (xv1Var.m4487d(16) != 0) {
                throw new tv0("placeholder of time domain transforms not zeroed out");
            }
        }
        m1856d(xv1Var);
        m1853g(xv1Var);
        m1855e(i, xv1Var);
        C3909c[] m1854f = m1854f(xv1Var);
        if (xv1Var.m4488c()) {
            return m1854f;
        }
        throw new tv0("framing bit after modes not set as expected");
    }

    /* renamed from: k */
    public static boolean m1849k(int i, rv0 rv0Var, boolean z) {
        if (rv0Var.m10919a() < 7) {
            if (z) {
                return false;
            }
            throw new tv0("too short header: " + rv0Var.m10919a());
        } else if (rv0Var.m10896x() != i) {
            if (z) {
                return false;
            }
            throw new tv0("expected header type " + Integer.toHexString(i));
        } else if (rv0Var.m10896x() == 118 && rv0Var.m10896x() == 111 && rv0Var.m10896x() == 114 && rv0Var.m10896x() == 98 && rv0Var.m10896x() == 105 && rv0Var.m10896x() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new tv0("expected characters 'vorbis'");
        }
    }
}
