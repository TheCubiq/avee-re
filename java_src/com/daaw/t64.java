package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class t64 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult p;

    public t64(JsResult jsResult) {
        this.p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.p.cancel();
    }
}
