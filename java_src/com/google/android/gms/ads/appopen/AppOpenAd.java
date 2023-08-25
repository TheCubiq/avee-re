package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.ry0;
import com.daaw.x23;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* loaded from: classes.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* loaded from: classes.dex */
    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "adUnitId cannot be null.");
        ry0.k(adRequest, "AdRequest cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new x23(context2, str2, adRequest2.zza(), i, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new x23(context, str, adRequest.zza(), i, appOpenAdLoadCallback).a();
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "adUnitId cannot be null.");
        ry0.k(adRequest, "AdRequest cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new x23(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new x23(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).a();
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        ry0.k(context, "Context cannot be null.");
        ry0.k(str, "adUnitId cannot be null.");
        ry0.k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(context);
        if (((Boolean) ya3.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new x23(context2, str2, adManagerAdRequest2.zza(), i, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            et3.c(context2).a(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new x23(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).a();
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
