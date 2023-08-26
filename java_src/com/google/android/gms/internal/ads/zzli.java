package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzli extends zzej implements zzlg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final long getValue() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }
}
