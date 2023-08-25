package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
/* loaded from: classes.dex */
public final class zzfd extends zzdc {
    public final OnAdMetadataChangedListener p;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.p = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.p;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
