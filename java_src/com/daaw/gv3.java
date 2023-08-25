package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class gv3 extends bp2 implements iv3 {
    public gv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.daaw.iv3
    public final void G1(cv3 cv3Var) {
        Parcel D = D();
        dp2.g(D, cv3Var);
        M(5, D);
    }

    @Override // com.daaw.iv3
    public final void c(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(7, D);
    }

    @Override // com.daaw.iv3
    public final void zzf() {
        M(4, D());
    }

    @Override // com.daaw.iv3
    public final void zzh() {
        M(6, D());
    }

    @Override // com.daaw.iv3
    public final void zzi() {
        M(1, D());
    }

    @Override // com.daaw.iv3
    public final void zzj() {
        M(2, D());
    }

    @Override // com.daaw.iv3
    public final void zzk() {
        M(8, D());
    }

    @Override // com.daaw.iv3
    public final void zzl() {
        M(3, D());
    }
}
