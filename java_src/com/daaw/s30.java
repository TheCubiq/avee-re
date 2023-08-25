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
    public ArrayList<View> p;
    public ArrayList<View> q;
    public View.OnApplyWindowInsetsListener r;
    public boolean s;

    public s30(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.s = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s21.h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(s21.i) : classAttribute;
        String string = obtainStyledAttributes.getString(s21.j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g0 = fragmentManager.g0(id);
        if (classAttribute != null && g0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.p0().a(context.getClassLoader(), classAttribute);
            a.A0(context, attributeSet, null);
            fragmentManager.l().o(true).c(this, a, string).i();
        }
        fragmentManager.R0(this);
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.q;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList<>();
        }
        this.p.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.y0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.y0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        px1 w = px1.w(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.r;
        px1 w2 = onApplyWindowInsetsListener != null ? px1.w(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : xs1.d0(this, w);
        if (!w2.p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                xs1.i(getChildAt(i), w2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.s && this.p != null) {
            for (int i = 0; i < this.p.size(); i++) {
                super.drawChild(canvas, this.p.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.s || (arrayList = this.p) == null || arrayList.size() <= 0 || !this.p.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.q;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.p;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.s = true;
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
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.s = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.r = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.q == null) {
                this.q = new ArrayList<>();
            }
            this.q.add(view);
        }
        super.startViewTransition(view);
    }
}
