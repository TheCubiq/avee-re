package com.daaw;
/* loaded from: classes.dex */
public final class cj5 {

    /* renamed from: a */
    public byte[] f5841a;

    /* renamed from: b */
    public int f5842b;

    /* renamed from: c */
    public int f5843c;

    /* renamed from: d */
    public int f5844d;

    public cj5() {
        this.f5841a = it5.f13996f;
    }

    public cj5(byte[] bArr, int i) {
        this.f5841a = bArr;
        this.f5844d = i;
    }

    /* renamed from: a */
    public final int m25331a() {
        return ((this.f5844d - this.f5842b) * 8) - this.f5843c;
    }

    /* renamed from: b */
    public final int m25330b() {
        return (this.f5842b * 8) + this.f5843c;
    }

    /* renamed from: c */
    public final int m25329c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f5843c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f5843c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f5843c = i4;
            byte[] bArr = this.f5841a;
            int i5 = this.f5842b;
            this.f5842b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f5841a;
        int i6 = this.f5842b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f5843c = 0;
            this.f5842b = i6 + 1;
        }
        m25319m();
        return i7;
    }

    /* renamed from: d */
    public final void m25328d() {
        if (this.f5843c == 0) {
            return;
        }
        this.f5843c = 0;
        this.f5842b++;
        m25319m();
    }

    /* renamed from: e */
    public final void m25327e(int i, int i2) {
        int i3;
        int i4 = i & 16383;
        int min = Math.min(8 - this.f5843c, 14);
        int i5 = this.f5843c;
        int i6 = (8 - i5) - min;
        byte[] bArr = this.f5841a;
        int i7 = this.f5842b;
        byte b = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr[i7]);
        bArr[i7] = b;
        int i8 = 14 - min;
        bArr[i7] = (byte) (b | ((i4 >>> i8) << i6));
        int i9 = i7 + 1;
        while (i8 > 8) {
            i8 -= 8;
            this.f5841a[i9] = (byte) (i4 >>> i8);
            i9++;
        }
        byte[] bArr2 = this.f5841a;
        byte b2 = (byte) (bArr2[i9] & ((1 << i3) - 1));
        bArr2[i9] = b2;
        bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << (8 - i8)) | b2);
        m25322j(14);
        m25319m();
    }

    /* renamed from: f */
    public final void m25326f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f5841a;
            int i5 = this.f5842b;
            int i6 = i5 + 1;
            this.f5842b = i6;
            byte b = bArr2[i5];
            int i7 = this.f5843c;
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
        int i9 = this.f5843c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f5841a;
            int i10 = this.f5842b;
            this.f5842b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.f5843c = i11;
        byte[] bArr4 = this.f5841a;
        int i12 = this.f5842b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.f5843c = 0;
            this.f5842b = i12 + 1;
        }
        m25319m();
    }

    /* renamed from: g */
    public final void m25325g(byte[] bArr, int i) {
        this.f5841a = bArr;
        this.f5842b = 0;
        this.f5843c = 0;
        this.f5844d = i;
    }

    /* renamed from: h */
    public final void m25324h(int i) {
        int i2 = i / 8;
        this.f5842b = i2;
        this.f5843c = i - (i2 * 8);
        m25319m();
    }

    /* renamed from: i */
    public final void m25323i() {
        int i = this.f5843c + 1;
        this.f5843c = i;
        if (i == 8) {
            this.f5843c = 0;
            this.f5842b++;
        }
        m25319m();
    }

    /* renamed from: j */
    public final void m25322j(int i) {
        int i2 = i / 8;
        int i3 = this.f5842b + i2;
        this.f5842b = i3;
        int i4 = this.f5843c + (i - (i2 * 8));
        this.f5843c = i4;
        if (i4 > 7) {
            this.f5842b = i3 + 1;
            this.f5843c = i4 - 8;
        }
        m25319m();
    }

    /* renamed from: k */
    public final void m25321k(int i) {
        uo4.m7872f(this.f5843c == 0);
        this.f5842b += i;
        m25319m();
    }

    /* renamed from: l */
    public final boolean m25320l() {
        boolean z = (this.f5841a[this.f5842b] & (128 >> this.f5843c)) != 0;
        m25323i();
        return z;
    }

    /* renamed from: m */
    public final void m25319m() {
        int i;
        int i2 = this.f5842b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f5844d) && (i2 != i || this.f5843c != 0))) {
            z = false;
        }
        uo4.m7872f(z);
    }
}
