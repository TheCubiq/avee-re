package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class da3 extends bp2 implements fa3 {
    public da3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.daaw.fa3
    public final void a0(ca3 ca3Var) {
        Parcel D = D();
        dp2.g(D, ca3Var);
        M(1, D);
    }
}
