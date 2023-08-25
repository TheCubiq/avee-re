package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class dv3 extends bp2 {
    public dv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void h3(cv3 cv3Var, String str, String str2) {
        Parcel D = D();
        dp2.g(D, cv3Var);
        D.writeString(str);
        D.writeString(str2);
        M(2, D);
    }
}
