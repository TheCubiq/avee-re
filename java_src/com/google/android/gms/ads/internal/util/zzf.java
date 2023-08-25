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
    /* renamed from: a */
    public final void mo1335a(Message message) {
        try {
            super.mo1335a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzs.zzI(com.google.android.gms.ads.internal.zzt.zzo().m11920c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().m11902u(e, "AdMobHandler.handleMessage");
        }
    }
}
