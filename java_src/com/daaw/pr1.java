package com.daaw;

import android.opengl.Matrix;
/* loaded from: classes.dex */
public class pr1 {
    public float[] a = new float[16];

    public float[] a() {
        return this.a;
    }

    public void b(pr1 pr1Var, pr1 pr1Var2) {
        Matrix.multiplyMM(a(), 0, pr1Var.a(), 0, pr1Var2.a(), 0);
    }

    public void c(float f) {
        Matrix.rotateM(this.a, 0, f, 0.0f, 0.0f, 1.0f);
    }

    public void d() {
        Matrix.setIdentityM(this.a, 0);
    }

    public void e(float f, float f2, float f3) {
        Matrix.translateM(this.a, 0, f, f2, f3);
    }
}
