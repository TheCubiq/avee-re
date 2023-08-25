package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.ry0;
import com.daaw.tj3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public abstract class InterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        ry0.m10829k(context, "Context cannot be null.");
        ry0.m10829k(str, "AdUnitId cannot be null.");
        ry0.m10829k(adRequest, "AdRequest cannot be null.");
        ry0.m10829k(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(context);
        if (((Boolean) ya3.f33457i.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new tj3(context2, str2).m9076a(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            et3.m23193c(context2).mo21236a(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new tj3(context, str).m9076a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
