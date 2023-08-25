package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class dv3 extends bp2 {
    public dv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: h3 */
    public final void m23877h3(cv3 cv3Var, String str, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, cv3Var);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        m25950M(2, m25952D);
    }
}
