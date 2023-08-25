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
/* renamed from: com.daaw.id */
/* loaded from: classes2.dex */
public final class C1683id {

    /* renamed from: a */
    public final Rect f13496a;

    /* renamed from: b */
    public final ColorStateList f13497b;

    /* renamed from: c */
    public final ColorStateList f13498c;

    /* renamed from: d */
    public final ColorStateList f13499d;

    /* renamed from: e */
    public final int f13500e;

    /* renamed from: f */
    public final gc1 f13501f;

    public C1683id(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, gc1 gc1Var, Rect rect) {
        ty0.m8702c(rect.left);
        ty0.m8702c(rect.top);
        ty0.m8702c(rect.right);
        ty0.m8702c(rect.bottom);
        this.f13496a = rect;
        this.f13497b = colorStateList2;
        this.f13498c = colorStateList;
        this.f13499d = colorStateList3;
        this.f13500e = i;
        this.f13501f = gc1Var;
    }

    /* renamed from: a */
    public static C1683id m19926a(Context context, int i) {
        ty0.m8704a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.f18345u2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(m21.f18352v2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.f18366x2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.f18359w2, 0), obtainStyledAttributes.getDimensionPixelOffset(m21.f18373y2, 0));
        ColorStateList m15930a = mn0.m15930a(context, obtainStyledAttributes, m21.f18380z2);
        ColorStateList m15930a2 = mn0.m15930a(context, obtainStyledAttributes, m21.f18038E2);
        ColorStateList m15930a3 = mn0.m15930a(context, obtainStyledAttributes, m21.f18024C2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m21.f18031D2, 0);
        gc1 m21769m = gc1.m21811b(context, obtainStyledAttributes.getResourceId(m21.f18010A2, 0), obtainStyledAttributes.getResourceId(m21.f18017B2, 0)).m21769m();
        obtainStyledAttributes.recycle();
        return new C1683id(m15930a, m15930a2, m15930a3, dimensionPixelSize, m21769m, rect);
    }

    /* renamed from: b */
    public int m19925b() {
        return this.f13496a.bottom;
    }

    /* renamed from: c */
    public int m19924c() {
        return this.f13496a.top;
    }

    /* renamed from: d */
    public void m19923d(TextView textView) {
        nn0 nn0Var = new nn0();
        nn0 nn0Var2 = new nn0();
        nn0Var.setShapeAppearanceModel(this.f13501f);
        nn0Var2.setShapeAppearanceModel(this.f13501f);
        nn0Var.m14997W(this.f13498c);
        nn0Var.m14989c0(this.f13500e, this.f13499d);
        textView.setTextColor(this.f13497b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f13497b.withAlpha(30), nn0Var, nn0Var2) : nn0Var;
        Rect rect = this.f13496a;
        xs1.m4694v0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
