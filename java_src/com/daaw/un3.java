package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
/* loaded from: classes.dex */
public final class un3 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {

    /* renamed from: a */
    public final gn3 f29345a;

    public un3(gn3 gn3Var) {
        this.f29345a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdClosed.");
        try {
            this.f29345a.zzf();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        k04.zzj("Mediation ad failed to show: Error Code = " + code + ". Error Message = " + message + " Error Domain = " + domain);
        try {
            this.f29345a.mo3338A(adError.zza());
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdFailedToShow.");
        k04.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f29345a.mo3327n(str);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdLeftApplication.");
        try {
            this.f29345a.zzn();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdOpened.");
        try {
            this.f29345a.zzp();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onVideoComplete.");
        try {
            this.f29345a.mo3334b();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onVideoPause.");
        try {
            this.f29345a.mo3329k();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onVideoPlay.");
        try {
            this.f29345a.zzx();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called reportAdClicked.");
        try {
            this.f29345a.zze();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called reportAdImpression.");
        try {
            this.f29345a.zzm();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
