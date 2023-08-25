package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class s64 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult p;

    public s64(JsResult jsResult) {
        this.p = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.p.cancel();
    }
}
