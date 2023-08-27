package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzsl extends zzej implements zzsk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final ParcelFileDescriptor zza(zzsg zzsgVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzsgVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzel.zza(transactAndReadException, ParcelFileDescriptor.CREATOR);
        transactAndReadException.recycle();
        return parcelFileDescriptor;
    }
}
