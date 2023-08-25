package com.daaw;
/* loaded from: classes.dex */
public final class pu1 {

    /* renamed from: k */
    public static final pu1 f23273k;

    /* renamed from: a */
    public final float f23274a;

    /* renamed from: b */
    public final float f23275b;

    /* renamed from: c */
    public final float f23276c;

    /* renamed from: d */
    public final float f23277d;

    /* renamed from: e */
    public final float f23278e;

    /* renamed from: f */
    public final float f23279f;

    /* renamed from: g */
    public final float[] f23280g;

    /* renamed from: h */
    public final float f23281h;

    /* renamed from: i */
    public final float f23282i;

    /* renamed from: j */
    public final float f23283j;

    static {
        float[] fArr = C2431od.f21277c;
        double m14381h = C2431od.m14381h(50.0f);
        Double.isNaN(m14381h);
        f23273k = m13131k(fArr, (float) ((m14381h * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public pu1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f23279f = f;
        this.f23274a = f2;
        this.f23275b = f3;
        this.f23276c = f4;
        this.f23277d = f5;
        this.f23278e = f6;
        this.f23280g = fArr;
        this.f23281h = f7;
        this.f23282i = f8;
        this.f23283j = f9;
    }

    /* renamed from: k */
    public static pu1 m13131k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = C2431od.f21275a;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float m14385d = ((double) f7) >= 0.9d ? C2431od.m14385d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : C2431od.m14385d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        double d2 = f;
        Double.isNaN(d2);
        float cbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(d2 * 5.0d)));
        float m14381h = C2431od.m14381h(f2) / fArr[1];
        double d3 = m14381h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = fArr3[0] * cbrt * f4;
        Double.isNaN(d4);
        double d5 = fArr3[1] * cbrt * f5;
        Double.isNaN(d5);
        double d6 = fArr3[2] * cbrt * f6;
        Double.isNaN(d6);
        float[] fArr4 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new pu1(m14381h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, m14385d, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float m13141a() {
        return this.f23274a;
    }

    /* renamed from: b */
    public float m13140b() {
        return this.f23277d;
    }

    /* renamed from: c */
    public float m13139c() {
        return this.f23281h;
    }

    /* renamed from: d */
    public float m13138d() {
        return this.f23282i;
    }

    /* renamed from: e */
    public float m13137e() {
        return this.f23279f;
    }

    /* renamed from: f */
    public float m13136f() {
        return this.f23275b;
    }

    /* renamed from: g */
    public float m13135g() {
        return this.f23278e;
    }

    /* renamed from: h */
    public float m13134h() {
        return this.f23276c;
    }

    /* renamed from: i */
    public float[] m13133i() {
        return this.f23280g;
    }

    /* renamed from: j */
    public float m13132j() {
        return this.f23283j;
    }
}
