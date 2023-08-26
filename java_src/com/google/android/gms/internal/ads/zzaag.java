package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class zzaag implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaae zzbwq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaag(zzaae zzaaeVar) {
        this.zzbwq = zzaaeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzbwq.zzbw("User canceled the download.");
    }
}
