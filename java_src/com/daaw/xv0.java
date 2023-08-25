package com.daaw;
/* loaded from: classes.dex */
public class xv0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final float[] f = new float[4];
    public float g = 4.0f;
    public float h = 0.0f;
    public boolean e = true;

    public static void a(xv0 xv0Var, xv0 xv0Var2, xv0 xv0Var3, float f) {
        xv0Var.a = 0.0f;
        double d = f;
        xv0Var.b = tg0.a(xv0Var2.b, xv0Var3.b, d);
        xv0Var.c = tg0.a(xv0Var2.c, xv0Var3.c, d);
        xv0Var.d = tg0.a(xv0Var2.d, xv0Var3.d, d);
        f80.b(xv0Var.f, xv0Var2.f, xv0Var3.f, f);
        xv0Var.g = tg0.a(xv0Var2.g, xv0Var3.g, d);
        xv0Var.h = tg0.a(xv0Var2.h, xv0Var3.h, d);
        xv0Var.e = f < 0.5f ? xv0Var2.e : xv0Var3.e;
    }

    public float[] b() {
        return this.f;
    }

    public void c(int i) {
        f80.n(this.f, i);
    }

    public void d(float[] fArr) {
        float[] fArr2 = this.f;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }
}
