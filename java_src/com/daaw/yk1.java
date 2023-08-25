package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public class yk1 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final int[] b = {-16842910};
    public static final int[] c = {16842908};
    public static final int[] d = {16843518};
    public static final int[] e = {16842919};
    public static final int[] f = {16842912};
    public static final int[] g = {16842913};
    public static final int[] h = {-16842919, -16842908};
    public static final int[] i = new int[0];
    public static final int[] j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x21.y0);
        try {
            if (!obtainStyledAttributes.hasValue(x21.D0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 == null || !e2.isStateful()) {
            TypedValue f2 = f();
            context.getTheme().resolveAttribute(16842803, f2, true);
            return d(context, i2, f2.getFloat());
        }
        return e2.getColorForState(b, e2.getDefaultColor());
    }

    public static int c(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        ul1 u = ul1.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.w();
        }
    }

    public static int d(Context context, int i2, float f2) {
        int c2 = c(context, i2);
        return zg.j(c2, Math.round(Color.alpha(c2) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        ul1 u = ul1.u(context, null, iArr);
        try {
            return u.c(0);
        } finally {
            u.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
