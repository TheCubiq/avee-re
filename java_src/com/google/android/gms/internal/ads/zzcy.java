package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzcy extends zzbh<Integer, Long> {
    public Long zzrr;
    public Long zzrs;

    public zzcy() {
    }

    public zzcy(String str) {
        zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzrr = (Long) zzk.get(0);
            this.zzrs = (Long) zzk.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    protected final HashMap<Integer, Long> zzu() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzrr);
        hashMap.put(1, this.zzrs);
        return hashMap;
    }
}
