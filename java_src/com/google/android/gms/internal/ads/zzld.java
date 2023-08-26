package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public interface zzld extends IInterface {
    zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzxn zzxnVar, int i) throws RemoteException;

    zzaap createAdOverlay(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException;

    zzaaz createInAppPurchaseManager(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzks createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException;

    zzqa createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    zzqf createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzagz createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzxn zzxnVar, int i) throws RemoteException;

    zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, int i) throws RemoteException;

    zzlj getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
