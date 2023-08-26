package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzkf extends zzek implements zzke {
    public zzkf() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onAdClicked();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
