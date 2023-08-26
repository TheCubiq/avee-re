package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzrn extends zzej implements zzrl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzrl
    public final void zza(zzrr zzrrVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzrrVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
