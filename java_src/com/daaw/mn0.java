package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
/* loaded from: classes2.dex */
public class mn0 {
    /* renamed from: a */
    public static ColorStateList m15930a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m11784a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m11784a = C2818r4.m11784a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : m11784a;
    }

    /* renamed from: b */
    public static ColorStateList m15929b(Context context, ul1 ul1Var, int i) {
        int m8045n;
        ColorStateList m11784a;
        return (!ul1Var.m8040s(i) || (m8045n = ul1Var.m8045n(i, 0)) == 0 || (m11784a = C2818r4.m11784a(context, m8045n)) == null) ? ul1Var.m8056c(i) : m11784a;
    }

    /* renamed from: c */
    public static int m15928c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: d */
    public static Drawable m15927d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m11783b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m11783b = C2818r4.m11783b(context, resourceId)) == null) ? typedArray.getDrawable(i) : m11783b;
    }

    /* renamed from: e */
    public static int m15926e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static ik1 m15925f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new ik1(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m15924g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m15923h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
