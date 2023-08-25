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

    /* renamed from: d */
    public final Rect f32189d;

    /* renamed from: e */
    public final Rect f32190e;

    /* renamed from: f */
    public int f32191f;

    /* renamed from: g */
    public int f32192g;

    public x90() {
        this.f32189d = new Rect();
        this.f32190e = new Rect();
        this.f32191f = 0;
    }

    public x90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32189d = new Rect();
        this.f32190e = new Rect();
        this.f32191f = 0;
    }

    /* renamed from: N */
    public static int m5423N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.daaw.ot1
    /* renamed from: F */
    public void mo5427F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View mo1010H = mo1010H(coordinatorLayout.m29789r(view));
        if (mo1010H != null) {
            CoordinatorLayout.C0197f c0197f = (CoordinatorLayout.C0197f) view.getLayoutParams();
            Rect rect = this.f32189d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0197f).leftMargin, mo1010H.getBottom() + ((ViewGroup.MarginLayoutParams) c0197f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin, ((coordinatorLayout.getHeight() + mo1010H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin);
            px1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && xs1.m4774B(coordinatorLayout) && !xs1.m4774B(view)) {
                rect.left += lastWindowInsets.m12951j();
                rect.right -= lastWindowInsets.m12950k();
            }
            Rect rect2 = this.f32190e;
            g80.m21895a(m5423N(c0197f.f1138c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m5426I = m5426I(mo1010H);
            view.layout(rect2.left, rect2.top - m5426I, rect2.right, rect2.bottom - m5426I);
            i2 = rect2.top - mo1010H.getBottom();
        } else {
            super.mo5427F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f32191f = i2;
    }

    /* renamed from: H */
    public abstract View mo1010H(List<View> list);

    /* renamed from: I */
    public final int m5426I(View view) {
        if (this.f32192g == 0) {
            return 0;
        }
        float mo1009J = mo1009J(view);
        int i = this.f32192g;
        return sn0.m10152b((int) (mo1009J * i), 0, i);
    }

    /* renamed from: J */
    public float mo1009J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m5425K() {
        return this.f32192g;
    }

    /* renamed from: L */
    public int mo1008L(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: M */
    public final int m5424M() {
        return this.f32191f;
    }

    /* renamed from: O */
    public final void m5422O(int i) {
        this.f32192g = i;
    }

    /* renamed from: P */
    public boolean m5421P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: m */
    public boolean mo1002m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo1010H;
        px1 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo1010H = mo1010H(coordinatorLayout.m29789r(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (xs1.m4774B(mo1010H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m12949l() + lastWindowInsets.m12952i();
            }
            int mo1008L = size + mo1008L(mo1010H);
            int measuredHeight = mo1010H.getMeasuredHeight();
            if (m5421P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo1008L -= measuredHeight;
            }
            coordinatorLayout.m29815J(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo1008L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }
}
