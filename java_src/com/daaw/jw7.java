package com.daaw;
/* loaded from: classes.dex */
public final class jw7 extends iw7 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.daaw.iw7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo18199a(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int m16409l;
        int m16410k;
        int m16410k2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            } else if (b2 < -16) {
                byte b3 = (byte) ((i >> 8) ^ (-1));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 >= i3) {
                        m16410k2 = lw7.m16410k(b2, b4);
                        return m16410k2;
                    }
                    i2 = i5;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            } else {
                byte b5 = (byte) ((i >> 8) ^ (-1));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = bArr[i2];
                    if (i6 >= i3) {
                        m16410k = lw7.m16410k(b2, b5);
                        return m16410k;
                    }
                    i2 = i6;
                    b = 0;
                } else {
                    b = i >> 16;
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i7 >= i3) {
                        m16409l = lw7.m16409l(b2, b5, b6);
                        return m16409l;
                    }
                    i2 = i7;
                    b = b6;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            byte b7 = bArr[i2];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i8 < i3) {
                        if (b7 >= -62) {
                            i2 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b7;
                } else if (b7 >= -16) {
                    if (i8 >= i3 - 2) {
                        return lw7.m16418c(bArr, i8, i3);
                    }
                    int i9 = i8 + 1;
                    byte b8 = bArr[i8];
                    if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                        int i10 = i9 + 1;
                        if (bArr[i9] <= -65) {
                            i2 = i10 + 1;
                            if (bArr[i10] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i8 >= i3 - 1) {
                    return lw7.m16418c(bArr, i8, i3);
                } else {
                    int i11 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i2 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i2 = i8;
        }
        return 0;
    }

    @Override // com.daaw.iw7
    /* renamed from: b */
    public final String mo18198b(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!hw7.m20341d(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (hw7.m20341d(b2)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (!hw7.m20341d(b3)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                        }
                    }
                } else if (hw7.m20339f(b2)) {
                    if (i5 >= i3) {
                        throw xs7.m4540d();
                    }
                    hw7.m20342c(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else if (hw7.m20340e(b2)) {
                    if (i5 >= i3 - 1) {
                        throw xs7.m4540d();
                    }
                    int i7 = i5 + 1;
                    hw7.m20343b(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else if (i5 >= i3 - 2) {
                    throw xs7.m4540d();
                } else {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    hw7.m20344a(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
