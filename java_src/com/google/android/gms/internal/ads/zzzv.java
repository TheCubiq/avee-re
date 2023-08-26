package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;
@zzadh
/* loaded from: classes2.dex */
public final class zzzv implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzbvp;
    private MediationInterstitialListener zzbvq;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzane.zzck("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzane.zzck("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzane.zzck("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzbvq = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzane.zzdk("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzane.zzdk("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzbvq.onAdFailedToLoad(this, 0);
        } else {
            if (!(PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzoh.zzh(context))) {
                zzane.zzdk("Default browser does not support custom tabs. Bailing out.");
                this.zzbvq.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzane.zzdk("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzbvq.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzbvp = (Activity) context;
            this.mUri = Uri.parse(string);
            this.zzbvq.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.mUri);
        zzakk.zzcrm.post(new zzzx(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(build.intent), null, new zzzw(this), null, new zzang(0, 0, false))));
        com.google.android.gms.ads.internal.zzbv.zzeo().zzqc();
    }
}
