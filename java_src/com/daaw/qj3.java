package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class qj3 extends bp2 implements sj3 {
    public qj3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.daaw.sj3
    public final void t0(mj3 mj3Var) {
        Parcel D = D();
        dp2.g(D, mj3Var);
        M(1, D);
    }

    @Override // com.daaw.sj3
    public final void zze(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(2, D);
    }

    @Override // com.daaw.sj3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }
}
