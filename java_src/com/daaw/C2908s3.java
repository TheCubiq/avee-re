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
/* renamed from: com.daaw.s3 */
/* loaded from: classes.dex */
public class C2908s3 extends Button implements vl1, InterfaceC3511x7, yl1 {

    /* renamed from: p */
    public final C2816r3 f25819p;

    /* renamed from: q */
    public final C3282v4 f25820q;

    /* renamed from: r */
    public C1248f4 f25821r;

    public C2908s3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.buttonStyle);
    }

    public C2908s3(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        yk1.m3617a(this, getContext());
        C2816r3 c2816r3 = new C2816r3(this);
        this.f25819p = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3282v4 c3282v4 = new C3282v4(this);
        this.f25820q = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        c3282v4.m7502b();
        getEmojiTextViewHelper().m22934c(attributeSet, i);
    }

    private C1248f4 getEmojiTextViewHelper() {
        if (this.f25821r == null) {
            this.f25821r = new C1248f4(this);
        }
        return this.f25821r;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeMaxTextSize();
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            return c3282v4.m7499e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeMinTextSize();
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            return c3282v4.m7498f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeStepGranularity();
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            return c3282v4.m7497g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3282v4 c3282v4 = this.f25820q;
        return c3282v4 != null ? c3282v4.m7496h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            return c3282v4.m7495i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25820q.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25820q.m7493k();
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
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7489o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 == null || InterfaceC3511x7.f32160a || !c3282v4.m7492l()) {
            return;
        }
        this.f25820q.m7501c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m22933d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC3511x7.f32160a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7484t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC3511x7.f32160a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7483u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC3511x7.f32160a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7482v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.m10257q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m22932e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m22936a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7485s(z);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f25819p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25820q.m7481w(colorStateList);
        this.f25820q.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25820q.m7480x(mode);
        this.f25820q.m7502b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7487q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC3511x7.f32160a) {
            super.setTextSize(i, f);
            return;
        }
        C3282v4 c3282v4 = this.f25820q;
        if (c3282v4 != null) {
            c3282v4.m7506A(i, f);
        }
    }
}
