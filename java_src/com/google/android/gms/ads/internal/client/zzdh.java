package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzdh extends bp2 implements zzdj {
    public zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, yd0 yd0Var, yd0 yd0Var2) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        m25950M(1, m25952D);
    }
}
