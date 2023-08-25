package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzcg extends bp2 implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        m25950M(5, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        m25950M(3, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(1, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        m25950M(4, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        m25950M(2, m25952D());
    }
}
