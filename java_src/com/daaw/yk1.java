package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public class yk1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f33747a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f33748b = {-16842910};

    /* renamed from: c */
    public static final int[] f33749c = {16842908};

    /* renamed from: d */
    public static final int[] f33750d = {16843518};

    /* renamed from: e */
    public static final int[] f33751e = {16842919};

    /* renamed from: f */
    public static final int[] f33752f = {16842912};

    /* renamed from: g */
    public static final int[] f33753g = {16842913};

    /* renamed from: h */
    public static final int[] f33754h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f33755i = new int[0];

    /* renamed from: j */
    public static final int[] f33756j = new int[1];

    /* renamed from: a */
    public static void m3617a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x21.f32003y0);
        try {
            if (!obtainStyledAttributes.hasValue(x21.f31774D0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m3616b(Context context, int i) {
        ColorStateList m3613e = m3613e(context, i);
        if (m3613e == null || !m3613e.isStateful()) {
            TypedValue m3612f = m3612f();
            context.getTheme().resolveAttribute(16842803, m3612f, true);
            return m3614d(context, i, m3612f.getFloat());
        }
        return m3613e.getColorForState(f33748b, m3613e.getDefaultColor());
    }

    /* renamed from: c */
    public static int m3615c(Context context, int i) {
        int[] iArr = f33756j;
        iArr[0] = i;
        ul1 m8038u = ul1.m8038u(context, null, iArr);
        try {
            return m8038u.m8057b(0, 0);
        } finally {
            m8038u.m8036w();
        }
    }

    /* renamed from: d */
    public static int m3614d(Context context, int i, float f) {
        int m3615c = m3615c(context, i);
        return C3838zg.m2344j(m3615c, Math.round(Color.alpha(m3615c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m3613e(Context context, int i) {
        int[] iArr = f33756j;
        iArr[0] = i;
        ul1 m8038u = ul1.m8038u(context, null, iArr);
        try {
            return m8038u.m8056c(0);
        } finally {
            m8038u.m8036w();
        }
    }

    /* renamed from: f */
    public static TypedValue m3612f() {
        ThreadLocal<TypedValue> threadLocal = f33747a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
