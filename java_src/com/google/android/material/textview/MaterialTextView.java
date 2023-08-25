package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.daaw.C3397w4;
import com.daaw.en0;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.qn0;
import com.daaw.w01;
/* loaded from: classes2.dex */
public class MaterialTextView extends C3397w4 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(qn0.m12324c(context, attributeSet, i, i2), attributeSet, i);
        int m181h;
        Context context2 = getContext();
        if (m182g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m179j(context2, theme, attributeSet, i, i2) || (m181h = m181h(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            m183f(theme, m181h);
        }
    }

    /* renamed from: g */
    public static boolean m182g(Context context) {
        return en0.m23357b(context, w01.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    public static int m181h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m21.f18143T2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(m21.f18150U2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    public static int m180i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = mn0.m15928c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    public static boolean m179j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m21.f18143T2, i, i2);
        int m180i = m180i(context, obtainStyledAttributes, m21.f18157V2, m21.f18164W2);
        obtainStyledAttributes.recycle();
        return m180i != -1;
    }

    /* renamed from: f */
    public final void m183f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, m21.f18115P2);
        int m180i = m180i(getContext(), obtainStyledAttributes, m21.f18129R2, m21.f18136S2);
        obtainStyledAttributes.recycle();
        if (m180i >= 0) {
            setLineHeight(m180i);
        }
    }

    @Override // com.daaw.C3397w4, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m182g(context)) {
            m183f(context.getTheme(), i);
        }
    }
}
