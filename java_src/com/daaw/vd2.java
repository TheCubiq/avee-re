package com.daaw;
/* loaded from: classes.dex */
public final class vd2 {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(ik5 ik5Var, int i, int i2) {
        ik5Var.f(i);
        if (ik5Var.i() < 5) {
            return -9223372036854775807L;
        }
        int m = ik5Var.m();
        if ((8388608 & m) == 0 && ((m >> 8) & 8191) == i2 && (m & 32) != 0 && ik5Var.s() >= 7 && ik5Var.i() >= 7 && (ik5Var.s() & 16) == 16) {
            byte[] bArr = new byte[6];
            ik5Var.b(bArr, 0, 6);
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            long j = bArr[3] & 255;
            return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
