package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztf implements zzts {
    private final /* synthetic */ zzoa zzbnz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztf(zzte zzteVar, zzoa zzoaVar) {
        this.zzbnz = zzoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzbof != null) {
            zzttVar.zzbof.zza(this.zzbnz);
        }
    }
}
