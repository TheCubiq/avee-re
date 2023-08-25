package com.daaw;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
/* loaded from: classes.dex */
public final class ay2 extends AdListener implements AppEventListener, zza {

    /* renamed from: p */
    public final AbstractAdViewAdapter f4099p;

    /* renamed from: q */
    public final MediationBannerListener f4100q;

    public ay2(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f4099p = abstractAdViewAdapter;
        this.f4100q = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f4100q.onAdClicked(this.f4099p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f4100q.onAdClosed(this.f4099p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f4100q.onAdFailedToLoad(this.f4099p, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f4100q.onAdLoaded(this.f4099p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f4100q.onAdOpened(this.f4099p);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f4100q.zzd(this.f4099p, str, str2);
    }
}
