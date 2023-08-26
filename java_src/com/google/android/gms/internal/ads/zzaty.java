package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzaty extends zzej implements zzatx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final zzatv zza(zzatt zzattVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzattVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzatv zzatvVar = (zzatv) zzel.zza(transactAndReadException, zzatv.CREATOR);
        transactAndReadException.recycle();
        return zzatvVar;
    }
}
