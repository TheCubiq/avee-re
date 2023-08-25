package com.daaw;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class ve1 extends l70 {

    /* renamed from: p */
    public l70 f30171p;

    /* renamed from: q */
    public C3326a f30172q;

    /* renamed from: r */
    public boolean f30173r;

    /* renamed from: com.daaw.ve1$a */
    /* loaded from: classes.dex */
    public static class C3326a extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f30174a;

        /* renamed from: b */
        public final int f30175b;

        public C3326a(Drawable.ConstantState constantState, int i) {
            this.f30174a = constantState;
            this.f30175b = i;
        }

        public C3326a(C3326a c3326a) {
            this(c3326a.f30174a, c3326a.f30175b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new ve1(this, null, resources);
        }
    }

    public ve1(l70 l70Var, int i) {
        this(new C3326a(l70Var.getConstantState(), i), l70Var, null);
    }

    public ve1(C3326a c3326a, l70 l70Var, Resources resources) {
        this.f30172q = c3326a;
        if (l70Var != null) {
            this.f30171p = l70Var;
            return;
        }
        Drawable.ConstantState constantState = c3326a.f30174a;
        this.f30171p = (l70) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
    }

    @Override // com.daaw.l70
    /* renamed from: b */
    public boolean mo7215b() {
        return this.f30171p.mo7215b();
    }

    @Override // com.daaw.l70
    /* renamed from: c */
    public void mo7214c(int i) {
        this.f30171p.mo7214c(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f30171p.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f30171p.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public int getAlpha() {
        return this.f30171p.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public Drawable.Callback getCallback() {
        return this.f30171p.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f30171p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f30172q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f30171p.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f30172q.f30175b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f30172q.f30175b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f30171p.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f30171p.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30171p.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f30171p.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f30171p.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f30171p.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f30173r && super.mutate() == this) {
            this.f30171p = (l70) this.f30171p.mutate();
            this.f30172q = new C3326a(this.f30172q);
            this.f30173r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f30171p.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f30171p.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f30171p.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f30171p.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f30171p.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f30171p.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30171p.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f30171p.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f30171p.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f30171p.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f30171p.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f30171p.stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f30171p.unscheduleSelf(runnable);
    }
}
