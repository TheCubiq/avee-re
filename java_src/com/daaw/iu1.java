package com.daaw;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class iu1 extends nu1 {

    /* renamed from: e */
    public static boolean f14007e = true;

    @Override // com.daaw.nu1
    /* renamed from: a */
    public void mo14790a(View view) {
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo14788c(View view) {
        if (f14007e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f14007e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // com.daaw.nu1
    /* renamed from: d */
    public void mo14787d(View view) {
    }

    @Override // com.daaw.nu1
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo14785f(View view, float f) {
        if (f14007e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f14007e = false;
            }
        }
        view.setAlpha(f);
    }
}
