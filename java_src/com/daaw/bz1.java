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

    /* renamed from: v */
    public static final PorterDuff.Mode f5287v = PorterDuff.Mode.SRC_IN;

    /* renamed from: p */
    public int f5288p;

    /* renamed from: q */
    public PorterDuff.Mode f5289q;

    /* renamed from: r */
    public boolean f5290r;

    /* renamed from: s */
    public dz1 f5291s;

    /* renamed from: t */
    public boolean f5292t;

    /* renamed from: u */
    public Drawable f5293u;

    public bz1(Drawable drawable) {
        this.f5291s = m25722d();
        mo25724a(drawable);
    }

    public bz1(dz1 dz1Var, Resources resources) {
        this.f5291s = dz1Var;
        m25721e(resources);
    }

    @Override // com.daaw.az1
    /* renamed from: a */
    public final void mo25724a(Drawable drawable) {
        Drawable drawable2 = this.f5293u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5293u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            dz1 dz1Var = this.f5291s;
            if (dz1Var != null) {
                dz1Var.f7997b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // com.daaw.az1
    /* renamed from: b */
    public final Drawable mo25723b() {
        return this.f5293u;
    }

    /* renamed from: c */
    public boolean mo24862c() {
        return true;
    }

    /* renamed from: d */
    public final dz1 m25722d() {
        return new dz1(this.f5291s);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5293u.draw(canvas);
    }

    /* renamed from: e */
    public final void m25721e(Resources resources) {
        Drawable.ConstantState constantState;
        dz1 dz1Var = this.f5291s;
        if (dz1Var == null || (constantState = dz1Var.f7997b) == null) {
            return;
        }
        mo25724a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    public final boolean m25720f(int[] iArr) {
        if (mo24862c()) {
            dz1 dz1Var = this.f5291s;
            ColorStateList colorStateList = dz1Var.f7998c;
            PorterDuff.Mode mode = dz1Var.f7999d;
            if (colorStateList == null || mode == null) {
                this.f5290r = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f5290r || colorForState != this.f5288p || mode != this.f5289q) {
                    setColorFilter(colorForState, mode);
                    this.f5288p = colorForState;
                    this.f5289q = mode;
                    this.f5290r = true;
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
        dz1 dz1Var = this.f5291s;
        return changingConfigurations | (dz1Var != null ? dz1Var.getChangingConfigurations() : 0) | this.f5293u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        dz1 dz1Var = this.f5291s;
        if (dz1Var == null || !dz1Var.m23807a()) {
            return null;
        }
        this.f5291s.f7996a = getChangingConfigurations();
        return this.f5291s;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f5293u.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5293u.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5293u.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C2366nu.m14821f(this.f5293u);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f5293u.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f5293u.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5293u.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f5293u.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f5293u.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f5293u.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C2366nu.m14819h(this.f5293u);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        dz1 dz1Var;
        ColorStateList colorStateList = (!mo24862c() || (dz1Var = this.f5291s) == null) ? null : dz1Var.f7998c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f5293u.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f5293u.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5292t && super.mutate() == this) {
            this.f5291s = m25722d();
            Drawable drawable = this.f5293u;
            if (drawable != null) {
                drawable.mutate();
            }
            dz1 dz1Var = this.f5291s;
            if (dz1Var != null) {
                Drawable drawable2 = this.f5293u;
                dz1Var.f7997b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f5292t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5293u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return C2366nu.m14814m(this.f5293u, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f5293u.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5293u.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C2366nu.m14817j(this.f5293u, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f5293u.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5293u.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f5293u.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f5293u.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m25720f(iArr) || this.f5293u.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.f5291s.f7998c = colorStateList;
        m25720f(getState());
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5291s.f7999d = mode;
        m25720f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f5293u.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
