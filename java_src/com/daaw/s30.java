package com.daaw;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class s30 extends FrameLayout {

    /* renamed from: p */
    public ArrayList<View> f25822p;

    /* renamed from: q */
    public ArrayList<View> f25823q;

    /* renamed from: r */
    public View.OnApplyWindowInsetsListener f25824r;

    /* renamed from: s */
    public boolean f25825s;

    public s30(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f25825s = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s21.f25808h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(s21.f25809i) : classAttribute;
        String string = obtainStyledAttributes.getString(s21.f25810j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment m29319g0 = fragmentManager.m29319g0(id);
        if (classAttribute != null && m29319g0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo29219a = fragmentManager.m29294p0().mo29219a(context.getClassLoader(), classAttribute);
            mo29219a.m29500A0(context, attributeSet, null);
            fragmentManager.m29305l().m29138o(true).m29150c(this, mo29219a, string).mo29144i();
        }
        fragmentManager.m29355R0(this);
    }

    /* renamed from: a */
    public final void m10747a(View view) {
        ArrayList<View> arrayList = this.f25823q;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f25822p == null) {
            this.f25822p = new ArrayList<>();
        }
        this.f25822p.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m29276y0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m29276y0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        px1 m12938w = px1.m12938w(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f25824r;
        px1 m12938w2 = onApplyWindowInsetsListener != null ? px1.m12938w(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : xs1.m4730d0(this, m12938w);
        if (!m12938w2.m12945p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                xs1.m4721i(getChildAt(i), m12938w2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f25825s && this.f25822p != null) {
            for (int i = 0; i < this.f25822p.size(); i++) {
                super.drawChild(canvas, this.f25822p.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f25825s || (arrayList = this.f25822p) == null || arrayList.size() <= 0 || !this.f25822p.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f25823q;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f25822p;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f25825s = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m10747a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m10747a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m10747a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m10747a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m10747a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m10747a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m10747a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f25825s = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f25824r = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f25823q == null) {
                this.f25823q = new ArrayList<>();
            }
            this.f25823q.add(view);
        }
        super.startViewTransition(view);
    }
}
