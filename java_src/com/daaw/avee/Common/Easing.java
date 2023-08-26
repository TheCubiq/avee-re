package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Easing {
    public static float easeInAndOut01(float f) {
        return f * f * f * ((f * ((6.0f * f) - 15.0f)) + 10.0f);
    }

    public static float easeInOutBack(float f, float f2, float f3, float f4, float f5) {
        return easeInOutBack(f, f2, f3, f4, f5, 1.70158f);
    }

    public static float easeInOutBack(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8 = f2 / (f5 / 2.0f);
        if (f8 < 1.0f) {
            double d = f6;
            Double.isNaN(d);
            float f9 = (float) (d * 1.525d);
            f7 = (f4 / 2.0f) * f8 * f8 * (((1.0f + f9) * f8) - f9);
        } else {
            float f10 = f8 - 2.0f;
            double d2 = f6;
            Double.isNaN(d2);
            float f11 = (float) (d2 * 1.525d);
            f7 = (f4 / 2.0f) * ((f10 * f10 * (((1.0f + f11) * f10) + f11)) + 2.0f);
        }
        return f7 + f3;
    }

    public static float easeInOutExpo(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f2 == 0.0f) {
            return f3;
        }
        if (f2 == f5) {
            return f3 + f4;
        }
        float f7 = f2 / (f5 / 2.0f);
        if (f7 < 1.0f) {
            f6 = (f4 / 2.0f) * ((float) Math.pow(2.0d, (f7 - 1.0f) * 10.0f));
        } else {
            f6 = (f4 / 2.0f) * (((float) (-Math.pow(2.0d, (f7 - 1.0f) * (-10.0f)))) + 2.0f);
        }
        return f6 + f3;
    }
}
