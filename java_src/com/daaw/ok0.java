package com.daaw;
/* loaded from: classes.dex */
public class ok0 extends C3812z6 {

    /* renamed from: j */
    public float f21602j;

    public ok0(le0 le0Var, boolean z) {
        super(le0Var, z);
        this.f21602j = 0.0f;
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: b */
    public float mo2800b(float f) {
        float f2 = this.f21602j;
        if (f2 > 0.5f) {
            f2 = 0.5f - (f2 - 0.5f);
        }
        float f3 = f2 * 0.8f;
        return super.mo2800b((f * 0.2f) + f3 + f3);
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: c */
    public qc0 mo2799c(float f) {
        return this;
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: e */
    public float mo2797e(float f) {
        return super.mo2797e(f);
    }

    @Override // com.daaw.C3812z6
    /* renamed from: i */
    public int mo2802i() {
        return 100;
    }

    /* renamed from: j */
    public void m14218j(float f) {
        this.f21602j = (this.f21602j + (f * 0.9f)) % 1.0f;
    }
}
