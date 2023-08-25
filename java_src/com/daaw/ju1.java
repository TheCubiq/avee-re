package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class ju1 extends iu1 {
    public static boolean f = true;
    public static boolean g = true;

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
