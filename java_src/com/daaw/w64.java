package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes.dex */
public final class w64 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult p;

    public w64(JsPromptResult jsPromptResult) {
        this.p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.p.cancel();
    }
}
