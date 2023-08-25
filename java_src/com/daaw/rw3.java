package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class rw3 extends cw3 {
    public final RewardedInterstitialAdLoadCallback p;
    public final sw3 q;

    public rw3(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, sw3 sw3Var) {
        this.p = rewardedInterstitialAdLoadCallback;
        this.q = sw3Var;
    }

    @Override // com.daaw.dw3
    public final void zze(int i) {
    }

    @Override // com.daaw.dw3
    public final void zzf(zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.p;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.dw3
    public final void zzg() {
        sw3 sw3Var;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.p;
        if (rewardedInterstitialAdLoadCallback == null || (sw3Var = this.q) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(sw3Var);
    }
}
