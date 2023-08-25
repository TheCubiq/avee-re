package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class s64 implements DialogInterface.OnCancelListener {

    /* renamed from: p */
    public final /* synthetic */ JsResult f25915p;

    public s64(JsResult jsResult) {
        this.f25915p = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f25915p.cancel();
    }
}
