package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes2.dex */
public class qn0 {
    public static final int[] a = {16842752, w01.theme};
    public static final int[] b = {w01.materialThemeOverlay};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof bl) && ((bl) context).c() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        bl blVar = new bl(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            blVar.getTheme().applyStyle(a2, true);
        }
        return blVar;
    }
}
