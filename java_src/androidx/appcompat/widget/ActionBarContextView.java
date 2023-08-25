package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.c21;
import com.daaw.hu1;
import com.daaw.n0;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.ut1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ActionBarContextView extends com.daaw.b {
    public View A;
    public View B;
    public LinearLayout C;
    public TextView D;
    public TextView E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public CharSequence x;
    public CharSequence y;
    public View z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ n0 p;

        public a(n0 n0Var) {
            this.p = n0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.p.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ul1 v = ul1.v(context, attributeSet, x21.y, i, 0);
        xs1.v0(this, v.g(x21.z));
        this.F = v.n(x21.D, 0);
        this.G = v.n(x21.C, 0);
        this.t = v.m(x21.B, 0);
        this.I = v.n(x21.A, c21.abc_action_mode_close_item_material);
        v.w();
    }

    @Override // com.daaw.b
    public /* bridge */ /* synthetic */ ut1 f(int i, long j) {
        return super.f(i, j);
    }

    public void g() {
        if (this.z == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.daaw.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // com.daaw.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.daaw.n0 r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.z
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.I
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.z = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.z
            goto L15
        L22:
            android.view.View r0 = r3.z
            int r1 = com.daaw.o11.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.A = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.s
            if (r0 == 0) goto L41
            r0.A()
        L41:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.s = r0
            r1 = 1
            r0.L(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.s
            android.content.Context r2 = r3.q
            r4.c(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.s
            androidx.appcompat.view.menu.j r4 = r4.q(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.r = r4
            r1 = 0
            com.daaw.xs1.v0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.r
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(com.daaw.n0):void");
    }

    public final void i() {
        if (this.C == null) {
            LayoutInflater.from(getContext()).inflate(c21.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.C = linearLayout;
            this.D = (TextView) linearLayout.findViewById(o11.action_bar_title);
            this.E = (TextView) this.C.findViewById(o11.action_bar_subtitle);
            if (this.F != 0) {
                this.D.setTextAppearance(getContext(), this.F);
            }
            if (this.G != 0) {
                this.E.setTextAppearance(getContext(), this.G);
            }
        }
        this.D.setText(this.x);
        this.E.setText(this.y);
        boolean z = !TextUtils.isEmpty(this.x);
        boolean z2 = !TextUtils.isEmpty(this.y);
        int i = 0;
        this.E.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.C;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.C.getParent() == null) {
            addView(this.C);
        }
    }

    public boolean j() {
        return this.H;
    }

    public void k() {
        removeAllViews();
        this.B = null;
        this.r = null;
        this.s = null;
        View view = this.A;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.s;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.s.E();
        }
    }

    @Override // com.daaw.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = hu1.b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.z;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = com.daaw.b.d(paddingRight, i5, b);
            paddingRight = com.daaw.b.d(d + e(this.z, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.C;
        if (linearLayout != null && this.B == null && linearLayout.getVisibility() != 8) {
            i7 += e(this.C, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.B;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.r;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.t;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.z;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.r;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.r, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.C;
            if (linearLayout != null && this.B == null) {
                if (this.H) {
                    this.C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.C.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.C.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.B;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.t > 0) {
                setMeasuredDimension(size, i3);
                return;
            }
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
        }
    }

    @Override // com.daaw.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.b
    public void setContentHeight(int i) {
        this.t = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.B;
        if (view2 != null) {
            removeView(view2);
        }
        this.B = view;
        if (view != null && (linearLayout = this.C) != null) {
            removeView(linearLayout);
            this.C = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.y = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.x = charSequence;
        i();
        xs1.u0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.H) {
            requestLayout();
        }
        this.H = z;
    }

    @Override // com.daaw.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
