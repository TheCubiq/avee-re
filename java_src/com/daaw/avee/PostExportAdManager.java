package com.daaw.avee;

import android.app.Activity;
import android.util.Log;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Design.VisualizerExporterDesign;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PostExportAdManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/daaw/avee/PostExportAdManager;", "Lcom/google/android/gms/ads/AdListener;", "isPremium", "Lcom/daaw/avee/Common/Events/WeakEventR;", "", "(Lcom/daaw/avee/Common/Events/WeakEventR;)V", "ad", "Lcom/google/android/gms/ads/InterstitialAd;", "adId", "", "listenerRefHolder", "", "", "onAdClicked", "", "onAdClosed", "onAdFailedToLoad", "errorCode", "", "onAdImpression", "onAdLeftApplication", "onAdLoaded", "onAdOpened", "showAd", "app_standardRelease"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class PostExportAdManager extends AdListener {
    private InterstitialAd ad;
    private final String adId;
    private final WeakEventR<Boolean> isPremium;
    private final List<Object> listenerRefHolder;

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
    }

    public PostExportAdManager(WeakEventR<Boolean> isPremium) {
        Intrinsics.checkParameterIsNotNull(isPremium, "isPremium");
        this.isPremium = isPremium;
        this.listenerRefHolder = new LinkedList();
        this.adId = "ca-app-pub-3759586557634138/3471601953";
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.PostExportAdManager.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Activity activity) {
                PostExportAdManager.this.ad = new InterstitialAd(activity);
                InterstitialAd interstitialAd = PostExportAdManager.this.ad;
                if (interstitialAd != null) {
                    interstitialAd.setAdUnitId(PostExportAdManager.this.adId);
                }
                InterstitialAd interstitialAd2 = PostExportAdManager.this.ad;
                if (interstitialAd2 != null) {
                    interstitialAd2.setAdListener(PostExportAdManager.this);
                }
                InterstitialAd interstitialAd3 = PostExportAdManager.this.ad;
                if (interstitialAd3 != null) {
                    interstitialAd3.loadAd(new AdRequest.Builder().build());
                }
            }
        }, this.listenerRefHolder);
        VisualizerExporterDesign.onExportSuccess.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.PostExportAdManager.2
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public final void invoke() {
                if (((Boolean) PostExportAdManager.this.isPremium.invoke(false)).booleanValue()) {
                    return;
                }
                PostExportAdManager.this.showAd();
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2 = this.ad;
        if (interstitialAd2 == null || !interstitialAd2.isLoaded() || (interstitialAd = this.ad) == null) {
            return;
        }
        interstitialAd.show();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i) {
        Log.d("PostExportAdManager", "onRewardedVideoAdFailedToLoad(" + i + ')');
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        Log.d("PostExportAdManager", "onRewardedVideoAdLoaded");
    }
}
