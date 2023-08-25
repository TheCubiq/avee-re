package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class sh5 extends RewardedAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ String f26249a;

    /* renamed from: b */
    public final /* synthetic */ String f26250b;

    /* renamed from: c */
    public final /* synthetic */ xh5 f26251c;

    public sh5(xh5 xh5Var, String str, String str2) {
        this.f26251c = xh5Var;
        this.f26249a = str;
        this.f26250b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f26251c;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f26250b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.f26251c.m5101k3(this.f26249a, rewardedAd, this.f26250b);
    }
}
