package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzxx extends zzek implements zzxw {
    public zzxx() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int zzmm = zzmm();
            parcel2.writeNoException();
            parcel2.writeInt(zzmm);
            return true;
        }
        return false;
    }
}
