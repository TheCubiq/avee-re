package com.daaw;
/* loaded from: classes.dex */
public final class qv0 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public qv0() {
    }

    public qv0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public qv0(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a() {
        int i;
        int i2 = this.b;
        s6.f(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }

    public int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        a();
    }

    public int d() {
        s6.f(this.c == 0);
        return this.b;
    }

    public int e() {
        return (this.b * 8) + this.c;
    }

    public void f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.c, i2);
        int i3 = this.c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.a;
        int i5 = this.b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        o(i2);
        a();
    }

    public boolean g() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        n();
        return z;
    }

    public int h(int i) {
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
        a();
        return i7;
    }

    public void i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.c;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.a;
            int i10 = this.b;
            this.b = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.c = i8 - 8;
        }
        int i11 = this.c + i7;
        this.c = i11;
        byte[] bArr4 = this.a;
        int i12 = this.b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.c = 0;
            this.b = i12 + 1;
        }
        a();
    }

    public void j(byte[] bArr, int i, int i2) {
        s6.f(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
        a();
    }

    public void k(byte[] bArr) {
        l(bArr, bArr.length);
    }

    public void l(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public void m(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void n() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public void o(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public void p(int i) {
        s6.f(this.c == 0);
        this.b += i;
        a();
    }
}
