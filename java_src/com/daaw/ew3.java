package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ew3 extends bp2 {
    public ew3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* renamed from: h3 */
    public final void m23088h3(tv3 tv3Var, String str, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, tv3Var);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        m25950M(2, m25952D);
    }
}
