package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class rh5 extends InterstitialAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ String f25295a;

    /* renamed from: b */
    public final /* synthetic */ String f25296b;

    /* renamed from: c */
    public final /* synthetic */ xh5 f25297c;

    public rh5(xh5 xh5Var, String str, String str2) {
        this.f25297c = xh5Var;
        this.f25295a = str;
        this.f25296b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f25297c;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f25296b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.f25297c.m5101k3(this.f25295a, interstitialAd, this.f25296b);
    }
}
