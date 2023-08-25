package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class bz1 extends Drawable implements Drawable.Callback, az1, ql1 {
    public static final PorterDuff.Mode v = PorterDuff.Mode.SRC_IN;
    public int p;
    public PorterDuff.Mode q;
    public boolean r;
    public dz1 s;
    public boolean t;
    public Drawable u;

    public bz1(Drawable drawable) {
        this.s = d();
        a(drawable);
    }

    public bz1(dz1 dz1Var, Resources resources) {
        this.s = dz1Var;
        e(resources);
    }

    @Override // com.daaw.az1
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            dz1 dz1Var = this.s;
            if (dz1Var != null) {
                dz1Var.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // com.daaw.az1
    public final Drawable b() {
        return this.u;
    }

    public boolean c() {
        return true;
    }

    public final dz1 d() {
        return new dz1(this.s);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.u.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        dz1 dz1Var = this.s;
        if (dz1Var == null || (constantState = dz1Var.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (c()) {
            dz1 dz1Var = this.s;
            ColorStateList colorStateList = dz1Var.c;
            PorterDuff.Mode mode = dz1Var.d;
            if (colorStateList == null || mode == null) {
                this.r = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.r || colorForState != this.p || mode != this.q) {
                    setColorFilter(colorForState, mode);
                    this.p = colorForState;
                    this.q = mode;
                    this.r = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        dz1 dz1Var = this.s;
        return changingConfigurations | (dz1Var != null ? dz1Var.getChangingConfigurations() : 0) | this.u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        dz1 dz1Var = this.s;
        if (dz1Var == null || !dz1Var.a()) {
            return null;
        }
        this.s.a = getChangingConfigurations();
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.u.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.u.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.u.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return nu.f(this.u);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.u.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.u.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.u.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.u.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.u.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.u.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return nu.h(this.u);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        dz1 dz1Var;
        ColorStateList colorStateList = (!c() || (dz1Var = this.s) == null) ? null : dz1Var.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.u.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.u.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t && super.mutate() == this) {
            this.s = d();
            Drawable drawable = this.u;
            if (drawable != null) {
                drawable.mutate();
            }
            dz1 dz1Var = this.s;
            if (dz1Var != null) {
                Drawable drawable2 = this.u;
                dz1Var.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return nu.m(this.u, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.u.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.u.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        nu.j(this.u, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.u.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.u.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.u.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.u.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.u.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.s.c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        this.s.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.u.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
