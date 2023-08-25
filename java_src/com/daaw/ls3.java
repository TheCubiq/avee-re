package com.daaw;
/* loaded from: classes.dex */
public final class ls3 {

    /* renamed from: a */
    public final ny8 f17733a = new ny8();

    /* renamed from: a */
    public final ls3 m16609a(int i) {
        this.f17733a.m14715a(i);
        return this;
    }

    /* renamed from: b */
    public final ls3 m16608b(lu3 lu3Var) {
        r32 r32Var;
        ny8 ny8Var = this.f17733a;
        r32Var = lu3Var.f17802a;
        for (int i = 0; i < r32Var.m11806b(); i++) {
            ny8Var.m14715a(r32Var.m11807a(i));
        }
        return this;
    }

    /* renamed from: c */
    public final ls3 m16607c(int... iArr) {
        ny8 ny8Var = this.f17733a;
        for (int i = 0; i < 21; i++) {
            ny8Var.m14715a(iArr[i]);
        }
        return this;
    }

    /* renamed from: d */
    public final ls3 m16606d(int i, boolean z) {
        ny8 ny8Var = this.f17733a;
        if (z) {
            ny8Var.m14715a(i);
        }
        return this;
    }

    /* renamed from: e */
    public final lu3 m16605e() {
        return new lu3(this.f17733a.m14714b(), null);
    }
}
