package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzky extends zzek implements zzkx {
    public zzky() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static zzkx zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof zzkx ? (zzkx) queryLocalInterface : new zzkz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzt();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
