package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes.dex */
public final class jf3 extends le3 {

    /* renamed from: p */
    public final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f15072p;

    public jf3(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f15072p = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.daaw.me3
    /* renamed from: c2 */
    public final void mo5844c2(ye3 ye3Var) {
        this.f15072p.onUnifiedNativeAdLoaded(new ze3(ye3Var));
    }
}
