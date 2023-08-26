package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
@zzadh
/* loaded from: classes2.dex */
public final class zzjf extends zzki {
    private final AdListener zzapu;

    public zzjf(AdListener adListener) {
        this.zzapu = adListener;
    }

    public final AdListener getAdListener() {
        return this.zzapu;
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClicked() {
        this.zzapu.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClosed() {
        this.zzapu.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdFailedToLoad(int i) {
        this.zzapu.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdImpression() {
        this.zzapu.onAdImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLeftApplication() {
        this.zzapu.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLoaded() {
        this.zzapu.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdOpened() {
        this.zzapu.onAdOpened();
    }
}
