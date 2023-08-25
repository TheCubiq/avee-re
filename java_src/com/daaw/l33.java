package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
/* loaded from: classes.dex */
public final class l33 extends bp2 {
    public l33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: h3 */
    public final long m17179h3(zzbei zzbeiVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzbeiVar);
        Parcel m25951I = m25951I(3, m25952D);
        long readLong = m25951I.readLong();
        m25951I.recycle();
        return readLong;
    }

    /* renamed from: i3 */
    public final zzbef m17178i3(zzbei zzbeiVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzbeiVar);
        Parcel m25951I = m25951I(1, m25952D);
        zzbef zzbefVar = (zzbef) dp2.m24107a(m25951I, zzbef.CREATOR);
        m25951I.recycle();
        return zzbefVar;
    }

    /* renamed from: j3 */
    public final zzbef m17177j3(zzbei zzbeiVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzbeiVar);
        Parcel m25951I = m25951I(2, m25952D);
        zzbef zzbefVar = (zzbef) dp2.m24107a(m25951I, zzbef.CREATOR);
        m25951I.recycle();
        return zzbefVar;
    }
}
