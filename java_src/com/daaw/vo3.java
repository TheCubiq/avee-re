package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class vo3 extends bp2 implements xo3 {
    public vo3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.daaw.xo3
    public final void I0(sn3 sn3Var) {
        Parcel D = D();
        dp2.g(D, sn3Var);
        M(1, D);
    }

    @Override // com.daaw.xo3
    public final void a(String str) {
        Parcel D = D();
        D.writeString("Adapter returned null.");
        M(2, D);
    }

    @Override // com.daaw.xo3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }
}
