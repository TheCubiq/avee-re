package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.daaw.k21;
import com.daaw.nn0;
import com.daaw.nu;
import com.daaw.on0;
import com.daaw.w01;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public static final int k0 = k21.Widget_MaterialComponents_Toolbar;
    public Integer j0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.k0
            android.content.Context r7 = com.daaw.qn0.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r7 = r6.getContext()
            int[] r2 = com.daaw.m21.Y2
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.daaw.xk1.h(r0, r1, r2, r3, r4, r5)
            int r9 = com.daaw.m21.Z2
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L29
            r0 = -1
            int r9 = r8.getColor(r9, r0)
            r6.setNavigationIconTint(r9)
        L29:
            r8.recycle()
            r6.R(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void R(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            nn0 nn0Var = new nn0();
            nn0Var.W(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            nn0Var.M(context);
            nn0Var.V(xs1.y(this));
            xs1.v0(this, nn0Var);
        }
    }

    public final Drawable S(Drawable drawable) {
        if (drawable == null || this.j0 == null) {
            return drawable;
        }
        Drawable r = nu.r(drawable);
        nu.n(r, this.j0.intValue());
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.e(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        on0.d(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(S(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.j0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
