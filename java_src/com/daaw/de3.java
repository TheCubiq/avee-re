package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class de3 extends bp2 implements fe3 {
    public de3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.daaw.fe3
    public final void e2(sd3 sd3Var) {
        Parcel D = D();
        dp2.g(D, sd3Var);
        M(1, D);
    }
}
