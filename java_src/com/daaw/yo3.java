package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class yo3 extends bp2 implements ap3 {
    public yo3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.daaw.ap3
    public final void a(String str) {
        Parcel D = D();
        D.writeString("Adapter returned null.");
        M(3, D);
    }

    @Override // com.daaw.ap3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(4, D);
    }

    @Override // com.daaw.ap3
    public final void zzg() {
        M(2, D());
    }
}
