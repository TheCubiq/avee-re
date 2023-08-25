package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class x64 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ JsPromptResult f32153p;

    /* renamed from: q */
    public final /* synthetic */ EditText f32154q;

    public x64(JsPromptResult jsPromptResult, EditText editText) {
        this.f32153p = jsPromptResult;
        this.f32154q = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f32153p.confirm(this.f32154q.getText().toString());
    }
}
