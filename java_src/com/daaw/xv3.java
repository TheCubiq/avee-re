package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class xv3 extends bp2 implements zv3 {
    public xv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.daaw.zv3
    public final void H0(tv3 tv3Var) {
        Parcel D = D();
        dp2.g(D, tv3Var);
        M(3, D);
    }

    @Override // com.daaw.zv3
    public final void i(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(4, D);
    }

    @Override // com.daaw.zv3
    public final void z2(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(5, D);
    }

    @Override // com.daaw.zv3
    public final void zze() {
        M(7, D());
    }

    @Override // com.daaw.zv3
    public final void zzf() {
        M(6, D());
    }

    @Override // com.daaw.zv3
    public final void zzg() {
        M(2, D());
    }

    @Override // com.daaw.zv3
    public final void zzj() {
        M(1, D());
    }
}
