package com.daaw;

import android.util.Pair;
/* loaded from: classes.dex */
public final class bz2 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair a(byte[] bArr) {
        hz2 hz2Var = new hz2(bArr, bArr.length);
        int c2 = c(hz2Var);
        int d = d(hz2Var);
        int a2 = hz2Var.a(4);
        if (c2 == 5 || c2 == 29) {
            d = d(hz2Var);
            if (c(hz2Var) == 22) {
                a2 = hz2Var.a(4);
            }
        }
        int i = c[a2];
        az2.c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    public static int c(hz2 hz2Var) {
        int a2 = hz2Var.a(5);
        return a2 == 31 ? hz2Var.a(6) + 32 : a2;
    }

    public static int d(hz2 hz2Var) {
        int a2 = hz2Var.a(4);
        if (a2 == 15) {
            return hz2Var.a(24);
        }
        az2.c(a2 < 13);
        return b[a2];
    }
}
