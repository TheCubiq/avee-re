package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes2.dex */
public final class zzse extends zzrp {
    private final UnifiedNativeAd.UnconfirmedClickListener zzblk;

    public zzse(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzblk = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzro
    public final void onUnconfirmedClickCancelled() {
        this.zzblk.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzro
    public final void onUnconfirmedClickReceived(String str) {
        this.zzblk.onUnconfirmedClickReceived(str);
    }
}
