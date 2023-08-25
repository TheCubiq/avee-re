package com.daaw;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbyi;
/* loaded from: classes.dex */
public final class wp3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AdOverlayInfoParcel f31436p;

    /* renamed from: q */
    public final /* synthetic */ zzbyi f31437q;

    public wp3(zzbyi zzbyiVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f31437q = zzbyiVar;
        this.f31436p = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        zzt.zzi();
        activity = this.f31437q.f36879a;
        zzm.zza(activity, this.f31436p, true);
    }
}
