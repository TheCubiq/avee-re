package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes2.dex */
public class y51 extends Drawable implements jc1, ql1 {
    public b p;

    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {
        public nn0 a;
        public boolean b;

        public b(nn0 nn0Var) {
            this.a = nn0Var;
            this.b = false;
        }

        public b(b bVar) {
            this.a = (nn0) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public y51 newDrawable() {
            return new y51(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public y51(gc1 gc1Var) {
        this(new b(new nn0(gc1Var)));
    }

    public y51(b bVar) {
        this.p = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public y51 mutate() {
        this.p = new b(this.p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.p;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.p.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.p.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.p.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = z51.b(iArr);
        b bVar = this.p;
        if (bVar.b != b2) {
            bVar.b = b2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.p.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.a.setColorFilter(colorFilter);
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.p.a.setShapeAppearanceModel(gc1Var);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        this.p.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.p.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        this.p.a.setTintMode(mode);
    }
}
