package com.daaw.avee.Design;

import android.app.Activity;
import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.AdViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class AdsDesign {
    public static WeakEvent1<Activity> onCreateAfterAdsInitialized = new WeakEvent1<>();
    private List<Object> listenerRefHolder = new LinkedList();

    public AdsDesign() {
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$AdsDesign$lRPC4Wleee3HB6t4w0uIeomhSvg
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public final void invoke(Object obj) {
                AdsDesign.lambda$new$0((Activity) obj);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onShowAdView.subscribeWeak(new WeakEventR3.Handler<AdViewHolder, Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.AdsDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEventR3.Handler
            public Boolean invoke(AdViewHolder adViewHolder, Integer num, Integer num2) {
                if (adViewHolder.adView == null) {
                    return false;
                }
                if (IAP2Design.premium && AppPreferences.createOrGetInstance().preferencesGetBoolSafe(adViewHolder.adView.getContext(), "pref_disableHeaderAds", false)) {
                    adViewHolder.adView.setVisibility(8);
                    return false;
                }
                if (num.intValue() != 0 && (num.intValue() == 1 || num.intValue() == 2)) {
                    if (num2.intValue() < 7) {
                        adViewHolder.adView.setVisibility(8);
                        return false;
                    } else if (num2.intValue() > 10 && IAP2Design.premium && AppPreferences.createOrGetInstance().preferencesGetBoolSafe(adViewHolder.adView.getContext(), "pref_disableHeaderAds", false)) {
                        adViewHolder.adView.setVisibility(8);
                        return false;
                    }
                }
                adViewHolder.adView.loadAd(new AdRequest.Builder().build());
                return true;
            }
        }, this.listenerRefHolder);
        IAP2Design.onPurchasedSuccessfully.subscribeWeak(new WeakEventR1.Handler<Boolean, Boolean>() { // from class: com.daaw.avee.Design.AdsDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(Boolean bool) {
                return Boolean.valueOf(AdsDesign.this.onPurchasedSuccessfully(bool.booleanValue()));
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$new$0(Activity activity) {
        MobileAds.initialize(activity, activity.getString(R.string.ads_app_id));
        onCreateAfterAdsInitialized.invoke(activity);
    }

    boolean onPurchasedSuccessfully(boolean z) {
        Context appContext;
        if (z && (appContext = PlayerCore.s().getAppContext()) != null) {
            AppPreferences.createOrGetInstance().preferencesSetBoolSafe(appContext, "pref_disableHeaderAds", true);
            AppPreferences.createOrGetInstance().preferencesSetBoolSafe(appContext, "pref_alwaysHideAppLogo", true);
        }
        return true;
    }
}
