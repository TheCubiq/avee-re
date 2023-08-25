package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class bw3 extends bp2 implements dw3 {
    public bw3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.daaw.dw3
    public final void zze(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.dw3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.dw3
    public final void zzg() {
        m25950M(1, m25952D());
    }
}
