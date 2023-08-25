package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* loaded from: classes.dex */
public class o4 extends RadioButton implements xl1, vl1, yl1 {
    public final w3 p;
    public final r3 q;
    public final v4 r;
    public f4 s;

    public o4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.I);
    }

    public o4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        yk1.a(this, getContext());
        w3 w3Var = new w3(this);
        this.p = w3Var;
        w3Var.e(attributeSet, i);
        r3 r3Var = new r3(this);
        this.q = r3Var;
        r3Var.e(attributeSet, i);
        v4 v4Var = new v4(this);
        this.r = v4Var;
        v4Var.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private f4 getEmojiTextViewHelper() {
        if (this.s == null) {
            this.s = new f4(this);
        }
        return this.s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.b();
        }
        v4 v4Var = this.r;
        if (v4Var != null) {
            v4Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        w3 w3Var = this.p;
        return w3Var != null ? w3Var.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        r3 r3Var = this.q;
        if (r3Var != null) {
            return r3Var.c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r3 r3Var = this.q;
        if (r3Var != null) {
            return r3Var.d();
        }
        return null;
    }

    @Override // com.daaw.xl1
    public ColorStateList getSupportButtonTintList() {
        w3 w3Var = this.p;
        if (w3Var != null) {
            return w3Var.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        w3 w3Var = this.p;
        if (w3Var != null) {
            return w3Var.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.r.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.r.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(r4.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        w3 w3Var = this.p;
        if (w3Var != null) {
            w3Var.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.r;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.r;
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
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.j(mode);
        }
    }

    @Override // com.daaw.xl1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        w3 w3Var = this.p;
        if (w3Var != null) {
            w3Var.g(colorStateList);
        }
    }

    @Override // com.daaw.xl1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        w3 w3Var = this.p;
        if (w3Var != null) {
            w3Var.h(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.r.w(colorStateList);
        this.r.b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.r.x(mode);
        this.r.b();
    }
}
