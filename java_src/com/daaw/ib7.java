package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
/* loaded from: classes.dex */
public final class ib7 {

    /* renamed from: a */
    public static final int[] f13440a = m19982d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public static void m19985a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* renamed from: b */
    public static void m19984b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f13440a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: c */
    public static void m19983c(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m19985a(iArr, 0, 4, 8, 12);
            m19985a(iArr, 1, 5, 9, 13);
            m19985a(iArr, 2, 6, 10, 14);
            m19985a(iArr, 3, 7, 11, 15);
            m19985a(iArr, 0, 5, 10, 15);
            m19985a(iArr, 1, 6, 11, 12);
            m19985a(iArr, 2, 7, 8, 13);
            m19985a(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: d */
    public static int[] m19982d(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
