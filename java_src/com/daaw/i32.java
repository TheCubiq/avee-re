package com.daaw;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
/* loaded from: classes.dex */
public final class i32 implements CustomEventBannerListener {

    /* renamed from: a */
    public final CustomEventAdapter f13217a;

    /* renamed from: b */
    public final MediationBannerListener f13218b;

    public i32(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f13217a = customEventAdapter;
        this.f13218b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        k04.zze("Custom event adapter called onAdClicked.");
        this.f13218b.onAdClicked(this.f13217a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        k04.zze("Custom event adapter called onAdClosed.");
        this.f13218b.onAdClosed(this.f13217a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        k04.zze("Custom event adapter called onAdFailedToLoad.");
        this.f13218b.onAdFailedToLoad(this.f13217a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        k04.zze("Custom event adapter called onAdFailedToLoad.");
        this.f13218b.onAdFailedToLoad(this.f13217a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        k04.zze("Custom event adapter called onAdLeftApplication.");
        this.f13218b.onAdLeftApplication(this.f13217a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        k04.zze("Custom event adapter called onAdLoaded.");
        this.f13217a.f36438a = view;
        this.f13218b.onAdLoaded(this.f13217a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        k04.zze("Custom event adapter called onAdOpened.");
        this.f13218b.onAdOpened(this.f13217a);
    }
}
