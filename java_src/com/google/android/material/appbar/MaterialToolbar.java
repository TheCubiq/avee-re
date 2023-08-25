package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.daaw.C2366nu;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.nn0;
import com.daaw.on0;
import com.daaw.qn0;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: k0 */
    public static final int f37156k0 = k21.Widget_MaterialComponents_Toolbar;

    /* renamed from: j0 */
    public Integer f37157j0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.f30746F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f37156k0;
        Context context2 = getContext();
        TypedArray m5026h = xk1.m5026h(context2, attributeSet, m21.f18178Y2, i, i2, new int[0]);
        int i3 = m21.f18185Z2;
        if (m5026h.hasValue(i3)) {
            setNavigationIconTint(m5026h.getColor(i3, -1));
        }
        m5026h.recycle();
        m996R(context2);
    }

    /* renamed from: R */
    public final void m996R(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            nn0 nn0Var = new nn0();
            nn0Var.m14997W(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            nn0Var.m15007M(context);
            nn0Var.m14998V(xs1.m4689y(this));
            xs1.m4694v0(this, nn0Var);
        }
    }

    /* renamed from: S */
    public final Drawable m995S(Drawable drawable) {
        if (drawable == null || this.f37157j0 == null) {
            return drawable;
        }
        Drawable m14809r = C2366nu.m14809r(drawable);
        C2366nu.m14813n(m14809r, this.f37157j0.intValue());
        return m14809r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.m14141e(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        on0.m14142d(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m995S(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f37157j0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
