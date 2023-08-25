package com.daaw;
/* loaded from: classes.dex */
public final class e42 {
    public byte[] a;
    public int b;
    public int c;
    public int d = 0;

    public e42(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        h();
    }

    public final int a(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = this.a;
            int i5 = this.c;
            i3 |= (bArr[i5] & 255) << i4;
            if (true != i(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (true != i(i6 + 1) ? 1 : 2);
        }
        h();
        return i7;
    }

    public final int b() {
        int g = g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    public final int c() {
        return g();
    }

    public final void d() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (true == i(i2 + 1) ? 2 : 1);
        }
        h();
    }

    public final void e(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                h();
                return;
            } else if (i(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean f() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        d();
        return z;
    }

    public final int g() {
        int i = 0;
        while (!f()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final void h() {
        int i;
        int i2 = this.c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.b) && (i2 != i || this.d != 0))) {
            z = false;
        }
        uo4.f(z);
    }

    public final boolean i(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
