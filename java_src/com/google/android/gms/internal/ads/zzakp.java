package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakp extends BroadcastReceiver {
    private final /* synthetic */ zzakk zzcru;

    private zzakp(zzakk zzakkVar) {
        this.zzcru = zzakkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzakp(zzakk zzakkVar, zzakl zzaklVar) {
        this(zzakkVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.zzcru.zzcrn = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zzcru.zzcrn = false;
        }
    }
}
