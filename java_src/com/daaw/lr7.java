package com.daaw;
/* loaded from: classes.dex */
public abstract class lr7 extends qr7 {
    public final byte[] d;
    public final int e;
    public int f;
    public int g;

    public lr7(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.d = bArr;
        this.e = bArr.length;
    }

    public final void I(byte b) {
        byte[] bArr = this.d;
        int i = this.f;
        this.f = i + 1;
        bArr[i] = b;
        this.g++;
    }

    public final void J(int i) {
        byte[] bArr = this.d;
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.g += 4;
    }

    public final void K(long j) {
        byte[] bArr = this.d;
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.g += 8;
    }

    public final void L(int i) {
        boolean z;
        z = qr7.c;
        if (!z) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.g++;
                i >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) i;
            this.g++;
            return;
        }
        long j = this.f;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            gw7.y(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.d;
        int i5 = this.f;
        this.f = i5 + 1;
        gw7.y(bArr4, i5, (byte) i);
        this.g += (int) (this.f - j);
    }

    public final void M(long j) {
        boolean z;
        z = qr7.c;
        if (!z) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.g++;
                j >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr2[i2] = (byte) j;
            this.g++;
            return;
        }
        long j2 = this.f;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            gw7.y(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        gw7.y(bArr4, i4, (byte) j);
        this.g += (int) (this.f - j2);
    }

    @Override // com.daaw.qr7
    public final int q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
