package com.daaw;
/* loaded from: classes.dex */
public final class hw7 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m20344a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m20338g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m20338g(b3) || m20338g(b4)) {
            throw xs7.m4540d();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m20343b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m20338g(b2)) {
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
            if (!m20338g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw xs7.m4540d();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m20342c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m20338g(b2)) {
            throw xs7.m4540d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m20341d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ boolean m20340e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ boolean m20339f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    public static boolean m20338g(byte b) {
        return b > -65;
    }
}
