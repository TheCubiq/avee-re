package com.daaw;
/* loaded from: classes.dex */
public final class hw7 {
    public static /* bridge */ /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || g(b3) || g(b4)) {
            throw xs7.d();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static /* bridge */ /* synthetic */ void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw xs7.d();
    }

    public static /* bridge */ /* synthetic */ void c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || g(b2)) {
            throw xs7.d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean e(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean f(byte b) {
        return b < -32;
    }

    public static boolean g(byte b) {
        return b > -65;
    }
}
