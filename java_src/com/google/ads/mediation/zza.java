package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zza implements RewardedVideoAdListener {
    private final /* synthetic */ AbstractAdViewAdapter zzhd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzhd = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewarded(RewardItem rewardItem) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onRewarded(this.zzhd, rewardItem);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdClosed() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onAdClosed(this.zzhd);
        AbstractAdViewAdapter.zza(this.zzhd, (InterstitialAd) null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdFailedToLoad(int i) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onAdFailedToLoad(this.zzhd, i);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLeftApplication() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onAdLeftApplication(this.zzhd);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLoaded() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onAdLoaded(this.zzhd);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdOpened() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onAdOpened(this.zzhd);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onVideoCompleted(this.zzhd);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoStarted() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzhd.zzhb;
        mediationRewardedVideoAdListener.onVideoStarted(this.zzhd);
    }
}
