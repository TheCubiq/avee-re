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
    public final void F0(zzcbf zzcbfVar, eu3 eu3Var) {
        Parcel D = D();
        dp2.e(D, zzcbfVar);
        dp2.g(D, eu3Var);
        M(1, D);
    }

    @Override // com.daaw.bu3
    public final void U1(zzcbj zzcbjVar, eu3 eu3Var) {
        Parcel D = D();
        dp2.e(D, zzcbjVar);
        dp2.g(D, eu3Var);
        M(3, D);
    }
}
