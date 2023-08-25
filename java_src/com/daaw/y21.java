package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes2.dex */
public class y21 extends ConstraintLayout {
    public final Runnable M;
    public int N;
    public nn0 O;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y21.this.x();
        }
    }

    public y21(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public y21(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(a21.material_radial_view_group, this);
        xs1.v0(this, t());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.K3, i, 0);
        this.N = obtainStyledAttributes.getDimensionPixelSize(m21.L3, 0);
        this.M = new a();
        obtainStyledAttributes.recycle();
    }

    public static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(xs1.m());
        }
        y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.O.W(ColorStateList.valueOf(i));
    }

    public final Drawable t() {
        nn0 nn0Var = new nn0();
        this.O = nn0Var;
        nn0Var.U(new o31(0.5f));
        this.O.W(ColorStateList.valueOf(-1));
        return this.O;
    }

    public int u() {
        return this.N;
    }

    public void v(int i) {
        this.N = i;
        x();
    }

    public void x() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (w(getChildAt(i2))) {
                i++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = m11.circle_center;
            if (id != i4 && !w(childAt)) {
                cVar.i(childAt.getId(), i4, this.N, f);
                f += 360.0f / (childCount - i);
            }
        }
        cVar.c(this);
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.M);
            handler.post(this.M);
        }
    }
}
