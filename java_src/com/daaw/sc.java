package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class sc {
    public long a;
    public int b;
    public int c;
    public long d;
    public int e;
    public short[] f = new short[0];

    public sc() {
        f();
        a(0L);
    }

    public void a(long j) {
        this.d = this.a - hr1.e(j, this.b);
    }

    public void b(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, byte[][] bArr) {
        byte[] bArr2 = bArr[0];
        this.a = j;
        this.b = i;
        this.c = i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        long a = hr1.a(i3, i2, i4);
        int i5 = ((int) a) * i2;
        this.e = i5;
        short[] sArr = this.f;
        if (sArr.length < i5 || sArr.length > i5 * 2) {
            this.f = new short[i5];
        }
        if (bArr2.length < i3 || bArr2.length > i3 * 2) {
            bArr2 = new byte[i3];
        }
        byteBuffer.get(bArr2, 0, i3);
        if (i3 % i2 != 0) {
            lz1.c("tmpBuffDataLength mismatch");
        }
        int i6 = i4 / 8;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            i7 += i6;
            try {
                this.f[i8] = (short) (((bArr2[i7 - 1] & 255) << 8) | (bArr2[i7 - 2] & 255));
                i8++;
            } catch (Exception e) {
                String.format("Oh, well: %d, %s", Integer.valueOf(i6), e.getLocalizedMessage());
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        a(a);
        bArr[0] = bArr2;
    }

    public void c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, byte[][] bArr) {
        b(byteBuffer, j, i, i2, byteBuffer.limit() - byteBuffer.position(), i3, bArr);
    }

    public int d(short[] sArr, int i, int i2, int i3, short[] sArr2, float[] fArr, long[] jArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.c == 1) {
            if (i == 1) {
                i4 = i2;
                while (this.c * i3 < this.e && (i10 = i4 * i) < sArr.length) {
                    sArr[i10] = this.f[i3];
                    if (sArr2[0] > sArr[i10]) {
                        sArr2[0] = sArr[i10];
                    }
                    if (sArr2[1] < sArr[i10]) {
                        sArr2[1] = sArr[i10];
                    }
                    fArr[0] = fArr[0] + (sArr[i10] * sArr[i10]);
                    i3++;
                    i4++;
                }
            } else {
                if (i == 2) {
                    i4 = i2;
                    while (this.c * i3 < this.e && (i9 = (i8 = i4 * i) + 1) < sArr.length) {
                        short[] sArr3 = this.f;
                        sArr[i8] = sArr3[i3];
                        sArr[i9] = sArr3[i3];
                        if (sArr2[0] > sArr[i8]) {
                            sArr2[0] = sArr[i8];
                        }
                        if (sArr2[1] < sArr[i8]) {
                            sArr2[1] = sArr[i8];
                        }
                        fArr[0] = fArr[0] + (sArr[i8] * sArr[i8]);
                        i3++;
                        i4++;
                    }
                }
                i4 = i2;
            }
        } else if (i == 1) {
            i4 = i2;
            while (true) {
                int i11 = this.c;
                if ((i3 * i11) + 1 >= this.e || (i7 = i4 * i) >= sArr.length) {
                    break;
                }
                short[] sArr4 = this.f;
                sArr[i7] = (short) ((sArr4[i3 * i11] + sArr4[(i11 * i3) + 1]) / 2);
                if (sArr2[0] > sArr[i7]) {
                    sArr2[0] = sArr[i7];
                }
                if (sArr2[1] < sArr[i7]) {
                    sArr2[1] = sArr[i7];
                }
                fArr[0] = fArr[0] + (sArr[i7] * sArr[i7]);
                i3++;
                i4++;
            }
        } else {
            if (i == 2) {
                i4 = i2;
                while (true) {
                    int i12 = this.c;
                    if ((i3 * i12) + 1 >= this.e || (i6 = (i5 = i4 * i) + 1) >= sArr.length) {
                        break;
                    }
                    short[] sArr5 = this.f;
                    sArr[i5] = sArr5[i3 * i12];
                    sArr[i6] = sArr5[(i12 * i3) + 1];
                    if (sArr2[0] > sArr[i5]) {
                        sArr2[0] = sArr[i5];
                    }
                    if (sArr2[1] < sArr[i5]) {
                        sArr2[1] = sArr[i5];
                    }
                    fArr[0] = fArr[0] + (sArr[i5] * sArr[i5]);
                    i3++;
                    i4++;
                }
            }
            i4 = i2;
        }
        jArr[0] = i3 * this.c >= this.e - 1 ? this.a : -1L;
        return i4 - i2;
    }

    public boolean e() {
        return this.e < 1;
    }

    public void f() {
        this.b = 1;
        this.c = 1;
        this.e = 0;
        this.a = Long.MIN_VALUE;
        this.d = Long.MIN_VALUE;
    }
}
