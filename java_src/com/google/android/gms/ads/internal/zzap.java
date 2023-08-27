package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* loaded from: classes.dex */
final class zzap implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel zzzc;
    private final /* synthetic */ zzao zzzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzao zzaoVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzzd = zzaoVar;
        this.zzzc = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbv.zzei();
        com.google.android.gms.ads.internal.overlay.zzl.zza(this.zzzd.zzza.zzvw.zzrt, this.zzzc, true);
    }
}
