package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzkg extends zzej implements zzke {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final void onAdClicked() throws RemoteException {
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
    }
}
