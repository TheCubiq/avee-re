package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public class ri0 {

    /* renamed from: a */
    public int f25311a;

    /* renamed from: b */
    public int f25312b;

    /* renamed from: c */
    public byte[] f25313c;

    /* renamed from: d */
    public int f25314d;

    /* renamed from: e */
    public int f25315e;

    /* renamed from: f */
    public int f25316f;

    /* renamed from: g */
    public int f25317g;

    /* renamed from: i */
    public int f25319i;

    /* renamed from: p */
    public int f25326p;

    /* renamed from: q */
    public int f25327q;

    /* renamed from: r */
    public int f25328r;

    /* renamed from: v */
    public int f25332v;

    /* renamed from: h */
    public int f25318h = 12;

    /* renamed from: j */
    public int f25320j = 4096;

    /* renamed from: k */
    public int[] f25321k = new int[5003];

    /* renamed from: l */
    public int[] f25322l = new int[5003];

    /* renamed from: m */
    public int f25323m = 5003;

    /* renamed from: n */
    public int f25324n = 0;

    /* renamed from: o */
    public boolean f25325o = false;

    /* renamed from: s */
    public int f25329s = 0;

    /* renamed from: t */
    public int f25330t = 0;

    /* renamed from: u */
    public int[] f25331u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: w */
    public byte[] f25333w = new byte[256];

    public ri0(int i, int i2, byte[] bArr, int i3) {
        this.f25311a = i;
        this.f25312b = i2;
        this.f25313c = bArr;
        this.f25314d = Math.max(2, i3);
    }

    /* renamed from: a */
    public final int m11296a(int i) {
        return (1 << i) - 1;
    }

    /* renamed from: b */
    public void m11295b(byte b, OutputStream outputStream) {
        byte[] bArr = this.f25333w;
        int i = this.f25332v;
        int i2 = i + 1;
        this.f25332v = i2;
        bArr[i] = b;
        if (i2 >= 254) {
            m11290g(outputStream);
        }
    }

    /* renamed from: c */
    public void m11294c(OutputStream outputStream) {
        m11293d(this.f25323m);
        int i = this.f25327q;
        this.f25324n = i + 2;
        this.f25325o = true;
        m11288i(i, outputStream);
    }

    /* renamed from: d */
    public void m11293d(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f25321k[i2] = -1;
        }
    }

    /* renamed from: e */
    public void m11292e(int i, OutputStream outputStream) {
        int[] iArr;
        this.f25326p = i;
        int i2 = 0;
        this.f25325o = false;
        this.f25317g = i;
        this.f25319i = m11296a(i);
        int i3 = 1 << (i - 1);
        this.f25327q = i3;
        this.f25328r = i3 + 1;
        this.f25324n = i3 + 2;
        this.f25332v = 0;
        int m11289h = m11289h();
        for (int i4 = this.f25323m; i4 < 65536; i4 *= 2) {
            i2++;
        }
        int i5 = 8 - i2;
        int i6 = this.f25323m;
        m11293d(i6);
        m11288i(this.f25327q, outputStream);
        while (true) {
            int m11289h2 = m11289h();
            if (m11289h2 == -1) {
                m11288i(m11289h, outputStream);
                m11288i(this.f25328r, outputStream);
                return;
            }
            int i7 = (m11289h2 << this.f25318h) + m11289h;
            int i8 = (m11289h2 << i5) ^ m11289h;
            int[] iArr2 = this.f25321k;
            if (iArr2[i8] == i7) {
                m11289h = this.f25322l[i8];
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
                        iArr = this.f25321k;
                        if (iArr[i8] == i7) {
                            m11289h = this.f25322l[i8];
                            break;
                        }
                    } while (iArr[i8] >= 0);
                }
                m11288i(m11289h, outputStream);
                int i10 = this.f25324n;
                if (i10 < this.f25320j) {
                    int[] iArr3 = this.f25322l;
                    this.f25324n = i10 + 1;
                    iArr3[i8] = i10;
                    this.f25321k[i8] = i7;
                } else {
                    m11294c(outputStream);
                }
                m11289h = m11289h2;
            }
        }
    }

    /* renamed from: f */
    public void m11291f(OutputStream outputStream) {
        outputStream.write(this.f25314d);
        this.f25315e = this.f25311a * this.f25312b;
        this.f25316f = 0;
        m11292e(this.f25314d + 1, outputStream);
        outputStream.write(0);
    }

    /* renamed from: g */
    public void m11290g(OutputStream outputStream) {
        int i = this.f25332v;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.f25333w, 0, this.f25332v);
            this.f25332v = 0;
        }
    }

    /* renamed from: h */
    public final int m11289h() {
        int i = this.f25315e;
        if (i == 0) {
            return -1;
        }
        this.f25315e = i - 1;
        byte[] bArr = this.f25313c;
        int i2 = this.f25316f;
        this.f25316f = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: i */
    public void m11288i(int i, OutputStream outputStream) {
        int i2 = this.f25329s;
        int[] iArr = this.f25331u;
        int i3 = this.f25330t;
        int i4 = i2 & iArr[i3];
        this.f25329s = i4;
        if (i3 > 0) {
            this.f25329s = i4 | (i << i3);
        } else {
            this.f25329s = i;
        }
        this.f25330t = i3 + this.f25317g;
        while (this.f25330t >= 8) {
            m11295b((byte) (this.f25329s & 255), outputStream);
            this.f25329s >>= 8;
            this.f25330t -= 8;
        }
        if (this.f25324n > this.f25319i || this.f25325o) {
            if (this.f25325o) {
                int i5 = this.f25326p;
                this.f25317g = i5;
                this.f25319i = m11296a(i5);
                this.f25325o = false;
            } else {
                int i6 = this.f25317g + 1;
                this.f25317g = i6;
                this.f25319i = i6 == this.f25318h ? this.f25320j : m11296a(i6);
            }
        }
        if (i == this.f25328r) {
            while (this.f25330t > 0) {
                m11295b((byte) (this.f25329s & 255), outputStream);
                this.f25329s >>= 8;
                this.f25330t -= 8;
            }
            m11290g(outputStream);
        }
    }
}
