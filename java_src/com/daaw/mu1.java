package com.daaw;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class mu1 extends lu1 {
    @Override // com.daaw.iu1, com.daaw.nu1
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.daaw.ku1, com.daaw.nu1
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.daaw.iu1, com.daaw.nu1
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.daaw.lu1, com.daaw.nu1
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.daaw.ju1, com.daaw.nu1
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.daaw.ju1, com.daaw.nu1
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
