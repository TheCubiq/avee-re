package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* loaded from: classes2.dex */
final class zzzx implements Runnable {
    private final /* synthetic */ zzzv zzbvr;
    private final /* synthetic */ AdOverlayInfoParcel zzzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzx(zzzv zzzvVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzbvr = zzzvVar;
        this.zzzc = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzbv.zzei();
        activity = this.zzbvr.zzbvp;
        com.google.android.gms.ads.internal.overlay.zzl.zza(activity, this.zzzc, true);
    }
}
