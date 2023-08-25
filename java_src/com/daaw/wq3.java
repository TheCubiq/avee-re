package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;
/* loaded from: classes.dex */
public final class wq3 extends le3 {

    /* renamed from: p */
    public final NativeAd.OnNativeAdLoadedListener f31460p;

    public wq3(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f31460p = onNativeAdLoadedListener;
    }

    @Override // com.daaw.me3
    /* renamed from: c2 */
    public final void mo5844c2(ye3 ye3Var) {
        this.f31460p.onNativeAdLoaded(new mq3(ye3Var));
    }
}
