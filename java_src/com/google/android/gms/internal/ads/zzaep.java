package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzaep extends zzej implements zzaen {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(zzaef zzaefVar, zzaeq zzaeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzaefVar);
        zzel.zza(obtainAndWriteInterfaceToken, zzaeqVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(zzaey zzaeyVar, zzaet zzaetVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzaeyVar);
        zzel.zza(obtainAndWriteInterfaceToken, zzaetVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final zzaej zzb(zzaef zzaefVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzaefVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzaej zzaejVar = (zzaej) zzel.zza(transactAndReadException, zzaej.CREATOR);
        transactAndReadException.recycle();
        return zzaejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzb(zzaey zzaeyVar, zzaet zzaetVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzaeyVar);
        zzel.zza(obtainAndWriteInterfaceToken, zzaetVar);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }
}
