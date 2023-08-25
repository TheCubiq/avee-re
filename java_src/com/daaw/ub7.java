package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ub7 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b = b(bArr, 0, 0);
        long b2 = b(bArr, 3, 2) & 67108611;
        long b3 = b(bArr, 6, 4) & 67092735;
        long b4 = b(bArr, 9, 6) & 66076671;
        long b5 = b(bArr, 12, 8) & 1048575;
        long j = b2 * 5;
        long j2 = b3 * 5;
        long j3 = b4 * 5;
        long j4 = b5 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j10 = j5 + (j6 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j7 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j9 + ((j14 >> 26) * 5);
                long j17 = j16 & 67108863;
                long j18 = (j6 & 67108863) + (j16 >> 26);
                long j19 = j17 + 5;
                long j20 = (j19 >> 26) + j18;
                long j21 = j11 + (j20 >> 26);
                long j22 = j13 + (j21 >> 26);
                long j23 = (j15 + (j22 >> 26)) - 67108864;
                long j24 = j23 >> 63;
                long j25 = j24 ^ (-1);
                long j26 = (j18 & j24) | (j20 & 67108863 & j25);
                long j27 = (j11 & j24) | (j21 & 67108863 & j25);
                long j28 = (j13 & j24) | (j22 & 67108863 & j25);
                long c = (((j17 & j24) | (j19 & 67108863 & j25) | (j26 << 26)) & 4294967295L) + c(bArr, 16);
                long c2 = (((j26 >> 6) | (j27 << 20)) & 4294967295L) + c(bArr, 20) + (c >> 32);
                long c3 = (((j27 >> 12) | (j28 << 14)) & 4294967295L) + c(bArr, 24) + (c2 >> 32);
                long c4 = c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c & 4294967295L, 0);
                d(bArr4, c2 & 4294967295L, 4);
                d(bArr4, c3 & 4294967295L, 8);
                d(bArr4, ((((j28 >> 18) | (((j15 & j24) | (j23 & j25)) << 8)) & 4294967295L) + c4 + (c3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i, (byte) 0);
            }
            long b6 = j9 + b(bArr3, 0, 0);
            long b7 = j6 + b(bArr3, 3, 2);
            long b8 = j5 + b(bArr3, 6, 4);
            long b9 = j7 + b(bArr3, 9, 6);
            long b10 = j8 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j29 = (b6 * b) + (b7 * j4) + (b8 * j3) + (b9 * j2) + (b10 * j);
            long j30 = (b6 * b2) + (b7 * b) + (b8 * j4) + (b9 * j3) + (b10 * j2) + (j29 >> 26);
            long j31 = (b6 * b3) + (b7 * b2) + (b8 * b) + (b9 * j4) + (b10 * j3) + (j30 >> 26);
            long j32 = (b6 * b4) + (b7 * b3) + (b8 * b2) + (b9 * b) + (b10 * j4) + (j31 >> 26);
            long j33 = (b6 * b5) + (b7 * b4) + (b8 * b3) + (b9 * b2) + (b10 * b) + (j32 >> 26);
            j8 = j33 & 67108863;
            long j34 = (j29 & 67108863) + ((j33 >> 26) * 5);
            j9 = j34 & 67108863;
            j6 = (j30 & 67108863) + (j34 >> 26);
            i2 += 16;
            j7 = j32 & 67108863;
            j5 = j31 & 67108863;
            i = 17;
        }
    }

    public static long b(byte[] bArr, int i, int i2) {
        return (c(bArr, i) >> i2) & 67108863;
    }

    public static long c(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void d(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
