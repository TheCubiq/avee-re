package com.daaw;
/* renamed from: com.daaw.bv */
/* loaded from: classes.dex */
public class C0888bv {
    /* renamed from: a */
    public static float m25812a(float f) {
        float f2 = f / 3.75f;
        float f3 = f2 * f2;
        return (f3 * ((((((((((0.0045813f * f3) + 0.0360768f) * f3) + 0.2659732f) * f3) + 1.2067492f) * f3) + 3.0899425f) * f3) + 3.5156229f)) + 1.0f;
    }

    /* renamed from: b */
    public static float m25811b(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2 - 1;
        Double.isNaN(d2);
        return 0.54f - (((float) Math.cos((d * 6.283185307179586d) / d2)) * 0.46f);
    }

    /* renamed from: c */
    public static float m25810c(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2 - 1;
        Double.isNaN(d2);
        return (1.0f - ((float) Math.cos((d * 6.283185307179586d) / d2))) * 0.5f;
    }

    /* renamed from: d */
    public static float m25809d(int i, int i2, float f) {
        float f2 = ((i * 2.0f) / i2) - 1.0f;
        float f3 = f * 3.1415927f;
        return m25812a(((float) Math.sqrt(1.0f - (f2 * f2))) * f3) / m25812a(f3);
    }
}
