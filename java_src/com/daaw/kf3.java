package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes.dex */
public final class kf3 extends ue3 {

    /* renamed from: p */
    public final UnifiedNativeAd.UnconfirmedClickListener f16346p;

    public kf3(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f16346p = unconfirmedClickListener;
    }

    @Override // com.daaw.ve3
    /* renamed from: f */
    public final void mo4816f(String str) {
        this.f16346p.onUnconfirmedClickReceived(str);
    }

    @Override // com.daaw.ve3
    public final void zze() {
        this.f16346p.onUnconfirmedClickCancelled();
    }
}
