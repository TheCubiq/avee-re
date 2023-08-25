package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* renamed from: com.daaw.o4 */
/* loaded from: classes.dex */
public class C2405o4 extends RadioButton implements xl1, vl1, yl1 {

    /* renamed from: p */
    public final C3396w3 f21018p;

    /* renamed from: q */
    public final C2816r3 f21019q;

    /* renamed from: r */
    public final C3282v4 f21020r;

    /* renamed from: s */
    public C1248f4 f21021s;

    public C2405o4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.f31704I);
    }

    public C2405o4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        yk1.m3617a(this, getContext());
        C3396w3 c3396w3 = new C3396w3(this);
        this.f21018p = c3396w3;
        c3396w3.m6562e(attributeSet, i);
        C2816r3 c2816r3 = new C2816r3(this);
        this.f21019q = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3282v4 c3282v4 = new C3282v4(this);
        this.f21020r = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        getEmojiTextViewHelper().m22934c(attributeSet, i);
    }

    private C1248f4 getEmojiTextViewHelper() {
        if (this.f21021s == null) {
            this.f21021s = new C1248f4(this);
        }
        return this.f21021s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3282v4 c3282v4 = this.f21020r;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C3396w3 c3396w3 = this.f21018p;
        return c3396w3 != null ? c3396w3.m6565b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    @Override // com.daaw.xl1
    public ColorStateList getSupportButtonTintList() {
        C3396w3 c3396w3 = this.f21018p;
        if (c3396w3 != null) {
            return c3396w3.m6564c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3396w3 c3396w3 = this.f21018p;
        if (c3396w3 != null) {
            return c3396w3.m6563d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21020r.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21020r.m7493k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m22933d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C2818r4.m11783b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3396w3 c3396w3 = this.f21018p;
        if (c3396w3 != null) {
            c3396w3.m6561f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f21020r;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f21020r;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m22932e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m22936a(inputFilterArr));
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f21019q;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.xl1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3396w3 c3396w3 = this.f21018p;
        if (c3396w3 != null) {
            c3396w3.m6560g(colorStateList);
        }
    }

    @Override // com.daaw.xl1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3396w3 c3396w3 = this.f21018p;
        if (c3396w3 != null) {
            c3396w3.m6559h(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21020r.m7481w(colorStateList);
        this.f21020r.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21020r.m7480x(mode);
        this.f21020r.m7502b();
    }
}
