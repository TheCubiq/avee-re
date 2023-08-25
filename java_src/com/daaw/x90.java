package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class x90 extends ot1<View> {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public x90() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public x90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.daaw.ot1
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            px1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && xs1.B(coordinatorLayout) && !xs1.B(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.e;
            g80.a(N(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i2 = rect2.top - H.getBottom();
        } else {
            super.F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f = i2;
    }

    public abstract View H(List<View> list);

    public final int I(View view) {
        if (this.g == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.g;
        return sn0.b((int) (J * i), 0, i);
    }

    public float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f;
    }

    public final void O(int i) {
        this.g = i;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        px1 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (H = H(coordinatorLayout.r(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (xs1.B(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.l() + lastWindowInsets.i();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.J(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }
}
