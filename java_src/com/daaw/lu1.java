package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class lu1 extends ku1 {

    /* renamed from: i */
    public static boolean f17799i = true;

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo14784g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo14784g(view, i);
        } else if (f17799i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f17799i = false;
            }
        }
    }
}
