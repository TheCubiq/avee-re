package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
/* loaded from: classes2.dex */
final class zzalm implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzall zzcst;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalm(zzall zzallVar) {
        this.zzcst = zzallVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzbv.zzek();
        zzakk.zza(this.zzcst.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
