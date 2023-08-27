package com.daaw.avee.Common;

import android.graphics.Color;
/* loaded from: classes.dex */
public class Interpolate {
    public static double Lerp(double d, double d2, double d3) {
        return d + ((d2 - d) * d3);
    }

    public static float Lerp(float f, float f2, double d) {
        return f + ((f2 - f) * ((float) d));
    }

    public static void Lerp(Vec2f vec2f, Vec2f vec2f2, Vec2f vec2f3, double d) {
        float f = (float) d;
        vec2f.x = vec2f2.x + ((vec2f3.x - vec2f2.x) * f);
        vec2f.y = vec2f2.y + ((vec2f3.y - vec2f2.y) * f);
    }

    public static int LerpColor(int i, int i2, float f) {
        float max = Math.max(Color.red(i), Math.max(Color.green(i), Color.blue(i)));
        float max2 = max + ((Math.max(Color.red(i2), Math.max(Color.green(i2), Color.blue(i2))) - max) * f);
        float red = Color.red(i) + ((Color.red(i2) - Color.red(i)) * f);
        float green = Color.green(i) + ((Color.green(i2) - Color.green(i)) * f);
        float blue = Color.blue(i) + ((Color.blue(i2) - Color.blue(i)) * f);
        float alpha = Color.alpha(i) + ((Color.alpha(i2) - Color.alpha(i)) * f);
        float sqrt = (float) Math.sqrt((red * red) + (green * green) + (blue * blue));
        return Color.argb((int) alpha, (int) ((red / sqrt) * max2), (int) ((green / sqrt) * max2), (int) ((blue / sqrt) * max2));
    }
}
