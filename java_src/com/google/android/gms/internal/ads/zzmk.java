package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzmk implements Runnable {
    private final /* synthetic */ zzmj zzatk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmk(zzmj zzmjVar) {
        this.zzatk = zzmjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        zzkhVar = this.zzatk.zzxs;
        if (zzkhVar != null) {
            try {
                zzkhVar2 = this.zzatk.zzxs;
                zzkhVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzane.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
