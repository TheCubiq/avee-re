package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes.dex */
public final class w64 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ JsPromptResult f30922p;

    public w64(JsPromptResult jsPromptResult) {
        this.f30922p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f30922p.cancel();
    }
}
