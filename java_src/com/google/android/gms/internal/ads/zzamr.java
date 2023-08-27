package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzamr extends BroadcastReceiver {
    private final /* synthetic */ zzamq zzcuf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamr(zzamq zzamqVar) {
        this.zzcuf = zzamqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzcuf.zzc(context, intent);
    }
}
