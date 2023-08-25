package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
/* loaded from: classes.dex */
public final class zzfd extends zzdc {

    /* renamed from: p */
    public final OnAdMetadataChangedListener f36185p;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f36185p = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f36185p;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
