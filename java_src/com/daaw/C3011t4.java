package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: com.daaw.t4 */
/* loaded from: classes.dex */
public class C3011t4 extends C2241n4 {

    /* renamed from: d */
    public final SeekBar f26985d;

    /* renamed from: e */
    public Drawable f26986e;

    /* renamed from: f */
    public ColorStateList f26987f;

    /* renamed from: g */
    public PorterDuff.Mode f26988g;

    /* renamed from: h */
    public boolean f26989h;

    /* renamed from: i */
    public boolean f26990i;

    public C3011t4(SeekBar seekBar) {
        super(seekBar);
        this.f26987f = null;
        this.f26988g = null;
        this.f26989h = false;
        this.f26990i = false;
        this.f26985d = seekBar;
    }

    @Override // com.daaw.C2241n4
    /* renamed from: c */
    public void mo9546c(AttributeSet attributeSet, int i) {
        super.mo9546c(attributeSet, i);
        Context context = this.f26985d.getContext();
        int[] iArr = x21.f31853T;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f26985d;
        xs1.m4706p0(seekBar, seekBar.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        Drawable m8051h = m8037v.m8051h(x21.f31858U);
        if (m8051h != null) {
            this.f26985d.setThumb(m8051h);
        }
        m9541j(m8037v.m8052g(x21.f31862V));
        int i2 = x21.f31870X;
        if (m8037v.m8040s(i2)) {
            this.f26988g = C3373vu.m6785e(m8037v.m8048k(i2, -1), this.f26988g);
            this.f26990i = true;
        }
        int i3 = x21.f31866W;
        if (m8037v.m8040s(i3)) {
            this.f26987f = m8037v.m8056c(i3);
            this.f26989h = true;
        }
        m8037v.m8036w();
        m9545f();
    }

    /* renamed from: f */
    public final void m9545f() {
        Drawable drawable = this.f26986e;
        if (drawable != null) {
            if (this.f26989h || this.f26990i) {
                Drawable m14809r = C2366nu.m14809r(drawable.mutate());
                this.f26986e = m14809r;
                if (this.f26989h) {
                    C2366nu.m14812o(m14809r, this.f26987f);
                }
                if (this.f26990i) {
                    C2366nu.m14811p(this.f26986e, this.f26988g);
                }
                if (this.f26986e.isStateful()) {
                    this.f26986e.setState(this.f26985d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m9544g(Canvas canvas) {
        if (this.f26986e != null) {
            int max = this.f26985d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f26986e.getIntrinsicWidth();
                int intrinsicHeight = this.f26986e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f26986e.setBounds(-i, -i2, i, i2);
                float width = ((this.f26985d.getWidth() - this.f26985d.getPaddingLeft()) - this.f26985d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f26985d.getPaddingLeft(), this.f26985d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f26986e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m9543h() {
        Drawable drawable = this.f26986e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f26985d.getDrawableState())) {
            this.f26985d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m9542i() {
        Drawable drawable = this.f26986e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m9541j(Drawable drawable) {
        Drawable drawable2 = this.f26986e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f26986e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f26985d);
            C2366nu.m14814m(drawable, xs1.m4768E(this.f26985d));
            if (drawable.isStateful()) {
                drawable.setState(this.f26985d.getDrawableState());
            }
            m9545f();
        }
        this.f26985d.invalidate();
    }
}
