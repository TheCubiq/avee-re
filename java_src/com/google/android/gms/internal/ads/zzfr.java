package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfr extends BroadcastReceiver {
    private final /* synthetic */ zzfp zzagk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfr(zzfp zzfpVar) {
        this.zzagk = zzfpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzagk.zzm(3);
    }
}
