package com.daaw;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class mu1 extends lu1 {
    @Override // com.daaw.iu1, com.daaw.nu1
    /* renamed from: c */
    public float mo14788c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.daaw.ku1, com.daaw.nu1
    /* renamed from: e */
    public void mo14786e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.daaw.iu1, com.daaw.nu1
    /* renamed from: f */
    public void mo14785f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.daaw.lu1, com.daaw.nu1
    /* renamed from: g */
    public void mo14784g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.daaw.ju1, com.daaw.nu1
    /* renamed from: h */
    public void mo14783h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.daaw.ju1, com.daaw.nu1
    /* renamed from: i */
    public void mo14782i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
