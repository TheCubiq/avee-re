package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzsy implements zzts {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsy(zzsu zzsuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzxs != null) {
            zzttVar.zzxs.onAdLoaded();
        }
    }
}
