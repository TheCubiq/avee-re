package com.daaw;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class sr0 {

    /* renamed from: a */
    public static final byte[] f26545a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f26546b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f26547c = new Object();

    /* renamed from: d */
    public static int[] f26548d = new int[10];

    /* renamed from: com.daaw.sr0$a */
    /* loaded from: classes.dex */
    public static final class C2968a {

        /* renamed from: a */
        public final int f26549a;

        /* renamed from: b */
        public final int f26550b;

        /* renamed from: c */
        public final boolean f26551c;

        public C2968a(int i, int i2, boolean z) {
            this.f26549a = i;
            this.f26550b = i2;
            this.f26551c = z;
        }
    }

    /* renamed from: com.daaw.sr0$b */
    /* loaded from: classes.dex */
    public static final class C2969b {

        /* renamed from: a */
        public final int f26552a;

        /* renamed from: b */
        public final int f26553b;

        /* renamed from: c */
        public final int f26554c;

        /* renamed from: d */
        public final float f26555d;

        /* renamed from: e */
        public final boolean f26556e;

        /* renamed from: f */
        public final boolean f26557f;

        /* renamed from: g */
        public final int f26558g;

        /* renamed from: h */
        public final int f26559h;

        /* renamed from: i */
        public final int f26560i;

        /* renamed from: j */
        public final boolean f26561j;

        public C2969b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f26552a = i;
            this.f26553b = i2;
            this.f26554c = i3;
            this.f26555d = f;
            this.f26556e = z;
            this.f26557f = z2;
            this.f26558g = i4;
            this.f26559h = i5;
            this.f26560i = i6;
            this.f26561j = z3;
        }
    }

    /* renamed from: a */
    public static void m9978a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m9977b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= position) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
        r8 = true;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m9976c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        C2914s6.m10685f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr != null) {
            if (zArr[0]) {
                m9978a(zArr);
                return i - 3;
            } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
                m9978a(zArr);
                return i - 2;
            } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
                m9978a(zArr);
                return i - 1;
            }
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            if ((bArr[i5] & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                    if (zArr != null) {
                        m9978a(zArr);
                    }
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        if (zArr != null) {
            boolean z = i3 > 2 ? false : false;
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
        }
        return i2;
    }

    /* renamed from: d */
    public static int m9975d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m9974e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m9973f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m9972g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
    }

    /* renamed from: h */
    public static C2968a m9971h(byte[] bArr, int i, int i2) {
        sv0 sv0Var = new sv0(bArr, i, i2);
        sv0Var.m9825l(8);
        int m9829h = sv0Var.m9829h();
        int m9829h2 = sv0Var.m9829h();
        sv0Var.m9826k();
        return new C2968a(m9829h, m9829h2, sv0Var.m9833d());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2969b m9970i(byte[] bArr, int i, int i2) {
        int m9829h;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean m9833d;
        float f;
        int m9832e;
        int i5;
        sv0 sv0Var = new sv0(bArr, i, i2);
        sv0Var.m9825l(8);
        int m9832e2 = sv0Var.m9832e(8);
        sv0Var.m9825l(16);
        int m9829h2 = sv0Var.m9829h();
        if (m9832e2 == 100 || m9832e2 == 110 || m9832e2 == 122 || m9832e2 == 244 || m9832e2 == 44 || m9832e2 == 83 || m9832e2 == 86 || m9832e2 == 118 || m9832e2 == 128 || m9832e2 == 138) {
            m9829h = sv0Var.m9829h();
            boolean m9833d2 = m9829h == 3 ? sv0Var.m9833d() : false;
            sv0Var.m9829h();
            sv0Var.m9829h();
            sv0Var.m9826k();
            if (sv0Var.m9833d()) {
                int i6 = m9829h != 3 ? 8 : 12;
                int i7 = 0;
                while (i7 < i6) {
                    if (sv0Var.m9833d()) {
                        m9969j(sv0Var, i7 < 6 ? 16 : 64);
                    }
                    i7++;
                }
            }
            z = m9833d2;
        } else {
            m9829h = 1;
            z = false;
        }
        int m9829h3 = sv0Var.m9829h() + 4;
        int m9829h4 = sv0Var.m9829h();
        if (m9829h4 == 0) {
            i3 = m9829h2;
            i4 = sv0Var.m9829h() + 4;
        } else if (m9829h4 == 1) {
            boolean m9833d3 = sv0Var.m9833d();
            sv0Var.m9830g();
            sv0Var.m9830g();
            long m9829h5 = sv0Var.m9829h();
            i3 = m9829h2;
            for (int i8 = 0; i8 < m9829h5; i8++) {
                sv0Var.m9829h();
            }
            z2 = m9833d3;
            i4 = 0;
            sv0Var.m9829h();
            sv0Var.m9826k();
            int m9829h6 = sv0Var.m9829h() + 1;
            m9833d = sv0Var.m9833d();
            int m9829h7 = (2 - (m9833d ? 1 : 0)) * (sv0Var.m9829h() + 1);
            if (!m9833d) {
                sv0Var.m9826k();
            }
            sv0Var.m9826k();
            int i9 = m9829h6 * 16;
            int i10 = m9829h7 * 16;
            if (sv0Var.m9833d()) {
                int m9829h8 = sv0Var.m9829h();
                int m9829h9 = sv0Var.m9829h();
                int m9829h10 = sv0Var.m9829h();
                int m9829h11 = sv0Var.m9829h();
                if (m9829h == 0) {
                    i5 = 2 - (m9833d ? 1 : 0);
                } else {
                    int i11 = m9829h == 3 ? 1 : 2;
                    i5 = (2 - (m9833d ? 1 : 0)) * (m9829h == 1 ? 2 : 1);
                    r7 = i11;
                }
                i9 -= (m9829h8 + m9829h9) * r7;
                i10 -= (m9829h10 + m9829h11) * i5;
            }
            int i12 = i10;
            int i13 = i9;
            float f2 = 1.0f;
            if (sv0Var.m9833d() && sv0Var.m9833d()) {
                m9832e = sv0Var.m9832e(8);
                if (m9832e != 255) {
                    int m9832e3 = sv0Var.m9832e(16);
                    int m9832e4 = sv0Var.m9832e(16);
                    if (m9832e3 != 0 && m9832e4 != 0) {
                        f2 = m9832e3 / m9832e4;
                    }
                    f = f2;
                } else {
                    float[] fArr = f26546b;
                    if (m9832e < fArr.length) {
                        f = fArr[m9832e];
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(m9832e);
                    }
                }
                return new C2969b(i3, i13, i12, f, z, m9833d, m9829h3, m9829h4, i4, z2);
            }
            f = 1.0f;
            return new C2969b(i3, i13, i12, f, z, m9833d, m9829h3, m9829h4, i4, z2);
        } else {
            i3 = m9829h2;
            i4 = 0;
        }
        z2 = false;
        sv0Var.m9829h();
        sv0Var.m9826k();
        int m9829h62 = sv0Var.m9829h() + 1;
        m9833d = sv0Var.m9833d();
        int m9829h72 = (2 - (m9833d ? 1 : 0)) * (sv0Var.m9829h() + 1);
        if (!m9833d) {
        }
        sv0Var.m9826k();
        int i92 = m9829h62 * 16;
        int i102 = m9829h72 * 16;
        if (sv0Var.m9833d()) {
        }
        int i122 = i102;
        int i132 = i92;
        float f22 = 1.0f;
        if (sv0Var.m9833d()) {
            m9832e = sv0Var.m9832e(8);
            if (m9832e != 255) {
            }
            return new C2969b(i3, i132, i122, f, z, m9833d, m9829h3, m9829h4, i4, z2);
        }
        f = 1.0f;
        return new C2969b(i3, i132, i122, f, z, m9833d, m9829h3, m9829h4, i4, z2);
    }

    /* renamed from: j */
    public static void m9969j(sv0 sv0Var, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((sv0Var.m9830g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m9968k(byte[] bArr, int i) {
        int i2;
        synchronized (f26547c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m9975d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f26548d;
                        if (iArr.length <= i4) {
                            f26548d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f26548d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f26548d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
