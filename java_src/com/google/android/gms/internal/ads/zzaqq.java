package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes2.dex */
final class zzaqq implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzdbk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqq(JsResult jsResult) {
        this.zzdbk = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdbk.cancel();
    }
}
