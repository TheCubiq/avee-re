package com.daaw;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ur2 {

    /* renamed from: a */
    public final int f29464a;

    /* renamed from: b */
    public final int f29465b;

    /* renamed from: c */
    public final int f29466c;

    /* renamed from: d */
    public final int f29467d;

    /* renamed from: e */
    public final int f29468e;

    /* renamed from: f */
    public final short[] f29469f;

    /* renamed from: g */
    public int f29470g;

    /* renamed from: h */
    public short[] f29471h;

    /* renamed from: i */
    public int f29472i;

    /* renamed from: j */
    public short[] f29473j;

    /* renamed from: k */
    public int f29474k;

    /* renamed from: l */
    public short[] f29475l;

    /* renamed from: q */
    public int f29480q;

    /* renamed from: r */
    public int f29481r;

    /* renamed from: s */
    public int f29482s;

    /* renamed from: t */
    public int f29483t;

    /* renamed from: v */
    public int f29485v;

    /* renamed from: w */
    public int f29486w;

    /* renamed from: x */
    public int f29487x;

    /* renamed from: m */
    public int f29476m = 0;

    /* renamed from: n */
    public int f29477n = 0;

    /* renamed from: u */
    public int f29484u = 0;

    /* renamed from: o */
    public float f29478o = 1.0f;

    /* renamed from: p */
    public float f29479p = 1.0f;

    public ur2(int i, int i2) {
        this.f29464a = i;
        this.f29465b = i2;
        this.f29466c = i / 400;
        int i3 = i / 65;
        this.f29467d = i3;
        int i4 = i3 + i3;
        this.f29468e = i4;
        this.f29469f = new short[i4];
        this.f29470g = i4;
        int i5 = i2 * i4;
        this.f29471h = new short[i5];
        this.f29472i = i4;
        this.f29473j = new short[i5];
        this.f29474k = i4;
        this.f29475l = new short[i5];
    }

    /* renamed from: l */
    public static void m7782l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final int m7793a() {
        return this.f29481r;
    }

    /* renamed from: b */
    public final void m7792b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f29465b, this.f29481r);
        shortBuffer.put(this.f29473j, 0, this.f29465b * min);
        int i = this.f29481r - min;
        this.f29481r = i;
        short[] sArr = this.f29473j;
        int i2 = this.f29465b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void m7791c() {
        int i;
        int i2 = this.f29480q;
        float f = this.f29478o;
        float f2 = this.f29479p;
        int i3 = this.f29481r + ((int) ((((i2 / (f / f2)) + this.f29482s) / f2) + 0.5f));
        int i4 = this.f29468e;
        m7784j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f29468e;
            i = i6 + i6;
            int i7 = this.f29465b;
            if (i5 >= i * i7) {
                break;
            }
            this.f29471h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f29480q += i;
        m7781m();
        if (this.f29481r > i3) {
            this.f29481r = i3;
        }
        this.f29480q = 0;
        this.f29483t = 0;
        this.f29482s = 0;
    }

    /* renamed from: d */
    public final void m7790d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f29465b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m7784j(i2);
        shortBuffer.get(this.f29471h, this.f29480q * this.f29465b, (i3 + i3) / 2);
        this.f29480q += i2;
        m7781m();
    }

    /* renamed from: e */
    public final void m7789e(float f) {
        this.f29479p = f;
    }

    /* renamed from: f */
    public final void m7788f(float f) {
        this.f29478o = f;
    }

    /* renamed from: g */
    public final int m7787g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f29465b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
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
        this.f29486w = i5 / i7;
        this.f29487x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    public final void m7786h(short[] sArr, int i, int i2) {
        m7783k(i2);
        int i3 = this.f29465b;
        System.arraycopy(sArr, i * i3, this.f29473j, this.f29481r * i3, i3 * i2);
        this.f29481r += i2;
    }

    /* renamed from: i */
    public final void m7785i(short[] sArr, int i, int i2) {
        int i3 = this.f29468e / i2;
        int i4 = this.f29465b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f29469f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    public final void m7784j(int i) {
        int i2 = this.f29480q;
        int i3 = this.f29470g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f29470g = i4;
            this.f29471h = Arrays.copyOf(this.f29471h, i4 * this.f29465b);
        }
    }

    /* renamed from: k */
    public final void m7783k(int i) {
        int i2 = this.f29481r;
        int i3 = this.f29472i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f29472i = i4;
            this.f29473j = Arrays.copyOf(this.f29473j, i4 * this.f29465b);
        }
    }

    /* renamed from: m */
    public final void m7781m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f29481r;
        float f = this.f29478o / this.f29479p;
        double d = f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f29480q;
            if (i11 >= this.f29468e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f29483t;
                    if (i13 > 0) {
                        int min = Math.min(this.f29468e, i13);
                        m7786h(this.f29471h, i12, min);
                        this.f29483t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f29471h;
                        int i14 = this.f29464a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f29465b == i10 && i15 == i10) {
                            i = m7787g(sArr, i12, this.f29466c, this.f29467d);
                        } else {
                            m7785i(sArr, i12, i15);
                            int m7787g = m7787g(this.f29469f, 0, this.f29466c / i15, this.f29467d / i15);
                            if (i15 != i10) {
                                int i16 = m7787g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f29466c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f29467d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f29465b == i10) {
                                    i = m7787g(sArr, i12, i18, i19);
                                } else {
                                    m7785i(sArr, i12, i10);
                                    i = m7787g(this.f29469f, 0, i18, i19);
                                }
                            } else {
                                i = m7787g;
                            }
                        }
                        int i22 = this.f29486w;
                        int i23 = (i22 == 0 || (i4 = this.f29484u) == 0 || this.f29487x > i22 * 3 || i22 + i22 <= this.f29485v * 3) ? i : i4;
                        this.f29485v = i22;
                        this.f29484u = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f29471h;
                            if (f >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f));
                            } else {
                                this.f29483t = (int) ((i23 * (2.0f - f)) / ((-1.0f) + f));
                                i3 = i23;
                            }
                            m7783k(i3);
                            int i24 = i3;
                            m7782l(i3, this.f29465b, this.f29473j, this.f29481r, sArr2, i12, sArr2, i12 + i23);
                            this.f29481r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f29471h;
                            if (f < 0.5f) {
                                i2 = (int) ((i25 * f) / (1.0f - f));
                            } else {
                                this.f29483t = (int) ((i25 * ((f + f) - 1.0f)) / (1.0f - f));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            m7783k(i26);
                            int i27 = this.f29465b;
                            System.arraycopy(sArr3, i12 * i27, this.f29473j, this.f29481r * i27, i27 * i25);
                            m7782l(i2, this.f29465b, this.f29473j, this.f29481r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f29481r += i26;
                            i12 += i2;
                        }
                    }
                    if (this.f29468e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f29480q - i12;
                short[] sArr4 = this.f29471h;
                int i29 = this.f29465b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f29480q = i28;
            }
        } else {
            m7786h(this.f29471h, 0, this.f29480q);
            this.f29480q = 0;
        }
        float f2 = this.f29479p;
        if (f2 == 1.0f || this.f29481r == i9) {
            return;
        }
        int i30 = this.f29464a;
        int i31 = (int) (i30 / f2);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.f29481r - i9;
        int i33 = this.f29482s;
        int i34 = this.f29474k;
        if (i33 + i32 > i34) {
            int i35 = i34 + (i34 / 2) + i32;
            this.f29474k = i35;
            this.f29475l = Arrays.copyOf(this.f29475l, i35 * this.f29465b);
        }
        short[] sArr5 = this.f29473j;
        int i36 = this.f29465b;
        System.arraycopy(sArr5, i9 * i36, this.f29475l, this.f29482s * i36, i36 * i32);
        this.f29481r = i9;
        this.f29482s += i32;
        int i37 = 0;
        while (true) {
            i5 = this.f29482s;
            i6 = i5 - 1;
            if (i37 >= i6) {
                break;
            }
            while (true) {
                i7 = this.f29476m + 1;
                i8 = this.f29477n;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                m7783k(1);
                int i38 = 0;
                while (true) {
                    int i39 = this.f29465b;
                    if (i38 < i39) {
                        short[] sArr6 = this.f29473j;
                        int i40 = this.f29481r;
                        short[] sArr7 = this.f29475l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f29477n;
                        int i43 = this.f29476m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                }
                this.f29477n++;
                this.f29481r++;
            }
            this.f29476m = i7;
            if (i7 == i30) {
                this.f29476m = 0;
                az2.m26583e(i8 == i31);
                this.f29477n = 0;
            }
            i37++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.f29475l;
            int i47 = this.f29465b;
            System.arraycopy(sArr8, i6 * i47, sArr8, 0, (i5 - i6) * i47);
            this.f29482s -= i6;
        }
    }
}
