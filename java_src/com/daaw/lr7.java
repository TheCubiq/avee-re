package com.daaw;
/* loaded from: classes.dex */
public abstract class lr7 extends qr7 {

    /* renamed from: d */
    public final byte[] f17666d;

    /* renamed from: e */
    public final int f17667e;

    /* renamed from: f */
    public int f17668f;

    /* renamed from: g */
    public int f17669g;

    public lr7(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f17666d = bArr;
        this.f17667e = bArr.length;
    }

    /* renamed from: I */
    public final void m16624I(byte b) {
        byte[] bArr = this.f17666d;
        int i = this.f17668f;
        this.f17668f = i + 1;
        bArr[i] = b;
        this.f17669g++;
    }

    /* renamed from: J */
    public final void m16623J(int i) {
        byte[] bArr = this.f17666d;
        int i2 = this.f17668f;
        int i3 = i2 + 1;
        this.f17668f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f17668f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f17668f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f17668f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f17669g += 4;
    }

    /* renamed from: K */
    public final void m16622K(long j) {
        byte[] bArr = this.f17666d;
        int i = this.f17668f;
        int i2 = i + 1;
        this.f17668f = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.f17668f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.f17668f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.f17668f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.f17668f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f17668f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f17668f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f17668f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f17669g += 8;
    }

    /* renamed from: L */
    public final void m16621L(int i) {
        boolean z;
        z = qr7.f24291c;
        if (!z) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f17666d;
                int i2 = this.f17668f;
                this.f17668f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.f17669g++;
                i >>>= 7;
            }
            byte[] bArr2 = this.f17666d;
            int i3 = this.f17668f;
            this.f17668f = i3 + 1;
            bArr2[i3] = (byte) i;
            this.f17669g++;
            return;
        }
        long j = this.f17668f;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f17666d;
            int i4 = this.f17668f;
            this.f17668f = i4 + 1;
            gw7.m21161y(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.f17666d;
        int i5 = this.f17668f;
        this.f17668f = i5 + 1;
        gw7.m21161y(bArr4, i5, (byte) i);
        this.f17669g += (int) (this.f17668f - j);
    }

    /* renamed from: M */
    public final void m16620M(long j) {
        boolean z;
        z = qr7.f24291c;
        if (!z) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f17666d;
                int i = this.f17668f;
                this.f17668f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.f17669g++;
                j >>>= 7;
            }
            byte[] bArr2 = this.f17666d;
            int i2 = this.f17668f;
            this.f17668f = i2 + 1;
            bArr2[i2] = (byte) j;
            this.f17669g++;
            return;
        }
        long j2 = this.f17668f;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f17666d;
            int i3 = this.f17668f;
            this.f17668f = i3 + 1;
            gw7.m21161y(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f17666d;
        int i4 = this.f17668f;
        this.f17668f = i4 + 1;
        gw7.m21161y(bArr4, i4, (byte) j);
        this.f17669g += (int) (this.f17668f - j2);
    }

    @Override // com.daaw.qr7
    /* renamed from: q */
    public final int mo12245q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
