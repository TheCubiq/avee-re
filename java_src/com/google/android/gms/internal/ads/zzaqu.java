package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
/* loaded from: classes2.dex */
final class zzaqu implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzdbl;
    private final /* synthetic */ EditText zzdbm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqu(JsPromptResult jsPromptResult, EditText editText) {
        this.zzdbl = jsPromptResult;
        this.zzdbm = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdbl.confirm(this.zzdbm.getText().toString());
    }
}
