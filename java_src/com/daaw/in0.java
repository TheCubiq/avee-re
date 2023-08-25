package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
/* loaded from: classes2.dex */
public class in0 extends AppCompatCheckBox {

    /* renamed from: v */
    public static final int f13801v = k21.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: w */
    public static final int[][] f13802w = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: t */
    public ColorStateList f13803t;

    /* renamed from: u */
    public boolean f13804u;

    public in0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.f30748c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public in0(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f13801v;
        Context context2 = getContext();
        TypedArray m5026h = xk1.m5026h(context2, attributeSet, m21.f18052G2, i, i2, new int[0]);
        int i3 = m21.f18059H2;
        if (m5026h.hasValue(i3)) {
            C3708yi.m3732c(this, mn0.m15930a(context2, m5026h, i3));
        }
        this.f13804u = m5026h.getBoolean(m21.f18066I2, false);
        m5026h.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f13803t == null) {
            int[][] iArr = f13802w;
            int[] iArr2 = new int[iArr.length];
            int m18396c = jn0.m18396c(this, w01.f30749f);
            int m18396c2 = jn0.m18396c(this, w01.colorSurface);
            int m18396c3 = jn0.m18396c(this, w01.colorOnSurface);
            iArr2[0] = jn0.m18393f(m18396c2, m18396c, 1.0f);
            iArr2[1] = jn0.m18393f(m18396c2, m18396c3, 0.54f);
            iArr2[2] = jn0.m18393f(m18396c2, m18396c3, 0.38f);
            iArr2[3] = jn0.m18393f(m18396c2, m18396c3, 0.38f);
            this.f13803t = new ColorStateList(iArr, iArr2);
        }
        return this.f13803t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13804u && C3708yi.m3733b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f13804u = z;
        C3708yi.m3732c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
