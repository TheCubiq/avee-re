package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzmp implements Runnable {
    private final /* synthetic */ zzmo zzatm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmp(zzmo zzmoVar) {
        this.zzatm = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzahe zzaheVar;
        zzahe zzaheVar2;
        zzaheVar = this.zzatm.zzatl;
        if (zzaheVar != null) {
            try {
                zzaheVar2 = this.zzatm.zzatl;
                zzaheVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzane.zzc("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
