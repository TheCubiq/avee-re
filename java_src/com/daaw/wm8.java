package com.daaw;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class wm8 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public wm8(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    public final int a() {
        int i = this.m * this.b;
        return i + i;
    }

    public final int b() {
        int i = this.k * this.b;
        return i + i;
    }

    public final void c() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        int i = this.m - min;
        this.m = i;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void e() {
        int i;
        int i2 = this.k;
        float f = this.c;
        float f2 = this.d;
        int i3 = this.m + ((int) ((((i2 / (f / f2)) + this.o) / (this.e * f2)) + 0.5f));
        short[] sArr = this.j;
        int i4 = this.h;
        this.j = l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.h;
            i = i6 + i6;
            int i7 = this.b;
            if (i5 >= i * i7) {
                break;
            }
            this.j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.k += i;
        k();
        if (this.m > i3) {
            this.m = i3;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = l(this.j, this.k, i2);
        this.j = l;
        shortBuffer.get(l, this.k * this.b, (i3 + i3) / 2);
        this.k += i2;
        k();
    }

    public final int g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
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
        this.u = i5 / i7;
        this.v = i8 / i6;
        return i7;
    }

    public final void h(short[] sArr, int i, int i2) {
        short[] l = l(this.l, this.m, i2);
        this.l = l;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, l, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void i(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final void k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.k;
            if (i11 >= this.h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.r;
                    if (i13 > 0) {
                        int min = Math.min(this.h, i13);
                        h(this.j, i12, min);
                        this.r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.j;
                        int i14 = this.a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.b == i10 && i15 == i10) {
                            i = g(sArr, i12, this.f, this.g);
                        } else {
                            i(sArr, i12, i15);
                            int g = g(this.i, 0, this.f / i15, this.g / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.b == i10) {
                                    i = g(sArr, i12, i18, i19);
                                } else {
                                    i(sArr, i12, i10);
                                    i = g(this.i, 0, i18, i19);
                                }
                            } else {
                                i = g;
                            }
                        }
                        int i22 = this.u;
                        int i23 = (i22 == 0 || (i4 = this.s) == 0 || this.v > i22 * 3 || i22 + i22 <= this.t * 3) ? i : i4;
                        this.t = i22;
                        this.s = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.j;
                            if (f3 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f3));
                            } else {
                                this.r = (int) ((i23 * (2.0f - f3)) / ((-1.0f) + f3));
                                i3 = i23;
                            }
                            short[] l = l(this.l, this.m, i3);
                            this.l = l;
                            int i24 = i3;
                            j(i3, this.b, l, this.m, sArr2, i12, sArr2, i12 + i23);
                            this.m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.j;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i25 * f3) / (f5 - f3));
                            } else {
                                this.r = (int) ((i25 * ((f3 + f3) - 1.0f)) / (f5 - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] l2 = l(this.l, this.m, i26);
                            this.l = l2;
                            int i27 = this.b;
                            System.arraycopy(sArr3, i12 * i27, l2, this.m * i27, i27 * i25);
                            j(i2, this.b, this.l, this.m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.m += i26;
                            i12 += i2;
                        }
                    }
                    if (this.h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.k - i12;
                short[] sArr4 = this.j;
                int i29 = this.b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.k = i28;
                f5 = 1.0f;
            }
        } else {
            h(this.j, 0, this.k);
            this.k = 0;
        }
        if (f4 == f5 || this.m == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f4);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.m - i9;
        short[] l3 = l(this.n, this.o, i32);
        this.n = l3;
        short[] sArr5 = this.l;
        int i33 = this.b;
        System.arraycopy(sArr5, i9 * i33, l3, this.o * i33, i33 * i32);
        this.m = i9;
        this.o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.p + 1;
                i8 = this.q;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                this.l = l(this.l, this.m, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.b;
                    if (i35 < i36) {
                        short[] sArr6 = this.l;
                        int i37 = this.m;
                        short[] sArr7 = this.n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.q;
                        int i40 = this.p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr6[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i7;
            if (i7 == i30) {
                this.p = 0;
                uo4.f(i8 == i31);
                this.q = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.n;
            int i44 = this.b;
            System.arraycopy(sArr8, i6 * i44, sArr8, 0, (i5 - i6) * i44);
            this.o -= i6;
        }
    }

    public final short[] l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
