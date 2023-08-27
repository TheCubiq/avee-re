package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzlh extends zzek implements zzlg {
    public zzlh() {
        super("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            long value = getValue();
            parcel2.writeNoException();
            parcel2.writeLong(value);
            return true;
        }
        return false;
    }
}
