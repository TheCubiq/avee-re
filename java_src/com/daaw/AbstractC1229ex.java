package com.daaw;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.daaw.ex */
/* loaded from: classes2.dex */
public abstract class AbstractC1229ex {

    /* renamed from: a */
    public TextInputLayout f8888a;

    /* renamed from: b */
    public Context f8889b;

    /* renamed from: c */
    public CheckableImageButton f8890c;

    public AbstractC1229ex(TextInputLayout textInputLayout) {
        this.f8888a = textInputLayout;
        this.f8889b = textInputLayout.getContext();
        this.f8890c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    public abstract void mo190a();

    /* renamed from: b */
    public boolean mo215b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo233c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo214d() {
        return false;
    }
}
