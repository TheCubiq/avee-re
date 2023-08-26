package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes2.dex */
final class zzeu extends BroadcastReceiver {
    private final /* synthetic */ zzet zzafk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeu(zzet zzetVar) {
        this.zzafk = zzetVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzafk.zzl(3);
    }
}
