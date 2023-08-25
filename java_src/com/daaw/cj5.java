package com.daaw;
/* loaded from: classes.dex */
public final class cj5 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public cj5() {
        this.a = it5.f;
    }

    public cj5(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int b() {
        return (this.b * 8) + this.c;
    }

    public final int c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        m();
        return i7;
    }

    public final void d() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        m();
    }

    public final void e(int i, int i2) {
        int i3;
        int i4 = i & 16383;
        int min = Math.min(8 - this.c, 14);
        int i5 = this.c;
        int i6 = (8 - i5) - min;
        byte[] bArr = this.a;
        int i7 = this.b;
        byte b = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr[i7]);
        bArr[i7] = b;
        int i8 = 14 - min;
        bArr[i7] = (byte) (b | ((i4 >>> i8) << i6));
        int i9 = i7 + 1;
        while (i8 > 8) {
            i8 -= 8;
            this.a[i9] = (byte) (i4 >>> i8);
            i9++;
        }
        byte[] bArr2 = this.a;
        byte b2 = (byte) (bArr2[i9] & ((1 << i3) - 1));
        bArr2[i9] = b2;
        bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << (8 - i8)) | b2);
        j(14);
        m();
    }

    public final void f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            byte b = bArr2[i5];
            int i7 = this.c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.a;
            int i10 = this.b;
            this.b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.c = i11;
        byte[] bArr4 = this.a;
        int i12 = this.b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.c = 0;
            this.b = i12 + 1;
        }
        m();
    }

    public final void g(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final void h(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        m();
    }

    public final void i() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        m();
    }

    public final void j(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        m();
    }

    public final void k(int i) {
        uo4.f(this.c == 0);
        this.b += i;
        m();
    }

    public final boolean l() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        i();
        return z;
    }

    public final void m() {
        int i;
        int i2 = this.b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.d) && (i2 != i || this.c != 0))) {
            z = false;
        }
        uo4.f(z);
    }
}
