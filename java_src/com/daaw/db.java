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
/* loaded from: classes2.dex */
public class db extends FrameLayout {
    public static final View.OnTouchListener w = new a();
    public cb p;
    public bb q;
    public int r;
    public final float s;
    public final float t;
    public ColorStateList u;
    public PorterDuff.Mode v;

    /* loaded from: classes2.dex */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public db(Context context, AttributeSet attributeSet) {
        super(qn0.c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m21.i4);
        int i = m21.p4;
        if (obtainStyledAttributes.hasValue(i)) {
            xs1.z0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.r = obtainStyledAttributes.getInt(m21.l4, 0);
        this.s = obtainStyledAttributes.getFloat(m21.m4, 1.0f);
        setBackgroundTintList(mn0.a(context2, obtainStyledAttributes, m21.n4));
        setBackgroundTintMode(fu1.e(obtainStyledAttributes.getInt(m21.o4, -1), PorterDuff.Mode.SRC_IN));
        this.t = obtainStyledAttributes.getFloat(m21.k4, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(w);
        setFocusable(true);
        if (getBackground() == null) {
            xs1.v0(this, a());
        }
    }

    public final Drawable a() {
        float dimension = getResources().getDimension(f11.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(jn0.g(this, w01.colorSurface, w01.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.u != null) {
            Drawable r = nu.r(gradientDrawable);
            nu.o(r, this.u);
            return r;
        }
        return nu.r(gradientDrawable);
    }

    public float getActionTextColorAlpha() {
        return this.t;
    }

    public int getAnimationMode() {
        return this.r;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bb bbVar = this.q;
        if (bbVar != null) {
            bbVar.onViewAttachedToWindow(this);
        }
        xs1.o0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bb bbVar = this.q;
        if (bbVar != null) {
            bbVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        cb cbVar = this.p;
        if (cbVar != null) {
            cbVar.a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.r = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.u != null) {
            drawable = nu.r(drawable.mutate());
            nu.o(drawable, this.u);
            nu.p(drawable, this.v);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        if (getBackground() != null) {
            Drawable r = nu.r(getBackground().mutate());
            nu.o(r, colorStateList);
            nu.p(r, this.v);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        if (getBackground() != null) {
            Drawable r = nu.r(getBackground().mutate());
            nu.p(r, mode);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    public void setOnAttachStateChangeListener(bb bbVar) {
        this.q = bbVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : w);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(cb cbVar) {
        this.p = cbVar;
    }
}
