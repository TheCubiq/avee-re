package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ke3 extends bp2 implements me3 {
    public ke3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.daaw.me3
    public final void c2(ye3 ye3Var) {
        Parcel D = D();
        dp2.g(D, ye3Var);
        M(1, D);
    }
}
