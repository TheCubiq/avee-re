package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes.dex */
public final class jf3 extends le3 {
    public final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener p;

    public jf3(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.p = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.daaw.me3
    public final void c2(ye3 ye3Var) {
        this.p.onUnifiedNativeAdLoaded(new ze3(ye3Var));
    }
}
