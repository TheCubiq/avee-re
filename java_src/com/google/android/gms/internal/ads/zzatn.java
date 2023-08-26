package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public interface zzatn extends IInterface {
    String getVersion() throws RemoteException;

    IObjectWrapper zza(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzy(IObjectWrapper iObjectWrapper) throws RemoteException;
}
