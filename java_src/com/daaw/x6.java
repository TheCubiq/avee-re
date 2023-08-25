package com.daaw;
/* loaded from: classes.dex */
public class x6 extends z6 {
    public x6(le0 le0Var, int i, int i2, int i3, int i4, boolean z) {
        super(le0Var, i, i2, i3, i4, z);
    }

    public x6(le0 le0Var, boolean z) {
        super(le0Var, z);
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public float b(float f) {
        return super.b(1.0f - f);
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public float e(float f) {
        return super.e(f);
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public boolean g() {
        return true;
    }

    @Override // com.daaw.z6
    public qc0 h(le0 le0Var, int i, int i2, int i3, int i4, boolean z) {
        return new x6(le0Var, i, i2, i3, i4, z);
    }
}
