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
/* loaded from: classes.dex */
public class w4 extends TextView implements vl1, yl1, x7 {
    public final r3 p;
    public final v4 q;
    public final u4 r;
    public f4 s;
    public boolean t;
    public Future<py0> u;

    public w4(Context context) {
        this(context, null);
    }

    public w4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public w4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        this.t = false;
        yk1.a(this, getContext());
        r3 r3Var = new r3(this);
        this.p = r3Var;
        r3Var.e(attributeSet, i);
        v4 v4Var = new v4(this);
        this.q = v4Var;
        v4Var.m(attributeSet, i);
        v4Var.b();
        this.r = new u4(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private f4 getEmojiTextViewHelper() {
        if (this.s == null) {
            this.s = new f4(this);
        }
        return this.s;
    }

    public final void c() {
        Future<py0> future = this.u;
        if (future != null) {
            try {
                this.u = null;
                sk1.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return sk1.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return sk1.c(this);
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
    public CharSequence getText() {
        c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        u4 u4Var;
        return (Build.VERSION.SDK_INT >= 28 || (u4Var = this.r) == null) ? super.getTextClassifier() : u4Var.a();
    }

    public py0.a getTextMetricsParamsCompat() {
        return sk1.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.q.r(this, onCreateInputConnection, editorInfo);
        return g4.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? r4.b(context, i) : null, i2 != 0 ? r4.b(context, i2) : null, i3 != 0 ? r4.b(context, i3) : null, i4 != 0 ? r4.b(context, i4) : null);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? r4.b(context, i) : null, i2 != 0 ? r4.b(context, i2) : null, i3 != 0 ? r4.b(context, i3) : null, i4 != 0 ? r4.b(context, i4) : null);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            sk1.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            sk1.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        sk1.l(this, i);
    }

    public void setPrecomputedText(py0 py0Var) {
        sk1.m(this, py0Var);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        u4 u4Var;
        if (Build.VERSION.SDK_INT >= 28 || (u4Var = this.r) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            u4Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<py0> future) {
        this.u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(py0.a aVar) {
        sk1.o(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.t) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = to1.a(getContext(), typeface, i);
        }
        this.t = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.t = false;
        }
    }
}
