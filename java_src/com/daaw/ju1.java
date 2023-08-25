package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class ju1 extends iu1 {

    /* renamed from: f */
    public static boolean f15413f = true;

    /* renamed from: g */
    public static boolean f15414g = true;

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo14783h(View view, Matrix matrix) {
        if (f15413f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f15413f = false;
            }
        }
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo14782i(View view, Matrix matrix) {
        if (f15414g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f15414g = false;
            }
        }
    }
}
