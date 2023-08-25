package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class jw3 extends cw3 {

    /* renamed from: p */
    public final RewardedAdLoadCallback f15481p;

    /* renamed from: q */
    public final RewardedAd f15482q;

    public jw3(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.f15481p = rewardedAdLoadCallback;
        this.f15482q = rewardedAd;
    }

    @Override // com.daaw.dw3
    public final void zze(int i) {
    }

    @Override // com.daaw.dw3
    public final void zzf(zze zzeVar) {
        if (this.f15481p != null) {
            this.f15481p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.dw3
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f15481p;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f15482q);
        }
    }
}
