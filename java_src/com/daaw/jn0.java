package com.daaw;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes2.dex */
public class jn0 {
    public static int a(Context context, int i, int i2) {
        TypedValue a = en0.a(context, i);
        return a != null ? a.data : i2;
    }

    public static int b(Context context, int i, String str) {
        return en0.c(context, i, str);
    }

    public static int c(View view, int i) {
        return en0.d(view, i);
    }

    public static int d(View view, int i, int i2) {
        return a(view.getContext(), i, i2);
    }

    public static int e(int i, int i2) {
        return zg.f(i2, i);
    }

    public static int f(int i, int i2, float f) {
        return e(i, zg.j(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int g(View view, int i, int i2, float f) {
        return f(c(view, i), c(view, i2), f);
    }
}
