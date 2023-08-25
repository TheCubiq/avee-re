package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes.dex */
public final class kf3 extends ue3 {
    public final UnifiedNativeAd.UnconfirmedClickListener p;

    public kf3(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.p = unconfirmedClickListener;
    }

    @Override // com.daaw.ve3
    public final void f(String str) {
        this.p.onUnconfirmedClickReceived(str);
    }

    @Override // com.daaw.ve3
    public final void zze() {
        this.p.onUnconfirmedClickCancelled();
    }
}
