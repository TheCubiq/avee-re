package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzrh extends zzej implements zzrf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzb(zzqs zzqsVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzqsVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
