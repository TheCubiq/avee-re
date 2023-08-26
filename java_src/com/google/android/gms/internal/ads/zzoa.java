package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public interface zzoa extends IInterface {
    String getContent() throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper) throws RemoteException;

    String zzjn() throws RemoteException;
}
