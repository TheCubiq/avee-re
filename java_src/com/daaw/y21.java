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
import androidx.constraintlayout.widget.C0182c;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes2.dex */
public class y21 extends ConstraintLayout {

    /* renamed from: M */
    public final Runnable f33226M;

    /* renamed from: N */
    public int f33227N;

    /* renamed from: O */
    public nn0 f33228O;

    /* renamed from: com.daaw.y21$a */
    /* loaded from: classes2.dex */
    public class RunnableC3662a implements Runnable {
        public RunnableC3662a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y21.this.m4250x();
        }
    }

    public y21(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public y21(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(a21.material_radial_view_group, this);
        xs1.m4694v0(this, m4253t());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18081K3, i, 0);
        this.f33227N = obtainStyledAttributes.getDimensionPixelSize(m21.f18088L3, 0);
        this.f33226M = new RunnableC3662a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: w */
    public static boolean m4251w(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(xs1.m4713m());
        }
        m4249y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4250x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m4249y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f33228O.m14997W(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final Drawable m4253t() {
        nn0 nn0Var = new nn0();
        this.f33228O = nn0Var;
        nn0Var.m14999U(new o31(0.5f));
        this.f33228O.m14997W(ColorStateList.valueOf(-1));
        return this.f33228O;
    }

    /* renamed from: u */
    public int m4252u() {
        return this.f33227N;
    }

    /* renamed from: v */
    public void mo163v(int i) {
        this.f33227N = i;
        m4250x();
    }

    /* renamed from: x */
    public void m4250x() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m4251w(getChildAt(i2))) {
                i++;
            }
        }
        C0182c c0182c = new C0182c();
        c0182c.m29854g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = m11.circle_center;
            if (id != i4 && !m4251w(childAt)) {
                c0182c.m29852i(childAt.getId(), i4, this.f33227N, f);
                f += 360.0f / (childCount - i);
            }
        }
        c0182c.m29858c(this);
    }

    /* renamed from: y */
    public final void m4249y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f33226M);
            handler.post(this.f33226M);
        }
    }
}
