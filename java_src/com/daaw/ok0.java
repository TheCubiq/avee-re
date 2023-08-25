package com.daaw;
/* loaded from: classes.dex */
public class ok0 extends z6 {
    public float j;

    public ok0(le0 le0Var, boolean z) {
        super(le0Var, z);
        this.j = 0.0f;
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public float b(float f) {
        float f2 = this.j;
        if (f2 > 0.5f) {
            f2 = 0.5f - (f2 - 0.5f);
        }
        float f3 = f2 * 0.8f;
        return super.b((f * 0.2f) + f3 + f3);
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public qc0 c(float f) {
        return this;
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public float e(float f) {
        return super.e(f);
    }

    @Override // com.daaw.z6
    public int i() {
        return 100;
    }

    public void j(float f) {
        this.j = (this.j + (f * 0.9f)) % 1.0f;
    }
}
