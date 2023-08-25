package com.daaw;
/* loaded from: classes.dex */
public final class ls3 {
    public final ny8 a = new ny8();

    public final ls3 a(int i) {
        this.a.a(i);
        return this;
    }

    public final ls3 b(lu3 lu3Var) {
        r32 r32Var;
        ny8 ny8Var = this.a;
        r32Var = lu3Var.a;
        for (int i = 0; i < r32Var.b(); i++) {
            ny8Var.a(r32Var.a(i));
        }
        return this;
    }

    public final ls3 c(int... iArr) {
        ny8 ny8Var = this.a;
        for (int i = 0; i < 21; i++) {
            ny8Var.a(iArr[i]);
        }
        return this;
    }

    public final ls3 d(int i, boolean z) {
        ny8 ny8Var = this.a;
        if (z) {
            ny8Var.a(i);
        }
        return this;
    }

    public final lu3 e() {
        return new lu3(this.a.b(), null);
    }
}
