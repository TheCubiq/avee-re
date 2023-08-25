package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcg;
/* loaded from: classes.dex */
public final class qx3 extends BroadcastReceiver {
    public final /* synthetic */ zzcg a;

    public qx3(zzcg zzcgVar) {
        this.a = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b(context, intent);
    }
}
