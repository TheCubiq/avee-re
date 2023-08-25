package com.daaw;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* loaded from: classes.dex */
public final class zr3 extends InterstitialAdLoadCallback {

    /* renamed from: a */
    public final AbstractAdViewAdapter f35439a;

    /* renamed from: b */
    public final MediationInterstitialListener f35440b;

    public zr3(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f35439a = abstractAdViewAdapter;
        this.f35440b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f35440b.onAdFailedToLoad(this.f35439a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f35439a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new zk4(abstractAdViewAdapter, this.f35440b));
        this.f35440b.onAdLoaded(this.f35439a);
    }
}
