package com.daaw;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbyi;
/* loaded from: classes.dex */
public final class wp3 implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel p;
    public final /* synthetic */ zzbyi q;

    public wp3(zzbyi zzbyiVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.q = zzbyiVar;
        this.p = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        zzt.zzi();
        activity = this.q.a;
        zzm.zza(activity, this.p, true);
    }
}
