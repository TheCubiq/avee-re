package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
/* renamed from: com.daaw.db */
/* loaded from: classes2.dex */
public class C1070db extends FrameLayout {

    /* renamed from: w */
    public static final View.OnTouchListener f6723w = new View$OnTouchListenerC1071a();

    /* renamed from: p */
    public InterfaceC0945cb f6724p;

    /* renamed from: q */
    public InterfaceC0831bb f6725q;

    /* renamed from: r */
    public int f6726r;

    /* renamed from: s */
    public final float f6727s;

    /* renamed from: t */
    public final float f6728t;

    /* renamed from: u */
    public ColorStateList f6729u;

    /* renamed from: v */
    public PorterDuff.Mode f6730v;

    /* renamed from: com.daaw.db$a */
    /* loaded from: classes2.dex */
    public static class View$OnTouchListenerC1071a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C1070db(Context context, AttributeSet attributeSet) {
        super(qn0.m12324c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m21.f18258i4);
        int i = m21.f18312p4;
        if (obtainStyledAttributes.hasValue(i)) {
            xs1.m4686z0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.f6726r = obtainStyledAttributes.getInt(m21.f18282l4, 0);
        this.f6727s = obtainStyledAttributes.getFloat(m21.f18290m4, 1.0f);
        setBackgroundTintList(mn0.m15930a(context2, obtainStyledAttributes, m21.f18298n4));
        setBackgroundTintMode(fu1.m22258e(obtainStyledAttributes.getInt(m21.f18305o4, -1), PorterDuff.Mode.SRC_IN));
        this.f6728t = obtainStyledAttributes.getFloat(m21.f18274k4, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f6723w);
        setFocusable(true);
        if (getBackground() == null) {
            xs1.m4694v0(this, m24575a());
        }
    }

    /* renamed from: a */
    public final Drawable m24575a() {
        float dimension = getResources().getDimension(f11.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(jn0.m18392g(this, w01.colorSurface, w01.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f6729u != null) {
            Drawable m14809r = C2366nu.m14809r(gradientDrawable);
            C2366nu.m14812o(m14809r, this.f6729u);
            return m14809r;
        }
        return C2366nu.m14809r(gradientDrawable);
    }

    public float getActionTextColorAlpha() {
        return this.f6728t;
    }

    public int getAnimationMode() {
        return this.f6726r;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6727s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0831bb interfaceC0831bb = this.f6725q;
        if (interfaceC0831bb != null) {
            interfaceC0831bb.onViewAttachedToWindow(this);
        }
        xs1.m4708o0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0831bb interfaceC0831bb = this.f6725q;
        if (interfaceC0831bb != null) {
            interfaceC0831bb.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC0945cb interfaceC0945cb = this.f6724p;
        if (interfaceC0945cb != null) {
            interfaceC0945cb.m25458a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f6726r = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6729u != null) {
            drawable = C2366nu.m14809r(drawable.mutate());
            C2366nu.m14812o(drawable, this.f6729u);
            C2366nu.m14811p(drawable, this.f6730v);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6729u = colorStateList;
        if (getBackground() != null) {
            Drawable m14809r = C2366nu.m14809r(getBackground().mutate());
            C2366nu.m14812o(m14809r, colorStateList);
            C2366nu.m14811p(m14809r, this.f6730v);
            if (m14809r != getBackground()) {
                super.setBackgroundDrawable(m14809r);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6730v = mode;
        if (getBackground() != null) {
            Drawable m14809r = C2366nu.m14809r(getBackground().mutate());
            C2366nu.m14811p(m14809r, mode);
            if (m14809r != getBackground()) {
                super.setBackgroundDrawable(m14809r);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC0831bb interfaceC0831bb) {
        this.f6725q = interfaceC0831bb;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f6723w);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC0945cb interfaceC0945cb) {
        this.f6724p = interfaceC0945cb;
    }
}
