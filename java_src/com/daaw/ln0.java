package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
/* loaded from: classes2.dex */
public class ln0 extends o4 {
    public static final int v = k21.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] w = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList t;
    public boolean u;

    public ln0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ln0(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.daaw.ln0.v
            android.content.Context r8 = com.daaw.qn0.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.daaw.m21.J2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.daaw.xk1.h(r0, r1, r2, r3, r4, r5)
            int r10 = com.daaw.m21.K2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = com.daaw.mn0.a(r8, r9, r10)
            com.daaw.yi.c(r7, r8)
        L28:
            int r8 = com.daaw.m21.L2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.u = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ln0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.t == null) {
            int c = jn0.c(this, w01.f);
            int c2 = jn0.c(this, w01.colorOnSurface);
            int c3 = jn0.c(this, w01.colorSurface);
            int[][] iArr = w;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = jn0.f(c3, c, 1.0f);
            iArr2[1] = jn0.f(c3, c2, 0.54f);
            iArr2[2] = jn0.f(c3, c2, 0.38f);
            iArr2[3] = jn0.f(c3, c2, 0.38f);
            this.t = new ColorStateList(iArr, iArr2);
        }
        return this.t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u && yi.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.u = z;
        yi.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
