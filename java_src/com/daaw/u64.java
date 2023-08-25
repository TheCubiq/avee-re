package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class u64 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ JsResult f28591p;

    public u64(JsResult jsResult) {
        this.f28591p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f28591p.confirm();
    }
}
