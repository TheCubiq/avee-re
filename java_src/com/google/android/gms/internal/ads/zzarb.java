package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzarb implements com.google.android.gms.ads.internal.overlay.zzn {
    private com.google.android.gms.ads.internal.overlay.zzn zzbnc;
    private zzaqw zzdcj;

    public zzarb(zzaqw zzaqwVar, com.google.android.gms.ads.internal.overlay.zzn zznVar) {
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
