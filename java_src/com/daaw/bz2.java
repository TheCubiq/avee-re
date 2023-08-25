package com.daaw;

import android.util.Pair;
/* loaded from: classes.dex */
public final class bz2 {

    /* renamed from: a */
    public static final byte[] f5294a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f5295b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    public static final int[] f5296c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair m25719a(byte[] bArr) {
        hz2 hz2Var = new hz2(bArr, bArr.length);
        int m25717c = m25717c(hz2Var);
        int m25716d = m25716d(hz2Var);
        int m20320a = hz2Var.m20320a(4);
        if (m25717c == 5 || m25717c == 29) {
            m25716d = m25716d(hz2Var);
            if (m25717c(hz2Var) == 22) {
                m20320a = hz2Var.m20320a(4);
            }
        }
        int i = f5296c[m20320a];
        az2.m26585c(i != -1);
        return Pair.create(Integer.valueOf(m25716d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m25718b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f5294a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    public static int m25717c(hz2 hz2Var) {
        int m20320a = hz2Var.m20320a(5);
        return m20320a == 31 ? hz2Var.m20320a(6) + 32 : m20320a;
    }

    /* renamed from: d */
    public static int m25716d(hz2 hz2Var) {
        int m20320a = hz2Var.m20320a(4);
        if (m20320a == 15) {
            return hz2Var.m20320a(24);
        }
        az2.m26585c(m20320a < 13);
        return f5295b[m20320a];
    }
}
