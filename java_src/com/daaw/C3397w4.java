package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.daaw.py0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: com.daaw.w4 */
/* loaded from: classes.dex */
public class C3397w4 extends TextView implements vl1, yl1, InterfaceC3511x7 {

    /* renamed from: p */
    public final C2816r3 f30868p;

    /* renamed from: q */
    public final C3282v4 f30869q;

    /* renamed from: r */
    public final C3160u4 f30870r;

    /* renamed from: s */
    public C1248f4 f30871s;

    /* renamed from: t */
    public boolean f30872t;

    /* renamed from: u */
    public Future<py0> f30873u;

    public C3397w4(Context context) {
        this(context, null);
    }

    public C3397w4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C3397w4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        this.f30872t = false;
        yk1.m3617a(this, getContext());
        C2816r3 c2816r3 = new C2816r3(this);
        this.f30868p = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3282v4 c3282v4 = new C3282v4(this);
        this.f30869q = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        c3282v4.m7502b();
        this.f30870r = new C3160u4(this);
        getEmojiTextViewHelper().m22934c(attributeSet, i);
    }

    private C1248f4 getEmojiTextViewHelper() {
        if (this.f30871s == null) {
            this.f30871s = new C1248f4(this);
        }
        return this.f30871s;
    }

    /* renamed from: c */
    public final void m6544c() {
        Future<py0> future = this.f30873u;
        if (future != null) {
            try {
                this.f30873u = null;
                sk1.m10261m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeMaxTextSize();
        }
        C3282v4 c3282v4 = this.f30869q;
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
        C3282v4 c3282v4 = this.f30869q;
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
        C3282v4 c3282v4 = this.f30869q;
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
        C3282v4 c3282v4 = this.f30869q;
        return c3282v4 != null ? c3282v4.m7496h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC3511x7.f32160a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            return c3282v4.m7495i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return sk1.m10272b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return sk1.m10271c(this);
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30869q.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30869q.m7493k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m6544c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3160u4 c3160u4;
        return (Build.VERSION.SDK_INT >= 28 || (c3160u4 = this.f30870r) == null) ? super.getTextClassifier() : c3160u4.m8592a();
    }

    public py0.C2666a getTextMetricsParamsCompat() {
        return sk1.m10268f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f30869q.m7486r(this, onCreateInputConnection, editorInfo);
        return C1360g4.m21977a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7489o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m6544c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 == null || InterfaceC3511x7.f32160a || !c3282v4.m7492l()) {
            return;
        }
        this.f30869q.m7501c();
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
        C3282v4 c3282v4 = this.f30869q;
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
        C3282v4 c3282v4 = this.f30869q;
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
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7482v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C2818r4.m11783b(context, i) : null, i2 != 0 ? C2818r4.m11783b(context, i2) : null, i3 != 0 ? C2818r4.m11783b(context, i3) : null, i4 != 0 ? C2818r4.m11783b(context, i4) : null);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C2818r4.m11783b(context, i) : null, i2 != 0 ? C2818r4.m11783b(context, i2) : null, i3 != 0 ? C2818r4.m11783b(context, i3) : null, i4 != 0 ? C2818r4.m11783b(context, i4) : null);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f30869q;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m22936a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            sk1.m10264j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            sk1.m10263k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        sk1.m10262l(this, i);
    }

    public void setPrecomputedText(py0 py0Var) {
        sk1.m10261m(this, py0Var);
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f30868p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30869q.m7481w(colorStateList);
        this.f30869q.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30869q.m7480x(mode);
        this.f30869q.m7502b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7487q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3160u4 c3160u4;
        if (Build.VERSION.SDK_INT >= 28 || (c3160u4 = this.f30870r) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3160u4.m8591b(textClassifier);
        }
    }

    public void setTextFuture(Future<py0> future) {
        this.f30873u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(py0.C2666a c2666a) {
        sk1.m10259o(this, c2666a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC3511x7.f32160a) {
            super.setTextSize(i, f);
            return;
        }
        C3282v4 c3282v4 = this.f30869q;
        if (c3282v4 != null) {
            c3282v4.m7506A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.f30872t) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = to1.m8916a(getContext(), typeface, i);
        }
        this.f30872t = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f30872t = false;
        }
    }
}
