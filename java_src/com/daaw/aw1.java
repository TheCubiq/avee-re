package com.daaw;
/* loaded from: classes.dex */
public class aw1 implements qd0 {
    public float a = 50.0f;
    public float b = 50.0f;

    @Override // com.daaw.zc0
    public void a(un unVar) {
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
    }

    @Override // com.daaw.qd0
    public float p(float f, float f2, bs1 bs1Var) {
        float f3 = this.b;
        bs1Var.a = f2 * f3;
        bs1Var.b = (-f) * f3;
        return 1.0f / ((((f * f) + (f2 * f2)) / this.a) + 1.0f);
    }
}
