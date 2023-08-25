package com.daaw;
/* loaded from: classes.dex */
public class nd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public nd(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static nd b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        nd ndVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int p = e(f8, f2, f).p();
            float b = od.b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                nd c = c(p);
                float a = c.a(e(c.k(), c.i(), f));
                if (a <= 1.0f) {
                    ndVar = c;
                    f4 = abs;
                    f5 = a;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (b < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return ndVar;
    }

    public static nd c(int i) {
        return d(i, pu1.k);
    }

    public static nd d(int i, pu1 pu1Var) {
        float f;
        double d;
        float[] f2 = od.f(i);
        float[][] fArr = od.a;
        float f3 = (f2[0] * fArr[0][0]) + (f2[1] * fArr[0][1]) + (f2[2] * fArr[0][2]);
        float f4 = (f2[0] * fArr[1][0]) + (f2[1] * fArr[1][1]) + (f2[2] * fArr[1][2]);
        float f5 = (f2[0] * fArr[2][0]) + (f2[1] * fArr[2][1]) + (f2[2] * fArr[2][2]);
        float f6 = pu1Var.i()[0] * f3;
        float f7 = pu1Var.i()[1] * f4;
        float f8 = pu1Var.i()[2] * f5;
        double c = pu1Var.c() * Math.abs(f6);
        Double.isNaN(c);
        float pow = (float) Math.pow(c / 100.0d, 0.42d);
        double c2 = pu1Var.c() * Math.abs(f7);
        Double.isNaN(c2);
        float pow2 = (float) Math.pow(c2 / 100.0d, 0.42d);
        double c3 = pu1Var.c() * Math.abs(f8);
        Double.isNaN(c3);
        float pow3 = (float) Math.pow(c3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum;
        Double.isNaN(d2);
        double d3 = signum2;
        Double.isNaN(d3);
        double d4 = (d2 * 11.0d) + (d3 * (-12.0d));
        double d5 = signum3;
        Double.isNaN(d5);
        double d6 = signum + signum2;
        Double.isNaN(d5);
        Double.isNaN(d6);
        float f9 = ((float) (d6 - (d5 * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f9, ((float) (d4 + d5)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((f12 * pu1Var.f()) / pu1Var.a(), pu1Var.b() * pu1Var.j())) * 100.0f;
        float d7 = pu1Var.d() * (4.0f / pu1Var.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (pu1Var.a() + 4.0f);
        Double.isNaN(((double) f13) < 20.14d ? 360.0f + f13 : f13);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, pu1Var.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((d * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pu1Var.g()) * pu1Var.h()) * ((float) Math.sqrt((f * f) + (f9 * f9)))) / (f11 + 0.305f), 0.9d));
        double d8 = pow4;
        Double.isNaN(d8);
        float sqrt = pow5 * ((float) Math.sqrt(d8 / 100.0d));
        float d9 = sqrt * pu1Var.d();
        float sqrt2 = ((float) Math.sqrt((pow5 * pu1Var.b()) / (pu1Var.a() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d9) + 1.0f)) * 43.85965f;
        double d10 = f14;
        return new nd(f13, sqrt, pow4, d7, d9, sqrt2, f15, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static nd e(float f, float f2, float f3) {
        return f(f, f2, f3, pu1.k);
    }

    public static nd f(float f, float f2, float f3, pu1 pu1Var) {
        double d;
        double d2 = f;
        Double.isNaN(d2);
        float b = (4.0f / pu1Var.b()) * ((float) Math.sqrt(d2 / 100.0d)) * (pu1Var.a() + 4.0f) * pu1Var.d();
        float d3 = f2 * pu1Var.d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * pu1Var.b()) / (pu1Var.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        double d4 = d3;
        Double.isNaN(d4);
        float log = ((float) Math.log((d4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f3) / 180.0f;
        return new nd(f3, f2, f, b, d3, sqrt, f4, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, pu1.k);
    }

    public static int n(float f, float f2, float f3, pu1 pu1Var) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return od.a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        nd ndVar = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            nd b = b(min, f4, f3);
            if (z) {
                if (b != null) {
                    return b.o(pu1Var);
                }
                z = false;
            } else if (b == null) {
                f2 = f4;
            } else {
                f5 = f4;
                ndVar = b;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return ndVar == null ? od.a(f3) : ndVar.o(pu1Var);
    }

    public float a(nd ndVar) {
        float l = l() - ndVar.l();
        float g = g() - ndVar.g();
        float h = h() - ndVar.h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(pu1 pu1Var) {
        float f;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        if (i() == 0.0d || k() == 0.0d) {
            f = 0.0f;
        } else {
            float i = i();
            double k = k();
            Double.isNaN(k);
            f = i / ((float) Math.sqrt(k / 100.0d));
        }
        double d7 = f;
        double pow = Math.pow(1.64d - Math.pow(0.29d, pu1Var.e()), 0.73d);
        Double.isNaN(d7);
        float pow2 = (float) Math.pow(d7 / pow, 1.1111111111111112d);
        double j = (j() * 3.1415927f) / 180.0f;
        Double.isNaN(j);
        float a = pu1Var.a();
        double k2 = k();
        Double.isNaN(k2);
        double b = pu1Var.b();
        Double.isNaN(b);
        double d8 = 1.0d / b;
        double j2 = pu1Var.j();
        Double.isNaN(j2);
        float pow3 = a * ((float) Math.pow(k2 / 100.0d, d8 / j2));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * pu1Var.g() * pu1Var.h();
        float f2 = pow3 / pu1Var.f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow2) / (((cos * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        Double.isNaN(Math.abs(f7));
        Double.isNaN(Math.abs(f7));
        float signum = Math.signum(f7) * (100.0f / pu1Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (d * 27.13d) / (400.0d - d2)), 2.380952380952381d));
        Double.isNaN(Math.abs(f8));
        Double.isNaN(Math.abs(f8));
        float signum2 = Math.signum(f8) * (100.0f / pu1Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (d3 * 27.13d) / (400.0d - d4)), 2.380952380952381d));
        Double.isNaN(Math.abs(f9));
        Double.isNaN(Math.abs(f9));
        float signum3 = Math.signum(f9) * (100.0f / pu1Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (d5 * 27.13d) / (400.0d - d6)), 2.380952380952381d));
        float f10 = signum / pu1Var.i()[0];
        float f11 = signum2 / pu1Var.i()[1];
        float f12 = signum3 / pu1Var.i()[2];
        float[][] fArr = od.b;
        return zg.c((fArr[0][0] * f10) + (fArr[0][1] * f11) + (fArr[0][2] * f12), (fArr[1][0] * f10) + (fArr[1][1] * f11) + (fArr[1][2] * f12), (f10 * fArr[2][0]) + (f11 * fArr[2][1]) + (f12 * fArr[2][2]));
    }

    public int p() {
        return o(pu1.k);
    }
}
