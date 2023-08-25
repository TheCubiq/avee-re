package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.daaw.gv6;
/* loaded from: classes.dex */
public final class zzf extends gv6 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.daaw.gv6
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzs.zzI(com.google.android.gms.ads.internal.zzt.zzo().c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdMobHandler.handleMessage");
        }
    }
}
