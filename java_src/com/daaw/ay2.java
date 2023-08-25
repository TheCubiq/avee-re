package com.daaw;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
/* loaded from: classes.dex */
public final class ay2 extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter p;
    public final MediationBannerListener q;

    public ay2(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.p = abstractAdViewAdapter;
        this.q = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.q.onAdClicked(this.p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.q.onAdClosed(this.p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.q.onAdFailedToLoad(this.p, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.q.onAdLoaded(this.p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.q.onAdOpened(this.p);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.q.zzd(this.p, str, str2);
    }
}
