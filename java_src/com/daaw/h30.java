package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
/* loaded from: classes2.dex */
public class h30 extends androidx.appcompat.widget.b {
    public Drawable E;
    public final Rect F;
    public final Rect G;
    public int H;
    public boolean I;
    public boolean J;

    public h30(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h30(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = new Rect();
        this.G = new Rect();
        this.H = x21.F0;
        this.I = true;
        this.J = false;
        TypedArray h = xk1.h(context, attributeSet, m21.r1, i, 0, new int[0]);
        this.H = h.getInt(m21.t1, this.H);
        Drawable drawable = h.getDrawable(m21.s1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.I = h.getBoolean(m21.u1, true);
        h.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.E;
        if (drawable != null) {
            if (this.J) {
                this.J = false;
                Rect rect = this.F;
                Rect rect2 = this.G;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.I) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.E;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.E.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.E;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.J = z | this.J;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.J = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.E);
            }
            this.E = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.H == 119) {
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
        if (this.H != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.H = i;
            if (i == 119 && this.E != null) {
                this.E.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }
}
