package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzdh extends zzbh<Integer, Long> {
    public Long zzgj;
    public Long zzgk;
    public Long zzsx;

    public zzdh() {
    }

    public zzdh(String str) {
        zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzsx = (Long) zzk.get(0);
            this.zzgj = (Long) zzk.get(1);
            this.zzgk = (Long) zzk.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    protected final HashMap<Integer, Long> zzu() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzsx);
        hashMap.put(1, this.zzgj);
        hashMap.put(2, this.zzgk);
        return hashMap;
    }
}
