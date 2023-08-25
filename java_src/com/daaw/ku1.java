package com.daaw;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class ku1 extends ju1 {

    /* renamed from: h */
    public static boolean f16747h = true;

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo14786e(View view, int i, int i2, int i3, int i4) {
        if (f16747h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f16747h = false;
            }
        }
    }
}
