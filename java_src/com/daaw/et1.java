package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class et1 {
    public static boolean a = true;

    public static dt1 a(ViewGroup viewGroup) {
        return new ct1(viewGroup);
    }

    @SuppressLint({"NewApi"})
    public static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }
}
