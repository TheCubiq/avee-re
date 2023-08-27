package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzyy implements Runnable {
    private final /* synthetic */ zzyq zzbvd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyy(zzyq zzyqVar) {
        this.zzbvd = zzyqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxt zzxtVar;
        try {
            zzxtVar = this.zzbvd.zzbuu;
            zzxtVar.onAdLoaded();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
