package com.daaw.avee.comp.Visualizer.Dsp;
/* loaded from: classes.dex */
public class DspWindows {
    static float I0(float f) {
        float f2 = f / 3.75f;
        float f3 = f2 * f2;
        return (f3 * ((((((((((0.0045813f * f3) + 0.0360768f) * f3) + 0.2659732f) * f3) + 1.2067492f) * f3) + 3.0899425f) * f3) + 3.5156229f)) + 1.0f;
    }

    public static float hannWindow(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2 - 1;
        Double.isNaN(d2);
        return (1.0f - ((float) Math.cos((d * 6.283185307179586d) / d2))) * 0.5f;
    }

    public static float hammingWindow(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2 - 1;
        Double.isNaN(d2);
        return 0.54f - (((float) Math.cos((d * 6.283185307179586d) / d2)) * 0.46f);
    }

    public static float hannWindow10(float f) {
        double d = f;
        Double.isNaN(d);
        return (1.0f - ((float) Math.cos(d * 6.283185307179586d))) * 0.5f;
    }

    public static float fourBlackmanHarris(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2 - 1;
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        return ((0.35875f - (((float) Math.cos((6.283185307179586d * d) / d2)) * 0.48829f)) + (((float) Math.cos((12.566370614359172d * d) / d2)) * 0.14128f)) - (((float) Math.cos((d * 18.84955592153876d) / d2)) * 0.01168f);
    }

    public static float kaiserWindow(int i, int i2, float f) {
        float f2 = ((i * 2.0f) / i2) - 1.0f;
        float f3 = f * 3.1415927f;
        return I0(((float) Math.sqrt(1.0f - (f2 * f2))) * f3) / I0(f3);
    }
}
