package com.daaw;

import android.opengl.Matrix;
/* loaded from: classes.dex */
public class pr1 {

    /* renamed from: a */
    public float[] f23194a = new float[16];

    /* renamed from: a */
    public float[] m13202a() {
        return this.f23194a;
    }

    /* renamed from: b */
    public void m13201b(pr1 pr1Var, pr1 pr1Var2) {
        Matrix.multiplyMM(m13202a(), 0, pr1Var.m13202a(), 0, pr1Var2.m13202a(), 0);
    }

    /* renamed from: c */
    public void m13200c(float f) {
        Matrix.rotateM(this.f23194a, 0, f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: d */
    public void m13199d() {
        Matrix.setIdentityM(this.f23194a, 0);
    }

    /* renamed from: e */
    public void m13198e(float f, float f2, float f3) {
        Matrix.translateM(this.f23194a, 0, f, f2, f3);
    }
}
