package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public class ri0 {
    public int a;
    public int b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public int p;
    public int q;
    public int r;
    public int v;
    public int h = 12;
    public int j = 4096;
    public int[] k = new int[5003];
    public int[] l = new int[5003];
    public int m = 5003;
    public int n = 0;
    public boolean o = false;
    public int s = 0;
    public int t = 0;
    public int[] u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public byte[] w = new byte[256];

    public ri0(int i, int i2, byte[] bArr, int i3) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = Math.max(2, i3);
    }

    public final int a(int i) {
        return (1 << i) - 1;
    }

    public void b(byte b, OutputStream outputStream) {
        byte[] bArr = this.w;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        bArr[i] = b;
        if (i2 >= 254) {
            g(outputStream);
        }
    }

    public void c(OutputStream outputStream) {
        d(this.m);
        int i = this.q;
        this.n = i + 2;
        this.o = true;
        i(i, outputStream);
    }

    public void d(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = -1;
        }
    }

    public void e(int i, OutputStream outputStream) {
        int[] iArr;
        this.p = i;
        int i2 = 0;
        this.o = false;
        this.g = i;
        this.i = a(i);
        int i3 = 1 << (i - 1);
        this.q = i3;
        this.r = i3 + 1;
        this.n = i3 + 2;
        this.v = 0;
        int h = h();
        for (int i4 = this.m; i4 < 65536; i4 *= 2) {
            i2++;
        }
        int i5 = 8 - i2;
        int i6 = this.m;
        d(i6);
        i(this.q, outputStream);
        while (true) {
            int h2 = h();
            if (h2 == -1) {
                i(h, outputStream);
                i(this.r, outputStream);
                return;
            }
            int i7 = (h2 << this.h) + h;
            int i8 = (h2 << i5) ^ h;
            int[] iArr2 = this.k;
            if (iArr2[i8] == i7) {
                h = this.l[i8];
            } else {
                if (iArr2[i8] >= 0) {
                    int i9 = i6 - i8;
                    if (i8 == 0) {
                        i9 = 1;
                    }
                    do {
                        i8 -= i9;
                        if (i8 < 0) {
                            i8 += i6;
                        }
                        iArr = this.k;
                        if (iArr[i8] == i7) {
                            h = this.l[i8];
                            break;
                        }
                    } while (iArr[i8] >= 0);
                }
                i(h, outputStream);
                int i10 = this.n;
                if (i10 < this.j) {
                    int[] iArr3 = this.l;
                    this.n = i10 + 1;
                    iArr3[i8] = i10;
                    this.k[i8] = i7;
                } else {
                    c(outputStream);
                }
                h = h2;
            }
        }
    }

    public void f(OutputStream outputStream) {
        outputStream.write(this.d);
        this.e = this.a * this.b;
        this.f = 0;
        e(this.d + 1, outputStream);
        outputStream.write(0);
    }

    public void g(OutputStream outputStream) {
        int i = this.v;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.w, 0, this.v);
            this.v = 0;
        }
    }

    public final int h() {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        this.e = i - 1;
        byte[] bArr = this.c;
        int i2 = this.f;
        this.f = i2 + 1;
        return bArr[i2] & 255;
    }

    public void i(int i, OutputStream outputStream) {
        int i2 = this.s;
        int[] iArr = this.u;
        int i3 = this.t;
        int i4 = i2 & iArr[i3];
        this.s = i4;
        if (i3 > 0) {
            this.s = i4 | (i << i3);
        } else {
            this.s = i;
        }
        this.t = i3 + this.g;
        while (this.t >= 8) {
            b((byte) (this.s & 255), outputStream);
            this.s >>= 8;
            this.t -= 8;
        }
        if (this.n > this.i || this.o) {
            if (this.o) {
                int i5 = this.p;
                this.g = i5;
                this.i = a(i5);
                this.o = false;
            } else {
                int i6 = this.g + 1;
                this.g = i6;
                this.i = i6 == this.h ? this.j : a(i6);
            }
        }
        if (i == this.r) {
            while (this.t > 0) {
                b((byte) (this.s & 255), outputStream);
                this.s >>= 8;
                this.t -= 8;
            }
            g(outputStream);
        }
    }
}
