package com.daaw;

import java.io.UnsupportedEncodingException;
/* renamed from: com.daaw.wc */
/* loaded from: classes2.dex */
public class C3419wc {
    /* renamed from: a */
    public static String m6203a(byte[] bArr, int i, int i2) {
        return m6202b(bArr, i, i2, "ISO-8859-1");
    }

    /* renamed from: b */
    public static String m6202b(byte[] bArr, int i, int i2, String str) {
        return i2 < 1 ? "" : new String(bArr, i, i2, str);
    }

    /* renamed from: c */
    public static String m6201c(byte[] bArr, int i, int i2) {
        try {
            return m6202b(bArr, i, i2, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m6200d(byte b, int i) {
        return (b & (1 << i)) != 0;
    }

    /* renamed from: e */
    public static byte[] m6199e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        return bArr2;
    }

    /* renamed from: f */
    public static int m6198f(byte[] bArr, int i, int i2) {
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

    /* renamed from: g */
    public static int m6197g(byte[] bArr, int i, int i2) {
        int i3 = 2;
        if (i2 != 1 && i2 != 2) {
            i3 = 1;
        }
        return m6198f(bArr, i, i3);
    }

    /* renamed from: h */
    public static int m6196h(byte b, int i) {
        int i2 = b & 255;
        return i < 0 ? i2 << (-i) : i > 0 ? i2 >> i : i2;
    }

    /* renamed from: i */
    public static int m6195i(byte[] bArr) {
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

    /* renamed from: j */
    public static byte[] m6194j(byte[] bArr) {
        int m6195i = m6195i(bArr);
        if (m6195i == 0) {
            return bArr;
        }
        int length = bArr.length - m6195i;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i >= i3) {
                bArr2[i3] = bArr[i2];
                return bArr2;
            }
            bArr2[i] = bArr[i2];
            if (bArr[i2] == -1) {
                int i4 = i2 + 1;
                if (bArr[i4] == 0) {
                    int i5 = i2 + 2;
                    if ((bArr[i5] & (-32)) == -32 || bArr[i5] == 0) {
                        i2 = i4;
                    }
                }
            }
            i2++;
            i++;
        }
    }

    /* renamed from: k */
    public static String m6193k(String str) {
        int length = str.length() - 1;
        while (length >= 0 && str.charAt(length) <= ' ') {
            length--;
        }
        return length == str.length() + (-1) ? str : length < 0 ? "" : str.substring(0, length + 1);
    }

    /* renamed from: l */
    public static int m6192l(byte b, byte b2, byte b3, byte b4) {
        return (b4 & 255) + m6196h(b3, -8) + m6196h(b2, -16) + m6196h(b, -24);
    }

    /* renamed from: m */
    public static int m6191m(byte b, byte b2, byte b3, byte b4) {
        return ((byte) (b4 & Byte.MAX_VALUE)) + m6196h((byte) (b3 & Byte.MAX_VALUE), -7) + m6196h((byte) (b2 & Byte.MAX_VALUE), -14) + m6196h((byte) (b & Byte.MAX_VALUE), -21);
    }
}
