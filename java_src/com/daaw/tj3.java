package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class tj3 extends AdManagerInterstitialAd {

    /* renamed from: a */
    public final Context f27776a;

    /* renamed from: b */
    public final zzp f27777b;

    /* renamed from: c */
    public final zzbu f27778c;

    /* renamed from: d */
    public final String f27779d;

    /* renamed from: e */
    public final xm3 f27780e;

    /* renamed from: f */
    public AppEventListener f27781f;

    /* renamed from: g */
    public FullScreenContentCallback f27782g;

    /* renamed from: h */
    public OnPaidEventListener f27783h;

    public tj3(Context context, String str) {
        xm3 xm3Var = new xm3();
        this.f27780e = xm3Var;
        this.f27776a = context;
        this.f27779d = str;
        this.f27777b = zzp.zza;
        this.f27778c = zzay.zza().zze(context, new zzq(), str, xm3Var);
    }

    /* renamed from: a */
    public final void m9076a(zzdx zzdxVar, AdLoadCallback adLoadCallback) {
        try {
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzy(this.f27777b.zza(this.f27776a, zzdxVar), new zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f27779d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f27781f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f27782g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f27783h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar = null;
        try {
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzdnVar = zzbuVar.zzk();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f27781f = appEventListener;
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new h13(appEventListener) : null);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f27782g = fullScreenContentCallback;
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzJ(new zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzL(z);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f27783h = onPaidEventListener;
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            k04.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbu zzbuVar = this.f27778c;
            if (zzbuVar != null) {
                zzbuVar.zzW(nt0.m14830g3(activity));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
