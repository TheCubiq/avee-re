package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.zzane;
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner zzdge;
    private CustomEventInterstitial zzdgf;
    private CustomEventNative zzdgg;
    private View zzhq;

    /* loaded from: classes.dex */
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzdgh;
        private final MediationBannerListener zzhi;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzdgh = customEventAdapter;
            this.zzhi = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzane.zzck("Custom event adapter called onAdClicked.");
            this.zzhi.onAdClicked(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzane.zzck("Custom event adapter called onAdClosed.");
            this.zzhi.onAdClosed(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzane.zzck("Custom event adapter called onAdFailedToLoad.");
            this.zzhi.onAdFailedToLoad(this.zzdgh, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzane.zzck("Custom event adapter called onAdLeftApplication.");
            this.zzhi.onAdLeftApplication(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
        public final void onAdLoaded(View view) {
            zzane.zzck("Custom event adapter called onAdLoaded.");
            this.zzdgh.zza(view);
            this.zzhi.onAdLoaded(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzane.zzck("Custom event adapter called onAdOpened.");
            this.zzhi.onAdOpened(this.zzdgh);
        }
    }

    /* loaded from: classes.dex */
    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzdgh;
        private final MediationInterstitialListener zzhj;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzdgh = customEventAdapter;
            this.zzhj = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzane.zzck("Custom event adapter called onAdClicked.");
            this.zzhj.onAdClicked(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzane.zzck("Custom event adapter called onAdClosed.");
            this.zzhj.onAdClosed(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzane.zzck("Custom event adapter called onFailedToReceiveAd.");
            this.zzhj.onAdFailedToLoad(this.zzdgh, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzane.zzck("Custom event adapter called onAdLeftApplication.");
            this.zzhj.onAdLeftApplication(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
        public final void onAdLoaded() {
            zzane.zzck("Custom event adapter called onReceivedAd.");
            this.zzhj.onAdLoaded(CustomEventAdapter.this);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzane.zzck("Custom event adapter called onAdOpened.");
            this.zzhj.onAdOpened(this.zzdgh);
        }
    }

    /* loaded from: classes.dex */
    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzdgh;
        private final MediationNativeListener zzhk;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzdgh = customEventAdapter;
            this.zzhk = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzane.zzck("Custom event adapter called onAdClicked.");
            this.zzhk.onAdClicked(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzane.zzck("Custom event adapter called onAdClosed.");
            this.zzhk.onAdClosed(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzane.zzck("Custom event adapter called onAdFailedToLoad.");
            this.zzhk.onAdFailedToLoad(this.zzdgh, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdImpression() {
            zzane.zzck("Custom event adapter called onAdImpression.");
            this.zzhk.onAdImpression(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzane.zzck("Custom event adapter called onAdLeftApplication.");
            this.zzhk.onAdLeftApplication(this.zzdgh);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzane.zzck("Custom event adapter called onAdLoaded.");
            this.zzhk.onAdLoaded(this.zzdgh, nativeAdMapper);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzane.zzck("Custom event adapter called onAdLoaded.");
            this.zzhk.onAdLoaded(this.zzdgh, unifiedNativeAdMapper);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzane.zzck("Custom event adapter called onAdOpened.");
            this.zzhk.onAdOpened(this.zzdgh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view) {
        this.zzhq = view;
    }

    private static <T> T zzi(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzane.zzdk(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.zzhq;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzdge;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdgf;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzdgg;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzdge;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdgf;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzdgg;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzdge;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdgf;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzdgg;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) zzi(bundle.getString("class_name"));
        this.zzdge = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdge.requestBannerAd(context, new zza(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzi(bundle.getString("class_name"));
        this.zzdgf = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdgf.requestInterstitialAd(context, new zzb(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) zzi(bundle.getString("class_name"));
        this.zzdgg = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdgg.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.zzdgf.showInterstitial();
    }
}
