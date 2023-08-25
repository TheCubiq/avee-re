package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ub7 {
    /* renamed from: a */
    public static byte[] m8347a(byte[] bArr, byte[] bArr2) {
        long m8346b = m8346b(bArr, 0, 0);
        long m8346b2 = m8346b(bArr, 3, 2) & 67108611;
        long m8346b3 = m8346b(bArr, 6, 4) & 67092735;
        long m8346b4 = m8346b(bArr, 9, 6) & 66076671;
        long m8346b5 = m8346b(bArr, 12, 8) & 1048575;
        long j = m8346b2 * 5;
        long j2 = m8346b3 * 5;
        long j3 = m8346b4 * 5;
        long j4 = m8346b5 * 5;
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
                long m8345c = (((j17 & j24) | (j19 & 67108863 & j25) | (j26 << 26)) & 4294967295L) + m8345c(bArr, 16);
                long m8345c2 = (((j26 >> 6) | (j27 << 20)) & 4294967295L) + m8345c(bArr, 20) + (m8345c >> 32);
                long m8345c3 = (((j27 >> 12) | (j28 << 14)) & 4294967295L) + m8345c(bArr, 24) + (m8345c2 >> 32);
                long m8345c4 = m8345c(bArr, 28);
                byte[] bArr4 = new byte[16];
                m8344d(bArr4, m8345c & 4294967295L, 0);
                m8344d(bArr4, m8345c2 & 4294967295L, 4);
                m8344d(bArr4, m8345c3 & 4294967295L, 8);
                m8344d(bArr4, ((((j28 >> 18) | (((j15 & j24) | (j23 & j25)) << 8)) & 4294967295L) + m8345c4 + (m8345c3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i, (byte) 0);
            }
            long m8346b6 = j9 + m8346b(bArr3, 0, 0);
            long m8346b7 = j6 + m8346b(bArr3, 3, 2);
            long m8346b8 = j5 + m8346b(bArr3, 6, 4);
            long m8346b9 = j7 + m8346b(bArr3, 9, 6);
            long m8346b10 = j8 + (m8346b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j29 = (m8346b6 * m8346b) + (m8346b7 * j4) + (m8346b8 * j3) + (m8346b9 * j2) + (m8346b10 * j);
            long j30 = (m8346b6 * m8346b2) + (m8346b7 * m8346b) + (m8346b8 * j4) + (m8346b9 * j3) + (m8346b10 * j2) + (j29 >> 26);
            long j31 = (m8346b6 * m8346b3) + (m8346b7 * m8346b2) + (m8346b8 * m8346b) + (m8346b9 * j4) + (m8346b10 * j3) + (j30 >> 26);
            long j32 = (m8346b6 * m8346b4) + (m8346b7 * m8346b3) + (m8346b8 * m8346b2) + (m8346b9 * m8346b) + (m8346b10 * j4) + (j31 >> 26);
            long j33 = (m8346b6 * m8346b5) + (m8346b7 * m8346b4) + (m8346b8 * m8346b3) + (m8346b9 * m8346b2) + (m8346b10 * m8346b) + (j32 >> 26);
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

    /* renamed from: b */
    public static long m8346b(byte[] bArr, int i, int i2) {
        return (m8345c(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: c */
    public static long m8345c(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: d */
    public static void m8344d(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
