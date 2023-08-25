package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerListener {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError);

    void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
