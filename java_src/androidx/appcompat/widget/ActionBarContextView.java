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
import androidx.appcompat.view.menu.C0082e;
import com.daaw.AbstractC0783b;
import com.daaw.AbstractC2228n0;
import com.daaw.c21;
import com.daaw.hu1;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.ut1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0783b {

    /* renamed from: A */
    public View f475A;

    /* renamed from: B */
    public View f476B;

    /* renamed from: C */
    public LinearLayout f477C;

    /* renamed from: D */
    public TextView f478D;

    /* renamed from: E */
    public TextView f479E;

    /* renamed from: F */
    public int f480F;

    /* renamed from: G */
    public int f481G;

    /* renamed from: H */
    public boolean f482H;

    /* renamed from: I */
    public int f483I;

    /* renamed from: x */
    public CharSequence f484x;

    /* renamed from: y */
    public CharSequence f485y;

    /* renamed from: z */
    public View f486z;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0100a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ AbstractC2228n0 f487p;

        public View$OnClickListenerC0100a(AbstractC2228n0 abstractC2228n0) {
            this.f487p = abstractC2228n0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f487p.mo15648c();
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
        ul1 m8037v = ul1.m8037v(context, attributeSet, x21.f32002y, i, 0);
        xs1.m4694v0(this, m8037v.m8052g(x21.f32007z));
        this.f480F = m8037v.m8045n(x21.f31773D, 0);
        this.f481G = m8037v.m8045n(x21.f31768C, 0);
        this.f4141t = m8037v.m8046m(x21.f31763B, 0);
        this.f483I = m8037v.m8045n(x21.f31758A, c21.abc_action_mode_close_item_material);
        m8037v.m8036w();
    }

    @Override // com.daaw.AbstractC0783b
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ut1 mo26566f(int i, long j) {
        return super.mo26566f(i, j);
    }

    /* renamed from: g */
    public void m30160g() {
        if (this.f486z == null) {
            m30156k();
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

    @Override // com.daaw.AbstractC0783b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // com.daaw.AbstractC0783b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f485y;
    }

    public CharSequence getTitle() {
        return this.f484x;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m30159h(AbstractC2228n0 abstractC2228n0) {
        View view;
        ActionMenuPresenter actionMenuPresenter;
        View view2 = this.f486z;
        if (view2 != null) {
            if (view2.getParent() == null) {
                view = this.f486z;
            }
            View findViewById = this.f486z.findViewById(o11.action_mode_close_button);
            this.f475A = findViewById;
            findViewById.setOnClickListener(new View$OnClickListenerC0100a(abstractC2228n0));
            C0082e c0082e = (C0082e) abstractC2228n0.mo15646e();
            actionMenuPresenter = this.f4140s;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.m30141A();
            }
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
            this.f4140s = actionMenuPresenter2;
            actionMenuPresenter2.m30130L(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            c0082e.m30243c(this.f4140s, this.f4138q);
            ActionMenuView actionMenuView = (ActionMenuView) this.f4140s.mo30125q(this);
            this.f4139r = actionMenuView;
            xs1.m4694v0(actionMenuView, null);
            addView(this.f4139r, layoutParams);
        }
        view = LayoutInflater.from(getContext()).inflate(this.f483I, (ViewGroup) this, false);
        this.f486z = view;
        addView(view);
        View findViewById2 = this.f486z.findViewById(o11.action_mode_close_button);
        this.f475A = findViewById2;
        findViewById2.setOnClickListener(new View$OnClickListenerC0100a(abstractC2228n0));
        C0082e c0082e2 = (C0082e) abstractC2228n0.mo15646e();
        actionMenuPresenter = this.f4140s;
        if (actionMenuPresenter != null) {
        }
        ActionMenuPresenter actionMenuPresenter22 = new ActionMenuPresenter(getContext());
        this.f4140s = actionMenuPresenter22;
        actionMenuPresenter22.m30130L(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        c0082e2.m30243c(this.f4140s, this.f4138q);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.f4140s.mo30125q(this);
        this.f4139r = actionMenuView2;
        xs1.m4694v0(actionMenuView2, null);
        addView(this.f4139r, layoutParams2);
    }

    /* renamed from: i */
    public final void m30158i() {
        if (this.f477C == null) {
            LayoutInflater.from(getContext()).inflate(c21.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f477C = linearLayout;
            this.f478D = (TextView) linearLayout.findViewById(o11.action_bar_title);
            this.f479E = (TextView) this.f477C.findViewById(o11.action_bar_subtitle);
            if (this.f480F != 0) {
                this.f478D.setTextAppearance(getContext(), this.f480F);
            }
            if (this.f481G != 0) {
                this.f479E.setTextAppearance(getContext(), this.f481G);
            }
        }
        this.f478D.setText(this.f484x);
        this.f479E.setText(this.f485y);
        boolean z = !TextUtils.isEmpty(this.f484x);
        boolean z2 = !TextUtils.isEmpty(this.f485y);
        int i = 0;
        this.f479E.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f477C;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f477C.getParent() == null) {
            addView(this.f477C);
        }
    }

    /* renamed from: j */
    public boolean m30157j() {
        return this.f482H;
    }

    /* renamed from: k */
    public void m30156k() {
        removeAllViews();
        this.f476B = null;
        this.f4139r = null;
        this.f4140s = null;
        View view = this.f475A;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m30155l() {
        ActionMenuPresenter actionMenuPresenter = this.f4140s;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m30129M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f4140s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m30138D();
            this.f4140s.m30137E();
        }
    }

    @Override // com.daaw.AbstractC0783b, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m20417b = hu1.m20417b(this);
        int paddingRight = m20417b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f486z;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f486z.getLayoutParams();
            int i5 = m20417b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m20417b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m26568d = AbstractC0783b.m26568d(paddingRight, i5, m20417b);
            paddingRight = AbstractC0783b.m26568d(m26568d + m26567e(this.f486z, m26568d, paddingTop, paddingTop2, m20417b), i6, m20417b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f477C;
        if (linearLayout != null && this.f476B == null && linearLayout.getVisibility() != 8) {
            i7 += m26567e(this.f477C, i7, paddingTop, paddingTop2, m20417b);
        }
        int i8 = i7;
        View view2 = this.f476B;
        if (view2 != null) {
            m26567e(view2, i8, paddingTop, paddingTop2, m20417b);
        }
        int paddingLeft = m20417b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4139r;
        if (actionMenuView != null) {
            m26567e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m20417b);
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
            int i3 = this.f4141t;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f486z;
            if (view != null) {
                int m26569c = m26569c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f486z.getLayoutParams();
                paddingLeft = m26569c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f4139r;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m26569c(this.f4139r, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f477C;
            if (linearLayout != null && this.f476B == null) {
                if (this.f482H) {
                    this.f477C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f477C.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f477C.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m26569c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f476B;
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
                this.f476B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.f4141t > 0) {
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

    @Override // com.daaw.AbstractC0783b, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.AbstractC0783b
    public void setContentHeight(int i) {
        this.f4141t = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f476B;
        if (view2 != null) {
            removeView(view2);
        }
        this.f476B = view;
        if (view != null && (linearLayout = this.f477C) != null) {
            removeView(linearLayout);
            this.f477C = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f485y = charSequence;
        m30158i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f484x = charSequence;
        m30158i();
        xs1.m4696u0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f482H) {
            requestLayout();
        }
        this.f482H = z;
    }

    @Override // com.daaw.AbstractC0783b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
