package com.daaw;
/* loaded from: classes.dex */
public final class hz2 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public hz2(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i >> 3;
        boolean z = false;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.c;
            if (i9 != 0) {
                byte[] bArr = this.a;
                int i10 = this.b;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.a[this.b];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.b++;
        }
        if (i > 0) {
            int i11 = this.c + i;
            byte b = (byte) (255 >> (8 - i));
            byte[] bArr2 = this.a;
            int i12 = this.b;
            if (i11 > 8) {
                int i13 = i12 + 1;
                i4 = (b & (((255 & bArr2[i13]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.b = i13;
            } else {
                i4 = (b & ((255 & bArr2[i12]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.b = i12 + 1;
                }
            }
            i7 = i4;
            this.c = i11 % 8;
        }
        int i14 = this.b;
        if (i14 >= 0 && (i2 = this.c) >= 0 && (i14 < (i3 = this.d) || (i14 == i3 && i2 == 0))) {
            z = true;
        }
        az2.e(z);
        return i7;
    }
}
