package com.daaw;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ge1 {

    /* renamed from: a */
    public final int f11099a;

    /* renamed from: b */
    public final int f11100b;

    /* renamed from: c */
    public final float f11101c;

    /* renamed from: d */
    public final float f11102d;

    /* renamed from: e */
    public final float f11103e;

    /* renamed from: f */
    public final int f11104f;

    /* renamed from: g */
    public final int f11105g;

    /* renamed from: h */
    public final int f11106h;

    /* renamed from: i */
    public final short[] f11107i;

    /* renamed from: j */
    public short[] f11108j;

    /* renamed from: k */
    public int f11109k;

    /* renamed from: l */
    public short[] f11110l;

    /* renamed from: m */
    public int f11111m;

    /* renamed from: n */
    public short[] f11112n;

    /* renamed from: o */
    public int f11113o;

    /* renamed from: p */
    public int f11114p;

    /* renamed from: q */
    public int f11115q;

    /* renamed from: r */
    public int f11116r;

    /* renamed from: s */
    public int f11117s;

    /* renamed from: t */
    public int f11118t;

    /* renamed from: u */
    public int f11119u;

    /* renamed from: v */
    public int f11120v;

    public ge1(int i, int i2, float f, float f2, int i3) {
        this.f11099a = i;
        this.f11100b = i2;
        this.f11101c = f;
        this.f11102d = f2;
        this.f11103e = i / i3;
        this.f11104f = i / 400;
        int i4 = i / 65;
        this.f11105g = i4;
        int i5 = i4 * 2;
        this.f11106h = i5;
        this.f11107i = new short[i5];
        this.f11108j = new short[i5 * i2];
        this.f11110l = new short[i5 * i2];
        this.f11112n = new short[i5 * i2];
    }

    /* renamed from: o */
    public static void m21739o(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void m21753a(float f, int i) {
        int i2;
        int i3;
        if (this.f11111m == i) {
            return;
        }
        int i4 = this.f11099a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m21740n(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f11113o;
            if (i6 >= i7 - 1) {
                m21734t(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f11114p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f11115q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f11110l = m21748f(this.f11110l, this.f11111m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f11100b;
                    if (i9 < i10) {
                        this.f11110l[(this.f11111m * i10) + i9] = m21741m(this.f11112n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f11115q++;
                this.f11111m++;
            }
            int i11 = i2 + 1;
            this.f11114p = i11;
            if (i11 == i4) {
                this.f11114p = 0;
                C2914s6.m10685f(i3 == i5);
                this.f11115q = 0;
            }
            i6++;
        }
    }

    /* renamed from: b */
    public final void m21752b(float f) {
        int m21732v;
        int i = this.f11109k;
        if (i < this.f11106h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f11116r > 0) {
                m21732v = m21751c(i2);
            } else {
                int m21747g = m21747g(this.f11108j, i2);
                int i3 = (f > 1.0d ? 1 : (f == 1.0d ? 0 : -1));
                short[] sArr = this.f11108j;
                m21732v = i3 > 0 ? m21747g + m21732v(sArr, i2, f, m21747g) : m21742l(sArr, i2, f, m21747g);
            }
            i2 += m21732v;
        } while (this.f11106h + i2 <= i);
        m21733u(i2);
    }

    /* renamed from: c */
    public final int m21751c(int i) {
        int min = Math.min(this.f11106h, this.f11116r);
        m21750d(this.f11108j, i, min);
        this.f11116r -= min;
        return min;
    }

    /* renamed from: d */
    public final void m21750d(short[] sArr, int i, int i2) {
        short[] m21748f = m21748f(this.f11110l, this.f11111m, i2);
        this.f11110l = m21748f;
        int i3 = this.f11100b;
        System.arraycopy(sArr, i * i3, m21748f, this.f11111m * i3, i3 * i2);
        this.f11111m += i2;
    }

    /* renamed from: e */
    public final void m21749e(short[] sArr, int i, int i2) {
        int i3 = this.f11106h / i2;
        int i4 = this.f11100b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f11107i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    public final short[] m21748f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f11100b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    public final int m21747g(short[] sArr, int i) {
        int i2;
        int i3 = this.f11099a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f11100b == 1 && i4 == 1) {
            i2 = m21746h(sArr, i, this.f11104f, this.f11105g);
        } else {
            m21749e(sArr, i, i4);
            int m21746h = m21746h(this.f11107i, 0, this.f11104f / i4, this.f11105g / i4);
            if (i4 != 1) {
                int i5 = m21746h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f11104f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f11105g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f11100b == 1) {
                    i2 = m21746h(sArr, i, i7, i8);
                } else {
                    m21749e(sArr, i, 1);
                    i2 = m21746h(this.f11107i, 0, i7, i8);
                }
            } else {
                i2 = m21746h;
            }
        }
        int i11 = m21738p(this.f11119u, this.f11120v) ? this.f11117s : i2;
        this.f11118t = this.f11119u;
        this.f11117s = i2;
        return i11;
    }

    /* renamed from: h */
    public final int m21746h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f11100b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f11119u = i5 / i7;
        this.f11120v = i8 / i6;
        return i7;
    }

    /* renamed from: i */
    public void m21745i() {
        this.f11109k = 0;
        this.f11111m = 0;
        this.f11113o = 0;
        this.f11114p = 0;
        this.f11115q = 0;
        this.f11116r = 0;
        this.f11117s = 0;
        this.f11118t = 0;
        this.f11119u = 0;
        this.f11120v = 0;
    }

    /* renamed from: j */
    public int m21744j() {
        return this.f11111m;
    }

    /* renamed from: k */
    public void m21743k(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f11100b, this.f11111m);
        shortBuffer.put(this.f11110l, 0, this.f11100b * min);
        int i = this.f11111m - min;
        this.f11111m = i;
        short[] sArr = this.f11110l;
        int i2 = this.f11100b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: l */
    public final int m21742l(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f11116r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] m21748f = m21748f(this.f11110l, this.f11111m, i4);
        this.f11110l = m21748f;
        int i5 = this.f11100b;
        System.arraycopy(sArr, i * i5, m21748f, this.f11111m * i5, i5 * i2);
        m21739o(i3, this.f11100b, this.f11110l, this.f11111m + i2, sArr, i + i2, sArr, i);
        this.f11111m += i4;
        return i3;
    }

    /* renamed from: m */
    public final short m21741m(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f11100b];
        int i4 = this.f11115q * i2;
        int i5 = this.f11114p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: n */
    public final void m21740n(int i) {
        int i2 = this.f11111m - i;
        short[] m21748f = m21748f(this.f11112n, this.f11113o, i2);
        this.f11112n = m21748f;
        short[] sArr = this.f11110l;
        int i3 = this.f11100b;
        System.arraycopy(sArr, i * i3, m21748f, this.f11113o * i3, i3 * i2);
        this.f11111m = i;
        this.f11113o += i2;
    }

    /* renamed from: p */
    public final boolean m21738p(int i, int i2) {
        return i != 0 && this.f11117s != 0 && i2 <= i * 3 && i * 2 > this.f11118t * 3;
    }

    /* renamed from: q */
    public final void m21737q() {
        int i = this.f11111m;
        float f = this.f11101c;
        float f2 = this.f11102d;
        float f3 = f / f2;
        float f4 = this.f11103e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m21752b(f3);
        } else {
            m21750d(this.f11108j, 0, this.f11109k);
            this.f11109k = 0;
        }
        if (f4 != 1.0f) {
            m21753a(f4, i);
        }
    }

    /* renamed from: r */
    public void m21736r() {
        int i;
        int i2 = this.f11109k;
        float f = this.f11101c;
        float f2 = this.f11102d;
        int i3 = this.f11111m + ((int) ((((i2 / (f / f2)) + this.f11113o) / (this.f11103e * f2)) + 0.5f));
        this.f11108j = m21748f(this.f11108j, i2, (this.f11106h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f11106h;
            int i5 = this.f11100b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f11108j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f11109k += i * 2;
        m21737q();
        if (this.f11111m > i3) {
            this.f11111m = i3;
        }
        this.f11109k = 0;
        this.f11116r = 0;
        this.f11113o = 0;
    }

    /* renamed from: s */
    public void m21735s(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f11100b;
        int i2 = remaining / i;
        short[] m21748f = m21748f(this.f11108j, this.f11109k, i2);
        this.f11108j = m21748f;
        shortBuffer.get(m21748f, this.f11109k * this.f11100b, ((i * i2) * 2) / 2);
        this.f11109k += i2;
        m21737q();
    }

    /* renamed from: t */
    public final void m21734t(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f11112n;
        int i2 = this.f11100b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f11113o - i) * i2);
        this.f11113o -= i;
    }

    /* renamed from: u */
    public final void m21733u(int i) {
        int i2 = this.f11109k - i;
        short[] sArr = this.f11108j;
        int i3 = this.f11100b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f11109k = i2;
    }

    /* renamed from: v */
    public final int m21732v(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f11116r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] m21748f = m21748f(this.f11110l, this.f11111m, i3);
        this.f11110l = m21748f;
        m21739o(i3, this.f11100b, m21748f, this.f11111m, sArr, i, sArr, i + i2);
        this.f11111m += i3;
        return i3;
    }
}
