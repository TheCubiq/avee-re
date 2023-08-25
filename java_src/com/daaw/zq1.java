package com.daaw;

import android.graphics.Color;
/* loaded from: classes.dex */
public class zq1 {
    public static int a(float f, int i) {
        return (b(f) << 24) | (i & 16777215);
    }

    public static int b(float f) {
        return Math.round(f * 255.0f);
    }

    public static int c(int i, float f) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, f};
        return Color.HSVToColor(fArr);
    }

    public static float d(int i) {
        return Color.alpha(i) / 255.0f;
    }

    public static String e(int i, boolean z) {
        return String.format(z ? "#%08X" : "#%06X", Integer.valueOf(i & (z ? -1 : 16777215))).toUpperCase();
    }

    public static float f(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[2];
    }
}
