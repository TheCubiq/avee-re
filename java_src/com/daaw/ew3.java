package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ew3 extends bp2 {
    public ew3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void h3(tv3 tv3Var, String str, String str2) {
        Parcel D = D();
        dp2.g(D, tv3Var);
        D.writeString(str);
        D.writeString(str2);
        M(2, D);
    }
}
