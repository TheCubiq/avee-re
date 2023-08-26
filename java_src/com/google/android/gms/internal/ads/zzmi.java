package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzmi implements Runnable {
    private final /* synthetic */ zzmh zzatj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmi(zzmh zzmhVar) {
        this.zzatj = zzmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzmf.zza(this.zzatj.zzati) != null) {
            try {
                zzmf.zza(this.zzatj.zzati).onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzane.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
