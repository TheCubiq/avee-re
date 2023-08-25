package com.daaw;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class yq3 extends bp2 implements ar3 {
    public yq3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.daaw.ar3
    /* renamed from: N */
    public final void mo3432N(Intent intent) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, intent);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.ar3
    /* renamed from: l1 */
    public final void mo3431l1(yd0 yd0Var, String str, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.ar3
    public final void zzf() {
        m25950M(3, m25952D());
    }
}
