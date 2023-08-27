package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzhp extends zzej implements zzho {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final zzhi zza(zzhl zzhlVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzhlVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzhi zzhiVar = (zzhi) zzel.zza(transactAndReadException, zzhi.CREATOR);
        transactAndReadException.recycle();
        return zzhiVar;
    }
}
