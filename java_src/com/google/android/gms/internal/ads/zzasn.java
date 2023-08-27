package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzasn implements com.google.android.gms.ads.internal.overlay.zzn {
    private com.google.android.gms.ads.internal.overlay.zzn zzbnc;
    private zzaqw zzdcj;

    public zzasn(zzaqw zzaqwVar, com.google.android.gms.ads.internal.overlay.zzn zznVar) {
        this.zzdcj = zzaqwVar;
        this.zzbnc = zznVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcb() {
        this.zzbnc.zzcb();
        this.zzdcj.zzty();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcc() {
        this.zzbnc.zzcc();
        this.zzdcj.zzno();
    }
}
