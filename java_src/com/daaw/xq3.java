package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;
/* loaded from: classes.dex */
public final class xq3 extends ue3 {

    /* renamed from: p */
    public final NativeAd.UnconfirmedClickListener f32888p;

    public xq3(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f32888p = unconfirmedClickListener;
    }

    @Override // com.daaw.ve3
    /* renamed from: f */
    public final void mo4816f(String str) {
        this.f32888p.onUnconfirmedClickReceived(str);
    }

    @Override // com.daaw.ve3
    public final void zze() {
        this.f32888p.onUnconfirmedClickCancelled();
    }
}
