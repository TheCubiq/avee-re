package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztn implements zzts {
    private final /* synthetic */ zzagu zzboa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztn(zzti zztiVar, zzagu zzaguVar) {
        this.zzboa = zzaguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzboh != null) {
            zzttVar.zzboh.zza(this.zzboa);
        }
    }
}
