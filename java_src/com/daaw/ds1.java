package com.daaw;
/* loaded from: classes.dex */
public class ds1 {
    public float a;
    public float b;
    public float c;

    public ds1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public float a() {
        float b = b();
        if (b == 0.0f) {
            b = 1.1920929E-7f;
        }
        float f = this.a / b;
        float f2 = this.b / b;
        float f3 = (float) (-Math.atan2(f2 == 0.0f ? 1.1920928955078125E-7d : -f2, f != 0.0f ? f : 1.1920928955078125E-7d));
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    public float b() {
        float f = this.a;
        float f2 = this.b;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.c;
        return (float) Math.sqrt(f3 + (f4 * f4));
    }

    public void c() {
        float b = b();
        this.a /= b;
        this.b /= b;
        this.c /= b;
    }
}
