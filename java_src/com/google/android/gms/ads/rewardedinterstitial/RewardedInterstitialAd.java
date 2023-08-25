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
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "AdUnitId cannot be null.");
        ry0.k(adRequest, "AdRequest cannot be null.");
        ry0.k(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.l.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new sw3(context2, str2).a(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new sw3(context, str).a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "AdUnitId cannot be null.");
        ry0.k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.k(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.l.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new sw3(context2, str2).a(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new sw3(context, str).a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
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
