package com.daaw;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0232b;
/* renamed from: com.daaw.jw */
/* loaded from: classes.dex */
public class C1883jw implements TransformationMethod {

    /* renamed from: p */
    public final TransformationMethod f15471p;

    public C1883jw(TransformationMethod transformationMethod) {
        this.f15471p = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m18210a() {
        return this.f15471p;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f15471p;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0232b.m29575b().m29573d() != 1) ? charSequence : C0232b.m29575b().m29562o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f15471p;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
