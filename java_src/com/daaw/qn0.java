package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes2.dex */
public class qn0 {

    /* renamed from: a */
    public static final int[] f24199a = {16842752, w01.theme};

    /* renamed from: b */
    public static final int[] f24200b = {w01.materialThemeOverlay};

    /* renamed from: a */
    public static int m12326a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24199a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    public static int m12325b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24200b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m12324c(Context context, AttributeSet attributeSet, int i, int i2) {
        int m12325b = m12325b(context, attributeSet, i, i2);
        boolean z = (context instanceof C0855bl) && ((C0855bl) context).m26077c() == m12325b;
        if (m12325b == 0 || z) {
            return context;
        }
        C0855bl c0855bl = new C0855bl(context, m12325b);
        int m12326a = m12326a(context, attributeSet);
        if (m12326a != 0) {
            c0855bl.getTheme().applyStyle(m12326a, true);
        }
        return c0855bl;
    }
}
