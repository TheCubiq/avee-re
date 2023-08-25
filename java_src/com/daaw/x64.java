package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class x64 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult p;
    public final /* synthetic */ EditText q;

    public x64(JsPromptResult jsPromptResult, EditText editText) {
        this.p = jsPromptResult;
        this.q = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.p.confirm(this.q.getText().toString());
    }
}
