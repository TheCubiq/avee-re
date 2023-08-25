package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.daaw.et3;
import com.daaw.fw3;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.ry0;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public abstract class RewardedAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adRequest, "AdRequest cannot be null.");
        ry0.m10829k(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33460l.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new fw3(context2, str2).m22213a(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        k04.zze("Loading on UI thread");
        new fw3(context, str).m22213a(adRequest.zza(), rewardedAdLoadCallback);
    }

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.m10829k(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33460l.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                k04.zze("Loading on background thread");
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new fw3(context2, str2).m22213a(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        k04.zze("Loading on UI thread");
        new fw3(context, str).m22213a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);
}
