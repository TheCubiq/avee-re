package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class xw6 extends bp2 implements zw6 {
    public xw6(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.daaw.zw6
    /* renamed from: M0 */
    public final void mo1822M0(Bundle bundle, bx6 bx6Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        dp2.m24101g(m25952D, bx6Var);
        m25949g3(3, m25952D);
    }

    @Override // com.daaw.zw6
    /* renamed from: O */
    public final void mo1821O(Bundle bundle, bx6 bx6Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        dp2.m24101g(m25952D, bx6Var);
        m25949g3(2, m25952D);
    }

    @Override // com.daaw.zw6
    /* renamed from: Q0 */
    public final void mo1820Q0(String str, Bundle bundle, bx6 bx6Var) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        dp2.m24103e(m25952D, bundle);
        dp2.m24101g(m25952D, bx6Var);
        m25949g3(1, m25952D);
    }
}
