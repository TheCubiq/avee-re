package com.daaw;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class yp7 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i;
            copyOf[31] = (byte) (i | 64);
            int i2 = so7.b;
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i3 = 0; i3 < 7; i3++) {
                    byte[][] bArr3 = so7.a;
                    if (MessageDigest.isEqual(bArr3[i3], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(op7.a(bArr3[i3])));
                    }
                }
                long[] k = np7.k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(k, 0, jArr2, 0, 10);
                int i4 = 0;
                for (int i5 = 32; i4 < i5; i5 = 32) {
                    int i6 = copyOf[(32 - i4) - 1] & 255;
                    int i7 = 0;
                    while (i7 < 8) {
                        int i8 = (i6 >> (7 - i7)) & 1;
                        so7.a(jArr4, jArr2, i8);
                        so7.a(jArr5, jArr3, i8);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i9 = i6;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i10 = i4;
                        long[] jArr13 = new long[19];
                        int i11 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        np7.i(jArr4, jArr4, jArr5);
                        np7.h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        np7.i(jArr2, jArr2, jArr3);
                        np7.h(jArr3, copyOf4, jArr3);
                        np7.b(jArr14, jArr2, jArr5);
                        np7.b(jArr15, jArr4, jArr3);
                        np7.e(jArr14);
                        np7.d(jArr14);
                        np7.e(jArr15);
                        np7.d(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        np7.i(jArr14, jArr14, jArr15);
                        np7.h(jArr15, copyOf4, jArr15);
                        np7.g(jArr18, jArr14);
                        np7.g(jArr17, jArr15);
                        np7.b(jArr15, jArr17, k);
                        np7.e(jArr15);
                        np7.d(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        np7.g(jArr12, jArr4);
                        np7.g(jArr13, jArr5);
                        np7.b(jArr8, jArr12, jArr13);
                        np7.e(jArr8);
                        np7.d(jArr8);
                        np7.h(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        np7.f(jArr10, jArr13, 121665L);
                        np7.d(jArr10);
                        np7.i(jArr10, jArr10, jArr12);
                        np7.b(jArr16, jArr13, jArr10);
                        np7.e(jArr16);
                        np7.d(jArr16);
                        so7.a(jArr8, jArr6, i8);
                        so7.a(jArr16, jArr7, i8);
                        i7 = i11 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i6 = i9;
                        jArr = jArr11;
                        i4 = i10;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i4++;
                    copyOf = copyOf;
                }
                long[] jArr22 = jArr;
                long[] jArr23 = new long[10];
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = jArr2;
                long[] jArr34 = new long[10];
                np7.g(jArr24, jArr5);
                np7.g(jArr34, jArr24);
                np7.g(jArr32, jArr34);
                np7.a(jArr25, jArr32, jArr5);
                np7.a(jArr26, jArr25, jArr24);
                np7.g(jArr32, jArr26);
                np7.a(jArr27, jArr32, jArr25);
                np7.g(jArr32, jArr27);
                np7.g(jArr34, jArr32);
                np7.g(jArr32, jArr34);
                np7.g(jArr34, jArr32);
                np7.g(jArr32, jArr34);
                np7.a(jArr28, jArr32, jArr27);
                np7.g(jArr32, jArr28);
                np7.g(jArr34, jArr32);
                for (int i12 = 2; i12 < 10; i12 += 2) {
                    np7.g(jArr32, jArr34);
                    np7.g(jArr34, jArr32);
                }
                np7.a(jArr29, jArr34, jArr28);
                np7.g(jArr32, jArr29);
                np7.g(jArr34, jArr32);
                for (int i13 = 2; i13 < 20; i13 += 2) {
                    np7.g(jArr32, jArr34);
                    np7.g(jArr34, jArr32);
                }
                np7.a(jArr32, jArr34, jArr29);
                np7.g(jArr34, jArr32);
                np7.g(jArr32, jArr34);
                for (int i14 = 2; i14 < 10; i14 += 2) {
                    np7.g(jArr34, jArr32);
                    np7.g(jArr32, jArr34);
                }
                np7.a(jArr30, jArr32, jArr28);
                np7.g(jArr32, jArr30);
                np7.g(jArr34, jArr32);
                for (int i15 = 2; i15 < 50; i15 += 2) {
                    np7.g(jArr32, jArr34);
                    np7.g(jArr34, jArr32);
                }
                np7.a(jArr31, jArr34, jArr30);
                np7.g(jArr34, jArr31);
                np7.g(jArr32, jArr34);
                for (int i16 = 2; i16 < 100; i16 += 2) {
                    np7.g(jArr34, jArr32);
                    np7.g(jArr32, jArr34);
                }
                np7.a(jArr34, jArr32, jArr31);
                np7.g(jArr32, jArr34);
                np7.g(jArr34, jArr32);
                for (int i17 = 2; i17 < 50; i17 += 2) {
                    np7.g(jArr32, jArr34);
                    np7.g(jArr34, jArr32);
                }
                np7.a(jArr32, jArr34, jArr30);
                np7.g(jArr34, jArr32);
                np7.g(jArr32, jArr34);
                np7.g(jArr34, jArr32);
                np7.g(jArr32, jArr34);
                np7.g(jArr34, jArr32);
                np7.a(jArr23, jArr34, jArr26);
                np7.a(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                np7.a(jArr35, k, jArr22);
                np7.i(jArr36, k, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                np7.i(jArr38, jArr36, jArr40);
                np7.a(jArr38, jArr38, jArr3);
                np7.i(jArr38, jArr38, jArr33);
                np7.a(jArr38, jArr38, jArr35);
                np7.a(jArr38, jArr38, jArr33);
                np7.f(jArr37, jArr38, 4L);
                np7.d(jArr37);
                np7.a(jArr38, jArr35, jArr3);
                np7.h(jArr38, jArr38, jArr3);
                np7.a(jArr39, jArr36, jArr33);
                np7.i(jArr38, jArr38, jArr39);
                np7.g(jArr38, jArr38);
                if (MessageDigest.isEqual(np7.j(jArr37), np7.j(jArr38))) {
                    return np7.j(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(op7.a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] b() {
        byte[] a = vp7.a(32);
        a[0] = (byte) (a[0] | 7);
        int i = a[31] & 63;
        a[31] = (byte) i;
        a[31] = (byte) (i | 128);
        return a;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
