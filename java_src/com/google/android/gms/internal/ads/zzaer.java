package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzaer extends zzek implements zzaeq {
    public zzaer() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza((zzaej) zzel.zza(parcel, zzaej.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
