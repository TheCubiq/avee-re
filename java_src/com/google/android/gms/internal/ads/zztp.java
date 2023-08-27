package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztp implements zzts {
    private final /* synthetic */ int zzbnx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztp(zzti zztiVar, int i) {
        this.zzbnx = i;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzboh != null) {
            zzttVar.zzboh.onRewardedVideoAdFailedToLoad(this.zzbnx);
        }
    }
}
