package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
/* loaded from: classes2.dex */
final class zzyv implements Runnable {
    private final /* synthetic */ zzyq zzbvd;
    private final /* synthetic */ AdRequest.ErrorCode zzbve;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyv(zzyq zzyqVar, AdRequest.ErrorCode errorCode) {
        this.zzbvd = zzyqVar;
        this.zzbve = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxt zzxtVar;
        try {
            zzxtVar = this.zzbvd.zzbuu;
            zzxtVar.onAdFailedToLoad(zzzc.zza(this.zzbve));
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
