package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class iw7 {
    /* renamed from: d */
    public static final String m19303d(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!hw7.m20341d(b)) {
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
                if (hw7.m20341d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    i = i6;
                    while (true) {
                        i5 = i7;
                        if (i < i3) {
                            byte b3 = byteBuffer.get(i);
                            if (!hw7.m20341d(b3)) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    }
                } else if (hw7.m20339f(b2)) {
                    if (i6 >= i3) {
                        throw xs7.m4540d();
                    }
                    hw7.m20342c(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (hw7.m20340e(b2)) {
                    if (i6 >= i3 - 1) {
                        throw xs7.m4540d();
                    }
                    int i8 = i6 + 1;
                    hw7.m20343b(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw xs7.m4540d();
                } else {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    hw7.m20344a(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    i = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public abstract int mo18199a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    public abstract String mo18198b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final boolean m19304c(byte[] bArr, int i, int i2) {
        return mo18199a(0, bArr, i, i2) == 0;
    }
}
