package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class lw7 {
    public static final iw7 a;

    static {
        if (gw7.a() && gw7.b()) {
            int i = jq7.a;
        }
        a = new jw7();
    }

    public static /* bridge */ /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return l(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else {
            return k(b, bArr[i]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lw7.d(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new kw7(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int f(int i, byte[] bArr, int i2, int i3) {
        return a.a(i, bArr, i2, i3);
    }

    public static String g(ByteBuffer byteBuffer, int i, int i2) {
        iw7 iw7Var = a;
        if (byteBuffer.hasArray()) {
            return iw7Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        byteBuffer.isDirect();
        return iw7.d(byteBuffer, i, i2);
    }

    public static String h(byte[] bArr, int i, int i2) {
        return a.b(bArr, i, i2);
    }

    public static boolean i(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean j(byte[] bArr, int i, int i2) {
        return a.c(bArr, i, i2);
    }

    public static int k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int l(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
