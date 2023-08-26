package com.daaw.avee.Design;

import android.app.Activity;
import android.util.Log;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.ContextData;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.PrControls.PrGreenCheckBox;
import com.daaw.avee.comp.Common.PrControls.PrResources;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class AdsRewardedDesign implements RewardedVideoAdListener {
    public static int premiumGreen;
    private RewardedVideoAd mRewardedVideoAd;
    private List<Object> listenerRefHolder = new LinkedList();
    String adId = "";

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLeftApplication() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLoaded() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoStarted() {
    }

    public AdsRewardedDesign() {
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$oaMglkpqMPv8dOyWlQclZ7ClZvY
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsRewardedDesign.this.lambda$new$0$AdsRewardedDesign((Activity) obj);
            }
        }, this.listenerRefHolder);
        MainActivity.onResume.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$Q4DnBCYC-j9XgVh6elwrZY4wqVE
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsRewardedDesign.this.lambda$new$1$AdsRewardedDesign((Activity) obj);
            }
        }, this.listenerRefHolder);
        MainActivity.onPause.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$KhXNhHzvKFVo9dJfrQmEebvH1nw
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsRewardedDesign.this.lambda$new$2$AdsRewardedDesign((Activity) obj);
            }
        }, this.listenerRefHolder);
        MainActivity.onDestroy.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$OkPYSE7gAu5xeIIu0iQ7_lib9Gk
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsRewardedDesign.this.lambda$new$3$AdsRewardedDesign((ContextData) obj);
            }
        }, this.listenerRefHolder);
        PrResources.onRequestGreen.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$cF7tt0VI8f5AHjaZ8qF8igNRPDs
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(AdsRewardedDesign.premiumGreen > 0 || IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrGreenCheckBox.onTouch.subscribeWeak(new WeakEventR1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public final Object invoke(Object obj) {
                return AdsRewardedDesign.this.lambda$new$5$AdsRewardedDesign((ContextData) obj);
            }
        }, this.listenerRefHolder);
        PrGreenCheckBox.onRequest.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$qCOrgF1RWgqOz9dOqn4hepiUuks
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(AdsRewardedDesign.premiumGreen > 0 || IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrGreenCheckBox.onChecked.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsRewardedDesign$RLJILFw2iImf2eeBNsxg_CTHSSk
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsRewardedDesign.lambda$new$7((Boolean) obj);
            }
        }, this.listenerRefHolder);
    }

    public /* synthetic */ void lambda$new$0$AdsRewardedDesign(Activity activity) {
        this.adId = activity.getString(R.string.ads_reward_green_ad_unit_id);
        RewardedVideoAd rewardedVideoAdInstance = MobileAds.getRewardedVideoAdInstance(activity);
        this.mRewardedVideoAd = rewardedVideoAdInstance;
        rewardedVideoAdInstance.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
    }

    public /* synthetic */ void lambda$new$1$AdsRewardedDesign(Activity activity) {
        this.mRewardedVideoAd.resume(activity);
    }

    public /* synthetic */ void lambda$new$2$AdsRewardedDesign(Activity activity) {
        this.mRewardedVideoAd.pause(activity);
    }

    public /* synthetic */ void lambda$new$3$AdsRewardedDesign(ContextData contextData) {
        Activity activity = contextData.getActivity();
        if (activity != null) {
            this.mRewardedVideoAd.destroy(activity);
        }
    }

    public /* synthetic */ Boolean lambda$new$5$AdsRewardedDesign(ContextData contextData) {
        if (IAP2Design.premium || premiumGreen > 0 || !this.mRewardedVideoAd.isLoaded()) {
            return false;
        }
        showAd();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$new$7(Boolean bool) {
        if (bool.booleanValue()) {
            premiumGreen = Math.max(0, premiumGreen - 1);
        }
    }

    private void loadRewardedVideoAd() {
        if (this.adId.length() > 0) {
            this.mRewardedVideoAd.loadAd(this.adId, new AdRequest.Builder().build());
        }
    }

    private void showAd() {
        if (this.mRewardedVideoAd.isLoaded()) {
            this.mRewardedVideoAd.show();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewarded(RewardItem rewardItem) {
        premiumGreen += Math.min(2, rewardItem.getAmount());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdClosed() {
        loadRewardedVideoAd();
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdFailedToLoad(int i) {
        Log.d("AdsRewardDesign", "onRewardedVideoAdFailedToLoad(" + i + ")");
    }
}
