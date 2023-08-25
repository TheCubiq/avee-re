package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzbp extends bp2 implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(2, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(yd0 yd0Var, String str, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        m25952D.writeString(str2);
        Parcel m25951I = m25951I(1, m25952D);
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
