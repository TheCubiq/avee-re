package com.daaw;

import android.util.Pair;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class eg {
    public static final byte[] a = {0, 0, 0, 1};
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & x21.G0))};
    }

    public static byte[] b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = b;
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
            int[] iArr2 = c;
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
        return a(2, i5, i6);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static int d(byte[] bArr, int i) {
        int length = bArr.length - a.length;
        while (i <= length) {
            if (g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(qv0 qv0Var) {
        int h = qv0Var.h(5);
        return h == 31 ? qv0Var.h(6) + 32 : h;
    }

    public static int f(qv0 qv0Var) {
        int h = qv0Var.h(4);
        if (h == 15) {
            return qv0Var.h(24);
        }
        s6.a(h < 13);
        return b[h];
    }

    public static boolean g(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair<Integer, Integer> h(qv0 qv0Var, boolean z) {
        int e = e(qv0Var);
        int f = f(qv0Var);
        int h = qv0Var.h(4);
        if (e == 5 || e == 29) {
            f = f(qv0Var);
            e = e(qv0Var);
            if (e == 22) {
                h = qv0Var.h(4);
            }
        }
        if (z) {
            if (e != 1 && e != 2 && e != 3 && e != 4 && e != 6 && e != 7 && e != 17) {
                switch (e) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new tv0("Unsupported audio object type: " + e);
                }
            }
            j(qv0Var, e, h);
            switch (e) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = qv0Var.h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw new tv0("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = c[h];
        s6.a(i != -1);
        return Pair.create(Integer.valueOf(f), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> i(byte[] bArr) {
        return h(new qv0(bArr), false);
    }

    public static void j(qv0 qv0Var, int i, int i2) {
        qv0Var.o(1);
        if (qv0Var.g()) {
            qv0Var.o(14);
        }
        boolean g = qv0Var.g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            qv0Var.o(3);
        }
        if (g) {
            if (i == 22) {
                qv0Var.o(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                qv0Var.o(3);
            }
            qv0Var.o(1);
        }
    }

    public static byte[][] k(byte[] bArr) {
        if (g(bArr, 0)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                arrayList.add(Integer.valueOf(i));
                i = d(bArr, i + a.length);
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
