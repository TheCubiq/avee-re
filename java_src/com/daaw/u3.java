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
/* loaded from: classes.dex */
public class u3 extends CheckedTextView implements wl1, vl1, yl1 {
    public final v3 p;
    public final r3 q;
    public final v4 r;
    public f4 s;

    public u3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.checkedTextViewStyle);
    }

    public u3(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        yk1.a(this, getContext());
        v4 v4Var = new v4(this);
        this.r = v4Var;
        v4Var.m(attributeSet, i);
        v4Var.b();
        r3 r3Var = new r3(this);
        this.q = r3Var;
        r3Var.e(attributeSet, i);
        v3 v3Var = new v3(this);
        this.p = v3Var;
        v3Var.d(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private f4 getEmojiTextViewHelper() {
        if (this.s == null) {
            this.s = new f4(this);
        }
        return this.s;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        v4 v4Var = this.r;
        if (v4Var != null) {
            v4Var.b();
        }
        r3 r3Var = this.q;
        if (r3Var != null) {
            r3Var.b();
        }
        v3 v3Var = this.p;
        if (v3Var != null) {
            v3Var.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.p(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        v3 v3Var = this.p;
        if (v3Var != null) {
            return v3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        v3 v3Var = this.p;
        if (v3Var != null) {
            return v3Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.r.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.r.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g4.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(r4.b(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        v3 v3Var = this.p;
        if (v3Var != null) {
            v3Var.e();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    @Override // com.daaw.wl1
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        v3 v3Var = this.p;
        if (v3Var != null) {
            v3Var.f(colorStateList);
        }
    }

    @Override // com.daaw.wl1
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        v3 v3Var = this.p;
        if (v3Var != null) {
            v3Var.g(mode);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v4 v4Var = this.r;
        if (v4Var != null) {
            v4Var.q(context, i);
        }
    }
}
