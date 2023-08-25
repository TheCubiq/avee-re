package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.daaw.en0;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.qn0;
import com.daaw.w01;
import com.daaw.w4;
/* loaded from: classes2.dex */
public class MaterialTextView extends w4 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(qn0.c(context, attributeSet, i, i2), attributeSet, i);
        int h;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (j(context2, theme, attributeSet, i, i2) || (h = h(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            f(theme, h);
        }
    }

    public static boolean g(Context context) {
        return en0.b(context, w01.textAppearanceLineHeightEnabled, true);
    }

    public static int h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m21.T2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(m21.U2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = mn0.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    public static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m21.T2, i, i2);
        int i3 = i(context, obtainStyledAttributes, m21.V2, m21.W2);
        obtainStyledAttributes.recycle();
        return i3 != -1;
    }

    public final void f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, m21.P2);
        int i2 = i(getContext(), obtainStyledAttributes, m21.R2, m21.S2);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    @Override // com.daaw.w4, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (g(context)) {
            f(context.getTheme(), i);
        }
    }
}
