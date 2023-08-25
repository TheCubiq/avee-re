package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes2.dex */
public final class xk1 {

    /* renamed from: a */
    public static final int[] f32778a = {w01.f30751i};

    /* renamed from: b */
    public static final int[] f32779b = {w01.colorPrimaryVariant};

    /* renamed from: a */
    public static void m5033a(Context context) {
        m5029e(context, f32778a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m5032b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18196a6, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(m21.f18212c6, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(w01.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m5031c(context);
            }
        }
        m5033a(context);
    }

    /* renamed from: c */
    public static void m5031c(Context context) {
        m5029e(context, f32779b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    public static void m5030d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18196a6, i, i2);
        if (!obtainStyledAttributes.getBoolean(m21.f18220d6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(m21.f18204b6, -1) != -1;
        } else {
            z = m5028f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m5029e(Context context, int[] iArr, String str) {
        if (m5027g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static boolean m5028f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m5027g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m5026h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m5032b(context, attributeSet, i, i2);
        m5030d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static ul1 m5025i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m5032b(context, attributeSet, i, i2);
        m5030d(context, attributeSet, iArr, i, i2, iArr2);
        return ul1.m8037v(context, attributeSet, iArr, i, i2);
    }
}
