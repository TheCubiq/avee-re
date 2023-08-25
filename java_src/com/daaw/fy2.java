package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
/* loaded from: classes.dex */
public final class fy2 implements CustomEventInterstitialListener {

    /* renamed from: a */
    public final CustomEventAdapter f10095a;

    /* renamed from: b */
    public final MediationInterstitialListener f10096b;

    /* renamed from: c */
    public final /* synthetic */ CustomEventAdapter f10097c;

    public fy2(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f10097c = customEventAdapter;
        this.f10095a = customEventAdapter2;
        this.f10096b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        k04.zze("Custom event adapter called onAdClicked.");
        this.f10096b.onAdClicked(this.f10095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        k04.zze("Custom event adapter called onAdClosed.");
        this.f10096b.onAdClosed(this.f10095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        k04.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f10096b.onAdFailedToLoad(this.f10095a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        k04.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f10096b.onAdFailedToLoad(this.f10095a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        k04.zze("Custom event adapter called onAdLeftApplication.");
        this.f10096b.onAdLeftApplication(this.f10095a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        k04.zze("Custom event adapter called onReceivedAd.");
        this.f10096b.onAdLoaded(this.f10097c);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        k04.zze("Custom event adapter called onAdOpened.");
        this.f10096b.onAdOpened(this.f10095a);
    }
}
