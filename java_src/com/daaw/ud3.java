package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ud3 extends bp2 implements wd3 {
    public ud3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.daaw.wd3
    public final void V0(nd3 nd3Var) {
        Parcel D = D();
        dp2.g(D, nd3Var);
        M(1, D);
    }
}
