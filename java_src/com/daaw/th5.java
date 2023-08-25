package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class th5 extends RewardedInterstitialAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ String f27651a;

    /* renamed from: b */
    public final /* synthetic */ String f27652b;

    /* renamed from: c */
    public final /* synthetic */ xh5 f27653c;

    public th5(xh5 xh5Var, String str, String str2) {
        this.f27653c = xh5Var;
        this.f27651a = str;
        this.f27652b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f27653c;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f27652b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.f27653c.m5101k3(this.f27651a, rewardedInterstitialAd, this.f27652b);
    }
}
