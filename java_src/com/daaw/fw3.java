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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.internal.ads.zzcdy;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class fw3 extends RewardedAd {

    /* renamed from: a */
    public final String f10031a;

    /* renamed from: b */
    public final wv3 f10032b;

    /* renamed from: c */
    public final Context f10033c;

    /* renamed from: d */
    public final qw3 f10034d = new qw3();

    /* renamed from: e */
    public OnAdMetadataChangedListener f10035e;

    /* renamed from: f */
    public OnPaidEventListener f10036f;

    /* renamed from: g */
    public FullScreenContentCallback f10037g;

    public fw3(Context context, String str) {
        this.f10033c = context.getApplicationContext();
        this.f10031a = str;
        this.f10032b = zzay.zza().zzq(context, str, new xm3());
    }

    /* renamed from: a */
    public final void m22213a(zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                wv3Var.zzf(zzp.zza.zza(this.f10033c, zzdxVar), new jw3(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                return wv3Var.zzb();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.f10031a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f10037g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f10035e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f10036f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar = null;
        try {
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                zzdnVar = wv3Var.zzc();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            wv3 wv3Var = this.f10032b;
            tv3 zzd = wv3Var != null ? wv3Var.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new gw3(zzd);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f10037g = fullScreenContentCallback;
        this.f10034d.m12015g3(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                wv3Var.zzh(z);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f10035e = onAdMetadataChangedListener;
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                wv3Var.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f10036f = onPaidEventListener;
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                wv3Var.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                wv3 wv3Var = this.f10032b;
                if (wv3Var != null) {
                    wv3Var.zzl(new zzcdy(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f10034d.m12014h3(onUserEarnedRewardListener);
        if (activity == null) {
            k04.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            wv3 wv3Var = this.f10032b;
            if (wv3Var != null) {
                wv3Var.zzk(this.f10034d);
                this.f10032b.zzm(nt0.m14830g3(activity));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
