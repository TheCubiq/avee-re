package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes.dex */
public final class v64 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult p;

    public v64(JsPromptResult jsPromptResult) {
        this.p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.p.cancel();
    }
}
