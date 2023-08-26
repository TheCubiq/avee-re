package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public interface zzagz extends IInterface {
    void destroy() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void zza(zzagx zzagxVar) throws RemoteException;

    void zza(zzahe zzaheVar) throws RemoteException;

    void zza(zzahk zzahkVar) throws RemoteException;

    void zza(zzkx zzkxVar) throws RemoteException;

    Bundle zzba() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;
}
