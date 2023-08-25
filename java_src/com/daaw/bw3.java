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
        Parcel D = D();
        D.writeInt(i);
        M(2, D);
    }

    @Override // com.daaw.dw3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }

    @Override // com.daaw.dw3
    public final void zzg() {
        M(1, D());
    }
}
