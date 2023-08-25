package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public class bs1 {

    /* renamed from: a */
    public float f5090a;

    /* renamed from: b */
    public float f5091b;

    public bs1(float f, float f2) {
        this.f5090a = f;
        this.f5091b = f2;
    }

    /* renamed from: a */
    public static bs1 m25862a(String str, bs1 bs1Var) {
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

    /* renamed from: b */
    public static float m25861b(float f, float f2) {
        return -f2;
    }

    /* renamed from: c */
    public static float m25860c(float f, float f2) {
        return f;
    }

    /* renamed from: d */
    public static float m25859d(float f, float f2) {
        return f2;
    }

    /* renamed from: e */
    public static float m25858e(float f, float f2) {
        return -f;
    }

    /* renamed from: g */
    public static float m25856g(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    /* renamed from: h */
    public static bs1 m25855h(float f) {
        double radians = (float) Math.toRadians(f);
        return new bs1((float) Math.cos(radians), (float) Math.sin(radians));
    }

    /* renamed from: i */
    public static void m25854i(ds1 ds1Var, float f) {
        double d = f;
        ds1Var.f7696a = (float) Math.cos(d);
        ds1Var.f7697b = (float) Math.sin(d);
    }

    /* renamed from: j */
    public static float m25853j(float f, float f2) {
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = 1.1920929E-7f;
        }
        float f3 = f / sqrt;
        float f4 = f2 / sqrt;
        float f5 = (float) (-Math.atan2(f4 == 0.0f ? 1.1920928955078125E-7d : -f4, f3 != 0.0f ? f3 : 1.1920928955078125E-7d));
        return f5 < 0.0f ? f5 + 6.2831855f : f5;
    }

    /* renamed from: l */
    public static float m25851l(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: q */
    public static bs1 m25846q() {
        return new bs1(1.0f, 1.0f);
    }

    /* renamed from: s */
    public static bs1 m25844s() {
        return new bs1(0.0f, 0.0f);
    }

    /* renamed from: f */
    public float m25857f(bs1 bs1Var) {
        float f = this.f5090a - bs1Var.f5090a;
        float f2 = this.f5091b - bs1Var.f5091b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: k */
    public float m25852k() {
        float f = this.f5090a;
        float f2 = this.f5091b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: m */
    public void m25850m(float f, float f2, float f3) {
        float max = f3 / Math.max((this.f5090a * f) + (this.f5091b * f2), 0.25f);
        this.f5090a *= max;
        this.f5091b *= max;
    }

    /* renamed from: n */
    public void m25849n(bs1 bs1Var, float f) {
        float max = f / Math.max((this.f5090a * bs1Var.f5090a) + (this.f5091b * bs1Var.f5091b), 0.25f);
        this.f5090a *= max;
        this.f5091b *= max;
    }

    /* renamed from: o */
    public bs1 m25848o() {
        float f = this.f5090a;
        float f2 = this.f5091b;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        this.f5090a /= sqrt;
        this.f5091b /= sqrt;
        return this;
    }

    /* renamed from: p */
    public bs1 m25847p() {
        float f = this.f5090a;
        float f2 = this.f5091b;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = 1.1920929E-7f;
        }
        this.f5090a /= sqrt;
        this.f5091b /= sqrt;
        return this;
    }

    /* renamed from: r */
    public void m25845r(float f) {
        double d = f;
        float cos = (((float) Math.cos(d)) * this.f5090a) - (((float) Math.sin(d)) * this.f5091b);
        this.f5091b = (((float) Math.sin(d)) * this.f5090a) + (((float) Math.cos(d)) * this.f5091b);
        this.f5090a = cos;
    }

    public String toString() {
        return String.format(Locale.US, "%f %f", Float.valueOf(this.f5090a), Float.valueOf(this.f5091b));
    }
}
