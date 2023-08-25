package com.daaw;
/* loaded from: classes.dex */
public class ds1 {

    /* renamed from: a */
    public float f7696a;

    /* renamed from: b */
    public float f7697b;

    /* renamed from: c */
    public float f7698c;

    public ds1(float f, float f2, float f3) {
        this.f7696a = f;
        this.f7697b = f2;
        this.f7698c = f3;
    }

    /* renamed from: a */
    public float m24013a() {
        float m24012b = m24012b();
        if (m24012b == 0.0f) {
            m24012b = 1.1920929E-7f;
        }
        float f = this.f7696a / m24012b;
        float f2 = this.f7697b / m24012b;
        float f3 = (float) (-Math.atan2(f2 == 0.0f ? 1.1920928955078125E-7d : -f2, f != 0.0f ? f : 1.1920928955078125E-7d));
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    /* renamed from: b */
    public float m24012b() {
        float f = this.f7696a;
        float f2 = this.f7697b;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f7698c;
        return (float) Math.sqrt(f3 + (f4 * f4));
    }

    /* renamed from: c */
    public void m24011c() {
        float m24012b = m24012b();
        this.f7696a /= m24012b;
        this.f7697b /= m24012b;
        this.f7698c /= m24012b;
    }
}
