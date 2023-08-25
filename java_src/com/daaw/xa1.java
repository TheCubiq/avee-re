package com.daaw;
/* loaded from: classes.dex */
public abstract class xa1 implements he0 {

    /* renamed from: a */
    public float[] f32269a = new float[4];

    /* renamed from: b */
    public float[] f32270b = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: c */
    public float[] f32271c = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d */
    public boolean f32272d = false;

    /* renamed from: e */
    public float f32273e = 0.0f;

    /* renamed from: f */
    public float f32274f = 1.0f;

    /* renamed from: g */
    public float f32275g;

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        m5337s(c3239un.m7947r("colorFrom", -1), c3239un.m7947r("colorTo", -1), -1);
        m5336t(c3239un.m7953o("fixedHeight", 0.0f));
        this.f32274f = c3239un.m7953o("barHeightMultiplier", 1.0f);
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7985T("colorFrom", f80.m22861m(this.f32270b), "misc");
        c3239un.m7985T("colorTo", f80.m22861m(this.f32271c), "misc");
        c3239un.m7990O("fixedHeight", this.f32273e, "misc", -50.0f, 50.0f);
        c3239un.m7990O("barHeightMultiplier", this.f32274f, "misc", -2.0f, 2.0f);
    }

    /* renamed from: q */
    public int m5339q(int i, int i2, float f) {
        float f2 = ((i / i2) + (10.0f - f)) % 1.0f;
        this.f32275g = f2;
        if (f2 <= 0.5f) {
            br1.m25891r(this.f32270b, this.f32271c, this.f32269a, f2 * 2.0f);
        } else {
            br1.m25891r(this.f32271c, this.f32270b, this.f32269a, (f2 - 0.5f) * 2.0f);
        }
        return f80.m22861m(this.f32269a);
    }

    /* renamed from: r */
    public xa1 m5338r(int i) {
        return m5337s(i, i, i);
    }

    /* renamed from: s */
    public xa1 m5337s(int i, int i2, int i3) {
        f80.m22857q(this.f32270b, i);
        f80.m22857q(this.f32271c, i2);
        return this;
    }

    /* renamed from: t */
    public xa1 m5336t(float f) {
        this.f32272d = Math.abs(f) > 0.01f;
        this.f32273e = f;
        return this;
    }
}
