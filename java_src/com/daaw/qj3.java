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
    /* renamed from: t0 */
    public final void mo10288t0(mj3 mj3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, mj3Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.sj3
    public final void zze(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.sj3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }
}
