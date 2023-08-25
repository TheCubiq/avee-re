package com.daaw;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* renamed from: com.daaw.f4 */
/* loaded from: classes.dex */
public class C1248f4 {

    /* renamed from: a */
    public final TextView f9084a;

    /* renamed from: b */
    public final C1622hw f9085b;

    public C1248f4(TextView textView) {
        this.f9084a = textView;
        this.f9085b = new C1622hw(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m22936a(InputFilter[] inputFilterArr) {
        return this.f9085b.m20384a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m22935b() {
        return this.f9085b.m20383b();
    }

    /* renamed from: c */
    public void m22934c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f9084a.getContext().obtainStyledAttributes(attributeSet, x21.f31913g0, i, 0);
        try {
            int i2 = x21.f31983u0;
            boolean z = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, true) : true;
            obtainStyledAttributes.recycle();
            m22932e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void m22933d(boolean z) {
        this.f9085b.m20382c(z);
    }

    /* renamed from: e */
    public void m22932e(boolean z) {
        this.f9085b.m20381d(z);
    }

    /* renamed from: f */
    public TransformationMethod m22931f(TransformationMethod transformationMethod) {
        return this.f9085b.m20380e(transformationMethod);
    }
}
