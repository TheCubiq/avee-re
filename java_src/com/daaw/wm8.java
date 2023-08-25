package com.daaw;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class wm8 {

    /* renamed from: a */
    public final int f31349a;

    /* renamed from: b */
    public final int f31350b;

    /* renamed from: c */
    public final float f31351c;

    /* renamed from: d */
    public final float f31352d;

    /* renamed from: e */
    public final float f31353e;

    /* renamed from: f */
    public final int f31354f;

    /* renamed from: g */
    public final int f31355g;

    /* renamed from: h */
    public final int f31356h;

    /* renamed from: i */
    public final short[] f31357i;

    /* renamed from: j */
    public short[] f31358j;

    /* renamed from: k */
    public int f31359k;

    /* renamed from: l */
    public short[] f31360l;

    /* renamed from: m */
    public int f31361m;

    /* renamed from: n */
    public short[] f31362n;

    /* renamed from: o */
    public int f31363o;

    /* renamed from: p */
    public int f31364p;

    /* renamed from: q */
    public int f31365q;

    /* renamed from: r */
    public int f31366r;

    /* renamed from: s */
    public int f31367s;

    /* renamed from: t */
    public int f31368t;

    /* renamed from: u */
    public int f31369u;

    /* renamed from: v */
    public int f31370v;

    public wm8(int i, int i2, float f, float f2, int i3) {
        this.f31349a = i;
        this.f31350b = i2;
        this.f31351c = f;
        this.f31352d = f2;
        this.f31353e = i / i3;
        this.f31354f = i / 400;
        int i4 = i / 65;
        this.f31355g = i4;
        int i5 = i4 + i4;
        this.f31356h = i5;
        this.f31357i = new short[i5];
        int i6 = i5 * i2;
        this.f31358j = new short[i6];
        this.f31360l = new short[i6];
        this.f31362n = new short[i6];
    }

    /* renamed from: j */
    public static void m5960j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final int m5969a() {
        int i = this.f31361m * this.f31350b;
        return i + i;
    }

    /* renamed from: b */
    public final int m5968b() {
        int i = this.f31359k * this.f31350b;
        return i + i;
    }

    /* renamed from: c */
    public final void m5967c() {
        this.f31359k = 0;
        this.f31361m = 0;
        this.f31363o = 0;
        this.f31364p = 0;
        this.f31365q = 0;
        this.f31366r = 0;
        this.f31367s = 0;
        this.f31368t = 0;
        this.f31369u = 0;
        this.f31370v = 0;
    }

    /* renamed from: d */
    public final void m5966d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f31350b, this.f31361m);
        shortBuffer.put(this.f31360l, 0, this.f31350b * min);
        int i = this.f31361m - min;
        this.f31361m = i;
        short[] sArr = this.f31360l;
        int i2 = this.f31350b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: e */
    public final void m5965e() {
        int i;
        int i2 = this.f31359k;
        float f = this.f31351c;
        float f2 = this.f31352d;
        int i3 = this.f31361m + ((int) ((((i2 / (f / f2)) + this.f31363o) / (this.f31353e * f2)) + 0.5f));
        short[] sArr = this.f31358j;
        int i4 = this.f31356h;
        this.f31358j = m5958l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f31356h;
            i = i6 + i6;
            int i7 = this.f31350b;
            if (i5 >= i * i7) {
                break;
            }
            this.f31358j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f31359k += i;
        m5959k();
        if (this.f31361m > i3) {
            this.f31361m = i3;
        }
        this.f31359k = 0;
        this.f31366r = 0;
        this.f31363o = 0;
    }

    /* renamed from: f */
    public final void m5964f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f31350b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] m5958l = m5958l(this.f31358j, this.f31359k, i2);
        this.f31358j = m5958l;
        shortBuffer.get(m5958l, this.f31359k * this.f31350b, (i3 + i3) / 2);
        this.f31359k += i2;
        m5959k();
    }

    /* renamed from: g */
    public final int m5963g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f31350b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f31369u = i5 / i7;
        this.f31370v = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    public final void m5962h(short[] sArr, int i, int i2) {
        short[] m5958l = m5958l(this.f31360l, this.f31361m, i2);
        this.f31360l = m5958l;
        int i3 = this.f31350b;
        System.arraycopy(sArr, i * i3, m5958l, this.f31361m * i3, i3 * i2);
        this.f31361m += i2;
    }

    /* renamed from: i */
    public final void m5961i(short[] sArr, int i, int i2) {
        int i3 = this.f31356h / i2;
        int i4 = this.f31350b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f31357i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: k */
    public final void m5959k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f31361m;
        float f = this.f31351c;
        float f2 = this.f31352d;
        float f3 = f / f2;
        float f4 = this.f31353e * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f31359k;
            if (i11 >= this.f31356h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f31366r;
                    if (i13 > 0) {
                        int min = Math.min(this.f31356h, i13);
                        m5962h(this.f31358j, i12, min);
                        this.f31366r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f31358j;
                        int i14 = this.f31349a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f31350b == i10 && i15 == i10) {
                            i = m5963g(sArr, i12, this.f31354f, this.f31355g);
                        } else {
                            m5961i(sArr, i12, i15);
                            int m5963g = m5963g(this.f31357i, 0, this.f31354f / i15, this.f31355g / i15);
                            if (i15 != i10) {
                                int i16 = m5963g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f31354f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f31355g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f31350b == i10) {
                                    i = m5963g(sArr, i12, i18, i19);
                                } else {
                                    m5961i(sArr, i12, i10);
                                    i = m5963g(this.f31357i, 0, i18, i19);
                                }
                            } else {
                                i = m5963g;
                            }
                        }
                        int i22 = this.f31369u;
                        int i23 = (i22 == 0 || (i4 = this.f31367s) == 0 || this.f31370v > i22 * 3 || i22 + i22 <= this.f31368t * 3) ? i : i4;
                        this.f31368t = i22;
                        this.f31367s = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f31358j;
                            if (f3 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f3));
                            } else {
                                this.f31366r = (int) ((i23 * (2.0f - f3)) / ((-1.0f) + f3));
                                i3 = i23;
                            }
                            short[] m5958l = m5958l(this.f31360l, this.f31361m, i3);
                            this.f31360l = m5958l;
                            int i24 = i3;
                            m5960j(i3, this.f31350b, m5958l, this.f31361m, sArr2, i12, sArr2, i12 + i23);
                            this.f31361m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f31358j;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i25 * f3) / (f5 - f3));
                            } else {
                                this.f31366r = (int) ((i25 * ((f3 + f3) - 1.0f)) / (f5 - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] m5958l2 = m5958l(this.f31360l, this.f31361m, i26);
                            this.f31360l = m5958l2;
                            int i27 = this.f31350b;
                            System.arraycopy(sArr3, i12 * i27, m5958l2, this.f31361m * i27, i27 * i25);
                            m5960j(i2, this.f31350b, this.f31360l, this.f31361m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.f31361m += i26;
                            i12 += i2;
                        }
                    }
                    if (this.f31356h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f31359k - i12;
                short[] sArr4 = this.f31358j;
                int i29 = this.f31350b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f31359k = i28;
                f5 = 1.0f;
            }
        } else {
            m5962h(this.f31358j, 0, this.f31359k);
            this.f31359k = 0;
        }
        if (f4 == f5 || this.f31361m == i9) {
            return;
        }
        int i30 = this.f31349a;
        int i31 = (int) (i30 / f4);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.f31361m - i9;
        short[] m5958l3 = m5958l(this.f31362n, this.f31363o, i32);
        this.f31362n = m5958l3;
        short[] sArr5 = this.f31360l;
        int i33 = this.f31350b;
        System.arraycopy(sArr5, i9 * i33, m5958l3, this.f31363o * i33, i33 * i32);
        this.f31361m = i9;
        this.f31363o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.f31363o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.f31364p + 1;
                i8 = this.f31365q;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                this.f31360l = m5958l(this.f31360l, this.f31361m, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.f31350b;
                    if (i35 < i36) {
                        short[] sArr6 = this.f31360l;
                        int i37 = this.f31361m;
                        short[] sArr7 = this.f31362n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.f31365q;
                        int i40 = this.f31364p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr6[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                }
                this.f31365q++;
                this.f31361m++;
            }
            this.f31364p = i7;
            if (i7 == i30) {
                this.f31364p = 0;
                uo4.m7872f(i8 == i31);
                this.f31365q = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.f31362n;
            int i44 = this.f31350b;
            System.arraycopy(sArr8, i6 * i44, sArr8, 0, (i5 - i6) * i44);
            this.f31363o -= i6;
        }
    }

    /* renamed from: l */
    public final short[] m5958l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f31350b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
