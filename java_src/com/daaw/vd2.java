package com.daaw;
/* loaded from: classes.dex */
public final class vd2 {
    /* renamed from: a */
    public static int m7244a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m7243b(ik5 ik5Var, int i, int i2) {
        ik5Var.m19716f(i);
        if (ik5Var.m19713i() < 5) {
            return -9223372036854775807L;
        }
        int m19709m = ik5Var.m19709m();
        if ((8388608 & m19709m) == 0 && ((m19709m >> 8) & 8191) == i2 && (m19709m & 32) != 0 && ik5Var.m19703s() >= 7 && ik5Var.m19713i() >= 7 && (ik5Var.m19703s() & 16) == 16) {
            byte[] bArr = new byte[6];
            ik5Var.m19720b(bArr, 0, 6);
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            long j = bArr[3] & 255;
            return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
