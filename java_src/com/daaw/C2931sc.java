package com.daaw;

import java.nio.ByteBuffer;
/* renamed from: com.daaw.sc */
/* loaded from: classes.dex */
public class C2931sc {

    /* renamed from: a */
    public long f26065a;

    /* renamed from: b */
    public int f26066b;

    /* renamed from: c */
    public int f26067c;

    /* renamed from: d */
    public long f26068d;

    /* renamed from: e */
    public int f26069e;

    /* renamed from: f */
    public short[] f26070f = new short[0];

    public C2931sc() {
        m10462f();
        m10467a(0L);
    }

    /* renamed from: a */
    public void m10467a(long j) {
        this.f26068d = this.f26065a - hr1.m20465e(j, this.f26066b);
    }

    /* renamed from: b */
    public void m10466b(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, byte[][] bArr) {
        byte[] bArr2 = bArr[0];
        this.f26065a = j;
        this.f26066b = i;
        this.f26067c = i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        long m20469a = hr1.m20469a(i3, i2, i4);
        int i5 = ((int) m20469a) * i2;
        this.f26069e = i5;
        short[] sArr = this.f26070f;
        if (sArr.length < i5 || sArr.length > i5 * 2) {
            this.f26070f = new short[i5];
        }
        if (bArr2.length < i3 || bArr2.length > i3 * 2) {
            bArr2 = new byte[i3];
        }
        byteBuffer.get(bArr2, 0, i3);
        if (i3 % i2 != 0) {
            lz1.m16363c("tmpBuffDataLength mismatch");
        }
        int i6 = i4 / 8;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            i7 += i6;
            try {
                this.f26070f[i8] = (short) (((bArr2[i7 - 1] & 255) << 8) | (bArr2[i7 - 2] & 255));
                i8++;
            } catch (Exception e) {
                String.format("Oh, well: %d, %s", Integer.valueOf(i6), e.getLocalizedMessage());
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        m10467a(m20469a);
        bArr[0] = bArr2;
    }

    /* renamed from: c */
    public void m10465c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, byte[][] bArr) {
        m10466b(byteBuffer, j, i, i2, byteBuffer.limit() - byteBuffer.position(), i3, bArr);
    }

    /* renamed from: d */
    public int m10464d(short[] sArr, int i, int i2, int i3, short[] sArr2, float[] fArr, long[] jArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f26067c == 1) {
            if (i == 1) {
                i4 = i2;
                while (this.f26067c * i3 < this.f26069e && (i10 = i4 * i) < sArr.length) {
                    sArr[i10] = this.f26070f[i3];
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
                    while (this.f26067c * i3 < this.f26069e && (i9 = (i8 = i4 * i) + 1) < sArr.length) {
                        short[] sArr3 = this.f26070f;
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
                int i11 = this.f26067c;
                if ((i3 * i11) + 1 >= this.f26069e || (i7 = i4 * i) >= sArr.length) {
                    break;
                }
                short[] sArr4 = this.f26070f;
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
                    int i12 = this.f26067c;
                    if ((i3 * i12) + 1 >= this.f26069e || (i6 = (i5 = i4 * i) + 1) >= sArr.length) {
                        break;
                    }
                    short[] sArr5 = this.f26070f;
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
        jArr[0] = i3 * this.f26067c >= this.f26069e - 1 ? this.f26065a : -1L;
        return i4 - i2;
    }

    /* renamed from: e */
    public boolean m10463e() {
        return this.f26069e < 1;
    }

    /* renamed from: f */
    public void m10462f() {
        this.f26066b = 1;
        this.f26067c = 1;
        this.f26069e = 0;
        this.f26065a = Long.MIN_VALUE;
        this.f26068d = Long.MIN_VALUE;
    }
}
