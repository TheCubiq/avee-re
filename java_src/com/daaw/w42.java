package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
/* loaded from: classes.dex */
public final class w42 extends InterstitialAdLoadCallback {
    public w42(zzac zzacVar) {
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int code = loadAdError.getCode();
        zze.zza("Failed to load ad with error code: " + code);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        zze.zza("Ad is loaded.");
    }
}
