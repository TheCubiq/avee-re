package com.daaw;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* loaded from: classes.dex */
public class jw implements TransformationMethod {
    public final TransformationMethod p;

    public jw(TransformationMethod transformationMethod) {
        this.p = transformationMethod;
    }

    public TransformationMethod a() {
        return this.p;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.p;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.b.b().d() != 1) ? charSequence : androidx.emoji2.text.b.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.p;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
