package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
/* loaded from: classes.dex */
public final class bs3 implements CustomEventNativeListener {

    /* renamed from: a */
    public final CustomEventAdapter f5095a;

    /* renamed from: b */
    public final MediationNativeListener f5096b;

    public bs3(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f5095a = customEventAdapter;
        this.f5096b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        k04.zze("Custom event adapter called onAdClicked.");
        this.f5096b.onAdClicked(this.f5095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        k04.zze("Custom event adapter called onAdClosed.");
        this.f5096b.onAdClosed(this.f5095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        k04.zze("Custom event adapter called onAdFailedToLoad.");
        this.f5096b.onAdFailedToLoad(this.f5095a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        k04.zze("Custom event adapter called onAdFailedToLoad.");
        this.f5096b.onAdFailedToLoad(this.f5095a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        k04.zze("Custom event adapter called onAdImpression.");
        this.f5096b.onAdImpression(this.f5095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        k04.zze("Custom event adapter called onAdLeftApplication.");
        this.f5096b.onAdLeftApplication(this.f5095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        k04.zze("Custom event adapter called onAdLoaded.");
        this.f5096b.onAdLoaded(this.f5095a, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        k04.zze("Custom event adapter called onAdOpened.");
        this.f5096b.onAdOpened(this.f5095a);
    }
}
