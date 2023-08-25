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
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "AdUnitId cannot be null.");
        ry0.k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.k(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.i.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new tj3(context2, str2).a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new tj3(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
