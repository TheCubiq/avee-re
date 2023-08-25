package com.daaw;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes2.dex */
public class tn0 implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f27887a = new float[9];

    /* renamed from: b */
    public final float[] f27888b = new float[9];

    /* renamed from: c */
    public final Matrix f27889c = new Matrix();

    /* renamed from: a */
    public Matrix mo375a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f27887a);
        matrix2.getValues(this.f27888b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f27888b;
            float f2 = fArr[i];
            float[] fArr2 = this.f27887a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f27889c.setValues(this.f27888b);
        return this.f27889c;
    }
}
