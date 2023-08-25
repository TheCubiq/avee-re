package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
/* renamed from: com.daaw.b */
/* loaded from: classes.dex */
public abstract class AbstractC0783b extends ViewGroup {

    /* renamed from: p */
    public final C0784a f4137p;

    /* renamed from: q */
    public final Context f4138q;

    /* renamed from: r */
    public ActionMenuView f4139r;

    /* renamed from: s */
    public ActionMenuPresenter f4140s;

    /* renamed from: t */
    public int f4141t;

    /* renamed from: u */
    public ut1 f4142u;

    /* renamed from: v */
    public boolean f4143v;

    /* renamed from: w */
    public boolean f4144w;

    /* renamed from: com.daaw.b$a */
    /* loaded from: classes.dex */
    public class C0784a implements wt1 {

        /* renamed from: a */
        public boolean f4145a = false;

        /* renamed from: b */
        public int f4146b;

        public C0784a() {
        }

        @Override // com.daaw.wt1
        /* renamed from: a */
        public void mo4527a(View view) {
            this.f4145a = true;
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            if (this.f4145a) {
                return;
            }
            AbstractC0783b abstractC0783b = AbstractC0783b.this;
            abstractC0783b.f4142u = null;
            AbstractC0783b.super.setVisibility(this.f4146b);
        }

        @Override // com.daaw.wt1
        /* renamed from: c */
        public void mo4526c(View view) {
            AbstractC0783b.super.setVisibility(0);
            this.f4145a = false;
        }

        /* renamed from: d */
        public C0784a m26565d(ut1 ut1Var, int i) {
            AbstractC0783b.this.f4142u = ut1Var;
            this.f4146b = i;
            return this;
        }
    }

    public AbstractC0783b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0783b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4137p = new C0784a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(x01.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4138q = context;
        } else {
            this.f4138q = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    public static int m26568d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public int m26569c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: e */
    public int m26567e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public ut1 mo26566f(int i, long j) {
        ut1 m7734b;
        ut1 ut1Var = this.f4142u;
        if (ut1Var != null) {
            ut1Var.m7733c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            m7734b = xs1.m4729e(this).m7734b(1.0f);
        } else {
            m7734b = xs1.m4729e(this).m7734b(0.0f);
        }
        m7734b.m7730f(j);
        m7734b.m7728h(this.f4137p.m26565d(m7734b, i));
        return m7734b;
    }

    public int getAnimatedVisibility() {
        return this.f4142u != null ? this.f4137p.f4146b : getVisibility();
    }

    public int getContentHeight() {
        return this.f4141t;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, x21.f31882a, x01.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(x21.f31927j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f4140s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m30134H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4144w = false;
        }
        if (!this.f4144w) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4144w = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4144w = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4143v = false;
        }
        if (!this.f4143v) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4143v = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4143v = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f4141t = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ut1 ut1Var = this.f4142u;
            if (ut1Var != null) {
                ut1Var.m7733c();
            }
            super.setVisibility(i);
        }
    }
}
