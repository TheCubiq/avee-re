package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztj implements zzts {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zztj(zzti zztiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzboh != null) {
            zzttVar.zzboh.onRewardedVideoAdLoaded();
        }
    }
}
