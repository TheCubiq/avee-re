package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class th5 extends RewardedInterstitialAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xh5 c;

    public th5(xh5 xh5Var, String str, String str2) {
        this.c = xh5Var;
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String o3;
        xh5 xh5Var = this.c;
        o3 = xh5.o3(loadAdError);
        xh5Var.p3(o3, this.b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.c.k3(this.a, rewardedInterstitialAd, this.b);
    }
}
