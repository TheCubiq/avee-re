package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzfth;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfts;
/* loaded from: classes.dex */
public final class tt6 extends bp2 {
    public tt6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: h3 */
    public final zzftj m8825h3(zzfth zzfthVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzfthVar);
        Parcel m25951I = m25951I(1, m25952D);
        zzftj zzftjVar = (zzftj) dp2.m24107a(m25951I, zzftj.CREATOR);
        m25951I.recycle();
        return zzftjVar;
    }

    /* renamed from: i3 */
    public final zzfts m8824i3(zzftq zzftqVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzftqVar);
        Parcel m25951I = m25951I(3, m25952D);
        zzfts zzftsVar = (zzfts) dp2.m24107a(m25951I, zzfts.CREATOR);
        m25951I.recycle();
        return zzftsVar;
    }

    /* renamed from: j3 */
    public final void m8823j3(zzfte zzfteVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzfteVar);
        m25950M(2, m25952D);
    }
}
