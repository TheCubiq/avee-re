package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzkl extends zzek implements zzkk {
    public zzkl() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String mediationAdapterClassName;
        if (i != 1) {
            if (i == 2) {
                mediationAdapterClassName = getMediationAdapterClassName();
            } else if (i == 3) {
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzel.zza(parcel2, isLoading);
                return true;
            } else if (i == 4) {
                mediationAdapterClassName = zzck();
            } else if (i != 5) {
                return false;
            } else {
                zza((zzjj) zzel.zza(parcel, zzjj.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
            return true;
        }
        zzd((zzjj) zzel.zza(parcel, zzjj.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
