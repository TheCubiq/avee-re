package com.daaw;
/* loaded from: classes.dex */
public final class sv0 {

    /* renamed from: a */
    public byte[] f26661a;

    /* renamed from: b */
    public int f26662b;

    /* renamed from: c */
    public int f26663c;

    /* renamed from: d */
    public int f26664d;

    public sv0(byte[] bArr, int i, int i2) {
        m9828i(bArr, i, i2);
    }

    /* renamed from: a */
    public final void m9836a() {
        int i;
        int i2 = this.f26663c;
        C2914s6.m10685f(i2 >= 0 && (i2 < (i = this.f26662b) || (i2 == i && this.f26664d == 0)));
    }

    /* renamed from: b */
    public boolean m9835b(int i) {
        int i2 = this.f26663c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f26664d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f26662b) {
                break;
            } else if (m9827j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f26662b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m9834c() {
        int i = this.f26663c;
        int i2 = this.f26664d;
        int i3 = 0;
        while (this.f26663c < this.f26662b && !m9833d()) {
            i3++;
        }
        boolean z = this.f26663c == this.f26662b;
        this.f26663c = i;
        this.f26664d = i2;
        return !z && m9835b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m9833d() {
        boolean z = (this.f26661a[this.f26663c] & (128 >> this.f26664d)) != 0;
        m9826k();
        return z;
    }

    /* renamed from: e */
    public int m9832e(int i) {
        int i2;
        this.f26664d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f26664d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f26664d = i4;
            byte[] bArr = this.f26661a;
            int i5 = this.f26663c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m9827j(i5 + 1)) {
                r3 = 1;
            }
            this.f26663c = i5 + r3;
        }
        byte[] bArr2 = this.f26661a;
        int i6 = this.f26663c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f26664d = 0;
            this.f26663c = i6 + (m9827j(i6 + 1) ? 2 : 1);
        }
        m9836a();
        return i7;
    }

    /* renamed from: f */
    public final int m9831f() {
        int i = 0;
        while (!m9833d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m9832e(i) : 0);
    }

    /* renamed from: g */
    public int m9830g() {
        int m9831f = m9831f();
        return (m9831f % 2 == 0 ? -1 : 1) * ((m9831f + 1) / 2);
    }

    /* renamed from: h */
    public int m9829h() {
        return m9831f();
    }

    /* renamed from: i */
    public void m9828i(byte[] bArr, int i, int i2) {
        this.f26661a = bArr;
        this.f26663c = i;
        this.f26662b = i2;
        this.f26664d = 0;
        m9836a();
    }

    /* renamed from: j */
    public final boolean m9827j(int i) {
        if (2 <= i && i < this.f26662b) {
            byte[] bArr = this.f26661a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m9826k() {
        int i = this.f26664d + 1;
        this.f26664d = i;
        if (i == 8) {
            this.f26664d = 0;
            int i2 = this.f26663c;
            this.f26663c = i2 + (m9827j(i2 + 1) ? 2 : 1);
        }
        m9836a();
    }

    /* renamed from: l */
    public void m9825l(int i) {
        int i2 = this.f26663c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f26663c = i4;
        int i5 = this.f26664d + (i - (i3 * 8));
        this.f26664d = i5;
        if (i5 > 7) {
            this.f26663c = i4 + 1;
            this.f26664d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f26663c) {
                m9836a();
                return;
            } else if (m9827j(i2)) {
                this.f26663c++;
                i2 += 2;
            }
        }
    }
}
