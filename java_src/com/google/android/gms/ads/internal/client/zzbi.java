package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzbi extends bp2 implements zzbk {
    public zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(2, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        M(1, D());
    }
}
