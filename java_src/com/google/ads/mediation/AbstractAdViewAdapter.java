package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzatm;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzlo;
import java.util.Date;
import java.util.Map;
import java.util.Set;
@zzadh
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgw;
    private InterstitialAd zzgx;
    private AdLoader zzgy;
    private Context zzgz;
    private InterstitialAd zzha;
    private MediationRewardedVideoAdListener zzhb;
    private final RewardedVideoAdListener zzhc = new com.google.ads.mediation.zza(this);

    /* loaded from: classes.dex */
    static class zza extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd zzhe;

        public zza(NativeAppInstallAd nativeAppInstallAd) {
            this.zzhe = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzhe);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzhe);
            }
        }
    }

    /* loaded from: classes.dex */
    static class zzb extends NativeContentAdMapper {
        private final NativeContentAd zzhf;

        public zzb(NativeContentAd nativeContentAd) {
            this.zzhf = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzhf);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzhf);
            }
        }
    }

    /* loaded from: classes.dex */
    static class zzc extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd zzhg;

        public zzc(UnifiedNativeAd unifiedNativeAd) {
            this.zzhg = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzl(unifiedNativeAd.zzbh());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.zzhg);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzhg);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class zzd extends AdListener implements AppEventListener, zzjd {
        private final AbstractAdViewAdapter zzhh;
        private final com.google.android.gms.ads.mediation.MediationBannerListener zzhi;

        public zzd(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
            this.zzhh = abstractAdViewAdapter;
            this.zzhi = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            this.zzhi.onAdClicked(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzhi.onAdClosed(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzhi.onAdFailedToLoad(this.zzhh, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzhi.onAdLeftApplication(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzhi.onAdLoaded(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzhi.onAdOpened(this.zzhh);
        }

        @Override // com.google.android.gms.ads.doubleclick.AppEventListener
        public final void onAppEvent(String str, String str2) {
            this.zzhi.zza(this.zzhh, str, str2);
        }
    }

    /* loaded from: classes.dex */
    static final class zze extends AdListener implements zzjd {
        private final AbstractAdViewAdapter zzhh;
        private final com.google.android.gms.ads.mediation.MediationInterstitialListener zzhj;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
            this.zzhh = abstractAdViewAdapter;
            this.zzhj = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            this.zzhj.onAdClicked(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzhj.onAdClosed(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzhj.onAdFailedToLoad(this.zzhh, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzhj.onAdLeftApplication(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzhj.onAdLoaded(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzhj.onAdOpened(this.zzhh);
        }
    }

    /* loaded from: classes.dex */
    static final class zzf extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        private final AbstractAdViewAdapter zzhh;
        private final MediationNativeListener zzhk;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.zzhh = abstractAdViewAdapter;
            this.zzhk = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            this.zzhk.onAdClicked(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzhk.onAdClosed(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzhk.onAdFailedToLoad(this.zzhh, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            this.zzhk.onAdImpression(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzhk.onAdLeftApplication(this.zzhh);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzhk.onAdOpened(this.zzhh);
        }

        @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.zzhk.onAdLoaded(this.zzhh, new zza(nativeAppInstallAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.zzhk.onAdLoaded(this.zzhh, new zzb(nativeContentAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.zzhk.zza(this.zzhh, nativeCustomTemplateAd, str);
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.zzhk.zza(this.zzhh, nativeCustomTemplateAd);
        }

        @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.zzhk.onAdLoaded(this.zzhh, new zzc(unifiedNativeAd));
        }
    }

    private final AdRequest zza(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String str : keywords) {
                builder.addKeyword(str);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzkb.zzif();
            builder.addTestDevice(zzamu.zzbc(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InterstitialAd zza(AbstractAdViewAdapter abstractAdViewAdapter, InterstitialAd interstitialAd) {
        abstractAdViewAdapter.zzha = null;
        return null;
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzgw;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzaj(1).zzvx();
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzlo getVideoController() {
        VideoController videoController;
        AdView adView = this.zzgw;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzbc();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzhb != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgz;
        if (context == null || this.zzhb == null) {
            zzane.e("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzha = interstitialAd;
        interstitialAd.zza(true);
        this.zzha.setAdUnitId(getAdUnitId(bundle));
        this.zzha.setRewardedVideoAdListener(this.zzhc);
        this.zzha.zza(new com.google.ads.mediation.zzb(this));
        this.zzha.loadAd(zza(this.zzgz, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.destroy();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzgx;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzha;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzgw = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setAdListener(new zzd(this, mediationBannerListener));
        this.zzgw.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzgx = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzgx.setAdListener(new zze(this, mediationInterstitialListener));
        this.zzgx.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zzf zzfVar = new zzf(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zzfVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zzfVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zzfVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zzfVar);
        }
        if (nativeMediationAdRequest.zzna()) {
            for (String str : nativeMediationAdRequest.zznb().keySet()) {
                withAdListener.forCustomTemplateAd(str, zzfVar, nativeMediationAdRequest.zznb().get(str).booleanValue() ? zzfVar : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzgy = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzgx.show();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzha.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
