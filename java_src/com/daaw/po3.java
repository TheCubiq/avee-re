package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class po3 extends bp2 implements ro3 {
    public po3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.ro3
    /* renamed from: P2 */
    public final void mo11107P2(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.ro3
    /* renamed from: U2 */
    public final void mo11106U2(mn3 mn3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, mn3Var);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.ro3
    /* renamed from: a */
    public final void mo11105a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString("Adapter returned null.");
        m25950M(2, m25952D);
    }

    @Override // com.daaw.ro3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }
}
