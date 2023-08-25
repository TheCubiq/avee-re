package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzbyi;
/* loaded from: classes.dex */
public final class vp3 implements zzo {
    public final /* synthetic */ zzbyi p;

    public vp3(zzbyi zzbyiVar) {
        this.p = zzbyiVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        k04.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbyi zzbyiVar = this.p;
        mediationInterstitialListener = zzbyiVar.b;
        mediationInterstitialListener.onAdOpened(zzbyiVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        k04.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
        k04.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
        k04.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        k04.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbyi zzbyiVar = this.p;
        mediationInterstitialListener = zzbyiVar.b;
        mediationInterstitialListener.onAdClosed(zzbyiVar);
    }
}
