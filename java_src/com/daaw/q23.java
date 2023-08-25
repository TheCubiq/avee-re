package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class q23 extends bp2 implements s23 {
    public q23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.daaw.s23
    public final void i2(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }

    @Override // com.daaw.s23
    public final void r2(p23 p23Var) {
        Parcel D = D();
        dp2.g(D, p23Var);
        M(1, D);
    }

    @Override // com.daaw.s23
    public final void zzb(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(2, D);
    }
}
