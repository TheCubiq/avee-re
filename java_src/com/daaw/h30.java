package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0164b;
/* loaded from: classes2.dex */
public class h30 extends C0164b {

    /* renamed from: E */
    public Drawable f11981E;

    /* renamed from: F */
    public final Rect f11982F;

    /* renamed from: G */
    public final Rect f11983G;

    /* renamed from: H */
    public int f11984H;

    /* renamed from: I */
    public boolean f11985I;

    /* renamed from: J */
    public boolean f11986J;

    public h30(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h30(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11982F = new Rect();
        this.f11983G = new Rect();
        this.f11984H = x21.f31784F0;
        this.f11985I = true;
        this.f11986J = false;
        TypedArray m5026h = xk1.m5026h(context, attributeSet, m21.f18323r1, i, 0, new int[0]);
        this.f11984H = m5026h.getInt(m21.f18337t1, this.f11984H);
        Drawable drawable = m5026h.getDrawable(m21.f18330s1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f11985I = m5026h.getBoolean(m21.f18344u1, true);
        m5026h.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f11981E;
        if (drawable != null) {
            if (this.f11986J) {
                this.f11986J = false;
                Rect rect = this.f11982F;
                Rect rect2 = this.f11983G;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f11985I) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f11984H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f11981E;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11981E;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f11981E.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f11981E;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f11984H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11981E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11986J = z | this.f11986J;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11986J = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f11981E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f11981E);
            }
            this.f11981E = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f11984H == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f11984H != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f11984H = i;
            if (i == 119 && this.f11981E != null) {
                this.f11981E.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11981E;
    }
}
