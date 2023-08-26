package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzma;
/* loaded from: classes.dex */
public final class PublisherInterstitialAd {
    private final zzma zzuv;

    public PublisherInterstitialAd(Context context) {
        this.zzuv = new zzma(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzuv.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzuv.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzuv.getAppEventListener();
    }

    public final String getMediationAdapterClassName() {
        return this.zzuv.getMediationAdapterClassName();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzuv.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.zzuv.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzuv.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzuv.zza(publisherAdRequest.zzay());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzuv.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzuv.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzuv.setAppEventListener(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzuv.setCorrelator(correlator);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzuv.setImmersiveMode(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzuv.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.zzuv.show();
    }
}
