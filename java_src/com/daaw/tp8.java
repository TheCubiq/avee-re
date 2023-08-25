package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class tp8 extends BroadcastReceiver {
    public final /* synthetic */ zzs a;

    public /* synthetic */ tp8(zzs zzsVar, zzq zzqVar) {
        this.a = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzs zzsVar;
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzsVar = this.a;
            z = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            zzsVar = this.a;
            z = false;
        }
        zzs.f(zzsVar, z);
    }
}
