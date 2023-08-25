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
        M(5, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        M(3, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(1, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        M(4, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        M(2, D());
    }
}
