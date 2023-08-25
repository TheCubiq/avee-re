package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes2.dex */
public class y51 extends Drawable implements jc1, ql1 {

    /* renamed from: p */
    public C3671b f33368p;

    /* renamed from: com.daaw.y51$b */
    /* loaded from: classes2.dex */
    public static final class C3671b extends Drawable.ConstantState {

        /* renamed from: a */
        public nn0 f33369a;

        /* renamed from: b */
        public boolean f33370b;

        public C3671b(nn0 nn0Var) {
            this.f33369a = nn0Var;
            this.f33370b = false;
        }

        public C3671b(C3671b c3671b) {
            this.f33369a = (nn0) c3671b.f33369a.getConstantState().newDrawable();
            this.f33370b = c3671b.f33370b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public y51 newDrawable() {
            return new y51(new C3671b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public y51(gc1 gc1Var) {
        this(new C3671b(new nn0(gc1Var)));
    }

    public y51(C3671b c3671b) {
        this.f33368p = c3671b;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public y51 mutate() {
        this.f33368p = new C3671b(this.f33368p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C3671b c3671b = this.f33368p;
        if (c3671b.f33370b) {
            c3671b.f33369a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f33368p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33368p.f33369a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33368p.f33369a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f33368p.f33369a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m2811b = z51.m2811b(iArr);
        C3671b c3671b = this.f33368p;
        if (c3671b.f33370b != m2811b) {
            c3671b.f33370b = m2811b;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f33368p.f33369a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33368p.f33369a.setColorFilter(colorFilter);
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.f33368p.f33369a.setShapeAppearanceModel(gc1Var);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        this.f33368p.f33369a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.f33368p.f33369a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        this.f33368p.f33369a.setTintMode(mode);
    }
}
