package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class zzaaa implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzzy zzbvx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaa(zzzy zzzyVar) {
        this.zzbvx = zzzyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzbvx.zzbw("Operation denied by user.");
    }
}
