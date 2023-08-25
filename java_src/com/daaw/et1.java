package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class et1 {

    /* renamed from: a */
    public static boolean f8764a = true;

    /* renamed from: a */
    public static dt1 m23201a(ViewGroup viewGroup) {
        return new ct1(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m23200b(ViewGroup viewGroup, boolean z) {
        if (f8764a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f8764a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m23199c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m23200b(viewGroup, z);
        }
    }
}
