package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzqy extends zzej implements zzqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final void zza(zzqk zzqkVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzqkVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
