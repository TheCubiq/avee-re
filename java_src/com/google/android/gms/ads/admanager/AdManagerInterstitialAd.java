package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.ry0;
import com.daaw.tj3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.m10829k(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33457i.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new tj3(context2, str2).m9076a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new tj3(context, str).m9076a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
