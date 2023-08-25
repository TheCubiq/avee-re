package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* renamed from: com.daaw.q3 */
/* loaded from: classes.dex */
public class C2682q3 extends AutoCompleteTextView implements vl1, yl1 {

    /* renamed from: s */
    public static final int[] f23641s = {16843126};

    /* renamed from: p */
    public final C2816r3 f23642p;

    /* renamed from: q */
    public final C3282v4 f23643q;

    /* renamed from: r */
    public final C1160e4 f23644r;

    public C2682q3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.f31706p);
    }

    public C2682q3(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        yk1.m3617a(this, getContext());
        ul1 m8037v = ul1.m8037v(getContext(), attributeSet, f23641s, i, 0);
        if (m8037v.m8040s(0)) {
            setDropDownBackgroundDrawable(m8037v.m8052g(0));
        }
        m8037v.m8036w();
        C2816r3 c2816r3 = new C2816r3(this);
        this.f23642p = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3282v4 c3282v4 = new C3282v4(this);
        this.f23643q = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        c3282v4.m7502b();
        C1160e4 c1160e4 = new C1160e4(this);
        this.f23644r = c1160e4;
        c1160e4.m23731c(attributeSet, i);
        m12794a(c1160e4);
    }

    /* renamed from: a */
    public void m12794a(C1160e4 c1160e4) {
        KeyListener keyListener = getKeyListener();
        if (c1160e4.m23732b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m23733a = c1160e4.m23733a(keyListener);
            if (m23733a == keyListener) {
                return;
            }
            super.setKeyListener(m23733a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3282v4 c3282v4 = this.f23643q;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23643q.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23643q.m7493k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f23644r.m23730d(C1360g4.m21977a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f23643q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f23643q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.m10257q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C2818r4.m11783b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f23644r.m23729e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f23644r.m23733a(keyListener));
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f23642p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f23643q.m7481w(colorStateList);
        this.f23643q.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f23643q.m7480x(mode);
        this.f23643q.m7502b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3282v4 c3282v4 = this.f23643q;
        if (c3282v4 != null) {
            c3282v4.m7487q(context, i);
        }
    }
}
