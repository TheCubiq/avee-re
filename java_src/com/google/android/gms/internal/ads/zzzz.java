package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzz implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzzy zzbvx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzz(zzzy zzzyVar) {
        this.zzbvx = zzzyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzbvx.createIntent();
        com.google.android.gms.ads.internal.zzbv.zzek();
        context = this.zzbvx.mContext;
        zzakk.zza(context, createIntent);
    }
}
