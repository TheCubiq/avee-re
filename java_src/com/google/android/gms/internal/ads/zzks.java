package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public interface zzks extends IInterface {
    void destroy() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzlo getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaaw zzaawVar) throws RemoteException;

    void zza(zzabc zzabcVar, String str) throws RemoteException;

    void zza(zzahe zzaheVar) throws RemoteException;

    void zza(zzjn zzjnVar) throws RemoteException;

    void zza(zzke zzkeVar) throws RemoteException;

    void zza(zzkh zzkhVar) throws RemoteException;

    void zza(zzkx zzkxVar) throws RemoteException;

    void zza(zzla zzlaVar) throws RemoteException;

    void zza(zzlg zzlgVar) throws RemoteException;

    void zza(zzlu zzluVar) throws RemoteException;

    void zza(zzmu zzmuVar) throws RemoteException;

    void zza(zzod zzodVar) throws RemoteException;

    boolean zzb(zzjj zzjjVar) throws RemoteException;

    Bundle zzba() throws RemoteException;

    IObjectWrapper zzbj() throws RemoteException;

    zzjn zzbk() throws RemoteException;

    void zzbm() throws RemoteException;

    zzla zzbw() throws RemoteException;

    zzkh zzbx() throws RemoteException;

    String zzck() throws RemoteException;
}
