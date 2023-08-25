package com.daaw;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class ku1 extends ju1 {
    public static boolean h = true;

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    public void e(View view, int i, int i2, int i3, int i4) {
        if (h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
