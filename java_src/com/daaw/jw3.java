package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class jw3 extends cw3 {
    public final RewardedAdLoadCallback p;
    public final RewardedAd q;

    public jw3(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.p = rewardedAdLoadCallback;
        this.q = rewardedAd;
    }

    @Override // com.daaw.dw3
    public final void zze(int i) {
    }

    @Override // com.daaw.dw3
    public final void zzf(zze zzeVar) {
        if (this.p != null) {
            this.p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.dw3
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.p;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.q);
        }
    }
}
