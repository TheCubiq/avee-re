package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public interface zzqa extends IInterface {
    void destroy() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzak(String str) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper) throws RemoteException;
}
