package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbj;
/* loaded from: classes.dex */
public final class zt3 extends bp2 implements bu3 {
    public zt3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.daaw.bu3
    /* renamed from: F0 */
    public final void mo1907F0(zzcbf zzcbfVar, eu3 eu3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzcbfVar);
        dp2.m24101g(m25952D, eu3Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.bu3
    /* renamed from: U1 */
    public final void mo1906U1(zzcbj zzcbjVar, eu3 eu3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzcbjVar);
        dp2.m24101g(m25952D, eu3Var);
        m25950M(3, m25952D);
    }
}
