package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* renamed from: com.daaw.u3 */
/* loaded from: classes.dex */
public class C3159u3 extends CheckedTextView implements wl1, vl1, yl1 {

    /* renamed from: p */
    public final C3278v3 f28499p;

    /* renamed from: q */
    public final C2816r3 f28500q;

    /* renamed from: r */
    public final C3282v4 f28501r;

    /* renamed from: s */
    public C1248f4 f28502s;

    public C3159u3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.checkedTextViewStyle);
    }

    public C3159u3(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        yk1.m3617a(this, getContext());
        C3282v4 c3282v4 = new C3282v4(this);
        this.f28501r = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        c3282v4.m7502b();
        C2816r3 c2816r3 = new C2816r3(this);
        this.f28500q = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3278v3 c3278v3 = new C3278v3(this);
        this.f28499p = c3278v3;
        c3278v3.m7535d(attributeSet, i);
        getEmojiTextViewHelper().m22934c(attributeSet, i);
    }

    private C1248f4 getEmojiTextViewHelper() {
        if (this.f28502s == null) {
            this.f28502s = new C1248f4(this);
        }
        return this.f28502s;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3282v4 c3282v4 = this.f28501r;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            c3278v3.m7538a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            return c3278v3.m7537b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            return c3278v3.m7536c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f28501r.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f28501r.m7493k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1360g4.m21977a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m22933d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C2818r4.m11783b(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            c3278v3.m7534e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f28501r;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f28501r;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.m10257q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m22932e(z);
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f28500q;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.wl1
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            c3278v3.m7533f(colorStateList);
        }
    }

    @Override // com.daaw.wl1
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3278v3 c3278v3 = this.f28499p;
        if (c3278v3 != null) {
            c3278v3.m7532g(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f28501r.m7481w(colorStateList);
        this.f28501r.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f28501r.m7480x(mode);
        this.f28501r.m7502b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3282v4 c3282v4 = this.f28501r;
        if (c3282v4 != null) {
            c3282v4.m7487q(context, i);
        }
    }
}
