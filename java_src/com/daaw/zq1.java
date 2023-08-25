package com.daaw;

import android.graphics.Color;
/* loaded from: classes.dex */
public class zq1 {
    /* renamed from: a */
    public static int m1987a(float f, int i) {
        return (m1986b(f) << 24) | (i & 16777215);
    }

    /* renamed from: b */
    public static int m1986b(float f) {
        return Math.round(f * 255.0f);
    }

    /* renamed from: c */
    public static int m1985c(int i, float f) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, f};
        return Color.HSVToColor(fArr);
    }

    /* renamed from: d */
    public static float m1984d(int i) {
        return Color.alpha(i) / 255.0f;
    }

    /* renamed from: e */
    public static String m1983e(int i, boolean z) {
        return String.format(z ? "#%08X" : "#%06X", Integer.valueOf(i & (z ? -1 : 16777215))).toUpperCase();
    }

    /* renamed from: f */
    public static float m1982f(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[2];
    }
}
