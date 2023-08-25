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
    /* renamed from: i2 */
    public final void mo10752i2(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.s23
    /* renamed from: r2 */
    public final void mo10751r2(p23 p23Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, p23Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.s23
    public final void zzb(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(2, m25952D);
    }
}
