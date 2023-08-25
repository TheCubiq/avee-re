package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class gv3 extends bp2 implements iv3 {
    public gv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.daaw.iv3
    /* renamed from: G1 */
    public final void mo19328G1(cv3 cv3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, cv3Var);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.iv3
    /* renamed from: c */
    public final void mo19327c(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.iv3
    public final void zzf() {
        m25950M(4, m25952D());
    }

    @Override // com.daaw.iv3
    public final void zzh() {
        m25950M(6, m25952D());
    }

    @Override // com.daaw.iv3
    public final void zzi() {
        m25950M(1, m25952D());
    }

    @Override // com.daaw.iv3
    public final void zzj() {
        m25950M(2, m25952D());
    }

    @Override // com.daaw.iv3
    public final void zzk() {
        m25950M(8, m25952D());
    }

    @Override // com.daaw.iv3
    public final void zzl() {
        m25950M(3, m25952D());
    }
}
