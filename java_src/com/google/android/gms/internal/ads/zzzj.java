package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public interface zzzj extends IInterface {
    zzlo getVideoController() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, zzzm zzzmVar) throws RemoteException;

    void zza(byte[] bArr, String str, Bundle bundle, IObjectWrapper iObjectWrapper, zzzf zzzfVar, zzxt zzxtVar, zzjn zzjnVar) throws RemoteException;

    void zza(byte[] bArr, String str, Bundle bundle, IObjectWrapper iObjectWrapper, zzzh zzzhVar, zzxt zzxtVar) throws RemoteException;

    zzzt zznc() throws RemoteException;

    zzzt zznd() throws RemoteException;
}
