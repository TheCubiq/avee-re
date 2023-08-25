package com.daaw;
/* loaded from: classes.dex */
public class tg0 {
    public static float a(float f, float f2, double d) {
        return f + ((f2 - f) * ((float) d));
    }

    public static void b(bs1 bs1Var, bs1 bs1Var2, bs1 bs1Var3, double d) {
        float f = bs1Var2.a;
        float f2 = (float) d;
        bs1Var.a = f + ((bs1Var3.a - f) * f2);
        float f3 = bs1Var2.b;
        bs1Var.b = f3 + ((bs1Var3.b - f3) * f2);
    }
}
