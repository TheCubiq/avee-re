package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.comp.Common.AdViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
/* loaded from: classes.dex */
public class BaseAdsCore {
    int adSlotId;
    private AdViewHolder adView;
    public static WeakEventR3<AdViewHolder, Integer, Integer, Boolean> onShowAdView = new WeakEventR3<>();
    private static boolean[] mAdViewLastTimeLoadSuccess = {false, false, false};

    public BaseAdsCore(int i, Object obj) {
        this.adSlotId = i;
        initAdsMob(null, obj instanceof AdView ? (AdView) obj : null);
    }

    public void onBind(int i, int i2) {
        AdViewHolder adViewHolder = this.adView;
        if (adViewHolder == null || adViewHolder.adView == null || onShowAdView.invoke(this.adView, Integer.valueOf(this.adSlotId), Integer.valueOf(i), false).booleanValue()) {
            return;
        }
        mAdViewLastTimeLoadSuccess[this.adSlotId] = false;
    }

    private void initAdsMob(IContainerData iContainerData, AdView adView) {
        AdViewHolder adViewHolder = new AdViewHolder(adView);
        this.adView = adViewHolder;
        if (adViewHolder.adView != null) {
            if (mAdViewLastTimeLoadSuccess[this.adSlotId]) {
                this.adView.adView.setVisibility(0);
            } else {
                this.adView.adView.setVisibility(8);
            }
            this.adView.adView.setAdListener(new AdListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsCore.1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLeftApplication() {
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    BaseAdsCore.this.adView.adView.setVisibility(0);
                    BaseAdsCore.mAdViewLastTimeLoadSuccess[BaseAdsCore.this.adSlotId] = true;
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(int i) {
                    BaseAdsCore.this.adView.adView.setVisibility(8);
                    BaseAdsCore.mAdViewLastTimeLoadSuccess[BaseAdsCore.this.adSlotId] = false;
                }
            });
        }
    }
}
