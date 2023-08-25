package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public class i91 extends FrameLayout {
    public Drawable p;
    public Rect q;
    public Rect r;
    public boolean s;
    public boolean t;

    /* loaded from: classes2.dex */
    public class a implements vt0 {
        public a() {
        }

        @Override // com.daaw.vt0
        public px1 a(View view, px1 px1Var) {
            i91 i91Var = i91.this;
            if (i91Var.q == null) {
                i91Var.q = new Rect();
            }
            i91.this.q.set(px1Var.j(), px1Var.l(), px1Var.k(), px1Var.i());
            i91.this.a(px1Var);
            i91.this.setWillNotDraw(!px1Var.m() || i91.this.p == null);
            xs1.i0(i91.this);
            return px1Var.c();
        }
    }

    public i91(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i91(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new Rect();
        this.s = true;
        this.t = true;
        TypedArray h = xk1.h(context, attributeSet, m21.P3, i, k21.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.p = h.getDrawable(m21.Q3);
        h.recycle();
        setWillNotDraw(true);
        xs1.D0(this, new a());
    }

    public void a(px1 px1Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.q == null || this.p == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.s) {
            this.r.set(0, 0, width, this.q.top);
            this.p.setBounds(this.r);
            this.p.draw(canvas);
        }
        if (this.t) {
            this.r.set(0, height - this.q.bottom, width, height);
            this.p.setBounds(this.r);
            this.p.draw(canvas);
        }
        Rect rect = this.r;
        Rect rect2 = this.q;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.p.setBounds(this.r);
        this.p.draw(canvas);
        Rect rect3 = this.r;
        Rect rect4 = this.q;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.p.setBounds(this.r);
        this.p.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.t = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.s = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.p = drawable;
    }
}
