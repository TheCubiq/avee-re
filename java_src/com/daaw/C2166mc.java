package com.daaw;
/* renamed from: com.daaw.mc */
/* loaded from: classes2.dex */
public class C2166mc extends C2889rv implements Cloneable {

    /* renamed from: p */
    public float f18774p;

    /* renamed from: q */
    public float f18775q;

    /* renamed from: r */
    public float f18776r;

    /* renamed from: s */
    public float f18777s;

    /* renamed from: t */
    public float f18778t;

    @Override // com.daaw.C2889rv
    /* renamed from: b */
    public void mo10931b(float f, float f2, float f3, ic1 ic1Var) {
        float f4 = this.f18776r;
        if (f4 == 0.0f) {
            ic1Var.m19969m(f, 0.0f);
            return;
        }
        float f5 = ((this.f18775q * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f18774p;
        float f7 = f2 + this.f18778t;
        float f8 = (this.f18777s * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            ic1Var.m19969m(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        ic1Var.m19969m(f11, 0.0f);
        float f14 = f6 * 2.0f;
        ic1Var.m19981a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        ic1Var.m19981a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        ic1Var.m19981a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        ic1Var.m19969m(f, 0.0f);
    }

    /* renamed from: c */
    public float m16103c() {
        return this.f18777s;
    }

    /* renamed from: d */
    public float m16102d() {
        return this.f18775q;
    }

    /* renamed from: e */
    public float m16101e() {
        return this.f18774p;
    }

    /* renamed from: f */
    public float m16100f() {
        return this.f18776r;
    }

    /* renamed from: i */
    public void m16099i(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f18777s = f;
    }

    /* renamed from: j */
    public void m16098j(float f) {
        this.f18775q = f;
    }

    /* renamed from: k */
    public void m16097k(float f) {
        this.f18774p = f;
    }

    /* renamed from: m */
    public void m16096m(float f) {
        this.f18776r = f;
    }

    /* renamed from: n */
    public void m16095n(float f) {
        this.f18778t = f;
    }
}
