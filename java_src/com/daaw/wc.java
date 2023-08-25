package com.daaw;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class wc {
    public static String a(byte[] bArr, int i, int i2) {
        return b(bArr, i, i2, "ISO-8859-1");
    }

    public static String b(byte[] bArr, int i, int i2, String str) {
        return i2 < 1 ? "" : new String(bArr, i, i2, str);
    }

    public static String c(byte[] bArr, int i, int i2) {
        try {
            return b(bArr, i, i2, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static boolean d(byte b, int i) {
        return (b & (1 << i)) != 0;
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        return bArr2;
    }

    public static int f(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 <= bArr.length - i2; i3++) {
            if ((i3 - i) % i2 == 0) {
                int i4 = 0;
                while (i4 < i2 && bArr[i3 + i4] == 0) {
                    i4++;
                }
                if (i4 == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static int g(byte[] bArr, int i, int i2) {
        int i3 = 2;
        if (i2 != 1 && i2 != 2) {
            i3 = 1;
        }
        return f(bArr, i, i3);
    }

    public static int h(byte b, int i) {
        int i2 = b & 255;
        return i < 0 ? i2 << (-i) : i > 0 ? i2 >> i : i2;
    }

    public static int i(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 2; i2++) {
            if (bArr[i2] == -1 && bArr[i2 + 1] == 0) {
                int i3 = i2 + 2;
                if ((bArr[i3] & (-32)) == -32 || bArr[i3] == 0) {
                    i++;
                }
            }
        }
        return (bArr.length > 1 && bArr[bArr.length + (-2)] == -1 && bArr[bArr.length - 1] == 0) ? i + 1 : i;
    }

    public static byte[] j(byte[] bArr) {
        int i = i(bArr);
        if (i == 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (i2 >= i4) {
                bArr2[i4] = bArr[i3];
                return bArr2;
            }
            bArr2[i2] = bArr[i3];
            if (bArr[i3] == -1) {
                int i5 = i3 + 1;
                if (bArr[i5] == 0) {
                    int i6 = i3 + 2;
                    if ((bArr[i6] & (-32)) == -32 || bArr[i6] == 0) {
                        i3 = i5;
                    }
                }
            }
            i3++;
            i2++;
        }
    }

    public static String k(String str) {
        int length = str.length() - 1;
        while (length >= 0 && str.charAt(length) <= ' ') {
            length--;
        }
        return length == str.length() + (-1) ? str : length < 0 ? "" : str.substring(0, length + 1);
    }

    public static int l(byte b, byte b2, byte b3, byte b4) {
        return (b4 & 255) + h(b3, -8) + h(b2, -16) + h(b, -24);
    }

    public static int m(byte b, byte b2, byte b3, byte b4) {
        return ((byte) (b4 & Byte.MAX_VALUE)) + h((byte) (b3 & Byte.MAX_VALUE), -7) + h((byte) (b2 & Byte.MAX_VALUE), -14) + h((byte) (b & Byte.MAX_VALUE), -21);
    }
}
