package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* loaded from: classes2.dex */
final class zzzw implements com.google.android.gms.ads.internal.overlay.zzn {
    private final /* synthetic */ zzzv zzbvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzw(zzzv zzzvVar) {
        this.zzbvr = zzzvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onPause() {
        zzane.zzck("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onResume() {
        zzane.zzck("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzane.zzck("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zzbvr.zzbvq;
        mediationInterstitialListener.onAdClosed(this.zzbvr);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcc() {
        MediationInterstitialListener mediationInterstitialListener;
        zzane.zzck("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zzbvr.zzbvq;
        mediationInterstitialListener.onAdOpened(this.zzbvr);
    }
}
