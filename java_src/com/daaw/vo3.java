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
    /* renamed from: I0 */
    public final void mo4877I0(sn3 sn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, sn3Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.xo3
    /* renamed from: a */
    public final void mo4876a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString("Adapter returned null.");
        m25950M(2, m25952D);
    }

    @Override // com.daaw.xo3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }
}
