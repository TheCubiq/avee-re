package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public class bs1 {
    public float a;
    public float b;

    public bs1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static bs1 a(String str, bs1 bs1Var) {
        if (str == null) {
            return bs1Var;
        }
        try {
            int indexOf = str.indexOf(" ");
            if (indexOf < 0) {
                return bs1Var;
            }
            return new bs1(Float.parseFloat(str.substring(0, indexOf)), Float.parseFloat(str.substring(indexOf + 1)));
        } catch (NumberFormatException unused) {
            return bs1Var;
        }
    }

    public static float b(float f, float f2) {
        return -f2;
    }

    public static float c(float f, float f2) {
        return f;
    }

    public static float d(float f, float f2) {
        return f2;
    }

    public static float e(float f, float f2) {
        return -f;
    }

    public static float g(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    public static bs1 h(float f) {
        double radians = (float) Math.toRadians(f);
        return new bs1((float) Math.cos(radians), (float) Math.sin(radians));
    }

    public static void i(ds1 ds1Var, float f) {
        double d = f;
        ds1Var.a = (float) Math.cos(d);
        ds1Var.b = (float) Math.sin(d);
    }

    public static float j(float f, float f2) {
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = 1.1920929E-7f;
        }
        float f3 = f / sqrt;
        float f4 = f2 / sqrt;
        float f5 = (float) (-Math.atan2(f4 == 0.0f ? 1.1920928955078125E-7d : -f4, f3 != 0.0f ? f3 : 1.1920928955078125E-7d));
        return f5 < 0.0f ? f5 + 6.2831855f : f5;
    }

    public static float l(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static bs1 q() {
        return new bs1(1.0f, 1.0f);
    }

    public static bs1 s() {
        return new bs1(0.0f, 0.0f);
    }

    public float f(bs1 bs1Var) {
        float f = this.a - bs1Var.a;
        float f2 = this.b - bs1Var.b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float k() {
        float f = this.a;
        float f2 = this.b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public void m(float f, float f2, float f3) {
        float max = f3 / Math.max((this.a * f) + (this.b * f2), 0.25f);
        this.a *= max;
        this.b *= max;
    }

    public void n(bs1 bs1Var, float f) {
        float max = f / Math.max((this.a * bs1Var.a) + (this.b * bs1Var.b), 0.25f);
        this.a *= max;
        this.b *= max;
    }

    public bs1 o() {
        float f = this.a;
        float f2 = this.b;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        this.a /= sqrt;
        this.b /= sqrt;
        return this;
    }

    public bs1 p() {
        float f = this.a;
        float f2 = this.b;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = 1.1920929E-7f;
        }
        this.a /= sqrt;
        this.b /= sqrt;
        return this;
    }

    public void r(float f) {
        double d = f;
        float cos = (((float) Math.cos(d)) * this.a) - (((float) Math.sin(d)) * this.b);
        this.b = (((float) Math.sin(d)) * this.a) + (((float) Math.cos(d)) * this.b);
        this.a = cos;
    }

    public String toString() {
        return String.format(Locale.US, "%f %f", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}
