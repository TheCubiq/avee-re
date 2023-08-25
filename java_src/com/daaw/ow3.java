package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final class ow3 implements MediationRewardedAdCallback {
    public final gn3 a;

    public ow3(gn3 gn3Var) {
        this.a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        k04.zzj("Mediation ad failed to show: Error Code = " + code + ". Error Message = " + message + " Error Domain = " + domain);
        try {
            this.a.A(adError.zza());
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdFailedToShow.");
        k04.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.a.n(str);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onUserEarnedReward.");
        try {
            this.a.S0(new pw3(rewardItem));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onVideoComplete.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called onVideoStart.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called reportAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        ry0.e("#008 Must be called on the main UI thread.");
        k04.zze("Adapter called reportAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
