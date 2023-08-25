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

    /* renamed from: p */
    public Drawable f13374p;

    /* renamed from: q */
    public Rect f13375q;

    /* renamed from: r */
    public Rect f13376r;

    /* renamed from: s */
    public boolean f13377s;

    /* renamed from: t */
    public boolean f13378t;

    /* renamed from: com.daaw.i91$a */
    /* loaded from: classes2.dex */
    public class C1670a implements vt0 {
        public C1670a() {
        }

        @Override // com.daaw.vt0
        /* renamed from: a */
        public px1 mo6806a(View view, px1 px1Var) {
            i91 i91Var = i91.this;
            if (i91Var.f13375q == null) {
                i91Var.f13375q = new Rect();
            }
            i91.this.f13375q.set(px1Var.m12951j(), px1Var.m12949l(), px1Var.m12950k(), px1Var.m12952i());
            i91.this.mo343a(px1Var);
            i91.this.setWillNotDraw(!px1Var.m12948m() || i91.this.f13374p == null);
            xs1.m4720i0(i91.this);
            return px1Var.m12958c();
        }
    }

    public i91(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i91(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13376r = new Rect();
        this.f13377s = true;
        this.f13378t = true;
        TypedArray m5026h = xk1.m5026h(context, attributeSet, m21.f18116P3, i, k21.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f13374p = m5026h.getDrawable(m21.f18123Q3);
        m5026h.recycle();
        setWillNotDraw(true);
        xs1.m4769D0(this, new C1670a());
    }

    /* renamed from: a */
    public void mo343a(px1 px1Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f13375q == null || this.f13374p == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f13377s) {
            this.f13376r.set(0, 0, width, this.f13375q.top);
            this.f13374p.setBounds(this.f13376r);
            this.f13374p.draw(canvas);
        }
        if (this.f13378t) {
            this.f13376r.set(0, height - this.f13375q.bottom, width, height);
            this.f13374p.setBounds(this.f13376r);
            this.f13374p.draw(canvas);
        }
        Rect rect = this.f13376r;
        Rect rect2 = this.f13375q;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f13374p.setBounds(this.f13376r);
        this.f13374p.draw(canvas);
        Rect rect3 = this.f13376r;
        Rect rect4 = this.f13375q;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f13374p.setBounds(this.f13376r);
        this.f13374p.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f13374p;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f13374p;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f13378t = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f13377s = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f13374p = drawable;
    }
}
