package com.daaw;

import android.util.Pair;
import java.util.ArrayList;
/* renamed from: com.daaw.eg */
/* loaded from: classes.dex */
public final class C1183eg {

    /* renamed from: a */
    public static final byte[] f8452a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f8453b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    public static final int[] f8454c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static byte[] m23493a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & x21.f31789G0))};
    }

    /* renamed from: b */
    public static byte[] m23492b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f8453b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f8454c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i == -1 || i6 == -1) {
            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
        }
        return m23493a(2, i5, i6);
    }

    /* renamed from: c */
    public static byte[] m23491c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f8452a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: d */
    public static int m23490d(byte[] bArr, int i) {
        int length = bArr.length - f8452a.length;
        while (i <= length) {
            if (m23487g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m23489e(qv0 qv0Var) {
        int m12125h = qv0Var.m12125h(5);
        return m12125h == 31 ? qv0Var.m12125h(6) + 32 : m12125h;
    }

    /* renamed from: f */
    public static int m23488f(qv0 qv0Var) {
        int m12125h = qv0Var.m12125h(4);
        if (m12125h == 15) {
            return qv0Var.m12125h(24);
        }
        C2914s6.m10690a(m12125h < 13);
        return f8453b[m12125h];
    }

    /* renamed from: g */
    public static boolean m23487g(byte[] bArr, int i) {
        if (bArr.length - i <= f8452a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f8452a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: h */
    public static Pair<Integer, Integer> m23486h(qv0 qv0Var, boolean z) {
        int m23489e = m23489e(qv0Var);
        int m23488f = m23488f(qv0Var);
        int m12125h = qv0Var.m12125h(4);
        if (m23489e == 5 || m23489e == 29) {
            m23488f = m23488f(qv0Var);
            m23489e = m23489e(qv0Var);
            if (m23489e == 22) {
                m12125h = qv0Var.m12125h(4);
            }
        }
        if (z) {
            if (m23489e != 1 && m23489e != 2 && m23489e != 3 && m23489e != 4 && m23489e != 6 && m23489e != 7 && m23489e != 17) {
                switch (m23489e) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new tv0("Unsupported audio object type: " + m23489e);
                }
            }
            m23484j(qv0Var, m23489e, m12125h);
            switch (m23489e) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m12125h2 = qv0Var.m12125h(2);
                    if (m12125h2 == 2 || m12125h2 == 3) {
                        throw new tv0("Unsupported epConfig: " + m12125h2);
                    }
            }
        }
        int i = f8454c[m12125h];
        C2914s6.m10690a(i != -1);
        return Pair.create(Integer.valueOf(m23488f), Integer.valueOf(i));
    }

    /* renamed from: i */
    public static Pair<Integer, Integer> m23485i(byte[] bArr) {
        return m23486h(new qv0(bArr), false);
    }

    /* renamed from: j */
    public static void m23484j(qv0 qv0Var, int i, int i2) {
        qv0Var.m12118o(1);
        if (qv0Var.m12126g()) {
            qv0Var.m12118o(14);
        }
        boolean m12126g = qv0Var.m12126g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            qv0Var.m12118o(3);
        }
        if (m12126g) {
            if (i == 22) {
                qv0Var.m12118o(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                qv0Var.m12118o(3);
            }
            qv0Var.m12118o(1);
        }
    }

    /* renamed from: k */
    public static byte[][] m23483k(byte[] bArr) {
        if (m23487g(bArr, 0)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                arrayList.add(Integer.valueOf(i));
                i = m23490d(bArr, i + f8452a.length);
            } while (i != -1);
            byte[][] bArr2 = new byte[arrayList.size()];
            int i2 = 0;
            while (i2 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                int intValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
                byte[] bArr3 = new byte[intValue2];
                System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
                bArr2[i2] = bArr3;
                i2++;
            }
            return bArr2;
        }
        return null;
    }
}
