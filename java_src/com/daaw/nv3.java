package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public final class nv3 extends bp2 implements pv3 {
    public nv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.daaw.pv3
    public final void B1(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(1, D);
    }

    @Override // com.daaw.pv3
    public final void D2(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(11, D);
    }

    @Override // com.daaw.pv3
    public final void F1(yd0 yd0Var, zzcdd zzcddVar) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzcddVar);
        M(7, D);
    }

    @Override // com.daaw.pv3
    public final void G(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(6, D);
    }

    @Override // com.daaw.pv3
    public final void a3(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(5, D);
    }

    @Override // com.daaw.pv3
    public final void zze(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(8, D);
    }

    @Override // com.daaw.pv3
    public final void zzg(yd0 yd0Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeInt(i);
        M(9, D);
    }

    @Override // com.daaw.pv3
    public final void zzi(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(3, D);
    }

    @Override // com.daaw.pv3
    public final void zzj(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(4, D);
    }
}
