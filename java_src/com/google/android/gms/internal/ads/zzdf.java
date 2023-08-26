package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzdf extends zzbh<Integer, Long> {
    public Long zzfp;
    public Long zzfr;
    public Long zzfv;
    public Long zzfw;
    public Long zzsp;
    public Long zzsq;
    public Long zzsr;
    public Long zzss;
    public Long zzst;
    public Long zzsu;
    public Long zzsv;

    public zzdf() {
    }

    public zzdf(String str) {
        zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzsp = (Long) zzk.get(0);
            this.zzsq = (Long) zzk.get(1);
            this.zzsr = (Long) zzk.get(2);
            this.zzfr = (Long) zzk.get(3);
            this.zzfp = (Long) zzk.get(4);
            this.zzss = (Long) zzk.get(5);
            this.zzst = (Long) zzk.get(6);
            this.zzsu = (Long) zzk.get(7);
            this.zzfw = (Long) zzk.get(8);
            this.zzfv = (Long) zzk.get(9);
            this.zzsv = (Long) zzk.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    protected final HashMap<Integer, Long> zzu() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzsp);
        hashMap.put(1, this.zzsq);
        hashMap.put(2, this.zzsr);
        hashMap.put(3, this.zzfr);
        hashMap.put(4, this.zzfp);
        hashMap.put(5, this.zzss);
        hashMap.put(6, this.zzst);
        hashMap.put(7, this.zzsu);
        hashMap.put(8, this.zzfw);
        hashMap.put(9, this.zzfv);
        hashMap.put(10, this.zzsv);
        return hashMap;
    }
}
