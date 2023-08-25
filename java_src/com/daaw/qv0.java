package com.daaw;
/* loaded from: classes.dex */
public final class qv0 {

    /* renamed from: a */
    public byte[] f24432a;

    /* renamed from: b */
    public int f24433b;

    /* renamed from: c */
    public int f24434c;

    /* renamed from: d */
    public int f24435d;

    public qv0() {
    }

    public qv0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public qv0(byte[] bArr, int i) {
        this.f24432a = bArr;
        this.f24435d = i;
    }

    /* renamed from: a */
    public final void m12132a() {
        int i;
        int i2 = this.f24433b;
        C2914s6.m10685f(i2 >= 0 && (i2 < (i = this.f24435d) || (i2 == i && this.f24434c == 0)));
    }

    /* renamed from: b */
    public int m12131b() {
        return ((this.f24435d - this.f24433b) * 8) - this.f24434c;
    }

    /* renamed from: c */
    public void m12130c() {
        if (this.f24434c == 0) {
            return;
        }
        this.f24434c = 0;
        this.f24433b++;
        m12132a();
    }

    /* renamed from: d */
    public int m12129d() {
        C2914s6.m10685f(this.f24434c == 0);
        return this.f24433b;
    }

    /* renamed from: e */
    public int m12128e() {
        return (this.f24433b * 8) + this.f24434c;
    }

    /* renamed from: f */
    public void m12127f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f24434c, i2);
        int i3 = this.f24434c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f24432a;
        int i5 = this.f24433b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f24432a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f24432a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        m12118o(i2);
        m12132a();
    }

    /* renamed from: g */
    public boolean m12126g() {
        boolean z = (this.f24432a[this.f24433b] & (128 >> this.f24434c)) != 0;
        m12119n();
        return z;
    }

    /* renamed from: h */
    public int m12125h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f24434c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f24434c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f24434c = i4;
            byte[] bArr = this.f24432a;
            int i5 = this.f24433b;
            this.f24433b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f24432a;
        int i6 = this.f24433b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f24434c = 0;
            this.f24433b = i6 + 1;
        }
        m12132a();
        return i7;
    }

    /* renamed from: i */
    public void m12124i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f24432a;
            int i4 = this.f24433b;
            int i5 = i4 + 1;
            this.f24433b = i5;
            byte b = bArr2[i4];
            int i6 = this.f24434c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.f24434c;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.f24432a;
            int i10 = this.f24433b;
            this.f24433b = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.f24434c = i8 - 8;
        }
        int i11 = this.f24434c + i7;
        this.f24434c = i11;
        byte[] bArr4 = this.f24432a;
        int i12 = this.f24433b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.f24434c = 0;
            this.f24433b = i12 + 1;
        }
        m12132a();
    }

    /* renamed from: j */
    public void m12123j(byte[] bArr, int i, int i2) {
        C2914s6.m10685f(this.f24434c == 0);
        System.arraycopy(this.f24432a, this.f24433b, bArr, i, i2);
        this.f24433b += i2;
        m12132a();
    }

    /* renamed from: k */
    public void m12122k(byte[] bArr) {
        m12121l(bArr, bArr.length);
    }

    /* renamed from: l */
    public void m12121l(byte[] bArr, int i) {
        this.f24432a = bArr;
        this.f24433b = 0;
        this.f24434c = 0;
        this.f24435d = i;
    }

    /* renamed from: m */
    public void m12120m(int i) {
        int i2 = i / 8;
        this.f24433b = i2;
        this.f24434c = i - (i2 * 8);
        m12132a();
    }

    /* renamed from: n */
    public void m12119n() {
        int i = this.f24434c + 1;
        this.f24434c = i;
        if (i == 8) {
            this.f24434c = 0;
            this.f24433b++;
        }
        m12132a();
    }

    /* renamed from: o */
    public void m12118o(int i) {
        int i2 = i / 8;
        int i3 = this.f24433b + i2;
        this.f24433b = i3;
        int i4 = this.f24434c + (i - (i2 * 8));
        this.f24434c = i4;
        if (i4 > 7) {
            this.f24433b = i3 + 1;
            this.f24434c = i4 - 8;
        }
        m12132a();
    }

    /* renamed from: p */
    public void m12117p(int i) {
        C2914s6.m10685f(this.f24434c == 0);
        this.f24433b += i;
        m12132a();
    }
}
