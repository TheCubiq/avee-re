package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzre extends zzej implements zzrc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzre(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzb(zzqs zzqsVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, zzqsVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
