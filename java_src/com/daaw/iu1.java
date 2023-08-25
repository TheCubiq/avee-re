package com.daaw;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class iu1 extends nu1 {
    public static boolean e = true;

    @Override // com.daaw.nu1
    public void a(View view) {
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // com.daaw.nu1
    public void d(View view) {
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    public void f(View view, float f) {
        if (e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f);
    }
}
