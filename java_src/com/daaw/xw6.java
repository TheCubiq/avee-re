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
    public final void M0(Bundle bundle, bx6 bx6Var) {
        Parcel D = D();
        dp2.e(D, bundle);
        dp2.g(D, bx6Var);
        g3(3, D);
    }

    @Override // com.daaw.zw6
    public final void O(Bundle bundle, bx6 bx6Var) {
        Parcel D = D();
        dp2.e(D, bundle);
        dp2.g(D, bx6Var);
        g3(2, D);
    }

    @Override // com.daaw.zw6
    public final void Q0(String str, Bundle bundle, bx6 bx6Var) {
        Parcel D = D();
        D.writeString(str);
        dp2.e(D, bundle);
        dp2.g(D, bx6Var);
        g3(1, D);
    }
}
