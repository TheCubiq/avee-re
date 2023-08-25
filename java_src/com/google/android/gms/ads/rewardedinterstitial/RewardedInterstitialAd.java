package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.ry0;
import com.daaw.sw3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
/* loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adRequest, "AdRequest cannot be null.");
        ry0.m10829k(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33460l.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new sw3(context2, str2).m9793a(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new sw3(context, str).m9793a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.m10829k(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33460l.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new sw3(context2, str2).m9793a(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new sw3(context, str).m9793a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
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
