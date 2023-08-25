package com.daaw;
/* loaded from: classes.dex */
public final class pu1 {
    public static final pu1 k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = od.c;
        double h = od.h(50.0f);
        Double.isNaN(h);
        k = k(fArr, (float) ((h * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public pu1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }

    public static pu1 k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = od.a;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f7) >= 0.9d ? od.d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : od.d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        double d3 = f;
        Double.isNaN(d3);
        float cbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(d3 * 5.0d)));
        float h = od.h(f2) / fArr[1];
        double d4 = h;
        float sqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d4, 0.2d));
        double d5 = fArr3[0] * cbrt * f4;
        Double.isNaN(d5);
        double d6 = fArr3[1] * cbrt * f5;
        Double.isNaN(d6);
        double d7 = fArr3[2] * cbrt * f6;
        Double.isNaN(d7);
        float[] fArr4 = {(float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d), (float) Math.pow(d7 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new pu1(h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.c;
    }

    public float[] i() {
        return this.g;
    }

    public float j() {
        return this.j;
    }
}
