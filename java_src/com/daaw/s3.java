package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public class s3 extends Button implements vl1, x7, yl1 {
    public final r3 p;
    public final v4 q;
    public f4 r;

    public s3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.buttonStyle);
    }

    public s3(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        yk1.a(this, getContext());
        r3 r3Var = new r3(this);
        this.p = r3Var;
        r3Var.e(attributeSet, i);
        v4 v4Var = new v4(this);
        this.q = v4Var;
        v4Var.m(attributeSet, i);
        v4Var.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private f4 getEmojiTextViewHelper() {
        if (this.r == null) {
            this.r = new f4(this);
        }
        return this.r;
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (x7.a) {
            return super.getAutoSizeMaxTextSize();
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            return v4Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (x7.a) {
            return super.getAutoSizeMinTextSize();
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            return v4Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (x7.a) {
            return super.getAutoSizeStepGranularity();
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            return v4Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (x7.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v4 v4Var = this.q;
        return v4Var != null ? v4Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (x7.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            return v4Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.p(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v4 v4Var = this.q;
        if (v4Var == null || x7.a || !v4Var.l()) {
            return;
        }
        this.q.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (x7.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (x7.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (x7.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.v(i);
        }
    }

    @Override // android.view.View
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.s(z);
        }
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (x7.a) {
            super.setTextSize(i, f);
            return;
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.A(i, f);
        }
    }
}
