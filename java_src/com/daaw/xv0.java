package com.daaw;
/* loaded from: classes.dex */
public class xv0 {

    /* renamed from: a */
    public float f32972a;

    /* renamed from: b */
    public float f32973b;

    /* renamed from: c */
    public float f32974c;

    /* renamed from: d */
    public float f32975d;

    /* renamed from: f */
    public final float[] f32977f = new float[4];

    /* renamed from: g */
    public float f32978g = 4.0f;

    /* renamed from: h */
    public float f32979h = 0.0f;

    /* renamed from: e */
    public boolean f32976e = true;

    /* renamed from: a */
    public static void m4494a(xv0 xv0Var, xv0 xv0Var2, xv0 xv0Var3, float f) {
        xv0Var.f32972a = 0.0f;
        double d = f;
        xv0Var.f32973b = tg0.m9185a(xv0Var2.f32973b, xv0Var3.f32973b, d);
        xv0Var.f32974c = tg0.m9185a(xv0Var2.f32974c, xv0Var3.f32974c, d);
        xv0Var.f32975d = tg0.m9185a(xv0Var2.f32975d, xv0Var3.f32975d, d);
        f80.m22872b(xv0Var.f32977f, xv0Var2.f32977f, xv0Var3.f32977f, f);
        xv0Var.f32978g = tg0.m9185a(xv0Var2.f32978g, xv0Var3.f32978g, d);
        xv0Var.f32979h = tg0.m9185a(xv0Var2.f32979h, xv0Var3.f32979h, d);
        xv0Var.f32976e = f < 0.5f ? xv0Var2.f32976e : xv0Var3.f32976e;
    }

    /* renamed from: b */
    public float[] m4493b() {
        return this.f32977f;
    }

    /* renamed from: c */
    public void m4492c(int i) {
        f80.m22860n(this.f32977f, i);
    }

    /* renamed from: d */
    public void m4491d(float[] fArr) {
        float[] fArr2 = this.f32977f;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }
}
