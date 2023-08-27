package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes2.dex */
final class zzaqs implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzdbl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqs(JsPromptResult jsPromptResult) {
        this.zzdbl = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdbl.cancel();
    }
}
