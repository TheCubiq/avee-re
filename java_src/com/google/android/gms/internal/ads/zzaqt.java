package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes2.dex */
final class zzaqt implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzdbl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqt(JsPromptResult jsPromptResult) {
        this.zzdbl = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdbl.cancel();
    }
}
