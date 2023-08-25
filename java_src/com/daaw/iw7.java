package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class iw7 {
    public static final String d(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!hw7.d(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (hw7.d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    i = i6;
                    while (true) {
                        i5 = i7;
                        if (i < i3) {
                            byte b3 = byteBuffer.get(i);
                            if (!hw7.d(b3)) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    }
                } else if (hw7.f(b2)) {
                    if (i6 >= i3) {
                        throw xs7.d();
                    }
                    hw7.c(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (hw7.e(b2)) {
                    if (i6 >= i3 - 1) {
                        throw xs7.d();
                    }
                    int i8 = i6 + 1;
                    hw7.b(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw xs7.d();
                } else {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    hw7.a(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    i = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public abstract int a(int i, byte[] bArr, int i2, int i3);

    public abstract String b(byte[] bArr, int i, int i2);

    public final boolean c(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }
}
