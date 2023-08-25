package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;
/* loaded from: classes.dex */
public final class wq3 extends le3 {
    public final NativeAd.OnNativeAdLoadedListener p;

    public wq3(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.p = onNativeAdLoadedListener;
    }

    @Override // com.daaw.me3
    public final void c2(ye3 ye3Var) {
        this.p.onNativeAdLoaded(new mq3(ye3Var));
    }
}
