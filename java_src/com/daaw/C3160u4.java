package com.daaw;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* renamed from: com.daaw.u4 */
/* loaded from: classes.dex */
public final class C3160u4 {

    /* renamed from: a */
    public TextView f28522a;

    /* renamed from: b */
    public TextClassifier f28523b;

    /* renamed from: com.daaw.u4$a */
    /* loaded from: classes.dex */
    public static final class C3161a {
        /* renamed from: a */
        public static TextClassifier m8590a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C3160u4(TextView textView) {
        this.f28522a = (TextView) ty0.m8699f(textView);
    }

    /* renamed from: a */
    public TextClassifier m8592a() {
        TextClassifier textClassifier = this.f28523b;
        return textClassifier == null ? C3161a.m8590a(this.f28522a) : textClassifier;
    }

    /* renamed from: b */
    public void m8591b(TextClassifier textClassifier) {
        this.f28523b = textClassifier;
    }
}
