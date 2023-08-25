package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzbf extends bp2 implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        m25950M(6, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        m25950M(1, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(2, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(8, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        m25950M(7, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        m25950M(3, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        m25950M(4, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        m25950M(5, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        m25950M(9, m25952D());
    }
}
