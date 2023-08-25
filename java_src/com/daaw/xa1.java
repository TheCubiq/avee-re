package com.daaw;
/* loaded from: classes.dex */
public abstract class xa1 implements he0 {
    public float[] a = new float[4];
    public float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] c = {1.0f, 1.0f, 1.0f, 1.0f};
    public boolean d = false;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g;

    @Override // com.daaw.zc0
    public void a(un unVar) {
        s(unVar.r("colorFrom", -1), unVar.r("colorTo", -1), -1);
        t(unVar.o("fixedHeight", 0.0f));
        this.f = unVar.o("barHeightMultiplier", 1.0f);
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.T("colorFrom", f80.m(this.b), "misc");
        unVar.T("colorTo", f80.m(this.c), "misc");
        unVar.O("fixedHeight", this.e, "misc", -50.0f, 50.0f);
        unVar.O("barHeightMultiplier", this.f, "misc", -2.0f, 2.0f);
    }

    public int q(int i, int i2, float f) {
        float f2 = ((i / i2) + (10.0f - f)) % 1.0f;
        this.g = f2;
        if (f2 <= 0.5f) {
            br1.r(this.b, this.c, this.a, f2 * 2.0f);
        } else {
            br1.r(this.c, this.b, this.a, (f2 - 0.5f) * 2.0f);
        }
        return f80.m(this.a);
    }

    public xa1 r(int i) {
        return s(i, i, i);
    }

    public xa1 s(int i, int i2, int i3) {
        f80.q(this.b, i);
        f80.q(this.c, i2);
        return this;
    }

    public xa1 t(float f) {
        this.d = Math.abs(f) > 0.01f;
        this.e = f;
        return this;
    }
}
