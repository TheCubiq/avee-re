package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdk extends BroadcastReceiver {
    private final /* synthetic */ zzdi zztj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdk(zzdi zzdiVar) {
        this.zztj = zzdiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zztj.zzaq();
    }
}
