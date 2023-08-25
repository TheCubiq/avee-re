package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class vt3 extends bp2 implements xt3 {
    public vt3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.daaw.xt3
    /* renamed from: A1 */
    public final void mo4525A1(zzccb zzccbVar, hu3 hu3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzccbVar);
        dp2.m24101g(m25952D, hu3Var);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.xt3
    /* renamed from: L2 */
    public final void mo4524L2(zzccb zzccbVar, hu3 hu3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzccbVar);
        dp2.m24101g(m25952D, hu3Var);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.xt3
    /* renamed from: b2 */
    public final void mo4523b2(zzccb zzccbVar, hu3 hu3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzccbVar);
        dp2.m24101g(m25952D, hu3Var);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.xt3
    /* renamed from: j1 */
    public final void mo4522j1(String str, hu3 hu3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        dp2.m24101g(m25952D, hu3Var);
        m25950M(7, m25952D);
    }
}
