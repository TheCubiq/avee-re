package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class t64 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ JsResult f27031p;

    public t64(JsResult jsResult) {
        this.f27031p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27031p.cancel();
    }
}
