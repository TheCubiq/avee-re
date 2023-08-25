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
    public final String a;
    public final wv3 b;
    public final Context c;
    public final qw3 d = new qw3();
    public OnAdMetadataChangedListener e;
    public OnPaidEventListener f;
    public FullScreenContentCallback g;

    public fw3(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = zzay.zza().zzq(context, str, new xm3());
    }

    public final void a(zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            wv3 wv3Var = this.b;
            if (wv3Var != null) {
                wv3Var.zzf(zzp.zza.zza(this.c, zzdxVar), new jw3(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            wv3 wv3Var = this.b;
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
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar = null;
        try {
            wv3 wv3Var = this.b;
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
            wv3 wv3Var = this.b;
            tv3 zzd = wv3Var != null ? wv3Var.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new gw3(zzd);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.g = fullScreenContentCallback;
        this.d.g3(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            wv3 wv3Var = this.b;
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
            this.e = onAdMetadataChangedListener;
            wv3 wv3Var = this.b;
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
            this.f = onPaidEventListener;
            wv3 wv3Var = this.b;
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
                wv3 wv3Var = this.b;
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
        this.d.h3(onUserEarnedRewardListener);
        if (activity == null) {
            k04.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            wv3 wv3Var = this.b;
            if (wv3Var != null) {
                wv3Var.zzk(this.d);
                this.b.zzm(nt0.g3(activity));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
