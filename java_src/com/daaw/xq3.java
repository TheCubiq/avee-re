package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;
/* loaded from: classes.dex */
public final class xq3 extends ue3 {
    public final NativeAd.UnconfirmedClickListener p;

    public xq3(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
