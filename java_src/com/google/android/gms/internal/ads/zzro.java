package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public interface zzro extends IInterface {
    void onUnconfirmedClickCancelled() throws RemoteException;

    void onUnconfirmedClickReceived(String str) throws RemoteException;
}
