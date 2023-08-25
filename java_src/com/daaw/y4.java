package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class y4 extends ToggleButton implements vl1, yl1 {
    public final r3 p;
    public final v4 q;
    public f4 r;

    public y4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public y4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yk1.a(this, getContext());
        r3 r3Var = new r3(this);
        this.p = r3Var;
        r3Var.e(attributeSet, i);
        v4 v4Var = new v4(this);
        this.q = v4Var;
        v4Var.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private f4 getEmojiTextViewHelper() {
        if (this.r == null) {
            this.r = new f4(this);
        }
        return this.r;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.b();
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.b();
        }
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.q.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.q.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.q.w(colorStateList);
        this.q.b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.q.x(mode);
        this.q.b();
    }
}
