package com.daaw;
/* loaded from: classes2.dex */
public final class rn0 {
    /* renamed from: a */
    public static float m11160a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m11159b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m11157d(m11160a(f, f2, f3, f4), m11160a(f, f2, f5, f4), m11160a(f, f2, f5, f6), m11160a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m11158c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    public static float m11157d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
