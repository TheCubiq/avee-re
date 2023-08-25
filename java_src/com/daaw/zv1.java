package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zv1 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final long a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.a = j;
            this.b = i;
            this.c = j2;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static long b(long j, long j2) {
        double d2 = j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(j, 1.0d / d2));
    }

    public static a c(xv1 xv1Var) {
        if (xv1Var.d(24) != 5653314) {
            throw new tv0("expected code book to start with [0x56, 0x43, 0x42] at " + xv1Var.b());
        }
        int d2 = xv1Var.d(16);
        int d3 = xv1Var.d(24);
        long[] jArr = new long[d3];
        boolean c2 = xv1Var.c();
        long j = 0;
        if (c2) {
            int d4 = xv1Var.d(5) + 1;
            int i = 0;
            while (i < d3) {
                int d5 = xv1Var.d(a(d3 - i));
                for (int i2 = 0; i2 < d5 && i < d3; i2++) {
                    jArr[i] = d4;
                    i++;
                }
                d4++;
            }
        } else {
            boolean c3 = xv1Var.c();
            for (int i3 = 0; i3 < d3; i3++) {
                if (!c3) {
                    jArr[i3] = xv1Var.d(5) + 1;
                } else if (xv1Var.c()) {
                    jArr[i3] = xv1Var.d(5) + 1;
                } else {
                    jArr[i3] = 0;
                }
            }
        }
        int d6 = xv1Var.d(4);
        if (d6 > 2) {
            throw new tv0("lookup type greater than 2 not decodable: " + d6);
        }
        if (d6 == 1 || d6 == 2) {
            xv1Var.e(32);
            xv1Var.e(32);
            int d7 = xv1Var.d(4) + 1;
            xv1Var.e(1);
            if (d6 != 1) {
                j = d3 * d2;
            } else if (d2 != 0) {
                j = b(d3, d2);
            }
            xv1Var.e((int) (j * d7));
        }
        return new a(d2, d3, jArr, d6, c2);
    }

    public static void d(xv1 xv1Var) {
        int d2 = xv1Var.d(6) + 1;
        for (int i = 0; i < d2; i++) {
            int d3 = xv1Var.d(16);
            if (d3 == 0) {
                xv1Var.e(8);
                xv1Var.e(16);
                xv1Var.e(16);
                xv1Var.e(6);
                xv1Var.e(8);
                int d4 = xv1Var.d(4) + 1;
                for (int i2 = 0; i2 < d4; i2++) {
                    xv1Var.e(8);
                }
            } else if (d3 != 1) {
                throw new tv0("floor type greater than 1 not decodable: " + d3);
            } else {
                int d5 = xv1Var.d(5);
                int i3 = -1;
                int[] iArr = new int[d5];
                for (int i4 = 0; i4 < d5; i4++) {
                    iArr[i4] = xv1Var.d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = xv1Var.d(3) + 1;
                    int d6 = xv1Var.d(2);
                    if (d6 > 0) {
                        xv1Var.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        xv1Var.e(8);
                    }
                }
                xv1Var.e(2);
                int d7 = xv1Var.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        xv1Var.e(d7);
                        i9++;
                    }
                }
            }
        }
    }

    public static void e(int i, xv1 xv1Var) {
        int d2 = xv1Var.d(6) + 1;
        for (int i2 = 0; i2 < d2; i2++) {
            int d3 = xv1Var.d(16);
            if (d3 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(d3);
            } else {
                int d4 = xv1Var.c() ? xv1Var.d(4) + 1 : 1;
                if (xv1Var.c()) {
                    int d5 = xv1Var.d(8) + 1;
                    for (int i3 = 0; i3 < d5; i3++) {
                        int i4 = i - 1;
                        xv1Var.e(a(i4));
                        xv1Var.e(a(i4));
                    }
                }
                if (xv1Var.d(2) != 0) {
                    throw new tv0("to reserved bits must be zero after mapping coupling steps");
                }
                if (d4 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        xv1Var.e(4);
                    }
                }
                for (int i6 = 0; i6 < d4; i6++) {
                    xv1Var.e(8);
                    xv1Var.e(8);
                    xv1Var.e(8);
                }
            }
        }
    }

    public static c[] f(xv1 xv1Var) {
        int d2 = xv1Var.d(6) + 1;
        c[] cVarArr = new c[d2];
        for (int i = 0; i < d2; i++) {
            cVarArr[i] = new c(xv1Var.c(), xv1Var.d(16), xv1Var.d(16), xv1Var.d(8));
        }
        return cVarArr;
    }

    public static void g(xv1 xv1Var) {
        int d2 = xv1Var.d(6) + 1;
        for (int i = 0; i < d2; i++) {
            if (xv1Var.d(16) > 2) {
                throw new tv0("residueType greater than 2 is not decodable");
            }
            xv1Var.e(24);
            xv1Var.e(24);
            xv1Var.e(24);
            int d3 = xv1Var.d(6) + 1;
            xv1Var.e(8);
            int[] iArr = new int[d3];
            for (int i2 = 0; i2 < d3; i2++) {
                iArr[i2] = ((xv1Var.c() ? xv1Var.d(5) : 0) * 8) + xv1Var.d(3);
            }
            for (int i3 = 0; i3 < d3; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        xv1Var.e(8);
                    }
                }
            }
        }
    }

    public static b h(rv0 rv0Var) {
        k(3, rv0Var, false);
        String u = rv0Var.u((int) rv0Var.n());
        int length = 11 + u.length();
        long n = rv0Var.n();
        String[] strArr = new String[(int) n];
        int i = length + 4;
        for (int i2 = 0; i2 < n; i2++) {
            strArr[i2] = rv0Var.u((int) rv0Var.n());
            i = i + 4 + strArr[i2].length();
        }
        if ((rv0Var.x() & 1) != 0) {
            return new b(u, strArr, i + 1);
        }
        throw new tv0("framing bit expected to be set");
    }

    public static d i(rv0 rv0Var) {
        k(1, rv0Var, false);
        long n = rv0Var.n();
        int x = rv0Var.x();
        long n2 = rv0Var.n();
        int l = rv0Var.l();
        int l2 = rv0Var.l();
        int l3 = rv0Var.l();
        int x2 = rv0Var.x();
        return new d(n, x, n2, l, l2, l3, (int) Math.pow(2.0d, x2 & 15), (int) Math.pow(2.0d, (x2 & 240) >> 4), (rv0Var.x() & 1) > 0, Arrays.copyOf(rv0Var.a, rv0Var.d()));
    }

    public static c[] j(rv0 rv0Var, int i) {
        k(5, rv0Var, false);
        int x = rv0Var.x() + 1;
        xv1 xv1Var = new xv1(rv0Var.a);
        xv1Var.e(rv0Var.c() * 8);
        for (int i2 = 0; i2 < x; i2++) {
            c(xv1Var);
        }
        int d2 = xv1Var.d(6) + 1;
        for (int i3 = 0; i3 < d2; i3++) {
            if (xv1Var.d(16) != 0) {
                throw new tv0("placeholder of time domain transforms not zeroed out");
            }
        }
        d(xv1Var);
        g(xv1Var);
        e(i, xv1Var);
        c[] f = f(xv1Var);
        if (xv1Var.c()) {
            return f;
        }
        throw new tv0("framing bit after modes not set as expected");
    }

    public static boolean k(int i, rv0 rv0Var, boolean z) {
        if (rv0Var.a() < 7) {
            if (z) {
                return false;
            }
            throw new tv0("too short header: " + rv0Var.a());
        } else if (rv0Var.x() != i) {
            if (z) {
                return false;
            }
            throw new tv0("expected header type " + Integer.toHexString(i));
        } else if (rv0Var.x() == 118 && rv0Var.x() == 111 && rv0Var.x() == 114 && rv0Var.x() == 98 && rv0Var.x() == 105 && rv0Var.x() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new tv0("expected characters 'vorbis'");
        }
    }
}
