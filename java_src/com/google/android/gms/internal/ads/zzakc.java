package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
@zzadh
/* loaded from: classes2.dex */
public final class zzakc extends Handler {
    public zzakc(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzakk.zza(com.google.android.gms.ads.internal.zzbv.zzeo().getApplicationContext(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdMobHandler.handleMessage");
        }
    }
}
