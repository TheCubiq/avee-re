package com.daaw;
/* renamed from: com.daaw.mv */
/* loaded from: classes.dex */
public class C2213mv {
    /* renamed from: a */
    public static float m15759a(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return f3;
        }
        if (f2 == f5) {
            return f3 + f4;
        }
        float f6 = f2 / (f5 / 2.0f);
        float f7 = f4 / 2.0f;
        return (f6 < 1.0f ? f7 * ((float) Math.pow(2.0d, (f6 - 1.0f) * 10.0f)) : f7 * (((float) (-Math.pow(2.0d, (f6 - 1.0f) * (-10.0f)))) + 2.0f)) + f3;
    }
}
