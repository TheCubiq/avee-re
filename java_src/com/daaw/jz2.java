package com.daaw;
/* loaded from: classes.dex */
public final class jz2 {

    /* renamed from: a */
    public final byte[] f15533a;

    /* renamed from: b */
    public final int f15534b;

    /* renamed from: c */
    public int f15535c;

    /* renamed from: d */
    public int f15536d = 0;

    public jz2(byte[] bArr, int i, int i2) {
        this.f15533a = bArr;
        this.f15535c = i;
        this.f15534b = i2;
        m18140g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0 == 8) goto L23;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m18146a(int i) {
        int i2;
        int i3;
        int i4 = i >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = m18139h(this.f15535c + 1) ? this.f15535c + 2 : this.f15535c + 1;
            int i8 = this.f15536d;
            if (i8 != 0) {
                byte[] bArr = this.f15533a;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.f15535c] & 255) << i8);
            } else {
                i3 = this.f15533a[this.f15535c];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.f15535c = i7;
        }
        if (i > 0) {
            int i9 = this.f15536d + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = m18139h(this.f15535c + 1) ? this.f15535c + 2 : this.f15535c + 1;
            byte[] bArr2 = this.f15533a;
            int i11 = this.f15535c;
            if (i9 > 8) {
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[i11] & 255) << (i9 - 8)))) | i5;
            } else {
                i2 = (b & ((255 & bArr2[i11]) >> (8 - i9))) | i5;
            }
            this.f15535c = i10;
            i5 = i2;
            this.f15536d = i9 % 8;
        }
        m18140g();
        return i5;
    }

    /* renamed from: b */
    public final int m18145b() {
        int m18141f = m18141f();
        return (m18141f % 2 == 0 ? -1 : 1) * ((m18141f + 1) / 2);
    }

    /* renamed from: c */
    public final int m18144c() {
        return m18141f();
    }

    /* renamed from: d */
    public final void m18143d(int i) {
        int i2 = this.f15535c;
        int i3 = (i >> 3) + i2;
        this.f15535c = i3;
        int i4 = this.f15536d + (i & 7);
        this.f15536d = i4;
        if (i4 > 7) {
            this.f15535c = i3 + 1;
            this.f15536d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f15535c) {
                m18140g();
                return;
            } else if (m18139h(i2)) {
                this.f15535c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean m18142e() {
        return m18146a(1) == 1;
    }

    /* renamed from: f */
    public final int m18141f() {
        int i = 0;
        while (!m18142e()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m18146a(i) : 0);
    }

    /* renamed from: g */
    public final void m18140g() {
        int i;
        int i2;
        int i3 = this.f15535c;
        boolean z = true;
        if (i3 < 0 || (i = this.f15536d) < 0 || i >= 8 || (i3 >= (i2 = this.f15534b) && (i3 != i2 || i != 0))) {
            z = false;
        }
        az2.m26583e(z);
    }

    /* renamed from: h */
    public final boolean m18139h(int i) {
        if (i < 2 || i >= this.f15534b) {
            return false;
        }
        byte[] bArr = this.f15533a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
