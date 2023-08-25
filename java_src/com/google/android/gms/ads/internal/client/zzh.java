package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
/* loaded from: classes.dex */
public final class zzh extends zzbj {

    /* renamed from: p */
    public final AdLoadCallback f36190p;

    /* renamed from: q */
    public final Object f36191q;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f36190p = adLoadCallback;
        this.f36191q = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f36190p;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f36190p;
        if (adLoadCallback == null || (obj = this.f36191q) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
