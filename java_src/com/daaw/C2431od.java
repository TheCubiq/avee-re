package com.daaw;

import android.graphics.Color;
/* renamed from: com.daaw.od */
/* loaded from: classes.dex */
public final class C2431od {

    /* renamed from: a */
    public static final float[][] f21275a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f21276b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f21277c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f21278d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static int m14388a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f21277c;
        return C3838zg.m2351c(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* renamed from: b */
    public static float m14387b(int i) {
        return m14386c(m14382g(i));
    }

    /* renamed from: c */
    public static float m14386c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* renamed from: d */
    public static float m14385d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: e */
    public static float m14384e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: f */
    public static float[] m14383f(int i) {
        float m14384e = m14384e(Color.red(i));
        float m14384e2 = m14384e(Color.green(i));
        float m14384e3 = m14384e(Color.blue(i));
        float[][] fArr = f21278d;
        return new float[]{(fArr[0][0] * m14384e) + (fArr[0][1] * m14384e2) + (fArr[0][2] * m14384e3), (fArr[1][0] * m14384e) + (fArr[1][1] * m14384e2) + (fArr[1][2] * m14384e3), (m14384e * fArr[2][0]) + (m14384e2 * fArr[2][1]) + (m14384e3 * fArr[2][2])};
    }

    /* renamed from: g */
    public static float m14382g(int i) {
        float m14384e = m14384e(Color.red(i));
        float m14384e2 = m14384e(Color.green(i));
        float m14384e3 = m14384e(Color.blue(i));
        float[][] fArr = f21278d;
        return (m14384e * fArr[1][0]) + (m14384e2 * fArr[1][1]) + (m14384e3 * fArr[1][2]);
    }

    /* renamed from: h */
    public static float m14381h(float f) {
        float f2;
        if (f > 8.0f) {
            double d = f;
            Double.isNaN(d);
            f2 = (float) Math.pow((d + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}
