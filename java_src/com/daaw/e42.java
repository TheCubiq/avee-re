package com.daaw;
/* loaded from: classes.dex */
public final class e42 {

    /* renamed from: a */
    public byte[] f8113a;

    /* renamed from: b */
    public int f8114b;

    /* renamed from: c */
    public int f8115c;

    /* renamed from: d */
    public int f8116d = 0;

    public e42(byte[] bArr, int i, int i2) {
        this.f8113a = bArr;
        this.f8115c = i;
        this.f8114b = i2;
        m23720h();
    }

    /* renamed from: a */
    public final int m23727a(int i) {
        int i2;
        this.f8116d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f8116d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f8116d = i4;
            byte[] bArr = this.f8113a;
            int i5 = this.f8115c;
            i3 |= (bArr[i5] & 255) << i4;
            if (true != m23719i(i5 + 1)) {
                r3 = 1;
            }
            this.f8115c = i5 + r3;
        }
        byte[] bArr2 = this.f8113a;
        int i6 = this.f8115c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f8116d = 0;
            this.f8115c = i6 + (true != m23719i(i6 + 1) ? 1 : 2);
        }
        m23720h();
        return i7;
    }

    /* renamed from: b */
    public final int m23726b() {
        int m23721g = m23721g();
        return (m23721g % 2 == 0 ? -1 : 1) * ((m23721g + 1) / 2);
    }

    /* renamed from: c */
    public final int m23725c() {
        return m23721g();
    }

    /* renamed from: d */
    public final void m23724d() {
        int i = this.f8116d + 1;
        this.f8116d = i;
        if (i == 8) {
            this.f8116d = 0;
            int i2 = this.f8115c;
            this.f8115c = i2 + (true == m23719i(i2 + 1) ? 2 : 1);
        }
        m23720h();
    }

    /* renamed from: e */
    public final void m23723e(int i) {
        int i2 = this.f8115c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f8115c = i4;
        int i5 = this.f8116d + (i - (i3 * 8));
        this.f8116d = i5;
        if (i5 > 7) {
            this.f8115c = i4 + 1;
            this.f8116d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f8115c) {
                m23720h();
                return;
            } else if (m23719i(i2)) {
                this.f8115c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean m23722f() {
        boolean z = (this.f8113a[this.f8115c] & (128 >> this.f8116d)) != 0;
        m23724d();
        return z;
    }

    /* renamed from: g */
    public final int m23721g() {
        int i = 0;
        while (!m23722f()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m23727a(i) : 0);
    }

    /* renamed from: h */
    public final void m23720h() {
        int i;
        int i2 = this.f8115c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f8114b) && (i2 != i || this.f8116d != 0))) {
            z = false;
        }
        uo4.m7872f(z);
    }

    /* renamed from: i */
    public final boolean m23719i(int i) {
        if (i < 2 || i >= this.f8114b) {
            return false;
        }
        byte[] bArr = this.f8113a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
