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
/* loaded from: classes.dex */
public abstract class b extends ViewGroup {
    public final a p;
    public final Context q;
    public ActionMenuView r;
    public ActionMenuPresenter s;
    public int t;
    public ut1 u;
    public boolean v;
    public boolean w;

    /* loaded from: classes.dex */
    public class a implements wt1 {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // com.daaw.wt1
        public void a(View view) {
            this.a = true;
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            if (this.a) {
                return;
            }
            b bVar = b.this;
            bVar.u = null;
            b.super.setVisibility(this.b);
        }

        @Override // com.daaw.wt1
        public void c(View view) {
            b.super.setVisibility(0);
            this.a = false;
        }

        public a d(ut1 ut1Var, int i) {
            b.this.u = ut1Var;
            this.b = i;
            return this;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(x01.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.q = context;
        } else {
            this.q = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
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

    public ut1 f(int i, long j) {
        ut1 b;
        ut1 ut1Var = this.u;
        if (ut1Var != null) {
            ut1Var.c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b = xs1.e(this).b(1.0f);
        } else {
            b = xs1.e(this).b(0.0f);
        }
        b.f(j);
        b.h(this.p.d(b, i));
        return b;
    }

    public int getAnimatedVisibility() {
        return this.u != null ? this.p.b : getVisibility();
    }

    public int getContentHeight() {
        return this.t;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, x21.a, x01.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(x21.j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.w = false;
        }
        if (!this.w) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.w = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.w = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = false;
        }
        if (!this.v) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.v = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.v = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.t = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ut1 ut1Var = this.u;
            if (ut1Var != null) {
                ut1Var.c();
            }
            super.setVisibility(i);
        }
    }
}
