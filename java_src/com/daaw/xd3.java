package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class xd3 extends bp2 implements zd3 {
    public xd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.daaw.zd3
    public final void g0(pd3 pd3Var) {
        Parcel D = D();
        dp2.g(D, pd3Var);
        M(1, D);
    }
}
