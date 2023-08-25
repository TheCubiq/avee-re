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
        M(6, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        M(1, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(2, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(8, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        M(7, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        M(3, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        M(4, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        M(5, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        M(9, D());
    }
}
