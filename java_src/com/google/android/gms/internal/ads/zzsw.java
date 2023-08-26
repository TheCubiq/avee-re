package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzsw implements zzts {
    private final /* synthetic */ int zzbnx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsw(zzsu zzsuVar, int i) {
        this.zzbnx = i;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzxs != null) {
            zzttVar.zzxs.onAdFailedToLoad(this.zzbnx);
        }
    }
}
