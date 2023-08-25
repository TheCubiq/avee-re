package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class lw7 {

    /* renamed from: a */
    public static final iw7 f17876a;

    static {
        if (gw7.m21185a() && gw7.m21184b()) {
            int i = jq7.f15342a;
        }
        f17876a = new jw7();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m16418c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return m16409l(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else {
            return m16410k(b, bArr[i]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        return r9 + r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m16417d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 >= 128 || i8 >= i6) {
                if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 >= 55296 && charAt2 <= 57343) || i8 > i6 - 3) {
                    if (i8 > i6 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                        }
                        throw new kw7(i7, length);
                    }
                    int i10 = i7 + 1;
                    if (i10 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i11 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i13 + 1;
                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                            i7 = i10;
                        } else {
                            i7 = i10;
                        }
                    }
                    throw new kw7(i7 - 1, length);
                } else {
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }

    /* renamed from: e */
    public static int m16416e(CharSequence charSequence) {
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

    /* renamed from: f */
    public static int m16415f(int i, byte[] bArr, int i2, int i3) {
        return f17876a.mo18199a(i, bArr, i2, i3);
    }

    /* renamed from: g */
    public static String m16414g(ByteBuffer byteBuffer, int i, int i2) {
        iw7 iw7Var = f17876a;
        if (byteBuffer.hasArray()) {
            return iw7Var.mo18198b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        byteBuffer.isDirect();
        return iw7.m19303d(byteBuffer, i, i2);
    }

    /* renamed from: h */
    public static String m16413h(byte[] bArr, int i, int i2) {
        return f17876a.mo18198b(bArr, i, i2);
    }

    /* renamed from: i */
    public static boolean m16412i(byte[] bArr) {
        return f17876a.m19304c(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static boolean m16411j(byte[] bArr, int i, int i2) {
        return f17876a.m19304c(bArr, i, i2);
    }

    /* renamed from: k */
    public static int m16410k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: l */
    public static int m16409l(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
