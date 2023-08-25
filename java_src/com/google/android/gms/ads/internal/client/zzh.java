package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
/* loaded from: classes.dex */
public final class zzh extends zzbj {
    public final AdLoadCallback p;
    public final Object q;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.p = adLoadCallback;
        this.q = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.p;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.p;
        if (adLoadCallback == null || (obj = this.q) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
