package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class tp8 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ zzs f27951a;

    public /* synthetic */ tp8(zzs zzsVar, zzq zzqVar) {
        this.f27951a = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzs zzsVar;
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzsVar = this.f27951a;
            z = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            zzsVar = this.f27951a;
            z = false;
        }
        zzs.m1326f(zzsVar, z);
    }
}
