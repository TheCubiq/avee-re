package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
/* loaded from: classes2.dex */
public final class id {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final gc1 f;

    public id(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, gc1 gc1Var, Rect rect) {
        ty0.c(rect.left);
        ty0.c(rect.top);
        ty0.c(rect.right);
        ty0.c(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = gc1Var;
    }

    public static id a(Context context, int i) {
        ty0.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.u2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(m21.v2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.x2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.w2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.y2, 0));
        ColorStateList a = mn0.a(context, obtainStyledAttributes, m21.z2);
        ColorStateList a2 = mn0.a(context, obtainStyledAttributes, m21.E2);
        ColorStateList a3 = mn0.a(context, obtainStyledAttributes, m21.C2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m21.D2, 0);
        gc1 m = gc1.b(context, obtainStyledAttributes.getResourceId(m21.A2, 0), obtainStyledAttributes.getResourceId(m21.B2, 0)).m();
        obtainStyledAttributes.recycle();
        return new id(a, a2, a3, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.a.bottom;
    }

    public int c() {
        return this.a.top;
    }

    public void d(TextView textView) {
        nn0 nn0Var = new nn0();
        nn0 nn0Var2 = new nn0();
        nn0Var.setShapeAppearanceModel(this.f);
        nn0Var2.setShapeAppearanceModel(this.f);
        nn0Var.W(this.c);
        nn0Var.c0(this.e, this.d);
        textView.setTextColor(this.b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), nn0Var, nn0Var2) : nn0Var;
        Rect rect = this.a;
        xs1.v0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
