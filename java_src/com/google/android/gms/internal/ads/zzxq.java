package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* loaded from: classes2.dex */
public interface zzxq extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzlo getVideoController() throws RemoteException;

    IObjectWrapper getView() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaic zzaicVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzaic zzaicVar, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar, zzpl zzplVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException;

    void zza(zzjj zzjjVar, String str, String str2) throws RemoteException;

    void zzc(zzjj zzjjVar, String str) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzxz zzmo() throws RemoteException;

    zzyc zzmp() throws RemoteException;

    Bundle zzmq() throws RemoteException;

    Bundle zzmr() throws RemoteException;

    boolean zzms() throws RemoteException;

    zzqs zzmt() throws RemoteException;

    zzyf zzmu() throws RemoteException;
}
