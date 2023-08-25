package com.daaw;
/* loaded from: classes.dex */
public final class hz2 {

    /* renamed from: a */
    public byte[] f13072a;

    /* renamed from: b */
    public int f13073b;

    /* renamed from: c */
    public int f13074c;

    /* renamed from: d */
    public int f13075d;

    public hz2(byte[] bArr, int i) {
        this.f13072a = bArr;
        this.f13075d = i;
    }

    /* renamed from: a */
    public final int m20320a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i >> 3;
        boolean z = false;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.f13074c;
            if (i9 != 0) {
                byte[] bArr = this.f13072a;
                int i10 = this.f13073b;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.f13072a[this.f13073b];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.f13073b++;
        }
        if (i > 0) {
            int i11 = this.f13074c + i;
            byte b = (byte) (255 >> (8 - i));
            byte[] bArr2 = this.f13072a;
            int i12 = this.f13073b;
            if (i11 > 8) {
                int i13 = i12 + 1;
                i4 = (b & (((255 & bArr2[i13]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.f13073b = i13;
            } else {
                i4 = (b & ((255 & bArr2[i12]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.f13073b = i12 + 1;
                }
            }
            i7 = i4;
            this.f13074c = i11 % 8;
        }
        int i14 = this.f13073b;
        if (i14 >= 0 && (i2 = this.f13074c) >= 0 && (i14 < (i3 = this.f13075d) || (i14 == i3 && i2 == 0))) {
            z = true;
        }
        az2.m26583e(z);
        return i7;
    }
}
