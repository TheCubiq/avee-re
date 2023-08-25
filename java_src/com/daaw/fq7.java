package com.daaw;
/* loaded from: classes.dex */
public final class fq7 {

    /* renamed from: a */
    public final byte[] f9798a = new byte[256];

    /* renamed from: b */
    public int f9799b;

    /* renamed from: c */
    public int f9800c;

    public fq7(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f9798a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f9798a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.f9799b = 0;
        this.f9800c = 0;
    }

    /* renamed from: a */
    public final void m22399a(byte[] bArr) {
        int i = this.f9799b;
        int i2 = this.f9800c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f9798a;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f9799b = i;
        this.f9800c = i2;
    }
}
