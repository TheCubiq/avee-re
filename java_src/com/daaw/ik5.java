package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ik5 {
    public byte[] a;
    public int b;
    public int c;

    public ik5() {
        this.a = it5.f;
    }

    public ik5(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public ik5(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public ik5(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final long A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    public final long B() {
        long z = z();
        if (z >= 0) {
            return z;
        }
        throw new IllegalStateException("Top bit not zero: " + z);
    }

    public final long C() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b & 63);
        }
        this.b += i;
        return j;
    }

    public final String D(char c) {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 != 0) {
            while (i2 < this.c && this.a[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.a;
            int i3 = this.b;
            String j = it5.j(bArr, i3, i2 - i3);
            this.b = i2;
            if (i2 < this.c) {
                this.b = i2 + 1;
            }
            return j;
        }
        return null;
    }

    public final String E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String j = it5.j(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return j;
    }

    public final String F(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final short G() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final void H(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void a(cj5 cj5Var, int i) {
        b(cj5Var.a, 0, i);
        cj5Var.h(0);
    }

    public final void b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        d(bArr, i);
    }

    public final void d(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        uo4.d(z);
        this.c = i;
    }

    public final void f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        uo4.d(z);
        this.b = i;
    }

    public final void g(int i) {
        f(this.b + i);
    }

    public final byte[] h() {
        return this.a;
    }

    public final int i() {
        return this.c - this.b;
    }

    public final int j() {
        return this.a.length;
    }

    public final int k() {
        return this.b;
    }

    public final int l() {
        return this.c;
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final int p() {
        int o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException("Top bit not zero: " + o);
    }

    public final int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int r() {
        return (s() << 21) | (s() << 14) | (s() << 7) | s();
    }

    public final int s() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int t() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    public final int v() {
        int m = m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final long x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    public final long y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final long z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i8] & 255);
    }
}
