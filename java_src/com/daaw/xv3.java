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
    /* renamed from: H0 */
    public final void mo1841H0(tv3 tv3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, tv3Var);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.zv3
    /* renamed from: i */
    public final void mo1840i(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.zv3
    /* renamed from: z2 */
    public final void mo1839z2(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.zv3
    public final void zze() {
        m25950M(7, m25952D());
    }

    @Override // com.daaw.zv3
    public final void zzf() {
        m25950M(6, m25952D());
    }

    @Override // com.daaw.zv3
    public final void zzg() {
        m25950M(2, m25952D());
    }

    @Override // com.daaw.zv3
    public final void zzj() {
        m25950M(1, m25952D());
    }
}
