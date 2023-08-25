package com.daaw;
/* loaded from: classes2.dex */
public class mc extends rv implements Cloneable {
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;

    @Override // com.daaw.rv
    public void b(float f, float f2, float f3, ic1 ic1Var) {
        float f4 = this.r;
        if (f4 == 0.0f) {
            ic1Var.m(f, 0.0f);
            return;
        }
        float f5 = ((this.q * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.p;
        float f7 = f2 + this.t;
        float f8 = (this.s * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            ic1Var.m(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        ic1Var.m(f11, 0.0f);
        float f14 = f6 * 2.0f;
        ic1Var.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        ic1Var.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        ic1Var.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        ic1Var.m(f, 0.0f);
    }

    public float c() {
        return this.s;
    }

    public float d() {
        return this.q;
    }

    public float e() {
        return this.p;
    }

    public float f() {
        return this.r;
    }

    public void i(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.s = f;
    }

    public void j(float f) {
        this.q = f;
    }

    public void k(float f) {
        this.p = f;
    }

    public void m(float f) {
        this.r = f;
    }

    public void n(float f) {
        this.t = f;
    }
}
