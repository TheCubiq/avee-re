package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes.dex */
public final class v64 implements DialogInterface.OnCancelListener {

    /* renamed from: p */
    public final /* synthetic */ JsPromptResult f29937p;

    public v64(JsPromptResult jsPromptResult) {
        this.f29937p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f29937p.cancel();
    }
}
