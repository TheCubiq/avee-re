package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzcdy;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class sw3 extends RewardedInterstitialAd {

    /* renamed from: a */
    public final String f26713a;

    /* renamed from: b */
    public final wv3 f26714b;

    /* renamed from: c */
    public final Context f26715c;

    /* renamed from: d */
    public final qw3 f26716d = new qw3();

    /* renamed from: e */
    public FullScreenContentCallback f26717e;

    /* renamed from: f */
    public OnAdMetadataChangedListener f26718f;

    /* renamed from: g */
    public OnPaidEventListener f26719g;

    public sw3(Context context, String str) {
        this.f26713a = str;
        this.f26715c = context.getApplicationContext();
        this.f26714b = zzay.zza().zzq(context, str, new xm3());
    }

    /* renamed from: a */
    public final void m9793a(zzdx zzdxVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzg(zzp.zza.zza(this.f26715c, zzdxVar), new rw3(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                return wv3Var.zzb();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f26713a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f26717e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f26718f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f26719g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar = null;
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                zzdnVar = wv3Var.zzc();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            wv3 wv3Var = this.f26714b;
            tv3 zzd = wv3Var != null ? wv3Var.zzd() : null;
            if (zzd != null) {
                return new gw3(zzd);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f26717e = fullScreenContentCallback;
        this.f26716d.m12015g3(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzh(z);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f26718f = onAdMetadataChangedListener;
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f26719g = onPaidEventListener;
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzl(new zzcdy(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f26716d.m12014h3(onUserEarnedRewardListener);
        try {
            wv3 wv3Var = this.f26714b;
            if (wv3Var != null) {
                wv3Var.zzk(this.f26716d);
                this.f26714b.zzm(nt0.m14830g3(activity));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
